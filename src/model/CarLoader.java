package model;
import java.util.ArrayList;

public class CarLoader {
	
	private ArrayList<Car> cars;

	/**
	 * Lägger till en bil
	 * @param
	 */
	public void loadCar(Car c) {

		cars.add(c);

	}

	/**
	 * tar ut sissta bilen
	 */
	public void unloadLastCar() {
		cars.remove(cars.size() - 1);
	}

	/**
	 * Tar ut första bilen
	 */
	public void unloadFirstCar() {
		cars.remove(0);
	}

	/**
	 * Uppdaterar position x samt y
	 * @param x
	 * @param y
	 */
	public void updateAllPositions(double x, double y) {

	}

}
