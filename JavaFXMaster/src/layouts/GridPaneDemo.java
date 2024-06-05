package layouts;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

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
		
		GridPane pane = new GridPane();
		
//		pane.getChildren().add(b);
//		pane.getChildren().add(b2);
//		pane.getChildren().add(b3);
//		pane.getChildren().add(b4);
//		pane.getChildren().add(b5);
		
		pane.add(b, 0, 0);
		pane.add(b2, 1, 1);
		pane.add(b3, 2, 2);
		pane.add(b4, 3, 3);
		pane.add(b5, 4, 4);
		
		/* 
		 *  x x x x x 
		 *  x x x x x
		 *  
		 */
		
		pane.setHgap(40);
		pane.setVgap(20); 
		pane.setGridLinesVisible(true);
		
		Scene scene = new Scene(pane,300,300);  // window
		stage.setScene(scene);
		stage.setTitle("GridPane");
		stage.show();
		
	}
}
