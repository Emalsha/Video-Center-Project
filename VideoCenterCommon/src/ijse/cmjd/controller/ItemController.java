package ijse.cmjd.controller;


import ijse.cmjd.model.Item;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emalsha
 */
public interface ItemController extends Remote {
    
    public boolean addItem(Item item) throws RemoteException,ClassNotFoundException,IOException;
    
    public Item searchItemById(String id) throws RemoteException,ClassNotFoundException,IOException;
    
    public Item searchItemByDesc(String desc) throws RemoteException,ClassNotFoundException,IOException;
    
    public boolean updateItem(Item item) throws RemoteException,ClassNotFoundException,IOException;
    
    public boolean deleteItem(String id) throws RemoteException,ClassNotFoundException,IOException;
    
    public ArrayList<Item> getAllItem() throws RemoteException,ClassNotFoundException,IOException;
    
    //reserve, release , observer method not implemented
    
}
