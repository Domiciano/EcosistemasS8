package main;

import processing.core.PApplet;

public class Servidor extends PApplet {

	private int eX;
	private int eY;
	private int dir;

	public static void main(String[] args) {
		PApplet.main("main.Servidor");
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		eX = 100;
		eY = 100;
		dir = 1;
		initMoveThread();
	}

	public void draw() {

		background(0);
		ellipse(eX, eY, 50, 50);
	}

	public void initMoveThread() {
		
		new Thread(
				
				()->{
					
					while(true) {
						move();
						try {
							Thread.sleep(15);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}

		).start();
		
		
	}

	public void move() {
			
		
			if(eX>width-25) {
				dir =  -1;
			}
			
			if(eX<25) {
				dir = 1;
			}
			
			eX +=  (dir*10);
	
	}
}
