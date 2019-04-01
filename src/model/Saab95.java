package model;
import javafx.scene.paint.Color;

public class Saab95 extends Car{

	public Turbo turbo;
	
	
	public Saab95() {
		super(125,Color.BLACK,"Saab95");
		turbo = new Turbo(1.3);
		stopEngine();
	}
	
	public void setTurboOn(){
		turbo.setTurboOn();
	}

	public void setTurboOff(){
		turbo.setTurboOff();
	}

	public double speedFactor() {	
		return getEnginePower() * 0.01 * turbo.getTurboFactor();
	}

	

	
}