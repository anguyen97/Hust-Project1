/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.Random;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Admin
 */
public class SendMail {

    public boolean sendmail(String mail, String newPass) {
        try {
            Email email = new SimpleEmail();
            // Cấu hình thông tin Email Server
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("anhngtrung@gmail.com", "06031997.ant"));

            // Với gmail cái này là bắt buộc.
            email.setSSLOnConnect(true);

            // Người gửi
            email.setFrom("anhngtrung@gmail.com", "Hệ thống quản lý sinh viên trường ABC");

            // Tiêu đề
            email.setSubject("Xác nhận mật khẩu mới");

            // Nội dung email
            email.setMsg("Mật khẩu mới của bạn là\t" + newPass + "\nĐể an toàn, hãy đăng nhập lại hệ thống và thay đổi mật khẩu của mình");
            // Người nhận
            email.addTo(mail);
            //Gửi email
            email.send();
            //Thông báo khi gửi thành công !
            System.out.println("Sent Email Successfull ! Check youremail, please !");
            return true;
            
        } catch (Exception e) {
            System.out.println("Gửi không thành công !");
            return false;
        }
    }

    public String newpass = "";

    // hàm random tạo mật khẩu mới
    public String randomString() {

        String str01 = "abcdefghijklmnopqrstuvwxyz";
        String str02 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str03 = "0123456789";

        // These are the valid charecters use to random.
        // Đây là các ký tự được dùng để chuỗi ký tự ngẫu nhiên.
        String strValid = str01 + str02 + str03;

        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int randnum = random.nextInt(strValid.length());
            newpass = newpass + strValid.charAt(randnum);
        }

        return newpass;
    }
}
