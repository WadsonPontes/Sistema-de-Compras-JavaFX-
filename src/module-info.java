module prova03 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens app to javafx.graphics, javafx.fxml, javafx.base, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.controllers to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.models to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.models.compra to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.models.pessoa to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.models.produto to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.utils to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.enums to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.css to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
	opens app.views to javafx.fxml, javafx.base, javafx.graphics, javafx.controls, javafx.media, javafx.swing, javafx.swt, javafx.web;
}
