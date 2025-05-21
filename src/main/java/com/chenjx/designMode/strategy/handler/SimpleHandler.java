package com.chenjx.designMode.strategy.handler;

import com.chenjx.designMode.strategy.Handler;
import lombok.Data;

@Data
public class SimpleHandler implements Handler {

    @Override
    public boolean canDo() {
        return true;
    }

    @Override
    public void doHandler() {
        System.out.println("简单处理");
    }
}
