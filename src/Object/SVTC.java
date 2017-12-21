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
public class SVTC extends Student{

    public SVTC(String course, String school, String name, String birthday, String address, String email, String phone, String id, String password) {
        super(course, school, name, birthday, address, email, phone, id, password);
    }

    public SVTC() {
    }

    
    @Override
    public void checkGraduation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
