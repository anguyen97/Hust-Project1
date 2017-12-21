/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Object.Subject;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class QLHP {

    public static ArrayList<Subject> listSubject; //tất cả các học phần của các viện trong trường

    public static ArrayList<Subject> listHPDK; //tất cả học phần mà 1 sv đã đang ký

    public static String stringSubjectID; // string lưu vị trí các học phần có cùng tên trong danh sách học phần

    //danh sách tất cả các học phần
    public ArrayList<Subject> loadFileHP() {
        listSubject = new ArrayList<>();
        try {
            InputStream in = new FileInputStream("data/Subject.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            Subject subject;
            while (s != null) {
                subject = new Subject();
                String arr[] = s.split("\t");
                subject.setIdSubject(arr[0]);
                subject.setNameSubject(arr[1]);
                subject.setSchoolSubject(arr[2]);
                subject.setSoTC(arr[3]);
                subject.setPreSubject(arr[4]);
                subject.setSemester(arr[5]);
                subject.setTypeOfEdu(arr[6]);
                listSubject.add(subject);
                s = br.readLine();
            }
            reader.close();
            br.close();
        } catch (UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listSubject;
    }

    //save data from arrayList to file
    public void saveFileHP(ArrayList<Subject> listSubject) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/Subject.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            for (Subject subject : listSubject) {
                bw.write(subject.getIdSubject() + "\t" + subject.getNameSubject() + "\t" + subject.getSchoolSubject() + "\t"
                        + subject.getSoTC() + "\t" + subject.getPreSubject() + "\t" + subject.getSemester() + "\t"
                        + subject.getTypeOfEdu());
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    //return -2: input not available, -1: not found, >=0 index
    public int searchSubjectByID(String idSearch) {
        listSubject = loadFileHP();
        if (idSearch.equals("")) {
            return -2;
        } else {
            for (int i = 0; i < listSubject.size(); i++) {
                if (listSubject.get(i).getIdSubject().equalsIgnoreCase(idSearch)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //kiểm tra học phần đã có trong CTDT không
    public int searchSubjectCTDTByID(String idSearch, String school, String kieuDT) {
        listSubject = loadCTDT(school, kieuDT);
        if (idSearch.equals("")) {
            return -2;
        } else {
            for (int i = 0; i < listSubject.size(); i++) {
                if (listSubject.get(i).getIdSubject().equalsIgnoreCase(idSearch)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //Exit more than a subject has the same name but different id > select all id
    public String searchSubjectByName(String nameSearch) {
        //listSubject = loadFileHP();
        if (nameSearch.isEmpty()) {
            return "null";
        } else {
            stringSubjectID = "";
            for (int i = 0; i < listSubject.size(); i++) {
                if (listSubject.get(i).getNameSubject().equalsIgnoreCase(nameSearch)) {
                    stringSubjectID += i + "\t";
                }
            }
            return stringSubjectID;
        }
    }

    //CTDT mỗi viện
    public ArrayList<Subject> loadCTDT(String school, String kieuDT) {
        listSubject = new ArrayList<>();
        try {
            InputStream in = new FileInputStream("data/CTDT.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            Subject subject;
            while (s != null) {
                subject = new Subject();
                String arr[] = s.split("\t");
                if (arr[0].equalsIgnoreCase(school) && arr[7].equalsIgnoreCase(kieuDT)) {
                    subject.setIdSubject(arr[1]);
                    subject.setNameSubject(arr[2]);
                    subject.setSchoolSubject(arr[3]);
                    subject.setSoTC(arr[4]);
                    subject.setPreSubject(arr[5]);
                    subject.setSemester(arr[6]);
                    subject.setTypeOfEdu(arr[7]);
                    listSubject.add(subject);
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
        return listSubject;
    }

    //lưu chương trình đào tạo sinh viên > của admin
    public void saveCTDT(ArrayList<Subject> listSubject, String school) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/CTDT.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            for (Subject subject : listSubject) {
                bw.write(school + "\t" + subject.getIdSubject() + "\t" + subject.getNameSubject() + "\t" + subject.getSchoolSubject() + "\t"
                        + subject.getSoTC() + "\t" + subject.getPreSubject() + "\t" + subject.getSemester() + "\t"
                        + subject.getTypeOfEdu());
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    //load ds học phần sinh viên có mã idLogin đã đăng ký
    public ArrayList<Subject> loadHPDK(String idLogin) {
        listHPDK = new ArrayList<>();
        try {
            InputStream in = new FileInputStream("data/DKHP.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            Subject subject;
            while (s != null) {
                String arr[] = s.split("\t");
                if (arr[0].equalsIgnoreCase(idLogin)) {
                    listSubject = loadFileHP();
                    for (int i = 1; i < arr.length; i++) {
                        for (int j = 0; j < listSubject.size(); j++) {
                            if (arr[i].equalsIgnoreCase(listSubject.get(j).getIdSubject())) {
                                subject = new Subject();
                                subject.setIdSubject(arr[i]);
                                subject.setNameSubject(listSubject.get(j).getNameSubject());
                                subject.setSchoolSubject(listSubject.get(j).getSchoolSubject());
                                subject.setSoTC(listSubject.get(j).getSoTC());
                                subject.setPreSubject(listSubject.get(j).getPreSubject());
                                subject.setSemester(listSubject.get(j).getSemester());
                                subject.setTypeOfEdu(listSubject.get(j).getTypeOfEdu());
                                listHPDK.add(subject);
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
        return listHPDK;
    }

    //lưu danh sách đăng ký học phần: id sv +ds học phần sinh viên đk
    public void saveDKHP(ArrayList<Subject> listHPDK, String idLogin) {
        Writer writer = null;
        try {
            removeDKHP(idLogin);
            writer = new FileWriter("data/DKHP.txt", true);
            BufferedWriter bw = new BufferedWriter(writer);
            String dsHP = idLogin + "\t";
            if (listHPDK.size() != 0) {
                for (int i = 0; i < listHPDK.size(); i++) {
                    dsHP += listHPDK.get(i).getIdSubject() + "\t";
                }
                bw.write(dsHP);
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //return subject'info has id = idSubject
    public String searchSubjectDKHP(String idSubject) {
        listSubject = loadFileHP();
        if (idSubject.equals("")) {
            return "null";
        } else {
            for (int i = 0; i < listSubject.size(); i++) {
                if (listSubject.get(i).getIdSubject().equalsIgnoreCase(idSubject)) {
                    return listSubject.get(i).getIdSubject() + "\t" + listSubject.get(i).getNameSubject() + "\t"
                            + listSubject.get(i).getSchoolSubject() + "\t" + listSubject.get(i).getSoTC() + "\t"
                            + listSubject.get(i).getPreSubject() + "\t" + listSubject.get(i).getSemester() + "\t"
                            + listSubject.get(i).getTypeOfEdu();
                }
            }
        }
        return "null";
    }

    //delete line has id  = idLogin to save file, file doesn't has the same-id line
    public void removeDKHP(String idLogin) {
        try {
            File inputFile = new File("data/DKHP.txt");
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
            Logger.getLogger(QLHP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
