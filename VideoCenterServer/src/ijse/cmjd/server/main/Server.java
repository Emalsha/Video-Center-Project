/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.server.main;

import ijse.cmjd.server.controllerImpl.RemoteFactoryImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author emalsha
 */
public class Server {
    public static boolean serverStart = false;
    
    public static boolean StartServer(){
        
        if(!serverStart){
            try {
                Registry registry = LocateRegistry.createRegistry(5050);
                registry.rebind("BOBShop", new RemoteFactoryImpl());
                serverStart = true;
                System.out.println("Server started//");
            } catch (Exception e) {
                serverStart = false;
            }
        }
        return serverStart;
    }
}
