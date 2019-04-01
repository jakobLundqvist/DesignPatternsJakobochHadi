package model;
import javafx.scene.paint.Color;

public class Porche extends Car {

	public Porche() {
		super(400, Color.BLACK, "Porche Carrerra");
		stopEngine();
	}

	public double speedFactor() {
		return getEnginePower() * 0.01;
	}

}