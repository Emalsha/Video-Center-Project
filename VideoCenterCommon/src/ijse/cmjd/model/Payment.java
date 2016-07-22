/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijse.cmjd.model;

import java.io.Serializable;

/**
 *
 * @author emalsha
 */
public class Payment implements Serializable{
    
    private String p_id;
    private String p_total;
    private String p_transaction_type;
    private String p_date;

    public Payment() {
    }

    public Payment(String p_id, String p_total, String p_transaction_type, String p_date) {
        this.p_id = p_id;
        this.p_total = p_total;
        this.p_transaction_type = p_transaction_type;
        this.p_date = p_date;
    }

    /**
     * @return the p_id
     */
    public String getP_id() {
        return p_id;
    }

    /**
     * @param p_id the p_id to set
     */
    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    /**
     * @return the p_total
     */
    public String getP_total() {
        return p_total;
    }

    /**
     * @param p_total the p_total to set
     */
    public void setP_total(String p_total) {
        this.p_total = p_total;
    }

    /**
     * @return the p_transaction_type
     */
    public String getP_transaction_type() {
        return p_transaction_type;
    }

    /**
     * @param p_transaction_type the p_transaction_type to set
     */
    public void setP_transaction_type(String p_transaction_type) {
        this.p_transaction_type = p_transaction_type;
    }

    /**
     * @return the p_date
     */
    public String getP_date() {
        return p_date;
    }

    /**
     * @param p_date the p_date to set
     */
    public void setP_date(String p_date) {
        this.p_date = p_date;
    }
    
    
    

}
