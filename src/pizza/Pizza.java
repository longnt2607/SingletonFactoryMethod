/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author long
 */
public abstract class Pizza {
    
    protected String pizzaStr = "";

    public Pizza() {
    }
    
    public abstract String prepare();
    
    public abstract String bake();
    
    public String cut() {
        pizzaStr += "cat thanh 8 mieng \n";
        return pizzaStr;
    }
    public String box() {
        pizzaStr += "dong hop banh pizza \n";
        return pizzaStr;
    }

    @Override
    public String toString() {
        return pizzaStr;
    }   
}
