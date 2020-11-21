package com.money.store.openplatform.util;

import net.dongliu.apk.parser.ApkFile;
import net.dongliu.apk.parser.bean.ApkMeta;
import net.dongliu.apk.parser.bean.UseFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: store
 * @description: Apk解析工具类
 * @author: Money
 * @create: 2020/04/07 16:28
 */
public class ApkUtil {

    private static final Logger logger = LoggerFactory.getLogger(ApkUtil.class);

    /**
     * 获取Apk信息
     *
     * @param file
     * @return
     */
    public static ApkMeta getApkMeta(File file) {
        ApkMeta apkMeta = null;
        try (ApkFile apkFile = new ApkFile(file)) {
            apkMeta = apkFile.getApkMeta();
        } catch (IOException e) {
            logger.error("解析错误！");
        }
        return apkMeta;
    }

}
