# 私人银行取款机项目 
   var money = 100;
    var total = 3;
    do{
        var handle = prompt("欢迎光临本银行ATM:\n请输入您的操作\n1.存钱;\n2.取钱;\n3.显示余额;\n4.退出\n")
        handle = parseInt(handle)

        if(handle == 1){
            money += parseInt(prompt("请输入您要存入的钱数："))
            alert("余额为" + money)
        }else if(handle == 2){
            money -= parseInt(prompt("请输入您要取钱的钱数："))
            alert("余额为" + money)
        }else if(handle == 3){
            alert("余额为" + money)
        }else if(handle == 4){
            alert("确认要退出吗")
        }else{
            alert("操作有误!您还有" + --total + "机会！！！")
        }
    }while(handle!=4 && total!=0)


final  
 final  修饰的类无法继承 
final修饰的方法无法覆盖
final  修饰的变量只能赋值一次
final 修饰的引用一旦指向某个对象不能采用系统默认值
final 修饰的实例变量 一般和static 联合使用 常量 
例子  public  static final double PI= 3.1415926；
 抽象类 
抽象类就是在class前添加abstract 关键字就行了
抽象类是无法实例化的 无法创建对象的所以抽象类 是用来被子类继承的
final  和 abstract 是不能联合使用的这俩个关键字是对立的 
抽象类的子类 可以是抽象类  也可以是非抽象类
抽象类中虽然无法实例化但是抽象类有构造方法这个构造方法是供子类使用的 
抽象类中不一定有抽象方法抽象方法必须出现在抽象类中
抽象方法怎么定义
 public abstract  void  dosome（）；
五颗星   非常之重要    一个非抽象的类 
继承抽象类必须将抽象类中的抽象方法进行覆盖或者重写 或者实现  


  接口也是一种引用数据 编译之后也是一个class文件
 接口 是完全抽象的  抽象类 是半抽象 也可以说接口是特殊的抽象类 
接口怎么定义 语法是 修饰符列表  + interface  + 接口名{  }
接口 支持多继承  一个接口可以继承多个接口
接口中只包含俩部分内容  一个是常量  一个是抽象方法
  接口中没有其他内容 只有这俩个内容
接口中所有的元素都是【public】修饰的  都是公开的 
接口中的抽象方法定义时：public abstract 修饰符时可以省略的 
接口中的方法都是抽象方法 所以节后中的方法不能有方法体
接口中的常量的public static final 可以省略 
  类和类之间叫做继承 类和接口之间叫做实现但是可以当做继承来看待
继承使用extends关键字完成  实现使用implement关键字完成
五颗星  当一个非抽象类要实现接口的话必须将接口中的所有方法全部实现
或者叫全部覆盖 或者全部重写 ！