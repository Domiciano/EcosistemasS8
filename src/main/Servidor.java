package main;

import processing.core.PApplet;

public class Servidor extends PApplet{
	
	
	public static void main(String[] args) {
		PApplet.main("main.Servidor");
		
	}
	
	public void settings() {
		size(500,500); 
	}
	
	public void setup() {
		
	}
	
	public void draw() {
		background(255,255,0); 
		ellipse(width/2, height/2, 50,50); 
		
	}
}
