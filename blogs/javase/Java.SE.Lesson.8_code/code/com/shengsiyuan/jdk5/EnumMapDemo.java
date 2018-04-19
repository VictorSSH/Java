package com.shengsiyuan.jdk5;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo
{
	public static void main(String[] args)
	{
		Map<Action, String> map = new EnumMap<Action, String>(Action.class);

		map.put(Action.TURN_RIGHT, "����ת");
		map.put(Action.SHOOT, "���");
		map.put(Action.TURN_LEFT, "����ת");

		for (Action action : Action.values())
		{
			System.out.println(map.get(action));
		}
	}
}

enum Action
{
	TURN_LEFT, TURN_RIGHT, SHOOT;
}
