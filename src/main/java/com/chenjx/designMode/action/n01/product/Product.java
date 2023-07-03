package com.chenjx.designMode.action.n01.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : jixing.chen
 * @create 2023/6/26 10:04
 */
@Data
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String name;

    private double price;
}
