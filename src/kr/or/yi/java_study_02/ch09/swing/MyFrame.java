package kr.or.yi.java_study_02.ch09.swing;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
		public MyFrame() throws HeadlessException{
		 setTitle("300x300 스윙 프레임 만들기");
		 setSize(300,300);
		 setVisible(true);
		
	}
		public static void main(String[] args) {
			MyFrame frame = new MyFrame();
		}
}
