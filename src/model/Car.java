package model;

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
	 * 
	 * @return bilens effekt
	 */
	public double getEnginePower() { //
		return enginePower;
	}

	/**
	 * Ger tillbaka bilens nuvarande hastighet
	 * 
	 * @return bilens hastighet
	 */
	public double getCurrentSpeed() { //
		return currentSpeed;
	}

	/**
	 * Ger tillbaka bilens färg
	 * 
	 * @return färg
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
	 * 
	 * @return
	 */
	public abstract double speedFactor();

	/**
	 * Öka hastighet
	 * 
	 * @param amount
	 */
	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
		if (getCurrentSpeed() > getEnginePower()) {
			currentSpeed = getEnginePower(); // MAX
		}
	}

	/**
	 * Minska Hastighet
	 * 
	 * @param amount
	 */
	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
		if (getCurrentSpeed() < 0) {
			currentSpeed = 0; // MIN
		}

	}

	/**
	 * Anropar incrementSpeed
	 * 
	 * @param amount
	 */
	public void gas(double amount) {
		if (amount > 1 || amount < 0) {
			return; // ABORT
		}
		incrementSpeed(amount);
	}

	/**
	 * Anropar decrementSpeed
	 * 
	 * @param amount
	 */
	public void brake(double amount) {
		if (amount > 1 || amount < 0) {
			return; // ABORT
		}
		decrementSpeed(amount);
	}

	/**
	 * Hur bilen ska röra på sig
	 */
	public void move() {
		if (dir == 1) { // HÖGER
			xPos += getCurrentSpeed();
		}
		if (dir == 2) { // BAKÅT
			yPos -= getCurrentSpeed();
		}
		if (dir == 3) { // VÄNSTER
			xPos -= getCurrentSpeed();
		}
		if (dir == 4) { // FRAMÅT
			yPos += getCurrentSpeed();
		}
	}

	/**
	 * Ger tillbaka bilens x position
	 * @return
	 */
	public double getX() {
		return xPos;
	}

	
	/**
	 * Ger tillbaka bilens y position
	 * @return
	 */
	public double getY() {
		return yPos;
	}

	/**
	 * Svänger Vänster
	 */
	public void turnLeft() {
		dir -= 1;
		if (dir == 0) {
			dir = 4;
		}
	}

	/**
	 * Svänger Höger
	 */
	public void turnRight() {
		dir += 1;
		if (dir == 5) {
			dir = 1;
		}
	}

	/**
	 * Ger modellens namn
	 * @return namn
	 */
	public String getModelName() {
		return this.modelName;
	}

	/** 
	 * uppdatera y position
	 * @param y
	 */
	public void setY(double y) {
		this.yPos = y;
	}

}
