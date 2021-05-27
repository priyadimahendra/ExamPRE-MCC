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
public class RepositoryImp extends Repository {
 
    //Contructor with attribute
    RepositoryImp(String name, int code, int quantity){
        setItems_name(name);
        setItems_code(code);
        setItems_quantity(quantity);
    }
    
    //Contructor
    RepositoryImp(){
        
    }
    
    //polymorphisme
    @Override
    public int check_stock() {
        System.out.println(getItems_name()+" = "+getItems_quantity());
        return 0;
    }
    
    
}
