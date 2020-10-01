package communication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;


public class TCPsingleton {
	
	private Socket socket;
	private BufferedWriter writer;
	private BufferedReader reader;
	private Class observer;
	
	private static TCPsingleton instance;
	
	private TCPsingleton() {
		
	}
	
	public static TCPsingleton getInstance() {
		if(instance == null) {
			instance = new TCPsingleton();
		}
		return instance;
	}
	
public void setObserver(Class observer) {
		
		this.observer = observer;
		
	}

	public void run() {
		
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("Esperando conexion");
			socket = server.accept();
			System.out.println("Cliente conectado");
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			reader = new BufferedReader(isr);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			writer = new BufferedWriter(osw);
			
			Gson gson = new Gson();
			
			while(true) {
				String line = reader.readLine();
				System.out.println("Recibido: " + line);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String msg) {
		new Thread(
				()->{
					try {
						writer.write(msg+"\n");
						writer.flush();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				).start();
	}

}
