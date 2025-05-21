package com.chenjx.designMode.strategy;

public interface Handler {

    /**
     * 是否可以执行
     * @return
     */
    boolean canDo();


    void doHandler();
}
