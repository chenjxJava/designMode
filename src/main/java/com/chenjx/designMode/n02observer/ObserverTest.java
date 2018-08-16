package com.chenjx.designMode.n02observer;

/**
 * create by chenjx 2018/8/16
 */
public class ObserverTest {
    public static void main(String[] args) {
        WatchServer watchServer = new WatchServer();
        watchServer.register(new User("liukai"));
        watchServer.register(new User("yehan"));
        watchServer.register(new User("chenyanpu"));
        watchServer.setInformation("hahah");
    }
}
