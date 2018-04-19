package com.shengsiyuan.reflect;

import java.lang.reflect.Field;

public class TestPrivate2
{
	public static void main(String[] args) throws Exception
	{
		Private2 p = new Private2();
		
		Class<?> classType = p.getClass();
		
		Field field = classType.getDeclaredField("name");
		
		field.setAccessible(true);//ѹ��Java�Է������η��ļ��
		
		field.set(p, "lisi");
		
		System.out.println(p.getName());
	}
}
