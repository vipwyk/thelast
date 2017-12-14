package com.mail;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

import java.util.Date;
import java.util.Properties;
public class MailBox {
    public String myEmailAccount = "vipwyk0506@163.com";
    public String myEmailPassword = "asd1234567";
    public String myEmailSMTPHost = "smtp.163.com";
    public  String attachedFileName="D:\\java\\adzuoye\\mail\\ZipTestCompressing.zip";
    private String htmlContent="祝您身体健康，万事如意！";
    public String receiveMailAccount = "kerwin.wang@foxmail.com";
  @Test
    public  void aa() throws Exception {
    	System.out.println("aaaa");
        Properties props = new Properties();                    
        props.setProperty("mail.transport.protocol", "smtp");   
        props.setProperty("mail.smtp.host", myEmailSMTPHost);  
        props.setProperty("mail.smtp.auth", "true");            
        Session session = Session.getInstance(props);
        session.setDebug(true);                                
       MimeMessage message = createMimeMessage(session, myEmailAccount, receiveMailAccount);
        Transport transport = session.getTransport();
        transport.connect(myEmailAccount, myEmailPassword);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    public MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail) throws Exception {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(sendMail, "王永康", "UTF-8"));
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "lhz", "UTF-8"));
        message.setSubject("信呼测试报告50例", "UTF-8"); 
        Multipart multipart = new MimeMultipart();
        System.out.println("attached file ");
        BodyPart attchmentPart = new MimeBodyPart();
        DataSource source = new FileDataSource(attachedFileName);
        attchmentPart.setDataHandler(new DataHandler(source));
        attchmentPart.setFileName(attachedFileName);
        multipart.addBodyPart(attchmentPart);
        message.setContent(multipart);   
        BodyPart htmlPart = new MimeBodyPart();
        htmlPart.setContent(htmlContent, "text/html;charset=UTF-8");
        multipart.addBodyPart(htmlPart);
        message.setSentDate(new Date());
        message.saveChanges();
        return message;
    }
}