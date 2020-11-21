package com.money.store.openplatform.service;


import com.money.store.common.constant.UserTypeEnum;
import org.springframework.web.multipart.MultipartFile;

/**
 * @program: store
 * @description: 上传文件Service
 * @author: Money
 * @create: 2020/04/07 15:04
 */
public interface UploadFileService {

    /**
     * 上传头像
     * @param file
     * @return 新文件位置 icon/[newFileName]
     */
    String uploadIcon(MultipartFile file);

    /**
     * 上传注册证明材料（手持身份证or营业执照）
     * @param userType 开发者类型
     * @param file
     * @return 新文件位置 [newFileName]
     */
    String uploadDocumentation(MultipartFile file, UserTypeEnum userType);

    /**
     * 上传APK
     * @param file
     * @param packageName 包名
     * @return
     */
    String uploadApk(MultipartFile file, String packageName);

    /**
     * 上传应用Logo
     * @param file
     * @return
     */
    String uploadLogo(MultipartFile file);

    /**
     * 上传应用截图
     * @param files
     * @return
     */
    String uploadPics(MultipartFile[] files);

    /**
     * 上传版权证明等相关证明
     * @param files
     * @return
     */
    String uploadCopyright(MultipartFile[] files);
}
