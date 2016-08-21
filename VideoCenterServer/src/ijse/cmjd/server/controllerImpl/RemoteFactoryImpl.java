/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.server.controllerImpl;

import ijse.cmjd.controller.CustomerController;
import ijse.cmjd.controller.ItemController;
import ijse.cmjd.controller.LoginController;
import ijse.cmjd.controller.PaymentController;
import ijse.cmjd.controller.RemoteFactory;
import ijse.cmjd.controller.RentController;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author emalsha
 */
public class RemoteFactoryImpl extends UnicastRemoteObject implements RemoteFactory{

    public RemoteFactoryImpl() throws RemoteException{}
    
    @Override
    public CustomerController getCustomerController() throws RemoteException, IOException, ClassNotFoundException {
        return new CustomerControllerImpl();
    }

    @Override
    public ItemController getItemController() throws RemoteException, IOException, ClassNotFoundException {
        return new ItemControllerImpl();
    }

    @Override
    public PaymentController getPaymentController() throws RemoteException, IOException, ClassNotFoundException {
        return new PaymentControllerImpl();
    }

    @Override
    public RentController getRentController() throws RemoteException, IOException, ClassNotFoundException {
        return new RentControllerImpl();
    }

    @Override
    public LoginController getLoginController() throws RemoteException, IOException, ClassNotFoundException {
        return new LoginControllerImpl();
    }
    
    
    
}
