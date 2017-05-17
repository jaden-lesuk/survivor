package com.survivor.main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends MouseAdapter {
	
	public void mousePressed(MouseEvent e){
		
	}
	
	public void mouseReleased(MouseEvent e){
		
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		Font fuck = new Font("arial" , 1 , 50);
		Font clock = new Font("arial" , 1 , 50);
		
		g.setFont(fuck);
		g.setColor(Color.white);
		g.drawString("SURVIVOR", 180, 60);
		
		g.setFont(clock);
		g.setColor(Color.white);
		g.drawRect(210, 100, 200, 64);
		g.drawString("PLAY", 245, 150);
		
		g.setColor(Color.white);
		g.drawRect(210, 200, 200, 64);
		g.drawString("HELP", 245, 250);
		
		g.setColor(Color.white);
		g.drawRect(210, 300, 200, 64);
		g.drawString("QUIT", 250, 350);
	}
	

}
