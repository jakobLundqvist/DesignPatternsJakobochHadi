package controller;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import model.Car;
import model.Saab95;
import model.Scania;
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

	public void changeTurbo(String turbo) {
		for (Car car : model) {
			if (car instanceof Saab95) {
				if (turbo.equals("Turbo On"))
					((Saab95) car).setTurboOn();
				else
					((Saab95) car).setTurboOff();
			}
		}

	}

	public void raiseFlatbed() {
		for (Car car : model) {
			if (car instanceof Scania) {
				((Scania) car).raiseFlatbed();
			}
		}
	}

	public void lowerFlatbed() {
		for (Car car : model) {
			if (car instanceof Scania) {
				((Scania) car).lowerFlatbed();
			}
		}
	}

}
