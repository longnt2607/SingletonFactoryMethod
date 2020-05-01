/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_store;

import pizza.NewYork.NYCheeseStyle;
import pizza.NewYork.NYClamStyle;
import pizza.NewYork.NYPepperOnionStyle;
import pizza.Pizza;
import pizza.PizzaType;

/**
 *
 * @author long
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(PizzaType type) {
        switch(type)
        {
            case cheese: return new NYCheeseStyle();
            case clam: return new NYClamStyle();
            case pepperoni: return new NYPepperOnionStyle();
        }  
        return null;
    }
    
}
