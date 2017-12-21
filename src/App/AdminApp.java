/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Object.Admin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class AdminApp {
    static  ArrayList<Admin> listAD;
    
    //load file admin.txt
    public ArrayList<Admin> loadFile(){
        listAD = new ArrayList<Admin>();
        try {
            InputStream in = new FileInputStream("data/ADMIN.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            Admin ad;
            while (s!=null) {      
                String arr[]=s.split("\t");
                ad = new Admin();
                ad.setId(arr[0]);
                ad.setPassword(arr[1]);
                ad.setName(arr[2]);
                ad.setBirthday(arr[3]);
                ad.setAddress(arr[4]);
                ad.setEmail(arr[5]);
                ad.setPhone(arr[6]);
                listAD.add(ad);
                s = br.readLine();
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(AdminApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listAD;
    }
    
    //save file
    public void saveFile(ArrayList<Admin> listAD) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/ADMIN.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            //sbw.newLine();
            for (Admin admin : listAD) {
                bw.write(admin.getId() + "\t" + admin.getPassword() + "\t" + admin.getName() + "\t"
                        + admin.getBirthday() + "\t" + admin.getAddress() + "\t" + admin.getEmail() + "\t"
                        + admin.getPhone() );
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public boolean checkLogin(String textUsername, String textPassword){
        listAD = loadFile();
        for (int i = 0; i < listAD.size(); i++) {
            if(listAD.get(i).getId().equals(textUsername)&&listAD.get(i).getPassword().equals(textPassword)){
                
                return true;
            }
        }
        return false;
    }
    
    public int searchAD(String idSearch, String mailSearch) {
        listAD = loadFile();
        if (idSearch.isEmpty() && mailSearch.isEmpty()) {
            return -2;
        }
        if (idSearch.isEmpty()) {
            for (int i = 0; i < listAD.size(); i++) {
                if (listAD.get(i).getEmail().equals(mailSearch)) {
                    return i;
                }
            }
            return -1;
        }
        if (mailSearch.isEmpty()) {
            for (int i = 0; i < listAD.size(); i++) {
                if (listAD.get(i).getId().equals(idSearch)) {
                    return i;
                }
            }
            return -1;
        }
        for (int i = 0; i < listAD.size(); i++) {
            if (listAD.get(i).getId().equals(idSearch) && listAD.get(i).getEmail().equals(mailSearch)) {
                return i;
            }
        }
        return -3;
    }
}
