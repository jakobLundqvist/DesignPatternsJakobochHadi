import javafx.scene.paint.Color;

public class AstonMartin extends Car {

	public Turbo turbo;

	public AstonMartin() {
		super(250, Color.BLACK, "Aston Martin");
		turbo = new Turbo(1.5);
		stopEngine();
	}

	public void setTurboOn() {
		turbo.setTurboOn();
	}

	public void setTurboOff() {
		turbo.setTurboOff();
	}

	public double speedFactor() {
		return getEnginePower() * 0.01 * turbo.getTurboFactor();
	}

}