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
public class Lecturer extends User{
    private String literacy;
    private String school;

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Lecturer(String literacy, String school, String name, String birthday, String address, String email, String phone, String id, String password) {
        super(name, birthday, address, email, phone, id, password);
        this.literacy = literacy;
        this.school = school;
    }

    public Lecturer() {
    }
    
}
