package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlRocket {
	
	@FXML
	private AnchorPane view;

	@FXML
	private AnchorPane totalPane;
	
	@FXML
	private JFXButton button;
	
	@FXML
	private JFXButton btnClose;
	
	@FXML
	private ImageView imagen;

	
	public void initialize() {
		transition();
	}

	public void openStage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Urano.fxml"));
			view = loader.load();
			Stage st = new Stage();
			st.setScene(new Scene(view));
			st.centerOnScreen();
			st.show();
			closeStage();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeApp() {
		System.exit(0);
	}

	public void closeStage() {
		Stage st = (Stage) totalPane.getScene().getWindow();
		st.close();
	}

	public void transition() {
		FadeTransition fade = new FadeTransition(Duration.seconds(3), imagen);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
	}
	
	
	public void hover() {
		button.setStyle("-fx-background-color: red");
	}
	
	public void unHover() {
		button.setStyle("-fx-background-color: orange");
	}

}
