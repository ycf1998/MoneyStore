package com.money.store.openplatform.controller;

import cn.hutool.core.util.IdUtil;
import com.money.store.common.api.CommonResult;
import com.money.store.mail.service.MailService;
import com.money.store.model.UmsUser;
import com.money.store.openplatform.service.UmsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


/**
 * @program: store
 * @description: 邮件系统
 * @author: Money
 * @create: 2020/03/01 15:07
 */
@Controller
@Api(value = "MailController", tags="发送邮件")
@RequestMapping("/mail")
public class MailController {

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
    @ResponseBody
    public CommonResult sendVerificationMail(String username, String email) {
        Context context = new Context();
        context.setVariable("addressee", "");
        context.setVariable("content", "欢迎您加入麦尼开放平台，请点击下方链接激活开发者资质（5分钟内有效）：");
        String token = IdUtil.simpleUUID();
        umsUserService.generateAuth(token, username, 300);
        String activeLink = "http://127.0.0.1:8081/openplatform/active-dev?token=" + token;
//        String activeLink = "http://118.31.77.63/openplatform/active-dev?token=" + token;
        context.setVariable("link", activeLink);
        String content = templateEngine.process("mailTemplate", context); // 读出html的文本
        if (mailService.sendHtmlMail(email, "验证邮箱", content.toString())) {
            return CommonResult.success(null);
        } else {
            return CommonResult.failed("发送失败！");
        }
    }

    @ApiOperation(value = "发送重置密码邮件")
    @GetMapping(value = "/resetPasswordMail")
    @ResponseBody
    public CommonResult sendResetPasswordMail(String email) {
        Context context = new Context();
        UmsUser umsUser = umsUserService.getUserByEmail(email);
        if (umsUser == null) {
            return CommonResult.failed("邮箱出错！请检查或稍后重试");
        }
        context.setVariable("addressee", umsUser.getNickname());
        context.setVariable("content", "您请求重新设置麦尼开放平台的登录密码，请点击下方链接重设密码（1小时内有效）：");
        String token = IdUtil.simpleUUID();
        umsUserService.generateAuth(token, umsUser.getId().toString(), 1800);
        String resetLink = "http://127.0.0.1:8081/openplatform/set-new-password?token=" + token;
//        String resetLink = "http://118.31.77.63/openplatform/set-new-password?token=" + token;
        context.setVariable("link", resetLink);
        String content = templateEngine.process("mailTemplate", context); // 读出html的文本
        if (mailService.sendHtmlMail(email, "重置密码", content.toString())) {
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
