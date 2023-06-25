package com.chenjx.designMode.create.n01simpleFactory.extend;

import com.chenjx.designMode.create.n01simpleFactory.Operation;

/**
 * @Author: chenjx
 * @Description:
 * @Date: Created in 14:10 2018/4/18
 * @Modified By:
 */
public class OperationAdd extends Operation {

	@Override
	public int getResult() {
		return getNumberA() + getNumberB();
	}
}
