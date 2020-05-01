/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethoddemo;

import pizza.Pizza;
import pizza.PizzaType;
import pizza_store.ChicagoPizzaStore;
import pizza_store.NYPizzaStore;
import pizza_store.PizzaStore;
import pizza_store.PizzaStoreType;

/**
 *
 * @author long
 */
public class FactoryMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*PizzaStore store = new ChicagoPizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.cheese);
        System.out.println(pizza.toString());
        
        PizzaStore NewYorkStore = new NYPizzaStore();
        Pizza pizza1 = NewYorkStore.orderPizza(PizzaType.pepperoni);
        System.out.println(pizza1.toString());*/
        
        PizzaStore store = PizzaStore.storePizza(PizzaStoreType.NewYork);
        Pizza pizza = store.orderPizza(PizzaType.clam);
        System.out.println(pizza.toString());
        
        PizzaStore store2 = PizzaStore.storePizza(PizzaStoreType.Chicago);
        Pizza pizza2 = store2.orderPizza(PizzaType.cheese);
        Pizza pizza3 = store2.orderPizza(PizzaType.pepperoni);
        System.out.println(pizza2.toString());
        System.out.println(pizza3.toString());
    }
    
}
