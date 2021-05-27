/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampre.mcc;

/**
 *
 * @author papahjahat
 */
public abstract class Repository {  
    private String items_name;
    private int items_code;
    private int items_quantity;
    
    // enkapsulasi
    public void setItems_quantity(int items_quantity) {
        this.items_quantity = items_quantity;
    }

    public void setItems_name(String items_name) {
        this.items_name = items_name;
    }

    public void setItems_code(int items_code) {
        this.items_code = items_code;
    }

    public String getItems_name() {
        return items_name;
    }

    public int getItems_quantity() {
        return items_quantity;
    }

    public int getItems_code() {
        return items_code;
    }
    
    public abstract int check_stock();
}
