package com.chenjx.designMode.action.n01.product;

import com.chenjx.designMode.action.n01.Discount;
import com.chenjx.designMode.action.n01.activity.Activity;
import lombok.Data;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : jixing.chen
 * @create 2023/6/26 10:08
 */
@Data
@ToString(callSuper = true)
public class Drinks extends Product implements Discount {
    @Override
    public void discount(Activity visitor) {
        visitor.drinksDiscount(this);
    }
}
