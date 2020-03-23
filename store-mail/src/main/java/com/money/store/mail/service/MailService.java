package com.money.store.mail.service;

/**
 * 邮箱发件Service
 */
public interface MailService {

    /**
     * 发送文本邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    boolean sendSimpleMail(String to, String subject, String content);
	
	/**
     * 批量发送文本邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    boolean sendSimpleMail(String to, String subject, String content, String... cc);
	
	/**
     * 发送HTML邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    boolean sendHtmlMail(String to, String subject, String content);

    /**
     * 发送带附件的邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     * @param filePath 附件路径
     */
    boolean sendAttachmentsMail(String to, String subject, String content, String filePath);

	/**
     * 发送图片邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     * @param rscPath
     * @param rscId
     */
    boolean sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);

}
