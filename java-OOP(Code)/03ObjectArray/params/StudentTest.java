package cn.bdqn.params;

public class StudentTest {
	public static void main(String[] args) {
		// ����ѧ�������
		Student stu = new Student();
		stu.age = 20;
		stu.name = "С��";
		// ���ҽ���
		stu.showInfo();
		// ���ö����˯������
		stu.sleep();
		System.out.println("----------------------------");
		stu.showInfo(stu);
		// ����ѧ���Ƿ񳤴�ķ���
		stu.changeStudent(stu);
	}

}
