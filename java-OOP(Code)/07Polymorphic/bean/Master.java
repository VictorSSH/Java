package cn.bdqn.bean;

/**
 * 宠物的主人类
 */
public class Master {

	/**
	 * 给所有宠物喂食的方法
	 * 有那么多小宠物？  喂谁？？？
	 * 关键点：
	 *  我们怎么知道  传递来的是 小猫咪还是小狗狗！！！
	 *  
	 *  instanceof  判断某个对象 是否属于某个类型
	 *  所有的对象  instanceof  Object  返回值都是true
	 */
	public void feed(Animal animal) {
		// animal.eat(); 那么子类中特有的方法我们无法访问
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;// 向下转型
			dog.eat();
			dog.swimming(); // 调用子类特有的方法
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;// 向下转型
			cat.eat();
		}

	}
}
