/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_store;

import pizza.Pizza;
import pizza.PizzaType;

/**
 *
 * @author long
 */
public abstract class PizzaStore {
    
    /*public abstract Pizza createPizza(PizzaType type);
       
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }*/
    
    // cài đặt dạng Singleton --------------------------------------------------
    
    private static PizzaStore pizzaStore;   
    
    public abstract Pizza createPizza(PizzaType type);
    
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
       
    public static PizzaStore storePizza(PizzaStoreType storeType) {
        if (pizzaStore == null) {
            switch (storeType) {
                case Chicago: pizzaStore = new ChicagoPizzaStore();
                case NewYork: pizzaStore = new NYPizzaStore();
            }
        }           
        return pizzaStore;
    }
}
