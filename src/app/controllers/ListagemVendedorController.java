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
import app.models.pessoa.Vendedor;
import app.utils.CenaUtil;

public class ListagemVendedorController implements Initializable {
	private ObservableList<Vendedor> vendedores;
	
	@FXML
    private TextField campoBusca;

    @FXML
    private ListView<Vendedor> listagem;
	
	@FXML
    private Button botaoVoltar;
	
	@FXML
    void buscar(ActionEvent event) {
		Set<Vendedor> filtrado = new HashSet<Vendedor>(Sistema.vendedores);
		
		if (!campoBusca.getText().equals("")) {
			filtrado.removeIf(x -> !x.cnpj.contains(campoBusca.getText()));
		}
		
		vendedores = FXCollections.observableArrayList(filtrado);
		listagem.setItems(vendedores);
	}
	
	@FXML
    void clicouNaListagem(MouseEvent event) {
		Sistema.vendedorSelecionado = listagem.getSelectionModel().getSelectedItem();
		CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaDadosVendedor.fxml");
    }

    @FXML
    void botaoVoltarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaListagem.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		vendedores = FXCollections.observableArrayList(Sistema.vendedores);
		listagem.setItems(vendedores);
	}
}
