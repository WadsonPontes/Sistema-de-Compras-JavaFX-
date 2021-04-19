package app.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CenaUtil {
    public static void trocarCena(Button botao, Class<?> classe, String caminho) {
		try {
			FXMLLoader fxml = new FXMLLoader();
			fxml.setLocation(classe.getResource(caminho));
			BorderPane root = (BorderPane) fxml.load();
			Scene cena = new Scene(root, 900, 500);
			Stage janela = (Stage) botao.getScene().getWindow();
			janela.setScene(cena);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
