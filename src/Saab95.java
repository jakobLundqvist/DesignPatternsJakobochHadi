import javafx.scene.paint.Color;

public class Saab95 extends Car{

	private boolean turboOn;

	
	public Saab95() {
		super(125,Color.BLACK,"Saab95");
		turboOn = false;
		stopEngine();
	}

	
	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}

	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

	
}