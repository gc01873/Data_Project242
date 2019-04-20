package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuViewerController implements Initializable {
	public void MenuScreen(ActionEvent event) throws IOException{
		Parent MenuView = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Scene MenuScene = new Scene(MenuView);
		Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
		Window.setScene(MenuScene);
		Window.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
