package com.chenjx.designMode.create.n01_03Factory.extend;

import com.chenjx.designMode.create.n01_03Factory.Operation;

/**
 * @Author: chenjx
 * @Description:
 * @Date: Created in 14:10 2018/4/18
 * @Modified By:
 */
public class OperationDiv extends Operation {

	@Override
	public int getResult() throws Exception {
		if(getNumberB() == 0) {
			throw new Exception("除数不能为0！");
		}
		return getNumberA() / getNumberB();
	}
}
