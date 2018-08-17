package com.chenjx.designMode.n02observer;

/**
 * create by chenjx 2018/8/16
 */
public class ObserverTest {
    public static void main(String[] args) {
        // 创建被观察者
        WatchServer watchServer = new WatchServer();
        // 被观察者注册，观察者
        watchServer.register(new User("liukai"));
        watchServer.register(new User("yehan"));
        watchServer.register(new User("chenyanpu"));
        // 被观察者发布信息
        watchServer.setInformation("hahah");
    }
}
