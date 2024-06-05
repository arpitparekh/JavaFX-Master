package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneDemo extends Application {

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
		
		BorderPane pane = new BorderPane();
		
//		pane.getChildren().add(b);
//		pane.getChildren().add(b2);
//		pane.getChildren().add(b3);
//		pane.getChildren().add(b4);
//		pane.getChildren().add(b5);
		
//		pane.add(b, 0, 0);
//		pane.add(b2, 1, 1);
//		pane.add(b3, 2, 2);
//		pane.add(b4, 3, 3);
//		pane.add(b5, 4, 4);
		
		/* 
		 *  x x x x x 
		 *  x x x x x
		 *  
		 */
		
//		pane.setHgap(40);
//		pane.setVgap(20); 
//		pane.setGridLinesVisible(true);
		
		pane.setTop(new Label("This will be at the top"));  
		pane.setLeft(new Label("This will be at the left"));  
		pane.setRight(new Label("This will be at the Right"));  
		pane.setCenter(new Label("This will be at the Centre"));  
		pane.setBottom(new Label("This will be at the bottom"));  
		
		Scene scene = new Scene(pane,300,300);  // window
		stage.setScene(scene);
		stage.setTitle("GridPane");
		stage.show();
		
	}

}
