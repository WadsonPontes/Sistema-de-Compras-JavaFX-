package app;
	
import app.controllers.Sistema;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Sistema.inicializar();
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/app/views/TelaMenuPrincipal.fxml"));
			
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root, 900, 500);
			scene.getStylesheets().add(getClass().getResource("/app/css/app.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Sistema de Compras de Wadson Pontes");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
