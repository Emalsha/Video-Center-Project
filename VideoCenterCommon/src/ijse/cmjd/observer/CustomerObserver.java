/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.observer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author emalsha
 */
public interface CustomerObserver extends Remote{
    public void update(String msg) throws RemoteException;
}
