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
public abstract class Order extends Repository {
    public abstract int amount_after_order(int code,int quantity, String name);
    public abstract boolean check_quantity(int quantity);
}
