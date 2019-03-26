import java.util.ArrayList;

public class CarLoader {
	private ArrayList<Car> cars;

	public void loadCar(Car c) {

		cars.add(c);

	}

	public void unloadLastCar() {
		cars.remove(cars.size() - 1);
	}

	public void unloadFirstCar() {
		cars.remove(0);
	}

	public void updateAllPositions(double x, double y) {
		// TODO Auto-generated method stub

	}

}
