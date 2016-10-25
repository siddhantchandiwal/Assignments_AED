/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Siddhant
 */
public class ConfigureBusiness {

    public static Business intializeBusiness() {
        Business business = Business.getInstance();
        //create amin as employee
        Employee e = business.getEmployeeDirectory().addEmployee();
        e.setFirstName("Admin");
        e.setLastName("");
        e.setOrganization("NEU");

        //create useraccount for admin
        UserAccount ua = business.getUserAccountDirectory().addUserAccount();
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setPerson(e);
        ua.setRole(UserAccount.ADMIN_ROLE);
        ua.setIsactive(true);

        return business;

    }

}
