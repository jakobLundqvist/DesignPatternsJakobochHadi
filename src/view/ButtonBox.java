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
	}

	private void addComponents() {
		VBox container = new VBox();
		HBox spinnerBox = new HBox();
		HBox buttonsBox = new HBox();

		spinner = new Spinner<Integer>(0, 100, 50);
		spinner.setEditable(true);

		gasButton = new Button("Gas");
		gasButton.setPrefSize(100, 20);

		Button brakeButton = new Button("Brake");
		brakeButton.setPrefSize(100, 20);

		spinnerBox.getChildren().addAll(spinner);
		buttonsBox.getChildren().addAll(gasButton, brakeButton);
		container.getChildren().addAll(spinnerBox, buttonsBox);

		this.getChildren().addAll(container);

	}

	private void setStyle() {
		this.setPadding(new Insets(15, 12, 15, 12));
		this.setSpacing(10);
		this.setStyle("-fx-background-color: #336699;");
	}

}
