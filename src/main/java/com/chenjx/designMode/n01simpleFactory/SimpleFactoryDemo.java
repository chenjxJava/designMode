package com.chenjx.designMode.simpleFactory;

/**
 * @Author: chenjx
 * @Description:
 * @Date: Created in 14:26 2018/4/18
 * @Modified By:
 */
public class SimpleFactoryDemo {

	public static void main(String[] args) {
		//
		Operation operation = OperationFactory.createOperation('+');
		operation.set_numberA(120);
		operation.set_numberB(50);
		int result = operation.getResult();
		System.out.println(result);

	}
}
