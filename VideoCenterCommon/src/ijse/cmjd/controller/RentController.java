/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.controller;

import ijse.cmjd.model.Rent;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author emalsha
 */
public interface RentController {
    
    public boolean addRentDetail(Rent rent) throws RemoteException,ClassNotFoundException,IOException;
    
    public Rent searchRentDetail(String id) throws RemoteException,ClassNotFoundException,IOException;
    
    public Rent searchRentDetailByPaymentId(String p_id) throws RemoteException,ClassNotFoundException,IOException;
    
    public boolean updateRentDetail(Rent rent) throws RemoteException,ClassNotFoundException,IOException;
    
    public boolean deleteRentDetail(String id) throws RemoteException,ClassNotFoundException,IOException;
    
    public ArrayList<Rent> getAllRentDetail() throws RemoteException,ClassNotFoundException,IOException;
    
}
