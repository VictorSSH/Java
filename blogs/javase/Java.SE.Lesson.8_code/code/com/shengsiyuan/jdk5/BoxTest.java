package com.shengsiyuan.jdk5;

import java.util.ArrayList;
import java.util.Collection;

public class BoxTest
{
	public static void main(String[] args)
	{
		int a = 3;
		
		Collection<Integer> c = new ArrayList<Integer>();
		
		c.add(3);//��int���͵�3ת��ΪInteger���Ͳ��ŵ����ϵ���
		c.add(a + 3);
		
		for(Integer i : c)
		{
			System.out.println(i);
		}
		
	}
}
