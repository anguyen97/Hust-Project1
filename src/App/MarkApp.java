/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Object.SubjectMark;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class MarkApp {

    public static ArrayList<SubjectMark> listDHP;

    //load data from file to arraylist
    public ArrayList<SubjectMark> loadFile() {
        listDHP = new ArrayList<SubjectMark>();
        try {
            InputStream in = new FileInputStream("data/Mark.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            SubjectMark mark;

            while (s != null) {
                mark = new SubjectMark();
                String arr[] = s.split("\t");
                mark.setIdLopHoc(arr[0]);
                mark.setIdSubject(arr[1]);
                mark.setIdStudent(arr[2]);
                mark.setDiemQT(Float.parseFloat(arr[3]));
                mark.setDiemKT(Float.parseFloat(arr[4]));
                mark.setTrongSoQT(Float.parseFloat(arr[5]));
                mark.setDiemTK(Float.parseFloat(arr[6]));
                mark.setDiemChu(arr[7]);
                listDHP.add(mark);
                s = br.readLine();
            }
            reader.close();
            br.close();
        } catch (UnsupportedEncodingException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
        return listDHP;
    }

    //save data from arrayList to file
    public void saveFile(ArrayList<SubjectMark> listDHP) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/Mark.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            //sbw.newLine();
            for (SubjectMark mark : listDHP) {
                bw.write(mark.getIdLopHoc() + "\t" + mark.getIdSubject() + "\t" + mark.getIdStudent() + "\t"
                        + mark.getDiemQT() + "\t" + mark.getDiemKT() + "\t" + mark.getTrongSoQT() + "\t"
                        + mark.getDiemTK() + "\t" + mark.getDiemChu());
                bw.newLine();
            }
            bw.close();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public boolean checkDiemTP(String mark) {
        double markTP = Double.valueOf(mark);
        if (markTP <= 10.0 && markTP >= 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkTrongSo(String trongSoQT) {
        double trongSo = Double.valueOf(trongSoQT);
        if (trongSo < 1.0 && trongSo > 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public double diemTK(String giuaKy, String cuoiKy, String trongSo) {
        Double diem = Double.valueOf(giuaKy) * Double.valueOf(trongSo) + Double.valueOf(cuoiKy) * (1 - Double.valueOf(trongSo));
        if (diem >= 8.5) {
            return 4.0;
        } else if (diem < 8.5 && diem >= 8.0) {
            return 3.5;
        } else if (diem < 8.0 && diem >= 7.0) {
            return 3.0;
        } else if (diem < 7.0 && diem >= 6.5) {
            return 2.5;
        } else if (diem < 6.5 && diem >= 5.5) {
            return 2.0;
        } else if (diem < 5.5 && diem >= 5.0) {
            return 1.5;
        } else if (diem < 5.0 && diem >= 4.0) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public String diemQuyDoi(String diem) {
        switch (diem) {
            case "4.0": {
                return "A";
            }
            case "3.5": {
                return "B+";
            }
            case "3.0": {
                return "B";
            }
            case "2.5": {
                return "C+";
            }
            case "2.0": {
                return "C";
            }
            case "1.5": {
                return "D+";
            }
            case "1.0": {
                return "D";
            }
            case "0": {
                return "F";
            }
        }
        return null;
    }

    public ArrayList<SubjectMark> loadMarkByID(String idLogin) {
        listDHP = new ArrayList<SubjectMark>();
        try {
            InputStream in = new FileInputStream("data/Mark.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            SubjectMark mark;
            while (s != null) {
                mark = new SubjectMark();
                String arr[] = s.split("\t");
                if (arr[2].equalsIgnoreCase(idLogin)) {
                    mark.setIdLopHoc(arr[0]);
                    mark.setIdSubject(arr[1]);
                    mark.setIdStudent(arr[2]);
                    mark.setDiemQT(Float.parseFloat(arr[3]));
                    mark.setDiemKT(Float.parseFloat(arr[4]));
                    mark.setTrongSoQT(Float.parseFloat(arr[5]));
                    mark.setDiemTK(Float.parseFloat(arr[6]));
                    mark.setDiemChu(arr[7]);
                    listDHP.add(mark);
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
        return listDHP;
    }

    public void readExcel(String filePath) {
        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            XSSFWorkbook wb = new XSSFWorkbook(file);
            //lấy trang đầu tiên của file excel
            XSSFSheet sheet = wb.getSheetAt(0);
            FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
            Writer writer = null;
            writer = new FileWriter("data/Mark.txt", true);
            BufferedWriter bw = new BufferedWriter(writer);
            Iterator<Row> rowIterator = sheet.iterator();
            Row row = rowIterator.next();
            while (rowIterator.hasNext()) {
                row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    CellType cellType = cell.getCellTypeEnum();
                    FormulaEvaluator evaluator;
                    switch (cellType) {
                        case STRING:
                            bw.write(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            bw.write(Double.toString(cell.getNumericCellValue()) + "\t");
                            break;
                        case FORMULA:
                            evaluator = wb.getCreationHelper().createFormulaEvaluator();
                            if (cellIterator.hasNext()) {
                                bw.write(evaluator.evaluate(cell).getNumberValue() + "\t");
                            } else {
                                bw.write(evaluator.evaluate(cell).getStringValue() + "\t");
                            }
                            break;
                    }
                }
                bw.newLine();
            }
//            for (Row row : sheet) {
//                
//                for (Cell cell : row) {
//                    switch(formulaEvaluator.evaluate(cell).getCellType()){
//                        case Cell.CELL_TYPE_STRING:
//                            bw.write(cell.getStringCellValue()+"\t");
//                            break;
//                        case Cell.CELL_TYPE_NUMERIC:
//                            bw.write(Double.toString(cell.getNumericCellValue())+"\t");
//                            break;
//                    }
//                }
//                bw.newLine();
//            }
            bw.close();
            writer.close();
            file.close();
            JOptionPane.showMessageDialog(null, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File không hợp lệ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Thao tác thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String loadDateMark() {
        InputStream in = null;
        String dateMark = "";
        try {
            in = new FileInputStream("data/DateInputMark.txt");
            Reader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();
            while (s != null) {
                dateMark += s;
                s = br.readLine();
            }
            br.close();
            in.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Thời gian nhập điểm không xác định", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        return dateMark;
    }

    public void saveDateMark(String dateMarkBegin, String dateMarkEnd) {
        Writer writer = null;
        try {
            writer = new FileWriter("data/DateInputMark.txt", false);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(dateMarkBegin+"-"+dateMarkEnd);
            bw.close();
            writer.close();
            JOptionPane.showMessageDialog(null, "Cập nhật thời gian thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
