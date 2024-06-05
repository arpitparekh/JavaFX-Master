package shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyShapeClass extends Application {

	public static void main(String[] args) {
			
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		// line shape
		
		Line line1 = new Line();
		line1.setStartX(0);
		line1.setStartY(0);
		line1.setEndX(100);
		line1.setEndY(0);
		
		line1.setStrokeWidth(5);
		line1.setStroke(Color.RED);
//		line1.setOpacity(0.7);
//		line1.setRotate(90);
		
		Line line2 = new Line();
		line2.setStartX(100);
		line2.setStartY(0);
		line2.setEndX(100);
		line2.setEndY(100);
		line2.setStrokeWidth(5);
		line2.setStroke(Color.RED);
		
		Line line3 = new Line();
		line3.setStartX(100);
		line3.setStartY(100);
		line3.setEndX(0);
		line3.setEndY(100);
		line3.setStrokeWidth(5);
		line3.setStroke(Color.RED);
		
		
		Line line4 = new Line();
		line4.setStartX(0);
		line4.setStartY(100);
		line4.setEndX(0);
		line4.setEndY(0);
		line4.setStrokeWidth(5);
		line4.setStroke(Color.RED);
		
		Circle c = new Circle(50,50,20);
		c.setFill(Color.GREENYELLOW);
		
		Polygon poly = new Polygon();
		poly.getPoints().setAll(110.0,0.0,110.0,100.0,210.0,100.0);
		poly.setFill(Color.DARKBLUE);
		
		Rectangle r = new Rectangle(220,0,100,100);
		r.setArcWidth(10);
		r.setArcHeight(10);
		r.setFill(Color.SANDYBROWN);
		
		Ellipse ellipse = new Ellipse(420,50,90,50);
		ellipse.setStrokeWidth(3);
		ellipse.setStroke(Color.SLATEBLUE);
		ellipse.setFill(Color.WHITE);
		
		
		Pane pane = new Pane();
		pane.setLayoutX(50);
		pane.setLayoutY(50);
		pane.getChildren().addAll(line1,line2,line3,line4,c,poly,r,ellipse);
		
		Scene scene = new Scene(pane,600,300);
		stage.setScene(scene);
		stage.setTitle("Shapes");
		stage.show();
		
	}

}
