/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_store;

import pizza.Chicago.ChicagoCheeseStyle;
import pizza.Chicago.ChicagoClamStyle;
import pizza.Chicago.ChicagoPepperOnionStyle;
import pizza.Pizza;
import pizza.PizzaType;

/**
 *
 * @author long
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(PizzaType type) {
        switch(type)
        {
            case cheese: return new ChicagoCheeseStyle();
            case clam: return new ChicagoClamStyle();
            case pepperoni: return new ChicagoPepperOnionStyle();
        }  
        return null;
    }
    
}
