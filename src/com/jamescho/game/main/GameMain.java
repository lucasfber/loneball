package com.jamescho.game.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class GameMain {
	
	private static final String GAME_TITLE = "LoneBall (Chapter 5)";
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 450;
	public static Game game;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(GAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		game = new Game(GAME_WIDTH, GAME_HEIGHT);
		frame.add(game);
		frame.pack();
		frame.setVisible(true);
		frame.setIconImage(Resources.iconImage);
		
	}
	
}
