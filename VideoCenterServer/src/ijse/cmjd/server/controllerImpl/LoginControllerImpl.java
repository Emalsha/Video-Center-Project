/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.server.controllerImpl;

import ijse.cmjd.controller.LoginController;
import ijse.cmjd.model.Login;
import ijse.cmjd.server.fileaccess.LoginFileAccess;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author emalsha
 */
public class LoginControllerImpl extends UnicastRemoteObject implements LoginController{

    private final LoginFileAccess fileAccess;
    
    public LoginControllerImpl() throws RemoteException{
        this.fileAccess = new LoginFileAccess();
    }
    
    @Override
    public boolean searchLogin(Login login) throws RemoteException, IOException, ClassNotFoundException {
        boolean isUser = fileAccess.searchLogin(login);
        return isUser;
    }
    
}
