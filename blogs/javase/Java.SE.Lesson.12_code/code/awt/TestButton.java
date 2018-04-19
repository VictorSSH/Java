package com.shengsiyuan.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("Test Button");
		
		Button button = new Button("Press Me!");
		
		//增加事件处理器
		button.addActionListener(new ButtonHandler());
		
		frame.add(button,BorderLayout.CENTER);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
}

class ButtonHandler implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String label = e.getActionCommand();
		
		System.out.println(label);
	}
}























