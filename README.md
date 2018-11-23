设计模式六大原则：
1、开闭原则（Open Close Principle）
开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

2、里氏代换原则（Liskov Substitution Principle）
里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。—— From Baidu 百科

3、依赖倒转原则（Dependence Inversion Principle）
这个是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

4、接口隔离原则（Interface Segregation Principle）
这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。

5、迪米特法则（最少知道原则）（Demeter Principle）
为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。

6、合成复用原则（Composite Reuse Principle）
原则是尽量使用合成/聚合的方式，而不是使用继承。




* 策略模式（Strategy）
在策略模式中，一个类的行为或其算法可以在运行时更改
定义算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户

意图：
    定义并封装一系列算法，使它们可以相互替换
主要解决：
    在有多种算法相似的情况下，使用 if…else 所带来的复杂性和难以维护
关键：
    将算法封装成一个个类，实现统一个接口
应用实例：
    旅行的出游方式：骑自行车、开汽车、乘飞机、搭高铁…
使用场景：
    1、如果在一个系统中有许多类，它们之间的区别仅仅在于它们的行为，则使用策略模式可以动态地让一个对象在许多行为中选择一种
    2、一个系统需要动态地在几种算法中选择一种
    3、有很多if…else语句用来根据某些条件选择调用一些相似的行为
注意事项：
    如果一个系统的策略多于四个，则需要考虑使用混合模式，解决策略类膨胀的问题



* 观察者模式（Observer）
对象间一对多关系，当一个对象被修改时，会自动通知依赖它的对象
在对象之间定义一对多的依赖，这样依赖，当一个对象改变状态，依赖它的对象都会收到通知，并自动更新

意图：
    定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
关键：
    被观察者类中保存了所有观察者类
缺点：
    1、被观察者如果有很多直接和间接的观察者，通知所有的观察者会很耗时
    2、观察者和被观察者之间如果有循环依赖会导致循环调用，可能导致系统崩溃
注意事项：
    如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式


* 装饰器模式（Decorator）
允许向现有的对象添加新的功能，同时又不改变其结构。创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能
动态地将新的行为附加到对象上。

意图：
    动态地给一个对象添加一些额外的指责。就增加功能来说，装饰器模式相比生成子类更为灵活
主要解决；
    一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀
如何解决：
    将具体功能职责划分，同时继承装饰者模式
关键：
    1、Component类充当抽象角色，不应该具体实现
    2、抽象装饰类有一个Component类型的引用，并且继承Component类（最重要的部分，装饰者同时有  被装饰者的引用，并继承被装饰者）
    3、具体装饰类重写父类方法，并可以在其中添加新的行为
缺点：
    多层装饰比较复杂




* 工厂模式（Factory）
在创建对象时不会对客户端暴露创建逻辑，并且时通过使用一个共同的接口来指向新创建的对象
定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类

意图：
    定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行
如何解决：
    让子类实现工厂接口，返回的也是一个抽象的产品
优点：
    1、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以
    2、屏蔽产品的具体实现，调用者只关心产品的接口
注意事项：
    复杂对象适合使用工厂模式，简单对象无需使用。
    使用工厂模式，需要引入一个工厂类，会增加系统的复杂度



* 抽象工厂模式（Abstract Factory）
提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
围绕一个超级工厂创建其它工厂，该超级工厂又称为其它工厂的工厂
接口负责创建一个相关对象的工厂，不需要显示指定它们的类。每个生成的工厂都能按照工厂模式提供对象

意图：
    提供一个创建一系列相关或者相互依赖对象的接口，而无需指定它们具体的类
何时使用：
    系统的产品有多于一个的产品族，而系统只消费其中某一族的产品
优点：
    当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象
缺点：
    产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的Creator里加代码，又要在具体的里面加代码




* 单例模式
类负责创建自己的对象，同时确保只有单个对象被创建

意图：
    保证一个类仅有一个实例，并提供一个访问它的全局访问点
关键代码：
    构造函数是私有的
优点：
    1、内存中只有一个实例，减少了内存开销，尤其是频繁的创建和销毁实例
    2、避免对资源的多重占用（比如写文件操作）
缺点：
    没有接口，不能继承，与单一职责原则冲突，一个类应该之关心内部逻辑，而不关心外面怎么样来实例化
注意事项：
    getInstance()方法中需要使用同步锁 synchronized 防止多线程同时进入造成 instance 被多次实例化
双检锁/双重校验锁（DCL，double-checked locking）
是否lazy loading：是
是否多线程安全：是
描述：
    这种方式采用双锁机制，安全且在多线程情况下能保持高性能
public class Singleton {

    public volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

登记式/静态内部类
是否lazy loading：是
是否多线程安全：是
描述：
    对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只使用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用
    这种方式利用了classloader机制来保证初始化instance时只有一个线程。当Singleton类被加载时，instance不一定被初始化，因为SingletonHolder类没有被主动使用，只有通过显式调用getInstance方法时，才会显式装载SingletonHolder类，从而实例化instance
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {}

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}


枚举
是否lazy loading：是
是否多线程安全：是
描述：
    这种方式时 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
public enum Singleton {
    INSTANCE;
    public void whateverMethod() {
        
    }
}





* 适配器模式（Adapter）
将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间
作为两个不兼容的接口之间的桥梁，结合了两个独立接口的

意图：
    将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的类可以一起工作
何时使用：
    1、系统需要使用现有的类，而此类的接口不符合系统的需要
    2、想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口
    3、通过接口转换，将一个类插入另一个类系中
如何解决：
    继承或依赖（推荐）
关键代码：
    适配器继承或依赖已有的对象，实现想要的目标接口
优点：
    1、可以让任何两个没有关联的类一起运行
    2、提高了类的服用
    3、增加了类的同名度
    4、灵活性好
缺点：
    1、过多地使用适配器会让系统非常凌乱，明明看到调用的是A接口，内部被适配成了B接口的实现。如果不是很有必要，可以不使用适配器，而是直接对系统进行重构
    2、由于Java只能单继承，所有至多只能适配一个适配者类，而且目标类必须是抽象类




* 外观模式（Facade）
提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用

主要解决：
    降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口
如何解决：
    客户端不与系统耦合，外观类与系统耦合
关键代码：
    在客户端和复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好
优点：
    1、减少系统相互依赖
    2、提高灵活性
    3、提高安全性
缺点：
    不符合开闭原则，如果要修改东西会很麻烦，继承重写都不合适
使用场景：
    1、为复杂的模块或子系统提供外界访问的模块
    2、子系统相对独立
    3、预防低水平人员带来的风险
注意事项：
    在层次化结构中，可以使用外观模式定义系统中每一层的入口





* 模版模式（Template）
在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模版方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤
在模版模式中，一个抽象类公开定义了执行它的方法的方式/模版。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行

意图：
    定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模版方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
关键代码：
    在抽象类实现共同部分，在子类现实特定步骤
优点：
    1、封装不变部分，扩展可变部分
    2、提取公共代码，便于维护
    3、行为由父类控制，子类实现
缺点：
    每个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大
注意事项：
    为了防止恶意操作，一般模版方法都加上final关键字





* 迭代器模式（Iterator）
提供一种方法顺序访问一个聚合对象中的各个元素，而不是暴露其内部的表示
用于顺序访问集合对象的元素，不需要知道集合对象的底层表示

意图：
    提供一种方法顺序访问一个聚合对象中各个元素，而又无须暴露该对象的内部表示
如何解决：
    把在元素之间游走的责任交给迭代器，而不是聚合对象
优点：
    1、支持以不同的方式遍历一个聚合对象
    2、迭代器简化了聚合类
    3、在同一个聚合上可以有多个遍历
    4、增加新的聚合类和迭代器类都很方便，无须修改原有代码
缺点：
    由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性
注意事项：
    迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据






* 组合模式（Composite）
允许你将对象组合成树形结构来表现”整体/部分“层次结构。组合能让客户以一致的方式处理个别对象以及对象组合
又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
创建了一个包含自己对象组的类，提供了修改相同对象组的方式

意图：
    将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
主要解决：
    它在我们树形结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦
何时使用 ：
    1、你想表达对象的部分-整体层次结构（树形结构）
    2、你希望用户忽略组合对象和单个对象的不同，用户将统一地使用组合结构中的所有对象
如何解决：
    树枝和叶子实现统一接口，树枝内部组合该接口
关键代码：
    树枝内部组合该接口，并且含有内部树形List，里面放Component
优点：
    1、高层模块调用简单
    2、节点自由增加
缺点：
    在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则
注意事项：
    定义时为具体类





* 状态模式（State）
允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类
将状态封装成为独立的类，并将动作委托到代表当前状态的对象，行为会随着内部状态而改变
我们创建表示各种状态的对象和一个行为随着状态对象而改变的context对象

主要解决：
    对象的行为依赖于它的状态，并且可以根据它的状态改变而改变它的相关行为
何时使用：
    代码中包含大量与对象状态有关的条件语句
如何解决：
    将各种具体的状态类抽象出来
关键代码：
    通常命令模式的接口中只有一个方法。而状态模式的接口中有一个或者多个方法
    状态模式的实现类的方法，一般返回值，或者是改变实例变量的值
    状态模式一般和对象的状态有关
    实现类的方法有不同的功能，覆盖接口中的方法
    状态模式和命令模式一样，也可以用于消除if…else等条件选择语句
优点：
    1、封装了转换规则
    2、枚举可能的状态，在枚举状态之前需要确定状态中类
    3、将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为
    4、允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块
    5、可以让多个对象共享一个状态对象，从而减少系统中对象的个数
缺点：
    1、状态模式的使用必然会增加系统类和对象的个数
    2、状态模式的结构和实现都较为复杂，如果使用不当将导致程序结构和代码的混乱
    3、状态模式对“开闭原则”的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码
使用场景：
    1、行为随状态改变而改变的场景
    2、条件、分之语句的替代者
注意事项：
    在行为受状态约束的时候使用状态模式，而且状态不超过5个





* 代理模式（Proxy）
为另一个对象提供一个替身或占位符以控制对这个对象的访问，有 远程代理、虚拟代理、保护代理 等形式

意图：
    为其他对象提供一种代理以控制对这个对象的访问
主要解决：
    1、要访问的对象在远程的机器上（远程代理）
    2、有些对象由于某些原因（对象创建开销大，某些操作需要安全控制，或者需要进程外的反问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层
关键代码：
    实现类与被代理类组合
优点：
    1、职责清晰
    2、高扩展性
    3、智能化
缺点：
    1、由于在客户端和真实主体之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢
    2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂
使用场景：
    按职责来划分，通常有以下使用场景：
        1、远程代理
        2、虚拟代理
        3、copy-on-write代理
        4、保护（protect or access）代理
        5、cache代理
        6、防火墙（firewall）代理
        7、同步化（synchronization）代理
        8、智能引用（smart reference）代理
注意事项：
    1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口
    2、和装饰器模式的区别：装饰器模式是为了增强功能，而代理模式是为了加以控制





* 建造者模式（Builder）
使用多个简单的对象一步一步构建成一个复杂的对象

意图：
    将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
主要解决：
    在软件系统中，有时候面临着“一个复杂对象”的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定
何时使用：
    一些基本部件不会变，而其组合经常变化的时候
关键代码：
    建造者：创建和提供实例；导演：管理建造出来的实例的依赖关系
优点：
    1、建造者独立，易扩展
    2、便于控制细节风险
缺点：
    1、产品必须有共同点，范围有限制
    2、如内部变化复杂，会有很多的建造类
使用场景：
    1、需要生成的对象具有复杂的内部结构
    2、需要生成的对象内部属性本身相互依赖
注意事项：
    与工厂模式的区别：建造者模式更加关注与零件装配的顺序



* 原型模式（Prototype）
用于创建重复的对象，同时又能保证性能
实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式
例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用

意图：
    用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
主要解决：
    在运行期建立和删除原型
何时使用：
    1、当一个系统应该独立于它的产品创建、构成和表示时
    2、当要实例化的类是在运行时刻指定时，例如，通过动态装载
    3、为了避免创建一个与产品类层次平行的工厂类层次时
    4、当一个类的实例只能有几种不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些
如何解决：
    利用已有的一个原型对象，快速地生成和原型对象一样的实例
关键代码：
    1、实现克隆操作，在Java继承Cloneable，重写clone()
    2、原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些“易变类”拥有稳定的接口
优点：
    1、性能提高
    2、逃避构造函数的约束
缺点：
    1、配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定容易实现，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候
    2、必须实现Cloneable接口
使用场景：
    1、资源优化场景。
    2、类初始化需要消耗非常多的资源，这个资源包括数据、硬件资源等
    3、性能和安全要求的场景
    4、通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式
    5、一个对象多个修改者的场景
    6、一个对象需要提供给其它对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用
    7、一般是和工厂方法模式一起出现，通过clone方法创建一个对象，然后由工厂方法提供给调用者
注意事项：
    与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现Cloneable，重写，深拷贝是通过实现Serializable读取二进制流




* 桥接模式（Bridge）
用于把抽象化和实现化解耦，使得二者可以独立变化。通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦
涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响

意图：
    将抽象部分和实现部分分离，使它们都可以独立的变化
主要解决：
    在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活
何时使用：
    实现系统可能有多个角度分类，每一种角度都可能变化
如何解决：
    把这种多角度分类分离出来，让它们独立变化，减少它们之间的耦合
优点：
    1、抽象和实现分离
    2、优秀的扩展能力
    3、实现细节对客户透明
缺点：
    桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程
使用场景：
    1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系
    2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用
    3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展
注意事项：
    对于两个独立变化的维度，适用桥接模式再合适不过了





* 过滤器模式（Filter）/标准模式（Criteria）
允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来





* 享元/蝇量模式（Flyweight）
主要用于减少创建对象的数量，以减少内存占用和提高性能
尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象

意图：
    运用共享技术有效地支持大量细粒度的对象
主要解决：
    在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽离出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建
何时使用：
    1、系统中有大量对象
    2、这些对象消耗大量内存
    3、这些对象的状态大部分可以外部化
    4、这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替
    5、系统不依赖于这些对象身份，这些对象是不可分辨的
如何解决：
    用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象
关键代码：
    用HashMa存储这些对象
应用实例：
    1、Java中的String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面
    2、数据库的数据池
优点：
    大大减少对象的创建，降低系统的内存，使效率提高
缺点：
    提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱
使用场景：
    1、系统有大量相似对象
    2、需要缓冲池的场景
注意事项：
    1、注意划分外部状态和内部状态，否则可能会引起线程安全问题
    2、这些类必须有一个工厂对象加以控制







* 责任链模式（Chain Of Responsibility）
为请求创建了一个接收者对象的链。该模式给予请求的类型，对请求的发送者和接受者进行解耦
通常每个接收者都包含对另一个接收者的引用，如果一个对象不能处理该请求，它会把相同的请求传给下一个接收者，依此类推

意图：
    避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止
主要解决：
    职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了
如何解决：
    拦截的类都实现统一接口
关键代码：
    Handler里面聚合它自己，在HandleRequest里判断是否合适，如果没达到条件则向下传递，向谁传递之前set进去
优点：
    1、降低耦合度，将请求的发送者和接受者解耦
    2、简化对象，对象不需要知道链的结构
    3、增强给对象指派职责的灵活性。通过改变链内的成员或调动它们的次序，允许动态地新增或删除责任
    4、增加新的请求处理类很方便
缺点：
    1、不能保证请求一定被接受
    2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用
    3、可能不容易观察运行时的特征，有碍于除错
使用场景：
    1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定
    2、在不明确指定接受者的情况下，向多个对象中的一个提交一个请求
    3、可动态指定一组对象处理请求




* 命令模式（Command）
请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令

意图：
    将一个请求封装成一个对象，从而可以用不同的请求对客户进行参数化
主要解决：
    在软件系统中，行为请求者与行为实现者通常事一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适
何时使用：
    在某些场合，比如要对行为进行“记录、撤销/重做、事务“等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将“行为请求者”与“行为实现者”解耦？将一组行为抽象为对象，可以实现二者之间的松耦合
如何解决：
    通过调用者调用接受者执行命令，顺序：调用者->接受者->命令
关键代码：
    定义三个角色：
        1、received：真正的命令执行对象
        2、command：命令
        3、invoker：使用命令对象的入口
优点：
    1、降低了系统耦合度
    2、新的命令可以很容易添加到系统中去
缺点：
    使用命令模式可能会导致某些系统有过多的具体命令类




* 解释器模式（Interpreter）
提供了评估语言的语法或表达式的方式
实现了一个表达式接口，该接口解释一个特定的上下文
这种模式被用在sql解析、符号处理引擎等

意图：
    给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子
主要解决：
    对于一些固定文法构建一个解释句子的解释器
何时使用：
    如果一种特定类型的问题发生的频率足够高，那么可能就值得就该问题的各个实例表述为一个简单语言中的句子。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题
如何解决：
    构建语法树，定义终结符与非终结符
关键代码：
    构建环境类，包含解释器之外的一些全局信息，一般是HashMap
优点：
    1、可扩展性好、灵活
    2、增加了新的解释表达式的方式
    3、易于实现简单文法
缺点：
    1、可利用场景比较少
    2、对于复杂的文法比较难维护
    3、解释器模式会引起类膨胀
    4、解释器模式采用递归调用方法
使用场景：
    1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树
    2、一些重复出现的问题可以用一种简单的语言来进行表达
    3、一个简单语法需要解释的场景
注意事项：
    可利用场景比较少





* 中介者模式（Mediator）
用来降低多个对象和类之间的通信复杂性
提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护

意图：
    用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
主要解决：
    对象和对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时作出相应的处理
何时使用：
    多个类相互耦合，形成了网状结构
如何解决：
    将上述网状结构分离为星型结构
关键代码：
    对象之间的通信封装到一个类中单独处理
优点：
    1、降低了类的复杂度，将一对多转化成了一对一
    2、各个类之间的解耦
    3、符合迪米特原则
缺点：
    中介者会庞大，变得复杂难以维护
使用场景：
    1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象
    2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类
注意事项：
    不应当在指责混乱的时候使用





* 备忘录模式（Memento）
保存一个对象的某个状态，以便在适当的时候恢复对象

意图：
    在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
何时使用：
    很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有“后悔药”可吃
如何解决：
    通过一个备忘录类专门存储对象状态
关键代码：
    客户不与备忘录类耦合，与备忘录管理类耦合
应用实例：
    打游戏时的存档等
优点：
    1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态
    2、实现了信息的封装，使得用户不需要关心状态的保存细节
缺点：
    消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存
使用场景：
    1、需要保存/恢复数据的相关状态场景
    2、提供一个可回滚的操作
注意事项：
    1、为了符合迪米特原则，还要增加一个管理备忘录的类
    2、为了节约内存，可使用原型模式+备忘录模式





* 空对象模式（Null Object）
一个空对象取代Null对象实例的检查
Null对象不是检查空值，而是反应一个不做任何动作的关系，这样的Null对象也可以在数据不可用的时候提供默认的行为
在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，还创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值的地方





* 访问者模式（Visitor）
使用一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。
根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作

意图：
    主要将数据结构与数据操作分离
主要解决：
    稳定的数据结构和易变的操作耦合问题
何时使用：
    需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作“污染”这些对象的类，使用访问者模式将这些封装到类中
如何解决：
    在被访问的类里面加一个对外提供接待访问者的接口
关键代码：
    在数据基础类里面有一个方法接受访问者，将自身引用传入访问者
优点：
    1、符合单一职责原则
    2、优秀的扩展性
    3、灵活性
缺点：
    1、具体元素对访问者公布细节，违反了迪米特原则
    2、具体元素变更比较困难
    3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象
使用场景：
    1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作
    2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作“污染”这些对象的类，也不希望在增加新操作时修改这些类
注意事项：
    访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器











重点概念：
1、封装变化的部分
    把应用中会变化的部分取出并封装起来, 以便以后可以轻易地改动或扩充此部分, 而不影响不需要变化的其它部分

2、多用组合，少用继承

3、针对接口编程, 而不是针对实现编程
    其真正的含义是"针对超类型(supertype)编程", 关键在于多态. 利用多态, 程序可以针对超类型编程, 执行时会根据实际状况执行到真正的行为, 不会被绑死在超类型的行为上

4、类应该对扩展开放，对修改关闭

5、依赖倒置原则
    依赖抽象，不要依赖具体类
指导方针
    变量不可以持有具体类的引用 - 如果使用new，就会持有具体类的引用，可以改用工厂来避开这样的做法
    不要让类派生自具体类 - 派生自具体类，就会依赖具体类；应该派生自一个抽象（接口或抽象类）
    不要覆盖基类中已实现的方法 - 如果覆盖基类已实现的方法，那基类就不是一个真正适合被继承的抽象；基类中已实现的方法，应该由所有的子类共享

6、最少知识（迪米特）原则
    要减少对象之间的交互，设计一个系统时，不管是任何对象，都要注意它所交互的类有哪些，并注意它和这些类是如何交互的，不要让太多的类耦合在一起，免得修改系统中一部分，会影响到其他部分

    就任何对象而言，在该对象的方法内，我们只应该调用属于以下范围的方法：
        - 该对象本身
        - 被当作方法的参数而传递进来的对象
        - 此方法所创建或实例化的任何对象
        - 对象的任何组件（有一个/has-a 关系）

7、好莱坞原则
    别调用（打电话给）我们，我们会调用（打电话给）你
    当高层组件依赖低层组件，而低层组件又依赖高层组件，而高层组件又依赖边侧组件，而边侧组件又依赖低层组件时，依赖腐败就发生了

    好莱坞原则下，允许底层组件将自己挂钩到系统上，但是高层组件会决定什么时候和怎么样使用这些低层组件



8、单一职责
    一个类应该只有一个引起变化的原因
    当一个模块或一个类被设计成只支持一组相关的功能时，我们说它具有高内聚；反之，当被设计成支持一组不相关的功能时，我们说它具有低内聚






