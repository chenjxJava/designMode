package com.chenjx.designMode.create.n01_03Factory;

/**
 * @Author: chenjx
 * @Description:
 * @Date: Created in 14:26 2018/4/18
 * @Modified By:
 */
public class SimpleFactoryDemo {

	public static void main(String[] args) throws Exception {
		// 入参可选：+, -, *, /
		// 根据输入的参数，可以创建不同bean

		Operation operation = OperationFactory.createOperation('*');
		operation.setNumberA(120);
		operation.setNumberB(2);
		int result = operation.getResult();
		System.out.println(result);

	}
}
