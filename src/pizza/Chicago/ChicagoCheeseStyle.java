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
public class ChicagoCheeseStyle extends Pizza{

    public ChicagoCheeseStyle() {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Cheese kiểu Chicago\n";
    }
    
    @Override
    public String prepare() {
        return pizzaStr += "Chuẩn bị bột và Cheesse\n";
    }

    @Override
    public String bake() {
        return pizzaStr += "Nướng ở 200 độ C trong 15 phút\n";
    }
    
}
