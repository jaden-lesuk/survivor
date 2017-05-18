//package com.survivor.main;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Rectangle;
//import java.util.Random;
//
//public class Particle extends GameObject{
//	private Handler handler;
//	
//	Random r = new Random();
//	private Color col;
//	
//	
//
//	public Particle(int x, int y, ID id, Handler handler) {
//		super(x, y, id);
//		this.handler = handler;
//
//			velX =(r.nextInt(5 - -5)+ -5);
//			velY =(r.nextInt(5 - -5)+ -5);
//		
//		col = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
//	}
//
//	public Rectangle getBounds(){
//		return new Rectangle((int)x,(int)y,16,16);
//	}
//	
//	
//	@Override
//	public void tick() {
//		x += velX;
//		y += velY;
//		
//		if (y <= 0 || y>= Game.HEIGHT -32 ) velY*=-1;
//		if (x <= 0 || x>= Game.WIDTH -16 ) velX*=-1;
//		handler.addObject(new Trail((int)x,(int) y,ID.Trail, col, 16, 16 , 0.03f,handler));
//	}
//
//	@Override
//	public void render(Graphics g) {
//		g.setColor(col);
//		g.fillRect((int)x,(int) y, 16, 16);
//	}
//}