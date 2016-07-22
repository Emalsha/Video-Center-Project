/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.controller;

import ijse.cmjd.model.Payment;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author emalsha
 */
public interface PaymentController {
    
    public boolean addPayment(Payment payment) throws RemoteException,ClassNotFoundException,IOException;
    
    public Payment searchPayment(String id) throws RemoteException,ClassNotFoundException,IOException;
    
    public Payment searchPaymentByDate(String date) throws RemoteException,ClassNotFoundException,IOException;
    
    public boolean updatePayment(Payment payment) throws RemoteException,ClassNotFoundException,IOException;
    
    public boolean deletePayment(String id) throws RemoteException,ClassNotFoundException,IOException;
    
    public ArrayList<Payment> getAllItem() throws RemoteException,ClassNotFoundException,IOException;
    
}
