package layouts;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlowPaneDemo extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Button b = new Button("First");
		Button b2 = new Button("Seocnd");
		Button b3 = new Button("Third");
		Button b4 = new Button("Fourth");
		Button b5 = new Button("Fifth");
		
		FlowPane pane = new FlowPane();
		
		pane.getChildren().add(b);
		pane.getChildren().add(b2);
		pane.getChildren().add(b3);
		pane.getChildren().add(b4);
		pane.getChildren().add(b5);
		
		pane.setAlignment(Pos.BASELINE_CENTER);  // Pos agr0
		pane.setVgap(20);
		pane.setOrientation(Orientation.VERTICAL);
		// Stage // Scene // Layout
		
		Scene scene = new Scene(pane,300,300);  // window
		stage.setScene(scene);
		stage.setTitle("FlowPane");
		stage.show();
		
	}

}
