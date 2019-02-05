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

	public double getEnginePower() { //
		return enginePower;
	}

	public double getCurrentSpeed() { //
		return currentSpeed;
	}

	public Color getColor() { // 
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}

	public abstract double speedFactor();

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}

	public void move() {
		if(dir == 1){ // HÖGER
			xPos += getCurrentSpeed();
		}
		if(dir == 2){ // BAKÅT
			yPos -= getCurrentSpeed();
		}
		if(dir == 3){ // VÄNSTER
			xPos -= getCurrentSpeed();
		}
		if(dir == 4){ // FRAMÅT
			yPos += getCurrentSpeed();
		}
	}
	
	public void turnLeft() { // Svänger vänster
		dir -= 1;
		if(dir == 0){
			dir = 4;
		}
	}

	public void turnRight() { // Svänger höger
		dir += 1;
		if(dir == 5){
			dir = 1;
		}
	}

}
