package com.shengsiyuan.swing;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameDemo
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("FrameDemo");
		
		JLabel label = new JLabel("hello world");
		
		frame.addWindowListener(new MyHandler());
		
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
}

class MyHandler extends WindowAdapter
{
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}











