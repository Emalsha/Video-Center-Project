/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.server.controllerImpl;

import ijse.cmjd.controller.CustomerController;
import ijse.cmjd.model.Customer;
import ijse.cmjd.server.fileaccess.CustomerFileAccess;
import ijse.cmjd.server.observerble.CustomerObserverble;
import java.rmi.*;
import java.io.*;
import java.util.*;
import java.rmi.server.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emalsha
 */
public class CustomerControllerImpl extends UnicastRemoteObject implements CustomerController{

    private final CustomerFileAccess customerFileAccess;
    private final CustomerObserverble customerObservable;
    
    
    public CustomerControllerImpl() throws RemoteException{
        this.customerObservable = new CustomerObserverble();
        this.customerFileAccess = new CustomerFileAccess();
    
    }
    
    @Override
    public boolean addCustomer(Customer customer) throws RemoteException, ClassNotFoundException, IOException {
        boolean isAdded = customerFileAccess.addCustomer(customer);
        if(isAdded){
            Customer searchCustomer = customerFileAccess.searchCustomer(customer.getCus_id());
            if(searchCustomer != null){
                new Thread(){
                    @Override
                    public void run(){
                        try{
                            customerObservable.notifyAllObservers("New customer added...");
                        }catch(RemoteException ex){
                            Logger.getLogger(CustomerControllerImpl.class.getName()).log(Level.SEVERE,null,ex);
                        }
                    }
                }.start();
            }
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public Customer searchCustomer(String id) throws RemoteException, ClassNotFoundException, IOException {
        return new Customer();
    }

    @Override
    public boolean updateCustomer(Customer customer) throws RemoteException, ClassNotFoundException, IOException {
        return true;
    }

    @Override
    public boolean deleteCustomer(Customer customer) throws RemoteException, ClassNotFoundException, IOException {
        return true;
    }

    @Override
    public ArrayList<Customer> getAllCustomer() throws RemoteException, ClassNotFoundException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
