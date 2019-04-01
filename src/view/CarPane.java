package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private double xPos;
	private double yPos;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		this.getChildren().add(volvoImage);
	}

	public void move(double x, double y) {
		xPos = x;
		yPos = y;
	}

	public void update() {
		volvoImage.setX(xPos);
		volvoImage.setTranslateY(yPos);
	}

}
