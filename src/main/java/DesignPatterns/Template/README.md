### 模板方法模式

模板方法模式定义了一组方法作为执行细节，并将整体执行流程封装起来。子类继承父类之后按需重写父类的各个步骤方法，最后整体的执行流程还是按照抽象类中的实现。

**模板方法模式属于行为型设计模式**

#### 实际项目中的应用

> 做饭的时候我们需要洗菜、切菜、炒菜、出锅盛菜。那么这个步骤我们就可以针对做不同的菜去实现不同的步骤细节，最后整个流程依然使用模板中定义好的方法组织起来即可。

- 优点：封装不可变部分，提供给子类实现细节步骤的代码
- 缺点：每一个不同的实现都需要创建一个子类，会导致系统更加庞大