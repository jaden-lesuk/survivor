package com.survivor.main;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Handler {
	
	List<GameObject> object = new ArrayList<GameObject>();
	
	public void tick(){
		for (int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g){
			for (int i = 0; i < object.size(); i++){
				GameObject tempObject = object.get(i);
				
				tempObject.render(g);
			}
	}
	
	public void clearEnemies(){
		for (int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			
			if(tempObject.getID() != ID.Player){
				object.clear();
				addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player, this));
			}
		}
	}
	
	public void clearEnemiesx(){
		for (int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			
			if(tempObject.getID() != ID.Player){
				object.clear();
	//			addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player, this));
			}
		}
	}
	
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
}
