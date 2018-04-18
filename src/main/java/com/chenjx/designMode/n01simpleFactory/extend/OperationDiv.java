package com.chenjx.designMode.n01simpleFactory.extend;

import com.chenjx.designMode.n01simpleFactory.Operation;

/**
 * @Author: chenjx
 * @Description:
 * @Date: Created in 14:10 2018/4/18
 * @Modified By:
 */
public class OperationDiv extends Operation {

	@Override
	public int getResult() throws Exception {
		if(get_numberB() == 0) {
			throw new Exception("除数不能为0！");
		}
		return get_numberA() / get_numberB();
	}
}
