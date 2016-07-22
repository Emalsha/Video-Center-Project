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
public class Rent implements Serializable {
    private String r_id;
    private String r_item_code;
    private String r_cus_id;
    private String r_rent_price;
    private String r_issu_date;
    private String r_due_date;
    private String r_num_of_day;
    private String r_num_of_disk;
    
    private String r_payment_id;

    public Rent() {
    }

    public Rent(String r_id, String r_item_code, String r_cus_id, String r_rent_price, String r_issu_date, String r_due_date, String r_num_of_day, String r_num_of_disk, String r_payment_id) {
        this.r_id = r_id;
        this.r_item_code = r_item_code;
        this.r_cus_id = r_cus_id;
        this.r_rent_price = r_rent_price;
        this.r_issu_date = r_issu_date;
        this.r_due_date = r_due_date;
        this.r_num_of_day = r_num_of_day;
        this.r_num_of_disk = r_num_of_disk;
        this.r_payment_id = r_payment_id;
    }

    /**
     * @return the r_id
     */
    public String getR_id() {
        return r_id;
    }

    /**
     * @param r_id the r_id to set
     */
    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    /**
     * @return the r_item_code
     */
    public String getR_item_code() {
        return r_item_code;
    }

    /**
     * @param r_item_code the r_item_code to set
     */
    public void setR_item_code(String r_item_code) {
        this.r_item_code = r_item_code;
    }

    /**
     * @return the r_cus_id
     */
    public String getR_cus_id() {
        return r_cus_id;
    }

    /**
     * @param r_cus_id the r_cus_id to set
     */
    public void setR_cus_id(String r_cus_id) {
        this.r_cus_id = r_cus_id;
    }

    /**
     * @return the r_rent_price
     */
    public String getR_rent_price() {
        return r_rent_price;
    }

    /**
     * @param r_rent_price the r_rent_price to set
     */
    public void setR_rent_price(String r_rent_price) {
        this.r_rent_price = r_rent_price;
    }

    /**
     * @return the r_issu_date
     */
    public String getR_issu_date() {
        return r_issu_date;
    }

    /**
     * @param r_issu_date the r_issu_date to set
     */
    public void setR_issu_date(String r_issu_date) {
        this.r_issu_date = r_issu_date;
    }

    /**
     * @return the r_due_date
     */
    public String getR_due_date() {
        return r_due_date;
    }

    /**
     * @param r_due_date the r_due_date to set
     */
    public void setR_due_date(String r_due_date) {
        this.r_due_date = r_due_date;
    }

    /**
     * @return the r_num_of_day
     */
    public String getR_num_of_day() {
        return r_num_of_day;
    }

    /**
     * @param r_num_of_day the r_num_of_day to set
     */
    public void setR_num_of_day(String r_num_of_day) {
        this.r_num_of_day = r_num_of_day;
    }

    /**
     * @return the r_num_of_disk
     */
    public String getR_num_of_disk() {
        return r_num_of_disk;
    }

    /**
     * @param r_num_of_disk the r_num_of_disk to set
     */
    public void setR_num_of_disk(String r_num_of_disk) {
        this.r_num_of_disk = r_num_of_disk;
    }

    /**
     * @return the r_payment_id
     */
    public String getR_payment_id() {
        return r_payment_id;
    }

    /**
     * @param r_payment_id the r_payment_id to set
     */
    public void setR_payment_id(String r_payment_id) {
        this.r_payment_id = r_payment_id;
    }

    
    
}