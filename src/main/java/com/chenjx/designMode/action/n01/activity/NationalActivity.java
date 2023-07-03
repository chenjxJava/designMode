package com.chenjx.designMode.action.n01.activity;

import com.chenjx.designMode.action.n01.product.Drinks;
import com.chenjx.designMode.action.n01.product.Fruits;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : jixing.chen
 * @create 2023/6/26 10:09
 */
public class NationalActivity implements Activity {

    @Override
    public void fruitsDiscount(Fruits fruits) {
        fruits.setPrice(fruits.getPrice() * 0.8);
    }

    @Override
    public void drinksDiscount(Drinks drinks) {
        drinks.setPrice(drinks.getPrice() * 0.8);
    }
}
