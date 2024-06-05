module JavaFXMaster {
	requires javafx.controls;
    requires javafx.graphics;
    
    opens shapes to javafx.graphics, javafx.fxml;
    opens layouts to javafx.graphics, javafx.fxml;
	
}
