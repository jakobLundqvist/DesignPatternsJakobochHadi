package main;

import controller.CarController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Car;
import model.CarModel;
import model.Saab95;
import model.Scania;
import model.Volvo740;
import view.ButtonBox;
import view.CarPane;

public class App extends Application {

	public final static double WIDTH = 1200;
	public final static double HEIGHT = 700;

	@Override
	public void start(Stage primaryStage) throws Exception {

		CarPane cp = new CarPane();
		
		CarModel model = new CarModel();

		CarController cc = new CarController(cp,model);

		Car volvo = new Volvo740();
		Car saab = new Saab95();
		Car scania = new Scania();

		model.addCar(volvo);
		model.addCar(saab);
		model.addCar(scania);

		ButtonBox cbp = new ButtonBox(cc);

		BorderPane root = new BorderPane();

		root.setTop(cp);
		root.setBottom(cbp);

		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Car Simulator");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}
