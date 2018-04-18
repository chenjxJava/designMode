package com.chenjx.designMode.simpleFactory;

/**
 * @Author: chenjx
 * @Description:
 * @Date: Created in 11:21 2018/4/18
 * @Modified By:
 */
public class Operation {
	private int _numberA = 0;
	private int _numberB = 0;

	public int get_numberA() {
		return _numberA;
	}

	public void set_numberA(int _numberA) {
		this._numberA = _numberA;
	}

	public int get_numberB() {
		return _numberB;
	}

	public void set_numberB(int _numberB) {
		this._numberB = _numberB;
	}

	public int getResult() {
		int result = 0;
		return result;
	}
}

