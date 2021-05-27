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
public class OrderImp extends Order {

    private int order_quantity;
    private int order_code;
    
    OrderImp(){
        
    }
    
    OrderImp(int order_quantity, int order_code){
        this.order_code = order_code;
        this.order_quantity = order_quantity;
    }
    
    @Override
    public int amount_after_order(int code,int quantity, String name) {
        if(code == order_code && check_quantity(quantity) == true){
            int new_quantity = quantity - order_quantity;
            System.out.println("Jumlah item "+ name +" yang terbaru = " + new_quantity);
            return new_quantity;
        } else{
            System.out.println("gagal");
            return 0;
        }
    }

    @Override
    public boolean check_quantity(int quantity) {
        if(order_quantity <= quantity){
            return true;
        }
        return false;
    }

    @Override
    public int check_stock() {
        return 0;
    }
    
    //overload
    public int check_stock(int code,int quantity,String name) {
        if(code == order_code && check_quantity(quantity) == true){
            System.out.println("Stock "+name+" cukup");
            return quantity - order_quantity;
        } else{
            System.out.println("Stock "+name+" kurang");
            return 0;
        }
    }
    
}
