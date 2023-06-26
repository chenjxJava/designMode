# Design Mode(设计模式)
## 分类
### 一、创建型
#### 1.单例模式
#### 2.工厂方法模式
#### 3.抽象工厂模式
#### 4.建造者模式
#### 5.原型模式

### 二、结构型
#### 1.适配器模式
#### 2.桥接模式
抽象为2个接口，之间有调用
```java
public abstract class A {
    private B b;
    public A(B b){this.b = b;}
    void say(B b);
}

public class A1 implements A {
    
}
public class A2 implements A {

}

public interface B {
    void say();
}

public class B1 implements B {
    
}
public class B2 implements B {

}

```
#### 3.组合模式
#### 4.装配模式
#### 5.外观模式
#### 6.享元模式
#### 7.代理模式
jdk动态代理，cglib动态代理。对方法做增强，或者对方法做包装的。

### 三、行为型
#### 1.访问者模式
#### 2.模板模式
#### 3.策略模式
#### 4.状态模式
#### 5.观察者模式
[java设计模式--观察者模式和事件监听器模式](http://blog.csdn.net/dongnan591172113/article/details/8771441)
#### 6.备忘录模式
#### 7.中介者模式
#### 8.迭代器模式
#### 9.解释器模式
#### 10.命令模式
#### 11.责任链模式
