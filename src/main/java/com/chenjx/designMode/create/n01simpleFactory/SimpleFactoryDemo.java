package com.chenjx.designMode.create.n01simpleFactory;

/**
 * @Author: chenjx
 * @Description:
 * @Date: Created in 14:26 2018/4/18
 * @Modified By:
 */
public class SimpleFactoryDemo {

	public static void main(String[] args) {
		//
		Operation operation = OperationFactory.createOperation('*');
		operation.setNumberA(120);
		operation.setNumberB(2);
		int result = 0;
		try {
			result = operation.getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);

	}
}
