package com.chenjx.designMode.n02observer;

/**
 * create by chenjx 2018/8/16
 * 被观察者
 */
public interface Observerable {
    /**
     * 订阅
     * @param observer
     * @return
     */
    boolean register(Observer observer);

    /**
     * 注销
     * @param observer
     * @return
     */
    boolean unregister(Observer observer);

    /**
     * 通知
     */
    void notifiyObserver();


}
