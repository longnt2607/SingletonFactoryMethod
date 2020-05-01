/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.NewYork;

import pizza.Pizza;

/**
 *
 * @author long
 */
public class NYClamStyle extends Pizza{

    public NYClamStyle() {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Clam kiểu New York\n";
    }

    @Override
    public String prepare() {
        return pizzaStr += "Chuẩn bị bột và Clam và Muối\n";
    }

    @Override
    public String bake() {
        return pizzaStr += "Nướng ở 220 độ C trong 18 phút\n";
    }
    
}
