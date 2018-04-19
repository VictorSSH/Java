package cn.bdqn.test;

public interface PhoneInterface {

	/**
	 * 打电话的方法
	 * @throws Exception  
	 * 如果声明方法的地方 没有声明异常，那么实现类中的这个call就不能声明异常！
	 * 如果出现了异常，只能自己处理（try  catch）
	 * 
	 */
	void call() throws Exception;
}
