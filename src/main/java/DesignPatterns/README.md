#### 2019-05-29新增设计模式包

##### 设计模式六大原则
- 单一职责
每个类应该实现单一的职责，否则就应该将类进行拆分
- 里氏替换
即继承复用。任何父类出现的地方，子类都可以出现。派生类可以在基类的基础上增加功能实现。是对“开闭原则”的一个补充。在里氏替换原则中，尽量不要对父类进行重载或者重写，因为父类代表了一个定义好的结构，通过这个规范的接口与外界交互，子类不应该随意破坏它。
- 依赖倒置
“开闭原则”的基础。即面向接口编程。依赖于抽象而不依赖于具体实现。编程时遇到具体类时，不与具体类交互，而与上层接口进行交互。
- 接口隔离
每个接口中不应存在子类用不到却必须实现的方法。否则就应将接口拆分，将职责单一化。
- 合成复用
尽量使用组合、聚集的形式编程，而不是使用继承。
- 迪米特法则（最少知道）
一个类对于自己依赖的类知道的越少越好。无论被依赖的类多么复杂，都应该将逻辑封装在方法内部，通过一个公有方法提供给依赖类使用，这样当被依赖类发生改变时，才会尽可能少的影响依赖类。

##### 创建型设计模式 5种
- 单例模式
- 工厂模式
- 抽象工厂模式
- 建造者模式
- 原型模式
##### 行为型设计模式 11种
- 策略模式
- 观察者模式
- 职责链模式
- 状态模式
- 中介者模式
- 备忘录模式
- 模板方法模式
- 命令模式
- 迭代子模式
- 访问者模式
- 解释器模式
##### 结构型设计模式 7种
- 适配器模式
- 装饰模式
- 代理模式
- 外观模式
- 享元模式
- 组合模式
- 桥接模式