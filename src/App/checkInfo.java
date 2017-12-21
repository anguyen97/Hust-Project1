/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class checkInfo {

    public  boolean checkEmail(String email) {
        String dinhDangEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean ktEmail = email.matches(dinhDangEmail);
        if (ktEmail == false) {
            JOptionPane.showMessageDialog(null, "Email sai, nhap lai theo dang abc@domain.com");
            return false;
        } else {
            return true;
        }
    }

    public  boolean checkPhone(String sDT) {
        String reg_sdt = "(\\+84|0)\\d{9,10}";
        boolean ktSdt = sDT.matches(reg_sdt);
        if (ktSdt == false) {
            JOptionPane.showMessageDialog(null, "SDT nhap khong hop le, thuc hien nhap lai");
            return false;
        } else {
            return true;
        }
    }

    public  boolean checkBirthday(String ngaySinh) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            df.parse(ngaySinh);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Nhap ngay sinh sai, nhap lai ngay/thang/nam");
            return false;
        }
        return true;
    }
}
