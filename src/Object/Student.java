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
public abstract class Student extends User{
    private String course;
    private String school;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student(String course, String school, String name, String birthday, String address, String email, String phone, String id, String password) {
        super(name, birthday, address, email, phone, id, password);
        this.course = course;
        this.school = school;
    }

    public Student() {
    }
    
    public abstract void checkGraduation();
}
