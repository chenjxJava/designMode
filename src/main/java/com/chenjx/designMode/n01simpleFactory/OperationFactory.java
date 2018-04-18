package com.chenjx.designMode.n01simpleFactory;

import com.chenjx.designMode.n01simpleFactory.extend.OperationAdd;
import com.chenjx.designMode.n01simpleFactory.extend.OperationDiv;
import com.chenjx.designMode.n01simpleFactory.extend.OperationMul;

/**
 * @Author: chenjx
 * @Description:  简单工厂设计模式
 * @Date: Created in 11:13 2018/4/18
 * @Modified By:
 *
 * 简单说，根据OperationFactory的静态方法，来创建不同的实现类
 */
public class OperationFactory {

	 public static Operation createOperation(char str) {
	 	Operation operation = null;
	 	switch (str) {
			case '+':
				operation = new OperationAdd();
				break;
			case '-':
				operation = new OperationAdd();
				break;
			case '*':
				operation = new OperationMul();
				break;
			case '/':
				operation = new OperationDiv();
				break;
		}
		return operation;
	 }
	
}
