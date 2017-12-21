/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Object.Lecturer;
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

/**
 *
 * @author Admin
 */
public class LecturerApp {
    public static ArrayList<Lecturer> listLecturer;

    //load data from file to arraylist
    public ArrayList<Lecturer> loadFile() {
        listLecturer = new ArrayList<Lecturer>();
        try {
            InputStream in = new FileInputStream("data/Lecturer.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            Lecturer lecturer;
            while (s != null) {
                lecturer = new Lecturer();
                String arr[] = s.split("\t");
                lecturer.setId(arr[0]);
                lecturer.setPassword(arr[1]);
                lecturer.setName(arr[2]);
                lecturer.setBirthday(arr[3]);
                lecturer.setAddress(arr[4]);
                lecturer.setEmail(arr[5]);
                lecturer.setPhone(arr[6]); 
                lecturer.setLiteracy(arr[7]);
                lecturer.setSchool(arr[8]);
                listLecturer.add(lecturer);
                s = br.readLine();
            }
            reader.close();
            br.close();
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listLecturer;
    }

    //save data from arrayList to file
    public void saveFile(ArrayList<Lecturer> listLecturer) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/Lecturer.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            //sbw.newLine();
            for (Lecturer lecturer : listLecturer) {
                bw.write(lecturer.getId() + "\t" + lecturer.getPassword() + "\t" + lecturer.getName() + "\t"
                        + lecturer.getBirthday() + "\t" + lecturer.getAddress() + "\t" + lecturer.getEmail() + "\t"
                        + lecturer.getPhone()+"\t"+lecturer.getLiteracy()+"\t"+lecturer.getSchool());
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public int searchLecturer(String idSearch, String mailSearch) {
        listLecturer = loadFile();
        if (idSearch.isEmpty() && mailSearch.isEmpty()) {
            return -2;
        }
        if (idSearch.isEmpty()) {
            for (int i = 0; i < listLecturer.size(); i++) {
                if (listLecturer.get(i).getEmail().equals(mailSearch)) {
                    return i;
                }
            }
            return -1;
        }
        if (mailSearch.isEmpty()) {
            for (int i = 0; i < listLecturer.size(); i++) {
                if (listLecturer.get(i).getId().equals(idSearch)) {
                    return i;
                }
            }
            return -1;
        }
        for (int i = 0; i < listLecturer.size(); i++) {
            if (listLecturer.get(i).getId().equals(idSearch) && listLecturer.get(i).getEmail().equals(mailSearch)) {
                return i;
            }
        }
        return -3;
    }
    
    public boolean checkLogin(String textUsername, String textPassword){
        listLecturer = loadFile();
        for (int i = 0; i < listLecturer.size(); i++) {
            if(listLecturer.get(i).getId().equals(textUsername)&&listLecturer.get(i).getPassword().equals(textPassword)){
                return true;
            }
        }
        return false;
    }
}
