import java.util.ArrayList;

import javafx.scene.paint.Color;

public class CarTransport extends Car {

	private Flatbed flatbed;
	private CarLoader loader;

	public CarTransport() {
		super(2000, Color.ORANGE, "VOVLO LÅNGTRUCK");
		flatbed = new Flatbed();
		loader = new CarLoader();
		stopEngine();
	}

	public double speedFactor() {
		return getEnginePower() * 0.001;
	}

	public void loadCar(Car c) {
		if (flatbed.isOpen() && c != this)
			loader.loadCar(c);
	}

	public void unloadCar() {
		if (flatbed.isOpen())
			loader.unloadLastCar();
	}

	@Override
	public void move() {
		super.move();
		loader.updateAllPositions(this.getX(), this.getY());
	}

	/**
	 * Höjer flaket 10 grader
	 */
	public void openRamp() {
		if (getCurrentSpeed() == 0)
			flatbed.open();
	}

	/**
	 * Sänker flaket 10 grader
	 */
	public void closeRamp() {
		if (getCurrentSpeed() == 0)
			flatbed.close();
	}

	@Override
	public void gas(double amount) {
		if (flatbed.isClosed())
			super.gas(amount);
	}

}
