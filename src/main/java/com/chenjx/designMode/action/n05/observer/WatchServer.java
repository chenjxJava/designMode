package com.chenjx.designMode.action.n05.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * create by chenjx 2018/8/16
 */
public class WatchServer implements Observerable {

    private String message;

    private List<Observer> observers =new ArrayList<Observer>();

    public boolean register(Observer observer) {
        return observers.add(observer);
    }

    public boolean unregister(Observer observer) {
        if(observers.isEmpty()) {
            return true;
        }
        return observers.remove(observer);
    }

    public void notifiyObserver() {
        if(!observers.isEmpty()) {
            for (Observer observer : observers) {
                observer.update(message);
            }
        }
    }

    /**
     * 发布
     * @param s
     */
    public void setInformation(String s) {
        this.message = s;
        System.out.println("微信更新消息： "+ s);
        notifiyObserver();
    }
}
