package com.money.store.openplatform.util;


import com.money.store.common.constant.UserTypeEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 *@program: appstore
 *@description: 上传工具类
 *@author: Money
 *@create: 2020/01/30 15:07
 */
@Component
public class UploadUtil {

    @Value("${upload.BASE_PATH}")
    public String UPLOAD_BASE_PATH;

    /**
     * 上传头像
     *
     * @param file
     * @return 新文件名 icon/[newFileName]
     */
    public String uploadIcon(MultipartFile file) {
        if (file != null && !file.isEmpty()) {
            String originalFilename = file.getOriginalFilename();
            String newFileNamePrefix = System.currentTimeMillis() + "";
            String newFileName = newFileNamePrefix + originalFilename.substring(originalFilename.lastIndexOf("."));
            String iconBasePath = UPLOAD_BASE_PATH + "icon" + File.separator;
            File dir = new File(iconBasePath);
            if(!dir.exists()) {
                dir.mkdirs();
            }
            File newFile = new File( iconBasePath + newFileName);
            try{
                file.transferTo(newFile);
            }catch(IOException e){
                return null;
            }
            return "icon/" + newFileName;
        }
        return null;
    }

    /**
     * 上传注册证明材料（手持身份证or营业执照）
     *
     * @param userType 开发者类型
     * @param file
     * @return 新文件名 [newFileName]
     */
    public String uploadDocumentation(Integer userType, MultipartFile file) {
        if (file != null && !file.isEmpty()) {
            String dirPath = "";
            if (userType.equals(UserTypeEnum.PERSON_DEV.getId())) {
                dirPath = "idCard";
            } else if (userType.equals(UserTypeEnum.COMPANY_DEV.getId())) {
                dirPath = "businessLicense";
            }
            String originalFilename = file.getOriginalFilename();
            String newFileNamePrefix = System.currentTimeMillis() + "";
            String newFileName = newFileNamePrefix + originalFilename.substring(originalFilename.lastIndexOf("."));
            String documentationBasePath  = UPLOAD_BASE_PATH + dirPath + File.separator;
            File dir = new File(documentationBasePath);
            if(!dir.exists()) {
                dir.mkdir();
            }
            File newFile = new File( documentationBasePath + newFileName);
            try{
                file.transferTo(newFile);
            }catch(IOException e){
                return null;
            }
            return newFileName;
        }
        return null;
    }
}
