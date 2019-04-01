package controller;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import model.Car;
import view.CarPane;

public class CarController {

	private ArrayList<Car> model;

	public CarController(CarPane cp) {

		model = new ArrayList<Car>();

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (model != null) {

					for (Car car : model) {

						car.move();

						if (car.getX() > 1100) {
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

	public void addCar(Car c) {
		c.setY(model.size() * 100);
		model.add(c);
	}

	public void gas(double amount) {
		for (Car car : model)
			car.gas(amount);
	}

	public void brake(double amount) {
		for (Car car : model)
			car.brake(amount);
	}

}
