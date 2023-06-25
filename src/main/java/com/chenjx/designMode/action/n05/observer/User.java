package com.chenjx.designMode.action.n05.observer;

/**
 * create by chenjx 2018/8/16
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println("用户:"+name+",收到推动消息："+ message);
    }
}
