package com.survivor.main;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	
	public KeyInput(Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size() ; i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getID() == ID.Player){
				//Key events for player1.
				
				if(key == KeyEvent.VK_W) tempObject.setY(tempObject.getY() - 5);
				if(key == KeyEvent.VK_S) tempObject.setY(tempObject.getY() + 5);
			}
			
			if(tempObject.getID() == ID.Player2){
				//Key events for player1.
				
				if(key == KeyEvent.VK_UP) tempObject.setY(tempObject.getY() - 5);
				if(key == KeyEvent.VK_DOWN) tempObject.setY(tempObject.getY() + 5);

			}
		}
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
	}
	
}
