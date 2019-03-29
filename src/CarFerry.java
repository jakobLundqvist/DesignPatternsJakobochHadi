import javafx.scene.paint.Color;

public class CarFerry extends Car{

	private CarLoader loader;

	public CarFerry() {
		super(5000, Color.WHITE, "STENA LINE");
		loader = new CarLoader();
		stopEngine();
	}

	public double speedFactor() {
		return getEnginePower() * 0.00001;
	}

	public void loadCar(Car c) {
			loader.loadCar(c);
	}

	public void unloadCar() {

			loader.unloadFirstCar();
	}

	@Override
	public void move() {
		super.move();
		loader.updateAllPositions(this.getX(), this.getY());
	}

	
}
