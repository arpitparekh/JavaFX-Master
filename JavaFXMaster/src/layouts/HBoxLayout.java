package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxLayout extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Button b = new Button("First");
		Button b2 = new Button("Seocnd");
		Button b3 = new Button("Third");
		Button b4 = new Button("Fourth");
		Button b5 = new Button("Fifth");
		
		VBox box = new VBox();
		
		box.getChildren().add(b);
		box.getChildren().add(b2);
		box.getChildren().add(b3);
		box.getChildren().add(b4);
		box.getChildren().add(b5);
		
		// Stage // Scene // Layout
		
		Scene scene = new Scene(box,300,300);  // window
		stage.setScene(scene);
		stage.setTitle("HBox");
		stage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
