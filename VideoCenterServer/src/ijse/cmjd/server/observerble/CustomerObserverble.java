/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.server.observerble;

import ijse.cmjd.model.Customer;
import ijse.cmjd.observer.CustomerObserver;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author emalsha
 */
public class CustomerObserverble {
    
    private static final ArrayList<CustomerObserver> LIST = new ArrayList<>();
    
    public void addCustomerObserver(CustomerObserver customerObserver){
        LIST.add(customerObserver);
    }
    
    public void removeCustomerObserver(CustomerObserver customerObserver){
        LIST.remove(customerObserver);
    }
    
    public void notifyAllObservers(String msg) throws RemoteException{
        for(CustomerObserver customerObserver : LIST ){
            customerObserver.update(msg);
        }
    }
    
    public void customerAdded(Customer customer)throws RemoteException{
        notifyAllObservers("Customer added to observe...");
    }
    
    public void customerDeleted(Customer customer)throws RemoteException{
        notifyAllObservers("Customer removed from obseerve...");
    }
    
    public void customerUpdate(Customer customer)throws RemoteException{
        notifyAllObservers("Customer updated in observer...");
    }
    
}
