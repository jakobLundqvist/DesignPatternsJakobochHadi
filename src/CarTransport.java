import java.util.ArrayList;

import javafx.scene.paint.Color;

public class CarTransport extends Car {

	private int flatbedAngle;

	private ArrayList<Car> cars;
	
	
	public CarTransport() {
		super(2000, Color.ORANGE, "VOVLO LÅNGTRUCK");
		flatbedAngle = 0;
		cars = new ArrayList<Car>();
		stopEngine();
	}

	public double speedFactor() {
		return getEnginePower() * 0.001;
	}

	public void loadCar(Car c){
		if(flatbedAngle == 70 && c != this)
			cars.add(c);
	}
	
	
	/**
	 * Höjer flaket 10 grader
	 */
	public void openRamp() {
		if (getCurrentSpeed() > 0)
			return;

		flatbedAngle += 10;
		if (flatbedAngle > 70)
			flatbedAngle = 70;
	}

	/**
	 * Sänker flaket 10 grader
	 */
	public void closeRamp() {
		flatbedAngle -= 10;
		if (flatbedAngle < 0)
			flatbedAngle = 0;
	}

	@Override
	public void gas(double amount) {
		if (flatbedAngle == 0)
			super.gas(amount);
	}

}
