/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Object.SubjectClass;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QLLHT {

    public static ArrayList<SubjectClass> listDSLH;
    public static ArrayList<SubjectClass> listLHSVDK;

    //load data from file to arraylist
    public ArrayList<SubjectClass> loadFileDSLH() {
        listDSLH = new ArrayList<>();
        try {
            InputStream in = new FileInputStream("data/DSLopHoc.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            SubjectClass lopHP;
            while (s != null) {
                lopHP = new SubjectClass();
                String arr[] = s.split("\t");
                lopHP.setIdSubject(arr[0]);
                lopHP.setIdLopHoc(arr[1]);
                lopHP.setIdClassroom(arr[2]);
                lopHP.setThu(arr[3]);
                lopHP.setTietBatDau(arr[4]);
                lopHP.setTietKetThuc(arr[5]);
                listDSLH.add(lopHP);
                s = br.readLine();
            }
            reader.close();
            br.close();
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listDSLH;
    }

    //save data from arrayList to file
    public void saveFileDSLH(ArrayList<SubjectClass> listLHP) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/DSLopHoc.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            //sbw.newLine();
            for (SubjectClass subjectClass : listLHP) {
                bw.write(subjectClass.getIdSubject() + "\t" + subjectClass.getIdLopHoc() + "\t" + subjectClass.getIdClassroom()
                        + "\t" + subjectClass.getThu() + "\t" + subjectClass.getTietBatDau() + "\t" + subjectClass.getTietKetThuc());
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //kiểm tra xem có thể thêm lớp học mới vào ds lớp đăng ký kh: đã đk học phần chưa, mã lớp hợp lệ?, thứ? tiết học?    
    public boolean checkAddPossible(String idHPLH) {
        
        return false;
    }
    
    //load danh sách các lớp học sinh viên có id= idLogin đăng kí
    public ArrayList<SubjectClass> loadLHSVDK(String idLogin){
        listLHSVDK = new ArrayList<>();
        try {
            InputStream in = new FileInputStream("data/DKLopHoc.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            SubjectClass lopHP;
            while (s != null) {                
                String arr[] = s.split("\t");
                if(arr[0].equalsIgnoreCase(idLogin)){
                    listDSLH = loadFileDSLH();
                    for (int i = 1; i < arr.length; i++) {
                        for (int j = 0; j < listDSLH.size(); j++) {
                            if(arr[i].equalsIgnoreCase(listDSLH.get(j).getIdLopHoc())){
                                lopHP = new SubjectClass();
                                lopHP.setIdSubject(listDSLH.get(j).getIdSubject());
                                lopHP.setIdLopHoc(listDSLH.get(j).getIdLopHoc());
                                lopHP.setIdClassroom(listDSLH.get(j).getIdClassroom());
                                lopHP.setThu(listDSLH.get(j).getThu());
                                lopHP.setTietBatDau(listDSLH.get(j).getTietBatDau());
                                lopHP.setTietKetThuc(listDSLH.get(j).getTietKetThuc());
                                listLHSVDK.add(lopHP);
                                break;
                            }
                        }
                    }
                    break;
                }                
                s = br.readLine();
            }
            reader.close();
            br.close();
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }               
        return listLHSVDK;
    }
    
    //lưu danh sách sv đăng ký lớp học: id sv +ds lớp học sinh viên đk
    public void saveDKLH(ArrayList<SubjectClass> listLHSVDK, String idLogin) {
        Writer writer = null;
        try {
            removeDKLH(idLogin);
            writer = new FileWriter("data/DKLopHoc.txt", true);
            BufferedWriter bw = new BufferedWriter(writer);
            String dsLH = idLogin + "\t";
            if (listLHSVDK.size() != 0) {
                for (int i = 0; i < listLHSVDK.size(); i++) {
                    dsLH += listLHSVDK.get(i).getIdLopHoc()+ "\t";
                }
                bw.write(dsLH);
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public  void removeDKLH(String idLogin) {
        try {
            File inputFile = new File("data/DKLopHoc.txt");
            File tempFile = new File("data/myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains(idLogin)) {
                    continue;
                }
                writer.write(currentLine);
                writer.newLine();
            }
            writer.close();
            reader.close();
            inputFile.delete();
            System.out.println(tempFile.renameTo(inputFile));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //return subject'info has id = idSubject
    public String searchInfoLopHocByID(String idLopHoc) {
        listDSLH = loadFileDSLH();
        if (idLopHoc.equals("")) {
            return "null";
        } else {
            for (int i = 0; i < listDSLH.size(); i++) {
                if (listDSLH.get(i).getIdLopHoc().equalsIgnoreCase(idLopHoc)) {
                    return listDSLH.get(i).getIdSubject() + "\t" + listDSLH.get(i).getIdLopHoc()+ "\t"
                            + listDSLH.get(i).getIdClassroom()+ "\t" + listDSLH.get(i).getThu()+ "\t"
                            + listDSLH.get(i).getTietBatDau()+ "\t" + listDSLH.get(i).getTietKetThuc();
                }
            }
        }
        return "null";
    }

}
