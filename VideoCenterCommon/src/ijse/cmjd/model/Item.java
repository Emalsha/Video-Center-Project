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
public class Item implements Serializable {
    
    private String item_code;
    private String item_desc;
    private String item_category;
    private String item_director;
    private String item_no_of_disc;
    private String item_price;
    private String item_rent_price;

    public Item() {
    }

    public Item(String item_code, String item_desc, String item_category, String item_director, String item_no_of_disc, String item_price, String item_rent_price) {
        this.item_code = item_code;
        this.item_desc = item_desc;
        this.item_category = item_category;
        this.item_director = item_director;
        this.item_no_of_disc = item_no_of_disc;
        this.item_price = item_price;
        this.item_rent_price = item_rent_price;
    }

    /**
     * @return the item_code
     */
    public String getItem_code() {
        return item_code;
    }

    /**
     * @param item_code the item_code to set
     */
    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    /**
     * @return the item_desc
     */
    public String getItem_desc() {
        return item_desc;
    }

    /**
     * @param item_desc the item_desc to set
     */
    public void setItem_desc(String item_desc) {
        this.item_desc = item_desc;
    }

    /**
     * @return the item_category
     */
    public String getItem_category() {
        return item_category;
    }

    /**
     * @param item_category the item_category to set
     */
    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }

    /**
     * @return the item_director
     */
    public String getItem_director() {
        return item_director;
    }

    /**
     * @param item_director the item_director to set
     */
    public void setItem_director(String item_director) {
        this.item_director = item_director;
    }

    /**
     * @return the item_no_of_disc
     */
    public String getItem_no_of_disc() {
        return item_no_of_disc;
    }

    /**
     * @param item_no_of_disc the item_no_of_disc to set
     */
    public void setItem_no_of_disc(String item_no_of_disc) {
        this.item_no_of_disc = item_no_of_disc;
    }

    /**
     * @return the item_price
     */
    public String getItem_price() {
        return item_price;
    }

    /**
     * @param item_price the item_price to set
     */
    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    /**
     * @return the item_rent_price
     */
    public String getItem_rent_price() {
        return item_rent_price;
    }

    /**
     * @param item_rent_price the item_rent_price to set
     */
    public void setItem_rent_price(String item_rent_price) {
        this.item_rent_price = item_rent_price;
    }
    
    
    
}
