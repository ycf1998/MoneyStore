package com.money.store.common.utils.ip;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.github.pagehelper.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 获取地址工具类
 */
public class AddressUtils
{
    private static final Logger log = LoggerFactory.getLogger(AddressUtils.class);

    public static final String IP_URL = "http://ip.ws.126.net/ipquery"; // 新浪ip库

    public static String getRealAddressByIP(String ip)
    {
        String address = "XX XX";
        // 内网不查询
        if (IpUtils.internalIp(ip))
        {
            return "内网IP";
        }
        String rspStr = HttpUtil.get(IP_URL + "?ip=" + ip);
        rspStr = rspStr.substring(rspStr.lastIndexOf('{'), rspStr.indexOf('}') + 1);
        if (StringUtil.isEmpty(rspStr))
        {
            log.error("获取地理位置异常 {}", ip);
            return address;
        }
        JSONObject obj = JSONUtil.parseObj(rspStr);
        String province = (String)obj.get("province");
        String city = (String)obj.get("city");
        log.info("ip:{}在{}{}登录！", ip, province, city);
        address = province + city;
        return address;
    }
}