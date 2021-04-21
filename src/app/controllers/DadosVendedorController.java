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

public class DadosVendedorController implements Initializable {
	private ObservableList<Compra> vendas;
	private ObservableList<Produto> estoque;
	
	@FXML
    private Button botaoVoltar;

    @FXML
    private TableView<Compra> listagemVendas;

    @FXML
    private TableColumn<Compra, String> campoCompradorVenda;

    @FXML
    private TableColumn<Compra, String> campoFormaVenda;

    @FXML
    private TableColumn<Compra, String> campoProdutosVenda;

    @FXML
    private TableView<Produto> listagemEstoque;

    @FXML
    private TableColumn<Produto, String> campoCodigoEstoque;

    @FXML
    private TableColumn<Produto, String> campoNomeEstoque;

    @FXML
    private TableColumn<Produto, Float> campoPrecoEstoque;
    
    @FXML
    private TableColumn<Produto, Integer> campoQtdEstoque;

    @FXML
    private Label campoNome;

    @FXML
    private Label campoCNPJ;

    @FXML
    private Label campoSaldo;

    @FXML
    private Label campoAReceber;

    @FXML
    void botaoVoltarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaListagemVendedor.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		campoNome.setText(Sistema.vendedorSelecionado.nome);
		campoCNPJ.setText(Sistema.vendedorSelecionado.cnpj);
		campoSaldo.setText("R$ " + Sistema.vendedorSelecionado.saldo);
		campoAReceber.setText("R$ " + Sistema.vendedorSelecionado.a_receber);
		
		campoCompradorVenda.setCellValueFactory(new PropertyValueFactory<Compra, String>("cpf"));
		campoFormaVenda.setCellValueFactory(new PropertyValueFactory<Compra, String>("forma"));
		campoProdutosVenda.setCellValueFactory(new PropertyValueFactory<Compra, String>("produtos"));

		campoCodigoEstoque.setCellValueFactory(new PropertyValueFactory<Produto, String>("codigo"));
		campoNomeEstoque.setCellValueFactory(new PropertyValueFactory<Produto, String>("nome"));
		campoPrecoEstoque.setCellValueFactory(new PropertyValueFactory<Produto, Float>("preco"));
		campoQtdEstoque.setCellValueFactory(new PropertyValueFactory<Produto, Integer>("quantidade"));
		
		vendas = FXCollections.observableArrayList(Sistema.vendedorSelecionado.vendas);
		listagemVendas.setItems(vendas);
		
		estoque = FXCollections.observableArrayList(Sistema.vendedorSelecionado.produtos);
		listagemEstoque.setItems(estoque);
	}
}
