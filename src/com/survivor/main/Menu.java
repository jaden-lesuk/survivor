package com.survivor.main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.survivor.main.Game.STATE;

public class Menu extends MouseAdapter {
	private Game game;
	private Handler handler;
	private Random r = new Random();
	
	public Menu(Game game, Handler handler){
		this.game = game;
		this.handler = handler;
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		if(mx > x && mx < x + width){
			if(my > y && my < y + height){
				return true;
			}else {return false;}
		}else {return false;}
	}
	
	
	public void mousePressed(MouseEvent e){
		int mx = e.getX();
		int my = e.getY();
		
		
		if(game.gameState == STATE.Menu){
			//play button
			if(mouseOver(mx, my, 210, 100, 200, 64)){
				game.gameState = STATE.Game;
				handler.addObject(new Player(Game.WIDTH/2-32 ,Game.HEIGHT/2-32, ID.Player, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH -50) ,r.nextInt(Game.HEIGHT -50), ID.BasicEnemy, handler));
			}
		
			
			//help button
			if(mouseOver(mx, my, 210, 200, 200, 64)){
				game.gameState = STATE.Help;
			}
			
			//quit button
			if(mouseOver(mx, my, 210, 300, 200, 64)){
				System.exit(1);
			}
			
		}

		
		//Help back button
		if(game.gameState == STATE.Help){
			if(mouseOver(mx, my, 200, 300, 200, 64)){
				game.gameState = STATE.Menu;
			}
		 }
		
	}
	
	public void mouseReleased(MouseEvent e){
		
	}
	

	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		if(game.gameState == STATE.Menu){
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
		}else if(game.gameState == STATE.Help){
			Font fuck = new Font("arial" , 1 , 50);
			Font clock = new Font("arial" , 1 , 50);
			
			g.setFont(fuck);
			g.setColor(Color.white);
			g.drawString("HELP", 250, 60);
			
			g.setColor(Color.white);
			g.drawString("Use W,A, S, D keys to", 65, 150);
			g.drawString("dodge enemies", 150, 200);
			
			g.setColor(Color.white);
			g.drawRect(200, 300, 200, 64);
			g.drawString("BACK", 230, 350);	
			
		}

	}
	

}
