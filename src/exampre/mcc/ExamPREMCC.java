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
public class ExamPREMCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RepositoryImp r1 = new RepositoryImp("Dancow",1,44);
        RepositoryImp r2 = new RepositoryImp("Stella",2,456);
        OrderImp o1 = new OrderImp(4,4);
                
        r1.check_stock();
        r2.check_stock();
        
        //--------------------------------------------------------------------------------------------------
        System.out.println();
        //array
        RepositoryImp[] array1;
        array1 = new RepositoryImp[3];
        
        array1[0] = new RepositoryImp("Chocolatos",3,55);
        array1[1] = new RepositoryImp("Ultra Milk",4,65);
        array1[2] = new RepositoryImp("Nissin",5,75);
        
        //print menggunakan array
        for(int i=0;i<3;i+=1){
            array1[i].check_stock();
        }
        //---------------------------------------------------------------------------------------------------
        System.out.println();
        o1.check_stock(array1[1].getItems_code(), array1[1].getItems_quantity(),array1[1].getItems_name());
        int g = o1.amount_after_order(array1[1].getItems_code(), array1[1].getItems_quantity(), array1[1].getItems_name());
        array1[1].setItems_quantity(g);
        array1[1].check_stock();
        
    }
    
}
