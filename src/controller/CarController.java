package controller;

import javafx.animation.AnimationTimer;
import main.App;
import model.Car;
import model.CarModel;
import view.CarPane;

public class CarController {

	private CarModel model;

	public CarController(CarPane cp, CarModel m) {
		model = m;

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (model != null) {

					for (Car car : model) {

						car.move();

						if (car.getX() > App.WIDTH - 100) {
							car.turnLeft();
							car.turnLeft();
							car.move();
						}
						if (car.getX() < 0) {
							car.turnLeft();
							car.turnLeft();
							car.move();
						}

						cp.move(car.getModelName(), car.getX(), car.getY());
					}
					cp.update();
				}
			}
		};
		at.start();
	}

	/**
	 * Knapp för gas
	 * @param amount
	 */
	public void gas(double amount) {
		model.gas(amount);
	}

	/**
	 * Knapp för break
	 * @param amount
	 */
	public void brake(double amount) {
		model.brake(amount);
	}

	/**
	 * Knapp för turbo
	 * @param turbo
	 */
	public void changeTurbo(String turbo) {
		model.changeTurbo(turbo);
	}

	/**
	 * knapp för att kunna höja Flatbed
	 */
	public void raiseFlatbed() {
		model.raiseFlatbed();
	}

	/**
	 * Knapp för att kunna sänka Flatbed
	 */
	public void lowerFlatbed() {
		model.lowerFlatbed();
	}

}
