module prova03 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens app to javafx.graphics, javafx.fxml;
	opens app.controllers to javafx.fxml;
}
