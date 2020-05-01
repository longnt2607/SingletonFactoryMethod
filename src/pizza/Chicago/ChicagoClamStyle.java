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
public class ChicagoClamStyle extends Pizza{
    
    public ChicagoClamStyle() {
        pizzaStr = "Chào các bạn! Đây là bánh pizza Clam kiểu Chicago";
    }

    @Override
    public String prepare() {
        return pizzaStr += "Chuẩn bị bột với clam\n";
    }

    @Override
    public String bake() {
        return pizzaStr +="Nướng ở 250 độ C trong 15 phút";
    }
}
