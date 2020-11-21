package com.money.store.openplatform.service.impl;

import com.money.store.common.constant.UserTypeEnum;
import com.money.store.openplatform.config.MoneyConfig;
import com.money.store.openplatform.service.UploadFileService;
import com.money.store.openplatform.util.file.UploadUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @program: store
 * @description: 上传文件Service实现类
 * @author: Money
 * @create: 2020/04/07 15:04
 */
@Service
public class UploadFileServiceImpl implements UploadFileService {

    /**
     * dev-windows: F:\\uploads\\user\\
     * prod-linux: /server/uploads/
     */
    private String prefixBaseDir = MoneyConfig.getBasePath();

    @Override
    public String uploadIcon(MultipartFile file) {
        if (file != null && !file.isEmpty()) {
            String baseDir = prefixBaseDir + "icon" + File.separator;
            String newFilePath = UploadUtil.upload(baseDir, file);
            if (newFilePath != null) {
                return "icon/" + newFilePath;
            }
        }
        return null;
    }

    @Override
    public String uploadDocumentation(MultipartFile file, UserTypeEnum userType) {
        if (file != null && !file.isEmpty()) {
            String typeDir = "";
            if (userType.equals(UserTypeEnum.PERSON_DEV)) {
                typeDir = "idCard";
            } else if (userType.equals(UserTypeEnum.COMPANY_DEV)) {
                typeDir = "businessLicense";
            }
            String baseDir = prefixBaseDir + typeDir + File.separator;
            String newFilePath = UploadUtil.upload(baseDir, file);
            if (newFilePath != null) {
                return typeDir + "/" + newFilePath;
            }
        }
        return null;
    }

    @Override
    public String uploadApk(MultipartFile file, String packageName) {
        if (file != null && !file.isEmpty()) {
            String baseDir = prefixBaseDir + "apk" + File.separator;
            String newFileName = packageName + System.currentTimeMillis();
            String newFilePath = UploadUtil.upload(baseDir, newFileName, file);
            if (newFilePath != null) {
                return  "/uploads/apk/" + newFilePath;
            }
        }
        return null;
    }

    @Override
    public String uploadLogo(MultipartFile file) {
        if (file != null && !file.isEmpty()) {
            String baseDir = prefixBaseDir + "app" + File.separator;
            String newFilePath = UploadUtil.upload(baseDir, file);
            if (newFilePath != null) {
                return "app/" + newFilePath;
            }
        }
        return null;
    }

    @Override
    public String uploadPics(MultipartFile[] files) {
        if (files != null) {
            StringBuilder sb = new StringBuilder();
            for (MultipartFile file : files) {
                String baseDir = prefixBaseDir + "app" + File.separator;
                String newFilePath = UploadUtil.upload(baseDir, file);
                if (newFilePath != null) {
                    sb.append("app/" + newFilePath + ",");
                }
            }
            return sb.deleteCharAt(sb.length() - 1).toString();
        }
        return null;
    }

    @Override
    public String uploadCopyright(MultipartFile[] files) {
        if (files != null) {
            StringBuilder sb = new StringBuilder();
            for (MultipartFile file : files) {
                String baseDir = prefixBaseDir + "app" + File.separator;
                String newFilePath = UploadUtil.upload(baseDir, file);
                if (newFilePath != null) {
                    sb.append("app/" + newFilePath + ",");
                }
            }
            return sb.deleteCharAt(sb.length() - 1).toString();
        }
        return null;
    }

}
