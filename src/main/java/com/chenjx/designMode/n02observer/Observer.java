package com.chenjx.designMode.n02observer;

/**
 * 观察者
 */
public interface Observer {

    /**
     * 监听
     * @param message
     */
    void update(String message);
}
