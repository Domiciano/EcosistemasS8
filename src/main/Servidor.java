package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.google.gson.Gson;

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
	ellipse(width/2, height/2, 100,100); 
		
	}
		
	

}
