package com.chenjx.designMode.strategy;

import lombok.Data;

import java.util.List;
@Data
public class StrategyContext {

    private List<Handler> handlers;

    public StrategyContext(List<Handler> handlers) {
        this.handlers = handlers;
    }

    /**
     * 处理
     */
    public void handle() {

        handlers.forEach(handler -> {
            if(handler.canDo()) {
                handler.doHandler();
            }
        });
    }
}
