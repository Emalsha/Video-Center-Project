/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.controller;

import ijse.cmjd.model.Customer;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author emalsha
 */
public interface CustomerController extends Remote{
    public boolean addCustomer(Customer customer) throws RemoteException,ClassNotFoundException,IOException;
    
    public Customer searchCustomer(String id) throws RemoteException,ClassNotFoundException,IOException;
    
    public boolean updateCustomer(Customer customer) throws RemoteException,ClassNotFoundException,IOException;
    
    public boolean deleteCustomer(Customer customer) throws RemoteException,ClassNotFoundException,IOException;
    
    public ArrayList<Customer> getAllCustomer() throws RemoteException,ClassNotFoundException,IOException;
    
    
    //Observer , reserve , release methond not implement yet.
    
}
