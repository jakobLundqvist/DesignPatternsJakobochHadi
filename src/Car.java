import javafx.scene.paint.Color;

public abstract class Car implements Movable {

	private double xPos, yPos;
	private int dir;
	// 0 == UP
	// 1 == RIGHT
	// 2 == DOWN
	// 3 == LEFT

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name

	public Car(double ep, Color c, String model) {

		enginePower = ep;
		color = c;
		modelName = model;
		xPos = 0;
		yPos = 0;
		dir = 1;

	}

	/**
	 * Ger tillbaka bilens effekt
	 * @return bilens effekt
	 */
	public double getEnginePower() { //
		return enginePower;
	}

	/**
	 * Ger tillbaka bilens nuvarande hastighet
	 * @return bilens hastighet
	 */
	public double getCurrentSpeed() { //
		return currentSpeed;
	}
	
	/**
	 * Ger tillbaka bilens f�rg
	 * @return
	 */
	public Color getColor() { // 
		return color;
	}
	
	/**
	 * Startar motorn
	 */
	public void startEngine() {
		currentSpeed = 0.1;
	}
	
	/**
	 * Stoppar motorn
	 */
	public void stopEngine() {
		currentSpeed = 0;
	}

	/**
	 * Ger hastigheten
	 * @return
	 */
	public abstract double speedFactor();

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
		if(getCurrentSpeed() > getEnginePower()){
			currentSpeed = getEnginePower(); // MAX
		}
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
		if(getCurrentSpeed() < 0){
			currentSpeed = 0; // MIN
		}
		
	}

	public void gas(double amount) {
		if( amount > 1 || amount < 0){
			return;  // ABORT
		}
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		if( amount > 1 || amount < 0){
			return;  // ABORT
		}
		decrementSpeed(amount);
	}

	public void move() {
		if(dir == 1){ // H�GER
			xPos += getCurrentSpeed();
		}
		if(dir == 2){ // BAK�T
			yPos -= getCurrentSpeed();
		}
		if(dir == 3){ // V�NSTER
			xPos -= getCurrentSpeed();
		}
		if(dir == 4){ // FRAM�T
			yPos += getCurrentSpeed();
		}
	}
	
	/**
	 * Sv�nger V�nster
	 */
	public void turnLeft() {
		dir -= 1;
		if(dir == 0){
			dir = 4;
		}
	}

	/**
	 * Sv�nger H�ger
	 */
	public void turnRight() {
		dir += 1;
		if(dir == 5){
			dir = 1;
		}
	}

}
