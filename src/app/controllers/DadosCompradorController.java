package app.controllers;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import app.models.compra.Compra;
import app.models.pessoa.Comprador;
import app.models.produto.Mostruario;
import app.models.produto.Produto;
import app.utils.CenaUtil;

public class DadosCompradorController implements Initializable {
	private ObservableList<Compra> compras;
	private ObservableList<Produto> sacola;
	
	@FXML
    private Button botaoVoltar;

    @FXML
    private TableView<Compra> listagemCompras;

    @FXML
    private TableColumn<Compra, String> campoVendedorCompra;

    @FXML
    private TableColumn<Compra, String> campoFormaCompra;

    @FXML
    private TableColumn<Compra, String> campoProdutosCompra;

    @FXML
    private TableView<Produto> listagemSacola;

    @FXML
    private TableColumn<Produto, String> campoCodigoSacola;

    @FXML
    private TableColumn<Produto, String> campoNomeSacola;

    @FXML
    private TableColumn<Produto, Float> campoPrecoSacola;
    
    @FXML
    private TableColumn<Produto, Integer> campoQtdSacola;

    @FXML
    private Label campoNome;

    @FXML
    private Label campoCPF;

    @FXML
    private Label campoSaldo;

    @FXML
    private Label campoDevendo;

    @FXML
    void botaoVoltarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaListagemComprador.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		campoNome.setText(Sistema.compradorSelecionado.nome);
		campoCPF.setText(Sistema.compradorSelecionado.cpf);
		campoSaldo.setText("R$ " + Sistema.compradorSelecionado.saldo);
		campoDevendo.setText("R$ " + Sistema.compradorSelecionado.a_pagar);
		
		campoVendedorCompra.setCellValueFactory(new PropertyValueFactory<Compra, String>("cnpj"));
		campoFormaCompra.setCellValueFactory(new PropertyValueFactory<Compra, String>("forma"));
		campoProdutosCompra.setCellValueFactory(new PropertyValueFactory<Compra, String>("produtos"));

		campoCodigoSacola.setCellValueFactory(new PropertyValueFactory<Produto, String>("codigo"));
		campoNomeSacola.setCellValueFactory(new PropertyValueFactory<Produto, String>("nome"));
		campoPrecoSacola.setCellValueFactory(new PropertyValueFactory<Produto, Float>("preco"));
		campoQtdSacola.setCellValueFactory(new PropertyValueFactory<Produto, Integer>("quantidade"));
		
		compras = FXCollections.observableArrayList(Sistema.compradorSelecionado.compras);
		listagemCompras.setItems(compras);
		
		sacola = FXCollections.observableArrayList(Sistema.compradorSelecionado.sacola);
		listagemSacola.setItems(sacola);
	}
}
