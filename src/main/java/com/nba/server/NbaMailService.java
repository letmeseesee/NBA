package com.nba.server;

import com.nba.config.MailConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NbaMailService {
    private Logger logger = LoggerFactory.getLogger(NbaMailService.class);

    @Autowired
    private JavaMailSenderImpl mailSender;

    @Autowired
    private MailConfig mailConfig;
//
//    /**
//     * 发送简单邮件
//     *
//     * @param subject 主题
//     * @param text    内容
//     * @param to      目标
//     */
    public void sendSimpleMail(String subject, String text, String to) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(mailConfig.getUsername());
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(text);
        mailSender.send(mailMessage);

        logger.info("从{}向邮箱{}发送邮件",mailConfig.getFrom(),to);
        logger.info("从{}向邮箱{}发送邮件",mailConfig.getFrom(),to);
    }
//
//    /**
//     * 发送附件邮件
//     *
//     * @param subject       主题
//     * @param text          内容
//     * @param to            目标
//     * @param attachmentMap 附件
//     * @throws MessagingException
//     */
//    @Async
//    public void sendHtmlMail(String subject, String text, String to, Map<String, String> attachmentMap)
//            throws MessagingException {
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//
//        //是否发送的邮件是富文本（附件，图片，html等）
//        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
//
//        messageHelper.setFrom(mailProperties.getFrom());
//        messageHelper.setTo(mailProperties.getTo());
//
//        messageHelper.setSubject(subject);
//        messageHelper.setText(text, true);//重点，默认为false，显示原始html代码，无效果
//
//        if (attachmentMap != null) {
//            attachmentMap.entrySet().stream().forEach(entrySet -> {
//                try {
//                    File file = new File(entrySet.getValue());
//                    if (file.exists()) {
//                        messageHelper.addAttachment(entrySet.getKey(), new FileSystemResource(file));
//                    }
//                } catch (MessagingException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//        javaMailSender.send(mimeMessage);
//    }
//
//
//    /**
//     * @param subject
//     * @param params
//     * @throws MessagingException
//     * @throws IOException
//     * @throws TemplateException
//     */
//    @Async
//    public void sendTemplateMail(String subject, Map<String, Object> params, String to)
//            throws MessagingException, IOException, TemplateException {
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//        helper.setFrom(mailProperties.getFrom());
//        helper.setTo(mailProperties.getTo());
//
//        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
//        configuration.setClassForTemplateLoading(this.getClass(), "/templates");
//
//        String html = FreeMarkerTemplateUtils.processTemplateIntoString(configuration.getTemplate("mail.ftl"), params);
//
//        helper.setSubject(subject);
//        helper.setText(html, true);//重点，默认为false，显示原始html代码，无效果
//
//        javaMailSender.send(mimeMessage);
//    }

}
