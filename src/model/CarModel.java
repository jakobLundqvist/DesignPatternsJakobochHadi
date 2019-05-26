package model;

import java.util.ArrayList;
import java.util.Iterator;

public class CarModel implements Iterable<Car> {

	private ArrayList<Car> cars = new ArrayList<Car>();

	public void addCar(Car c) {
		c.setY(cars.size() * 100);
		cars.add(c);
	}

	public void gas(double amount) {
		for (Car car : cars)
			car.gas(amount);
	}

	public void brake(double amount) {
		for (Car car : cars)
			car.brake(amount);
	}

	public void changeTurbo(String turbo) {
		for (Car car : cars) {
			if (car instanceof Saab95) {
				if (turbo.equals("Turbo On"))
					((Saab95) car).setTurboOn();
				else
					((Saab95) car).setTurboOff();
			}
		}

	}

	/**
	 * Tar upp flatbed
	 */
	public void raiseFlatbed() {
		for (Car car : cars) {
			if (car instanceof Scania) {
				((Scania) car).raiseFlatbed();
			}
		}
	}

	/**
	 * Tar ner flatbed
	 */
	public void lowerFlatbed() {
		for (Car car : cars) {
			if (car instanceof Scania) {
				((Scania) car).lowerFlatbed();
			}
		}
	}

	@Override
	public Iterator<Car> iterator() {
		return cars.iterator();
	}

}
