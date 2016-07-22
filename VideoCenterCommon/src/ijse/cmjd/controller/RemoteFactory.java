/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.controller;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author emalsha
 */
public interface RemoteFactory extends Remote{
     public CustomerController getCustomerController() throws RemoteException, IOException, ClassNotFoundException; 
     public ItemController getItemController() throws RemoteException, IOException, ClassNotFoundException;
     public PaymentController getPaymentController() throws RemoteException, IOException, ClassNotFoundException;
     public RentController getRentController() throws RemoteException, IOException, ClassNotFoundException;
}
