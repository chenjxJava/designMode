package com.chenjx.designMode.create.n05builder;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : jixing.chen
 * @create 2023/6/25 16:52
 */
public class TestBuilder {

    public static void main(String[] args) {
        User myBuilder = User.builder().age(23).name("myBuilder").build();
        System.out.println(myBuilder);
    }

}
