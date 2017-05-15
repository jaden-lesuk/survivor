package com.survivor.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable{

	private static final long serialVersionUID = 8340867905139409543L;
	
	public static final int WIDTH = 640, HEIGHT = WIDTH/12 * 9;
	
	
	public Game(){
		new Window(WIDTH, HEIGHT, "Survivor", this);
	}

	public synchronized void start(){
	}
	
	public void run(){
		
	}
	
	public static void main(String[] args){
		new Game();
	}
}
