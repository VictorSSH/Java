package com.shengsiyuan.jdk5;

public class EnumTest
{
	public static void doOp(OpConstant opConstant)
	{
		switch (opConstant)
		{
		case TURN_LEFT:
			System.out.println("����ת");
			break;

		case TURN_RIGHT:
			System.out.println("����ת");
			break;

		case SHOOT:
			System.out.println("���");
			break;
		}
	}
	
	
	public static void main(String[] args)
	{
		doOp(OpConstant.TURN_LEFT);
	}	
}

enum OpConstant
{
	TURN_LEFT, TURN_RIGHT, SHOOT
}