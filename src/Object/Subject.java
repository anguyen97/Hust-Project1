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
public class Subject {

    private String idSubject;
    private String nameSubject;
    private String schoolSubject;
    private String soTC;
    private String preSubject;
    private String semester;
    private String typeOfEdu;

    public String getTypeOfEdu() {
        return typeOfEdu;
    }

    public void setTypeOfEdu(String typeOfEdu) {
        this.typeOfEdu = typeOfEdu;
    }

    public Subject(String idSubject, String nameSubject, String schoolSubject, String soTC, String preSubject, String semester, String typeOfEdu) {
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
        this.schoolSubject = schoolSubject;
        this.soTC = soTC;
        this.preSubject = preSubject;
        this.semester = semester;
        this.typeOfEdu = typeOfEdu;
    }

   

    public Subject() {
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public String getSoTC() {
        return soTC;
    }

    public void setSoTC(String soTC) {
        this.soTC = soTC;
    }

    public String getPreSubject() {
        return preSubject;
    }

    public void setPreSubject(String preSubject) {
        this.preSubject = preSubject;
    }

}
