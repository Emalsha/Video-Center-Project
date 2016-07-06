/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.model;

import java.io.Serializable;
/**
 *
 * @author Emalsha Rasad
 */
public class Customer implements Serializable {
    
    private String cus_id;
    private String cus_name;
    private String cus_nic;
    private String cus_mobile;
    private String cus_address;

    public Customer() {
    }

    public Customer(String cus_id, String cus_name, String cus_nic, String cus_mobile, String cus_address) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_nic = cus_nic;
        this.cus_mobile = cus_mobile;
        this.cus_address = cus_address;
    }

    
    /**
     * @return the cus_id
     */
    public String getCus_id() {
        return cus_id;
    }

    /**
     * @param cus_id the cus_id to set
     */
    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    /**
     * @return the cus_name
     */
    public String getCus_name() {
        return cus_name;
    }

    /**
     * @param cus_name the cus_name to set
     */
    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    /**
     * @return the cus_nic
     */
    public String getCus_nic() {
        return cus_nic;
    }

    /**
     * @param cus_nic the cus_nic to set
     */
    public void setCus_nic(String cus_nic) {
        this.cus_nic = cus_nic;
    }

    /**
     * @return the cus_mobile
     */
    public String getCus_mobile() {
        return cus_mobile;
    }

    /**
     * @param cus_mobile the cus_mobile to set
     */
    public void setCus_mobile(String cus_mobile) {
        this.cus_mobile = cus_mobile;
    }

    /**
     * @return the cus_address
     */
    public String getCus_address() {
        return cus_address;
    }

    /**
     * @param cus_address the cus_address to set
     */
    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }
    
    
}
