/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.controller;

import ijse.cmjd.model.Login;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author emalsha
 */
public interface LoginController extends Remote{
    
    public boolean searchLogin(Login login) throws RemoteException,IOException,ClassNotFoundException;
 

}