package com.jamescho.game.model;

import java.awt.Rectangle;

import com.jamescho.game.main.GameMain;

public class Paddle {

	private int x, y, width, height, velY;
	private Rectangle rect;
	private final static int MOVE_SPEED_Y = 4;
	
	public Paddle(int x,int y,int width,int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		this.velY = 0;
		rect = new Rectangle(x,y,width,height);
	}
	
	public void update(){
		this.y += velY;
		
		if(y < 0){
			y = 0;
		}
		else if(y + height > GameMain.GAME_HEIGHT){
			y = GameMain.GAME_HEIGHT - height;
		}
		
		updateRect();
	}

	private void updateRect() {
		rect.setBounds(x, y, width, height);
	}
	
	public void accelUp(){
		velY = -MOVE_SPEED_Y;
	}
	
	public void accelDown(){
		velY = MOVE_SPEED_Y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Rectangle getRect() {
		return rect;
	}

	public void stop(){
		velY = 0;
	}
	
}
