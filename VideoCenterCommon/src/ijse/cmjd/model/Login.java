/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.model;

import java.io.Serializable;

/**
 *
 * @author emalsha
 */
public class Login implements Serializable {
    
    private String username;
    private String password;
    private String lastLogin;

    public Login() {
    }

    public Login(String username, String password, String lastLogin) {
        this.username = username;
        this.password = password;
        this.lastLogin = lastLogin;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the lastLogin
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin the lastLogin to set
     */
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
    
    
    
}
