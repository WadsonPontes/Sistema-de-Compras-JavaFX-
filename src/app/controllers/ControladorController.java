package app.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControladorController {
	@FXML
    private Button botaoEntrar;

    @FXML
    void botaoEntrarClicado(MouseEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/app/views/TelaListagemCompras.fxml"));
			BorderPane root = (BorderPane) loader.load();
			
			Stage window = (Stage) botaoEntrar.getScene().getWindow();
			Scene scene = new Scene(root, 900, 500);
			window.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
