package com.chenjx.designMode.create.n01_03Factory.extend;

import com.chenjx.designMode.create.n01_03Factory.Operation;

/**
 * @Author: chenjx
 * @Description:
 * @Date: Created in 14:10 2018/4/18
 * @Modified By:
 */
public class OperationMul extends Operation {

	@Override
	public int getResult() {
		return getNumberA() * getNumberB();
	}
}
