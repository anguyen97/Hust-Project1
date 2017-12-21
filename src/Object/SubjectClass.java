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
public class SubjectClass {
    private String idPhongHoc;
    private String idLopHoc;
    private String idHocPhan;
    private String Thu;
    private String tietBatDau;
    private String tietKetThuc;

    public SubjectClass(String idClassroom, String idLopHoc, String idSubject, String Thu, String tietBatDau, String tietKetThuc) {
        this.idPhongHoc = idClassroom;
        this.idLopHoc = idLopHoc;
        this.idHocPhan = idSubject;
        this.Thu = Thu;
        this.tietBatDau = tietBatDau;
        this.tietKetThuc = tietKetThuc;
    }

    public SubjectClass() {
    }

    public String getIdClassroom() {
        return idPhongHoc;
    }

    public void setIdClassroom(String idClassroom) {
        this.idPhongHoc = idClassroom;
    }

    public String getIdLopHoc() {
        return idLopHoc;
    }

    public void setIdLopHoc(String idLopHoc) {
        this.idLopHoc = idLopHoc;
    }

    public String getIdSubject() {
        return idHocPhan;
    }

    public void setIdSubject(String idSubject) {
        this.idHocPhan = idSubject;
    }

    public String getThu() {
        return Thu;
    }

    public void setThu(String Thu) {
        this.Thu = Thu;
    }

    public String getTietBatDau() {
        return tietBatDau;
    }

    public void setTietBatDau(String tietBatDau) {
        this.tietBatDau = tietBatDau;
    }

    public String getTietKetThuc() {
        return tietKetThuc;
    }

    public void setTietKetThuc(String tietKetThuc) {
        this.tietKetThuc = tietKetThuc;
    }

    
}
