package app.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

import app.models.pessoa.Comprador;
import app.utils.CenaUtil;

public class ListagemCompradorController implements Initializable {
	private ObservableList<Comprador> compradores;
	
	@FXML
    private TextField campoBusca;

    @FXML
    private ListView<Comprador> listagem;
	
	@FXML
    private Button botaoVoltar;

    @FXML
    void botaoVoltarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaListagem.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		compradores = FXCollections.observableArrayList(Sistema.compradores);
		listagem.setItems(compradores);
	}
}
