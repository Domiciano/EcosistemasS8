package main;

public class Coordenada {
	
	private String x;
	private String y;
	
	public Coordenada (String x, String y) {
		this.setX(x);
		this.setY(y);
		
	}
	
	public Coordenada () {
		
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}
	
	
	
}
