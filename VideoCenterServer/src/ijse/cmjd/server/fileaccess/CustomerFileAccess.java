/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.server.fileaccess;

import ijse.cmjd.model.Customer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.StringTokenizer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author emalsha
 */
public class CustomerFileAccess {
    private final File file = new File("./src/ijse/cmjd/database/customer.txt");
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Object RW_LOCK;
    private FileWriter fileWriter;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    
    public boolean addCustomer(Customer customer) throws RemoteException,IOException,ClassNotFoundException {
        
        try{
            lock.writeLock().lock();
            bufferedWriter = null;
            fileWriter = null;
            
            try{
                if(!file.exists()){
                    file.createNewFile();
                }
                
                String data ="";
                
                data += customer.getCus_id() + "$";
                data += customer.getCus_name() + "$";
                data += customer.getCus_address() + "$";
                data += customer.getCus_mobile() + "$";
                data += customer.getCus_nic() + "$";
                
                fileWriter = new FileWriter(file,true);
                bufferedWriter = new BufferedWriter(fileWriter);
                
                bufferedWriter.write(data);
                bufferedWriter.flush();
             
            }finally{
                bufferedWriter.close();
                fileWriter.close();
            }
            return true;
        }finally{
            lock.writeLock().unlock();
        }
        
    }
    
    public Customer searchCustomer(String id) throws IOException,ClassNotFoundException,RemoteException{
        
        if(file.exists()){
            
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(line,"$");
            String ar[] = new String[stringTokenizer.countTokens()];
            for(int i=0;i<ar.length;i++){
                if(stringTokenizer.hasMoreTokens()){
                    ar[i] = stringTokenizer.nextToken();
                }
            }
            bufferedReader.close();
            Customer customer = null;
            
            for(int i=0;i<ar.length;i += 5){
                if(id.equals(ar[i])){
                    customer = new Customer();
                    customer.setCus_id(ar[i]);
                    customer.setCus_name(ar[i+1]);
                    customer.setCus_address(ar[i+2]);
                    customer.setCus_mobile(ar[i+3]);
                    customer.setCus_nic(ar[i+4]);
                    break;
                }
            }
            
            return customer;
            
        }else{
            return null;
        }
    }
    
    public Customer searchCustomerNIC(String nic) throws IOException,ClassNotFoundException,RemoteException{
        
        if(file.exists()){
            
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(line,"$");
            String ar[] = new String[stringTokenizer.countTokens()];
            for(int i=0;i<ar.length;i++){
                if(stringTokenizer.hasMoreTokens()){
                    ar[i] = stringTokenizer.nextToken();
                }
            }
            bufferedReader.close();
            Customer customer = null;
            
            for(int i=0;i<ar.length;i += 5){
                if(nic.equals(ar[i+4])){
                    customer = new Customer();
                    customer.setCus_id(ar[i]);
                    customer.setCus_name(ar[i+1]);
                    customer.setCus_address(ar[i+2]);
                    customer.setCus_mobile(ar[i+3]);
                    customer.setCus_nic(ar[i+4]);
                    break;
                }
            }
            
            return customer;
            
        }else{
            return null;
        }
    }
    
    public boolean updateCustomer(Customer customer) throws RemoteException,IOException,ClassNotFoundException{
        
        try{
            
            lock.writeLock().lock();
            bufferedWriter = null;
            fileWriter = null;
            fileReader = null;
            
            if(file.exists()){
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();
                StringTokenizer stringTokenizer = new StringTokenizer(line,"$");
                String ar[] = new String[stringTokenizer.countTokens()];
                for(int i = 0; i<ar.length;i++){
                    if(stringTokenizer.hasMoreTokens()){
                        ar[i] = stringTokenizer.nextToken();
                    }
                }
                
                bufferedReader.close();
                for(int i = 0;i<ar.length; i += 5){
                    if (customer.getCus_id().equals(ar[i])) {
                        ar[i+1] = customer.getCus_name();
                        ar[i+2] = customer.getCus_address();
                        ar[i+3] = customer.getCus_mobile();
                        ar[i+4] = customer.getCus_nic();
                        
                        break;
                    }
                }
                fileWriter = new FileWriter(file);
                for(String data : ar){
                    fileWriter.append(data + "$");
                }
                fileWriter.flush();
                fileWriter.close();
                
                return true;
                
            }else{
                return false;
            }
            
        }finally{
            lock.writeLock().unlock();
        }
        
    }
    
    
}
