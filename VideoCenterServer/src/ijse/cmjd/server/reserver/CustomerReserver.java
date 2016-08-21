/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.server.reserver;

import ijse.cmjd.controller.CustomerController;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Emalsha Rasad
 */
public class CustomerReserver {
    private final Map<String,CustomerController> reservedData = new Hashtable<>();  
    
    public boolean reserveCustomer(String id , CustomerController customerController){
        if(reservedData.containsKey(id)){
            if(reservedData.get(id)==customerController){
                return true;
            }else{
                return false;
            }
        }else{
            reservedData.put(id, customerController);
            return true;
        }
    }
    
    public boolean releaseCustomer(String id,CustomerController customerController){
        if(reservedData.get(id) == customerController){
            reservedData.remove(id);
            return true;
        }else{
            return false;
        }
    }
}
