package com.money.store.openplatform.controller;

import cn.hutool.core.util.IdUtil;
import com.money.store.common.api.CommonResult;
import com.money.store.mail.service.MailService;
import com.money.store.model.UmsUser;
import com.money.store.openplatform.service.UmsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


/**
 * @program: store
 * @description: 邮件系统
 * @author: Money
 * @create: 2020/03/01 15:07
 */
@RestController
@Api(value = "MailController", tags="发送邮件")
@RequestMapping("/mail")
public class MailController {

    @Value("${money.baseUrl}")
    private String baseUrl;
    @Autowired
    private MailService mailService;
    @Autowired
    private UmsUserService umsUserService;
    @Autowired
    private TemplateEngine templateEngine;

    /**
     * 邮箱模板三个参数
     * addressee 收信人
     * content 内容
     * link 链接
     */

    @ApiOperation(value = "发送注册验证邮件")
    @GetMapping(value = "/verificationMail")
    public CommonResult verificationMail(String username, String email) {
        Context context = new Context();
        context.setVariable("addressee", "尊敬的" + username);
        context.setVariable("content", "欢迎您加入麦尼开放平台，请点击下方链接激活开发者资质（1小时内有效）：");
        String token = IdUtil.simpleUUID();
        umsUserService.generateAuth(token, username, 1800);
        String activeLink = baseUrl + "openplatform/active-dev?token=" + token;
        context.setVariable("link", activeLink);
        String content = templateEngine.process("mailTemplate", context); // 读出html的文本
        if (mailService.sendHtmlMail(email, "验证邮箱", content)) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed("发送失败！");
        }
    }

    @ApiOperation(value = "发送重置密码邮件")
    @GetMapping(value = "/resetPasswordMail")
    public CommonResult resetPasswordMail(String email) {
        Context context = new Context();
        UmsUser umsUser = umsUserService.getUserByEmail(email);
        if (umsUser == null) {
            return CommonResult.failed("该邮箱未注册");
        }
        context.setVariable("addressee", umsUser.getNickname());
        context.setVariable("content", "您请求重新设置麦尼开放平台的登录密码，请点击下方链接重设密码（1小时内有效）：");
        String token = IdUtil.simpleUUID();
        umsUserService.generateAuth(token, umsUser.getId().toString(), 1800);
        String resetLink = baseUrl + "openplatform/set-new-password?token=" + token;
        context.setVariable("link", resetLink);
        String content = templateEngine.process("mailTemplate", context); // 读出html的文本
        if (mailService.sendHtmlMail(email, "重置密码", content)) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed("发送失败！");
        }
    }

    @ApiOperation(value = "发送修改邮箱邮件")
    @GetMapping(value = "/activeEmailMail")
    public CommonResult activeEmailMail(String email) {
        Context context = new Context();
        UmsUser umsUser = umsUserService.getUserByEmail(email);
        if (umsUser == null) {
            return CommonResult.failed("该邮箱未注册");
        }
        context.setVariable("addressee", umsUser.getNickname());
        context.setVariable("content", "您请求修改绑定邮箱为此邮箱，请点击下方链接激活新邮箱（1小时内有效）：");
        String token = IdUtil.simpleUUID();
        umsUserService.generateAuth(token, umsUser.getUsername(), 1800);
        String activeLink = baseUrl + "openplatform/active-dev?token=" + token;
        context.setVariable("link", activeLink);
        String content = templateEngine.process("mailTemplate", context); // 读出html的文本
        if (mailService.sendHtmlMail(email, "修改邮箱", content)) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed("发送失败！");
        }
    }


//    @ApiOperation(value = "发送测试邮件")
//    @GetMapping(value = "/textMail")
//    @ResponseBody
//    public void sendTextMail(@RequestParam String email) {
//        MailClient client = new MailClient("www.shahow.top", "123@qq.com", "123");
//        client.send(new MessageBuilder()
//                .addMessage("测试", "我来了", "麦尼")
//                .addReceiver(email));
//    }
}
