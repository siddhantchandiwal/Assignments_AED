/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountDirectory;

    public UserAccountDirectory() {
        userAccountDirectory = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(ArrayList<UserAccount> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public UserAccount addUserAccount() {
        UserAccount e = new UserAccount();
        userAccountDirectory.add(e);
        return e;
    }

    public void deleteUserAccount( UserAccount e) {
        userAccountDirectory.remove(e);
    }

}
