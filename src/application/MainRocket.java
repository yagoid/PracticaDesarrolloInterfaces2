package application;
	
/**
 * 
 * @author yagoi
 * @version 1.0
 * 
 */

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class MainRocket extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Mars.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root,600,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Let me in!");
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
