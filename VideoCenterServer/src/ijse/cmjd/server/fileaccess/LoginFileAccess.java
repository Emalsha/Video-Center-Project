/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.server.fileaccess;

import ijse.cmjd.model.Login;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author emalsha
 */
public class LoginFileAccess {
    
    private final File file = new File("./src/ijse/cmjd/database/login.txt");
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    
    public boolean searchLogin(Login login)throws IOException{
           try {
              lock.writeLock().lock();
              
              if(file.exists()){
                  String[] ar;
                  try (BufferedReader buffReader = new BufferedReader(new FileReader(file))) {
                      String line=buffReader.readLine();
                      StringTokenizer stringTokenizer=new StringTokenizer(line,"$");
                      ar = new String[stringTokenizer.countTokens()];
                      for(int i=0;i<ar.length;i++){
                          if(stringTokenizer.hasMoreTokens()){
                              ar[i]=stringTokenizer.nextToken();
                          }
                      }
                  }
                  FileWriter newFileWriter;
                  
                  for (int i = 0; i < ar.length; i+=5) {
                      if (login.getUsername().equals(ar[i]) && login.getPassword().equals(ar[i+1])) {
                    
                        ar[i + 2] = login.getLastLogin();                       
                        
                        newFileWriter = new FileWriter(file);

                        for (String data : ar) {
                            newFileWriter.append(data + "$");
                        }
                        newFileWriter.flush();
                        newFileWriter.close();
                        return true;
                      }else{
                          return false;
                      }
                      
                  }
                   
              }else{
                  return false;
              }
           
           }finally{
               lock.writeLock().unlock();
           }
        return false;
    }
}
