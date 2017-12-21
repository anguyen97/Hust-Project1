/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Admin
 */
public class SubjectMark{
    private String  idStudent;
    private String idSubject;
    private String idLopHoc;
    private double diemQT;
    private double diemKT;
    private double trongSoQT;
    private double diemTK;
    private String diemChu;

    public double getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(double diemTK) {
        this.diemTK = diemTK;
    }

    public String getDiemChu() {
        return diemChu;
    }

    public void setDiemChu(String diemChu) {
        this.diemChu = diemChu;
    }

    public double getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(double diemQT) {
        this.diemQT = diemQT;
    }

    public SubjectMark(String idStudent, String idSubject, String idLopHoc, double diemQT, double diemKT, double trongSoQT, double diemTK, String diemChu) {
        this.idStudent = idStudent;
        this.idSubject = idSubject;
        this.idLopHoc = idLopHoc;
        this.diemQT = diemQT;
        this.diemKT = diemKT;
        this.trongSoQT = trongSoQT;
        this.diemTK = diemTK;
        this.diemChu = diemChu;
    }

    

    public SubjectMark() {
    }

    public double getDiemKT() {
        return diemKT;
    }

    public void setDiemKT(double diemKT) {
        this.diemKT = diemKT;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getIdLopHoc() {
        return idLopHoc;
    }

    public void setIdLopHoc(String idLopHoc) {
        this.idLopHoc = idLopHoc;
    }

    public double getTrongSoQT() {
        return trongSoQT;
    }

    public void setTrongSoQT(double trongSoQT) {
        this.trongSoQT = trongSoQT;
    }

    
    
}
