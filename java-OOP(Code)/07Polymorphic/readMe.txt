
都是去买东西，但是根据我们给别人金额的不同，得到不同的结果！！！！ 生活中的多态！

操作是否一致？   一致！  都是买东西！
什么不一样？？
     01.消费金额不一样
     02.因为消费金额不一样   所以  得到的东西不一样
     
程序中的多态：
    01.静态的多态     方法重载
    
    String     buySomething();
    String     buySomething(double money);
    String     buySomething(double money,String something);
   
    02.动态的多态
    
     Animal  是抽象类
     Animal x=new X(); 
     
     同一个引用类型，使用不同的对象实例，而执行不同的操作，从而得到一个不同的结果！
  
  如果X是Dog，等会执行eat（）就是吃骨头；  
  如果X是Cat，等会执行eat（）就是吃鱼；
  
  01.Dog和Cat都是动物！！ ===》同一个引用类型
  02.一个Dog 一个Cat     ===》不同的对象实例
  03. 吃骨头     吃鱼            ===》不同的操作结果
  
  
多态存在的必要条件：
01.要有继承关系！                                                Dog和Cat   is a  动物        都是 extends  Animal
02.子类要重写父类方法 ！                                     eat（）是重写了父类的方法
03.父类的引用指向了子类的对象！                        Animal x=new X();   X()子类的对象
  
  

多态的实际应用场景：
01.使用父类作为方法的参数！         
      
      我要买小动物！    buy(Animal)   buy(Dog)  对！
      
02.使用父类作为方法的返回值！
   
    我要买小动物！ 
     public   Animal   buy(Animal  animal){
		         这个方法让我们返回一个Animal（动物）
		        我们返回一个Cat 小猫咪  行吗？   行！！！
          return  new Cat();
     }
      

需求：
 01.创建Dog  Cat  Animal  三个类
 02.Dog  Cat 分别继承   Animal
 03.创建一个Master 主人类
 04.在Master中新增一个 给宠物喂食的方法，方法的参数是？？？Animal
 05.模拟主人给小动物 喂食的方法
 
 
 instanceof  判断某个对象 是否属于某个类型
 所有的对象  instanceof  Object  返回值都是true

  
  
    
    
    
    
    
    
    
    
    
    
    
 
 
 
     
     
     



