异常：Exception


生活中的异常！

 XX在上楼梯的时候，突然间 摔倒了？？？
 
  摔倒了====>发生了某种不可预知的情况
 
  摔倒了之后怎么办？
    01.躺一会
    02.起来 继续爬楼梯
    

代码中的异常！
    我们书写了 10行代码！
    但是在第5行出现了问题！
    后续代码不执行了？？？
    这种情况符合我们的逻辑吗？？？？不！
   
   
   怎么能让代码 继续执行？？ ====》java异常处理机制

java异常处理机制：
      保证程序出现异常情况以后，能继续执行后续代码！

 异常我们可以控制！ 但是 错误  我们无法预知和处理！



异常的分类
   01.受查异常（编译错误）  CheckException
   02.运行时异常                    RuntimeException


Throwable 是所有  异常Exception和错误Error的父类！



异常处理机制的5个关键字：

try:
        01.可能出现异常的代码块放在try代码块中
        02.不能独立出现，必须要和catch或者finally 连用

catch:
        01.如果try代码块中 出现异常，则执行该代码块
        02.捕获异常信息
        03.catch (RuntimeException e)的参数书写规则
		           前提 ：Z 继承  A 继承  B  继承   C
		            如果说try代码块中出现了A异常！
		            那么我们的参数只能设置成A本类或者它的父类（BC）!
		            绝对不能使用Z！
        04.可以书写多个catch块！
             01.try代码块中出现了异常之后，会根据异常类型找到对应的catch块
             02.多个catch块的书写顺序，必须按照异常类型从小到大书写！

finally:
       01.只有System.exit(int num);不执行，其他情况都必须执行的代码块！
           System.exit(int num)
            001.num=0 正常退出
            002.num!=0 异常退出
       02.如果有return存在，先执行finally再执行return
     
try ,catch ,finally 是自己处理异常！
西天取经的路上，有妖魔鬼怪！大师兄自己能搞定！
有些时候，猴哥搞不定？？？？怎么办？？？ 找救兵？？？
    
       
throw:   抛出异常
       01.只能写在方法体中
       02.同时只能抛出一个异常   
       



throws:  声明异常
       01.写在方法的参数列表之后
       02.可以声明多个异常，每个异常之间 使用逗号隔开
       03.throws的异常必须大于或者等于抛出的异常！



try ,catch ,finally是三个独立的代码块！
我们在其中一个代码快中定义的变量，其他的代码块不能访问！
如果想三个代码块中都能使用变量，必须把变量放在3个代码块之外！




自定义异常类：
   比如说我们创建了一个Student类！
   那么有可能 用户的年龄出现异常！
    我就想看到异常信息是      ！！！ 年龄异常！！！
 
前提：
    自定义异常类必须继承 RuntimeException,Exception,Throwable三者中的其中一个！
    
    创建一个Student类
      属性
        age
        sex
        name
  需求：
   当用户输入的sex不正确时  抛出 自定义异常的信息!说 性别不合法!!      
        
        
    
    
    
    
    
    


常见的异常类型：
  01.ArithmeticException  算术异常
  02.InputMismatchException  输入类型不匹配
  03.ArrayIndexOfBoundsException   数组下标越界
  04.NullPointException  空指针异常







