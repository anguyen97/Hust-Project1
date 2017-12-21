/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Object.SVNC;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
public class SVNCApp {

    public static ArrayList<SVNC> listSVNC;
    private  String infoLog;

    //load data from file to arraylist
    public ArrayList<SVNC> loadFile() {
        listSVNC = new ArrayList<SVNC>();
        try {
            InputStream in = new FileInputStream("data/SVNC.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            SVNC svnc;
            while (s != null) {
                svnc = new SVNC();
                String arr[] = s.split("\t");
                svnc.setId(arr[0]);
                svnc.setPassword(arr[1]);
                svnc.setName(arr[2]);
                svnc.setBirthday(arr[3]);
                svnc.setAddress(arr[4]);
                svnc.setEmail(arr[5]);
                svnc.setPhone(arr[6]);
                svnc.setSchool(arr[7]);
                svnc.setCourse(arr[8]);
                listSVNC.add(svnc);
                s = br.readLine();
            }
            reader.close();
            br.close();
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listSVNC;
    }

    //save data from arrayList to file
    public void saveFile(ArrayList<SVNC> listSVNC) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/SVNC.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            //sbw.newLine();
            for (SVNC svnc : listSVNC) {
                bw.write(svnc.getId() + "\t" + svnc.getPassword() + "\t" + svnc.getName() + "\t"
                        + svnc.getBirthday() + "\t" + svnc.getAddress() + "\t" + svnc.getEmail() + "\t"
                        + svnc.getPhone() + "\t" + svnc.getSchool() + "\t" + svnc.getCourse());
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    //delete file
    public void deleteFile() {
        File file = new File("data/SVNC.txt");
        if (file.delete()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(SVNCApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //search by ID: return -2: input not available id and mail are null, -1: not found, i>=0:index,
    //  -3: not found row has both id & mail avialable
    public int searchStudent(String idSearch, String mailSearch) {
        listSVNC = loadFile();
        if (idSearch.isEmpty() && mailSearch.isEmpty()) {
            return -2;
        }
        if (idSearch.isEmpty()) {
            for (int i = 0; i < listSVNC.size(); i++) {
                if (listSVNC.get(i).getEmail().equals(mailSearch)) {
                    return i;
                }
            }
            return -1;
        }
        if (mailSearch.isEmpty()) {
            for (int i = 0; i < listSVNC.size(); i++) {
                if (listSVNC.get(i).getId().equals(idSearch)) {
                    return i;
                }
            }
            return -1;
        }
        for (int i = 0; i < listSVNC.size(); i++) {
            if (listSVNC.get(i).getId().equals(idSearch) && listSVNC.get(i).getEmail().equals(mailSearch)) {
                return i;
            }
        }
        return -3;
    }
    
    //check login true/false
    public static String schoolLogin;
    
    public boolean checkLogin(String textUsername, String textPassword){
        listSVNC = loadFile();
        for (int i = 0; i < listSVNC.size(); i++) {
            if(listSVNC.get(i).getId().equals(textUsername)&&listSVNC.get(i).getPassword().equals(textPassword)){
                infoLog = listSVNC.get(i).getId()+"\t"+listSVNC.get(i).getPassword()+"\t"
                        +listSVNC.get(i).getSchool()+"\t"+"Niên chế";
                return true;
            }
        }
        return false;
    }

    public String getInfoLog() {
        return infoLog;
    }

    public void setInfoLog(String infoLog) {
        this.infoLog = infoLog;
    }
    
    
   
    
    //using school to load edu-program
    public String checkSchoolLogin(String textUsername, String textPassword){
        listSVNC = loadFile();
        for (int i = 0; i < listSVNC.size(); i++) {
           if(listSVNC.get(i).getId().equals(textUsername)&&listSVNC.get(i).getPassword().equals(textPassword)){
               schoolLogin=listSVNC.get(i).getSchool();
               return schoolLogin;
           }
        }
        return "null";
    }
}
