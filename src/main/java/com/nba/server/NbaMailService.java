package com.nba.server;

import org.springframework.stereotype.Service;

@Service
public class NbaMailService {
//
//    @Autowired
//    MailProperties mailProperties;
//
//    @Autowired
//    JavaMailSenderImpl javaMailSender;
//
//    @Value("${spring.mail.username}")  //发送人的邮箱  比如155156641XX@163.com
//    private String from;
//
//    /**
//     * 发送简单邮件
//     *
//     * @param subject 主题
//     * @param text    内容
//     * @param to      目标
//     */
//    @Async  //意思是异步调用这个方法
//    public void sendSimpleMail(String subject, String text, String to) {
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setFrom(mailProperties.getFrom());
//        mailMessage.setTo(to);
//
//        mailMessage.setSubject(subject);
//        mailMessage.setText(text);
//
//        javaMailSender.send(mailMessage);
//    }
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
