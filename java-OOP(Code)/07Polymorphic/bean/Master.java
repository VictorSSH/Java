package cn.bdqn.bean;

/**
 * �����������
 */
public class Master {

	/**
	 * �����г���ιʳ�ķ���
	 * ����ô��С���  ι˭������
	 * �ؼ��㣺
	 *  ������ô֪��  ���������� Сè�仹��С����������
	 *  
	 *  instanceof  �ж�ĳ������ �Ƿ�����ĳ������
	 *  ���еĶ���  instanceof  Object  ����ֵ����true
	 */
	public void feed(Animal animal) {
		// animal.eat(); ��ô���������еķ��������޷�����
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;// ����ת��
			dog.eat();
			dog.swimming(); // �����������еķ���
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;// ����ת��
			cat.eat();
		}

	}
}
