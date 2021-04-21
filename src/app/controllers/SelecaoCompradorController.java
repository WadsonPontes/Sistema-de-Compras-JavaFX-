package app.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import app.models.pessoa.Comprador;
import app.utils.CenaUtil;

public class SelecaoCompradorController implements Initializable {
	private ObservableList<Comprador> compradores;
	
	@FXML
    private TextField campoBusca;

    @FXML
    private ListView<Comprador> listagem;
	
	@FXML
    private Button botaoVoltar;
	
	@FXML
    void buscar(ActionEvent event) {
		Set<Comprador> filtrado = new HashSet<Comprador>(Sistema.compradores);
		
		if (!campoBusca.getText().equals("")) {
			filtrado.removeIf(x -> !x.cpf.contains(campoBusca.getText()));
		}
		
		compradores = FXCollections.observableArrayList(filtrado);
		listagem.setItems(compradores);
	}
	
	@FXML
    void clicouNaListagem(MouseEvent event) {
		Sistema.compradorSelecionado = listagem.getSelectionModel().getSelectedItem();
		CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaSelecaoVendedor.fxml");
    }

    @FXML
    void botaoVoltarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaMenuPrincipal.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		compradores = FXCollections.observableArrayList(Sistema.compradores);
		listagem.setItems(compradores);
	}
}
