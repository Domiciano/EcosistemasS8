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

import communication.TCPsingleton;
import processing.core.PApplet;

public class Servidor extends PApplet{
	private TCPsingleton tcp;
	
	public static void main(String[] args) {
		

	}
	
	public void settings() {
		
	}
	
	public void setup() {
		tcp = TCPsingleton.getInstance();

	}
	
	
	
	public void draw() {
		
		
	}
		
	

}
