package com.chenjx.designMode.action.n01;

import com.chenjx.designMode.action.n01.product.Fruits;
import com.chenjx.designMode.action.n01.activity.NationalActivity;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : jixing.chen
 * @create 2023/6/26 10:12
 */
public class Sale {
    public static void main(String[] args) {
        Fruits fruits = new Fruits();
        fruits.setName("橘子");
        fruits.setPrice(8);
        fruits.discount(new NationalActivity());
        System.out.println(fruits);
    }
}
