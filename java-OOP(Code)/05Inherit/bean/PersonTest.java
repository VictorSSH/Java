package cn.bdqn.bean;

public class PersonTest {

	public static void main(String[] args) {
		// ������һ��ѧ������
		Student stu = new Student();
		stu.setName("����");
		stu.setAge(50);
		stu.setAddress("����");
		/**
		 *  ���ѧ������
		 *  cn.bdqn.bean.Student@2b0a141e
		 *  cn.bdqn.bean.Student   ȫ����/�����޶���
		 *  @2b0a141e   ������
		 *  
		 *  ֻҪ�����Ǵ�����һ���࣬Ĭ�϶��Ǽ̳�Object��
		 *  ���Ǵ������� ��   �����������ͣ�
		 *  
		 *  ����ͨ������Դ���N������
		 *  �������ֱ������˶���
		 *  ��ô�ͻ�Ĭ��ִ��Object���е�toString()
		 */
		System.out.println(stu);

		// ����һ����ʦ����
		Teacher tea = new Teacher();
		tea.setName("����");
		tea.setAge(50);
		tea.setAddress("����");
		// �����ʦ����
		System.out.println(tea);
	}

}
