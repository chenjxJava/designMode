package com.chenjx.designMode.action.n01.activity;

import com.chenjx.designMode.action.n01.product.Drinks;
import com.chenjx.designMode.action.n01.product.Fruits;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : jixing.chen
 * @create 2023/6/26 10:03
 */
public interface Activity {

    void fruitsDiscount(Fruits fruits);

    void drinksDiscount(Drinks drinks);
}
