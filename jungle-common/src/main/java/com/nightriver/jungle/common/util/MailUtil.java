package com.nightriver.jungle.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * 〈邮件工具〉<br>
 * 〈 〉
 *
 * @author hyz
 * @create 2019/3/7
 * @since 1.0.0
 */
public class MailUtil {
    @Autowired
    private JavaMailSender mailSender;
    @Value("${spring.mail.from}")
    private String from;


    public static String random(int length) {
        String random = "";
        /*随机数函数*/
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < length; i++) {
            /*生成36以内的随机数，不含36，并转化为36位*/
            random += Integer.toString(r.nextInt(10));
        }
        return random;
    }

    public static String html(String code) throws Exception {
        String mailtemplatsPath ="/mail/register.html";
        //TODO 改为模板型的邮件发送
//        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
//        Template template = freeMarkerConfigurer.getConfiguration().getTemplate(mailtemplatsPath);
//        String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, code);
        return "<table style='width: 538px; background-color: #393836;' align='center' cellspacing='0' cellpadding='0'><tbody><tr><td style=' height: 65px; background-color: #000000; border-bottom: 1px solid #4d4b48;'>       <img src='' width='538' height='65'>    </td></tr><tr><td bgcolor='#17212e'><table width='470' border='0' align='center' cellpadding='0' cellspacing='0' style='padding-left: 5px; padding-right: 5px; padding-bottom: 10px;'><tbody><tr bgcolor='#17212e'><td style='padding-top: 32px;'><span style='padding-top: 16px; padding-bottom: 16px; font-size: 24px; color: #66c0f4; font-family: Arial, Helvetica, sans-serif; font-weight: bold;'>亲爱的&nbsp;用户,</span><br></td></tr><tr bgcolor='#121a25'><td style='padding: 20px; font-size: 12px; line-height: 17px; color: #c6d4df; font-family: Arial, Helvetica, sans-serif;'> <p>感谢您的注册，请输入以下验证您的电子邮件地址。</p> <span style='font-size: 24px; color: #66c0f4; font-family: Arial, Helvetica, sans-serif; font-weight: bold;'>"+
                code+"</span>  </td></tr><tr><td style='font-size: 12px; color: #6d7880; padding-top: 16px; padding-bottom: 60px;'>          The Jungle Team<br>          <a style='color: #8f98a0;' href='' rel='noopener' target='_blank'>localhost:9110</a><br>          </td></tr></tbody></table></td></tr> <tr><td bgcolor='#000000'>   <table width='460' height='55' border='0' align='center' cellpadding='0' cellspacing='0'>    <tbody><tr valign='top'>     <td width='110'>      <a href='' target='_blank' style=' color: #8B8B8B; font-size: 10px; font-family: Trebuchet MS, Verdana, Arial, Helvetica, sans-serif; text-transform: uppercase; ' font-size:='font-size:' px='px' color:='color:' b8b8b='b8b8b' font-family:='font-family:' trebuchet='trebuchet' ms='ms' text-transform:='text-transform:' uppercase='uppercase' rel='noopener'><img src='' width='92' height='26' hspace='0' vspace='0' border='0' align='top'><span></span></a></td> <td width='350' valign='top'>  <span style='color: #999999; font-size: 9px; font-family: Verdana, Arial, Helvetica, sans-serif;'>© Valve Corporation. All rights reserved. All trademarks are property of their respective owners in the US and other countries.</span> </td>    </tr>    </tbody></table></td> </tr><tr></tr></tbody></table>";
    }
}
