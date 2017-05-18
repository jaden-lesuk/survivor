package com.survivor.main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.survivor.main.Game.STATE;

public class End extends MouseAdapter {
	private Game game;
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	public STATE gameState = STATE.End;
	
	public End(Game game, Handler handler, HUD hud){
		this.game = game;
		this.handler = handler;
		this.hud = hud;
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
		
		
		if(game.gameState == STATE.End){
			//quit button
			if(mouseOver(mx, my,200, 220, 300, 64)){
				game.gameState = STATE.Game;
//				handler.addObject(new Player(Game.WIDTH/2-32 ,Game.HEIGHT/2-32, ID.Player, handler));
//				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH -50) ,r.nextInt(Game.HEIGHT -50), ID.BasicEnemy, handler));
				new Game();
			}
		}
		
//		if(game.gameState == STATE.End){
//			//quit button
//			if(mouseOver(mx, my, 200, 350, 200, 64)){
//				game.gameState = STATE.Menu;
//			}
//		}
		
	}
	
	public void mouseReleased(MouseEvent e){
		
	}
	

	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		 if(game.gameState == STATE.End){
			Font fuck = new Font("arial" , 1 , 50);
			Font clock = new Font("arial" , 1 , 50);
			
			g.setFont(fuck);
			g.setColor(Color.RED);
			g.drawString("YOU DIED",180, 100);
			
			g.setColor(Color.white);
			g.drawString("Your Score: "+hud.getScore(), 100, 200);

			g.setColor(Color.white);
			g.drawRect(150, 250, 300, 64);
			g.drawString("HOME", 225, 300);	
			
//			g.setColor(Color.white);
//			g.drawRect(200, 350, 200, 64);
//			g.drawString("HOME", 230, 400);	
		}

	}
	

}
