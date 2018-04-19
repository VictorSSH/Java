package com.shengsiyuan;

public class Node2Test
{	
	public static void main(String[] args)
	{
		Node2 node1 = new Node2("node1");
		Node2 node2 = new Node2("node2");
		Node2 node3 = new Node2("node3");
		
		node1.next = node2;
		node2.previous = node1;
		
		node2.next = node3;
		node3.previous = node2;
		
		node3.next = node1;
		node1.previous = node3;
		
		System.out.println("--------------------");
		
		Node2 node4 = new Node2("node4");
		
		node1.next = node4;
		node4.previous = node1;
		node4.next = node2;
		node2.previous = node4;
		
		System.out.println("--------------------");
		
		
		node1.next = node2;
		node2.previous = node1;
		
		node4.previous = null;
		node4.next = null;	
		
	}
}
