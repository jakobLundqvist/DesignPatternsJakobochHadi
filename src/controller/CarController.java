package controller;

import javafx.animation.AnimationTimer;
import model.Car;
import view.CarPane;

public class CarController {

	private Car model;

	public CarController(CarPane cp) {

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (model != null) {
					model.move();
					cp.move(model.getX(), model.getY());
					cp.update();
				}
			}
		};
		at.start();
	}

	public void setModel(Car v) {
		model = v;
	}

	public void gas(double amount) {
		model.gas(amount);
	}

}
