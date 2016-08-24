/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.client.main;

import ijse.cmjd.controller.CustomerController;
import ijse.cmjd.controller.LoginController;
import ijse.cmjd.controller.RemoteFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Emalsha Rasad
 */
public class ServerConnector{
    
    private static ServerConnector serverConnector;
    private final RemoteFactory remoteFactory;
    
    private LoginController loginController;
    private CustomerController customerController;
    
    private ServerConnector() throws NotBoundException,MalformedURLException,RemoteException{
        remoteFactory = (RemoteFactory)Naming.lookup("rmi://localhost:5050/BOBShop");
    }
    
    public static ServerConnector getServerConnector() throws NotBoundException,MalformedURLException,RemoteException{
        if (serverConnector == null) {
            serverConnector = new ServerConnector();
        }
        return serverConnector;
    }
    
    public LoginController getLoginController() throws RemoteException,IOException,ClassNotFoundException{
        if (loginController == null ) {
            loginController = remoteFactory.getLoginController();
        }
        return loginController;
    }
    
    public CustomerController getCustomerController() throws RemoteException,IOException,ClassNotFoundException{
        if(customerController == null){
            customerController = remoteFactory.getCustomerController();
        }
        return customerController;
    }
}
