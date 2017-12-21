/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Object.SVTC;

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
public class SVTCApp {

    public static ArrayList<SVTC> listSVTC;

    private String infoLog;
    //load data from file to arraylist
    public ArrayList<SVTC> loadFile() {
        listSVTC = new ArrayList<SVTC>();
        try {
            InputStream in = new FileInputStream("data/SVTC.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            SVTC svtc;
            while (s != null) {
                svtc = new SVTC();
                String arr[] = s.split("\t");
                svtc.setId(arr[0]);
                svtc.setPassword(arr[1]);
                svtc.setName(arr[2]);
                svtc.setBirthday(arr[3]);
                svtc.setAddress(arr[4]);
                svtc.setEmail(arr[5]);
                svtc.setPhone(arr[6]);
                svtc.setSchool(arr[7]);
                svtc.setCourse(arr[8]);
                listSVTC.add(svtc);
                s = br.readLine();
            }
            reader.close();
            br.close();
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listSVTC;
    }

    //save data from arrayList to file
    public void saveFile(ArrayList<SVTC> listSVTC) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/SVTC.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            //sbw.newLine();
            for (SVTC svtc : listSVTC) {
                bw.write(svtc.getId() + "\t" + svtc.getPassword() + "\t" + svtc.getName() + "\t"
                        + svtc.getBirthday() + "\t" + svtc.getAddress() + "\t" + svtc.getEmail() + "\t"
                        + svtc.getPhone() + "\t" + svtc.getSchool() + "\t" + svtc.getCourse());
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
        File file = new File("data/SVTC.txt");
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
        listSVTC = loadFile();
        if (idSearch.equals("") && mailSearch.equals("")) {
            return -2;
        }
        if (idSearch.equals("")) {
            for (int i = 0; i < listSVTC.size(); i++) {
                if (listSVTC.get(i).getEmail().equals(mailSearch)) {
                    return i;
                }
            }
            return -1;
        }
        if (mailSearch.equals("")) {
            for (int i = 0; i < listSVTC.size(); i++) {
                if (listSVTC.get(i).getId().equals(idSearch)) {
                    return i;
                }
            }
            return -1;
        }
        for (int i = 0; i < listSVTC.size(); i++) {
            if (listSVTC.get(i).getId().equals(idSearch) && listSVTC.get(i).getEmail().equals(mailSearch)) {
                return i;
            }
        }
        return -3;
    }

    //check login true/false
//    public boolean checkLogin(String textUsername, String textPassword) {
//        listSVTC = loadFile();
//        for (int i = 0; i < listSVTC.size(); i++) {
//            if (listSVTC.get(i).getId().equals(textUsername) && listSVTC.get(i).getPassword().equals(textPassword)) {
//                return true;
//            }
//        }
//        return false;
//    }
    public boolean checkLogin(String textUsername, String textPassword){
        listSVTC = loadFile();
        for (int i = 0; i < listSVTC.size(); i++) {
            if(listSVTC.get(i).getId().equals(textUsername)&&listSVTC.get(i).getPassword().equals(textPassword)){
                infoLog = listSVTC.get(i).getId()+"\t"+listSVTC.get(i).getPassword()+"\t"
                        +listSVTC.get(i).getSchool()+"\t"+"Tín chỉ";
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
    
    
}
