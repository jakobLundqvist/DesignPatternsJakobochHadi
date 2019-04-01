package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private ImageView scaniaImage;
	private ImageView saabImage;

	private double volvoXPos;
	private double volvoYPos;
	private double saabXPos;
	private double saabYPos;
	private double scaniaXPos;
	private double scaniaYPos;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		saabImage = new ImageView(new Image("/pics/Saab95.jpg"));
		scaniaImage = new ImageView(new Image("/pics/Scania.jpg"));
		this.getChildren().add(volvoImage);
		this.getChildren().add(saabImage);
		this.getChildren().add(scaniaImage);
	}

	public void move(String modelName, double x, double y) {
		if (modelName.equals("Saab95")) {
			saabXPos = x;
			saabYPos = y;
		}
		if (modelName.equals("Scania")) {
			scaniaXPos = x;
			scaniaYPos = y;
		}
		if (modelName.equals("Volvo740")) {
			volvoXPos = x;
			volvoYPos = y;
		}
	}

	public void update() {
		scaniaImage.setX(scaniaXPos);
		scaniaImage.setTranslateY(scaniaYPos);
		saabImage.setX(saabXPos);
		saabImage.setTranslateY(saabYPos);
		volvoImage.setX(volvoXPos);
		volvoImage.setTranslateY(volvoYPos);
	}

}
