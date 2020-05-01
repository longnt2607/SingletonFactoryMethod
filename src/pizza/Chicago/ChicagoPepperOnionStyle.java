/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.Chicago;

import pizza.Pizza;

/**
 *
 * @author long
 */
public class ChicagoPepperOnionStyle extends Pizza{
    
    public ChicagoPepperOnionStyle() {
        pizzaStr = "Chào các bạn! Đây là pizza pepperoni kiểu Chicago\n";
    }
    @Override
    public String prepare() {
        return pizzaStr +="Chuẩn bị bột với hành\n";
    }

    @Override
    public String bake() {
        return pizzaStr +="Nướng ở 250 độ C trong 10 phút\n";
    }
}
