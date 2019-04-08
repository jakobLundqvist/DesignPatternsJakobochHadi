package view;

import controller.CarController;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ButtonBox extends HBox {

	private CarController controller;
	private Spinner<Integer> spinner;
	private Button gasButton;
	private Button brakeButton;
	private Button turboButton;
	private Button flatbedUpButton, flatbedDownButton;

	public ButtonBox(CarController cc) {
		this.controller = cc;
		setStyle();
		addComponents();
		addEventListeners();
	}

	private void addEventListeners() {
		gasButton.setOnAction(e -> {
			controller.gas(spinner.getValue() / 100.0);
		});

		brakeButton.setOnAction(e -> {
			controller.brake(spinner.getValue() / 100.0);
		});

		turboButton.setOnAction(e -> {
			controller.changeTurbo(turboButton.getText());
			if (turboButton.getText().contentEquals("Turbo On"))
				turboButton.setText("Turbo Off");
			else
				turboButton.setText("Turbo On");
		});

		flatbedUpButton.setOnAction(e -> {
			controller.raiseFlatbed();
		});

		flatbedDownButton.setOnAction(e -> {
			controller.lowerFlatbed();
		});
	}

	private void addComponents() {
		VBox container = new VBox();
		HBox spinnerBox = new HBox();
		HBox buttonsBox = new HBox();

		spinner = new Spinner<Integer>(0, 100, 50);
		spinner.setEditable(true);

		gasButton = new Button("Gas");
		gasButton.setPrefSize(100, 20);

		brakeButton = new Button("Brake");
		brakeButton.setPrefSize(100, 20);

		turboButton = new Button("Turbo On");
		turboButton.setPrefSize(100, 20);

		flatbedUpButton = new Button("Flatbed Up");
		flatbedUpButton.setPrefSize(100, 20);

		flatbedDownButton = new Button("Flatbed Down");
		flatbedDownButton.setPrefSize(100, 20);

		spinnerBox.getChildren().addAll(spinner);
		buttonsBox.getChildren().addAll(gasButton, brakeButton);
		container.getChildren().addAll(spinnerBox, buttonsBox, turboButton, flatbedUpButton, flatbedDownButton);

		this.getChildren().addAll(container);

	}

	private void setStyle() {
		this.setPadding(new Insets(15, 12, 15, 12));
		this.setSpacing(10);
		this.setStyle("-fx-background-color: #336699;");
	}

}
