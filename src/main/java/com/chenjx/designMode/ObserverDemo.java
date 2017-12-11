package com.chenjx.designMode;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: chenjx
 * @Description:  观察者模式
 * @Date: Created in 11:12 2017/12/11
 * @Modified By:
 */
// 测试
public class ObserverDemo {
	public static void main(String[] args) {
		BeingWatched beingWatched = new BeingWatched();//受查者
		Watcher watcher = new Watcher();//观察者
		beingWatched.addObserver(watcher);
		beingWatched.counter(10);
	}
}

// 观察者
class Watcher implements Observer{

	public void update(Observable o, Object arg) {
		System.out.println("Update() called, count is "
			+ ((Integer) arg).intValue());
	}
}

// 被观察者
class BeingWatched extends java.util.Observable {
	void counter(int period) {
		for(; period>=0; period-- ) {
			setChanged();
			notifyObservers(new Integer(period));
			try {
				Thread.sleep(100);
			} catch( InterruptedException e) {
				System.out.println("Sleep interrupeted" );
			}
		}
	}
}
