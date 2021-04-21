package app.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

import app.enums.TipoFormaPagamento;
import app.models.compra.Compra;
import app.models.pessoa.Comprador;
import app.models.pessoa.Vendedor;
import app.models.produto.Produto;
import app.utils.CenaUtil;

public class SelecaoProdutoController implements Initializable {
	private ObservableList<Produto> produtos;
	
	@FXML
    private TextField campoBusca;

    @FXML
    private TableView<Produto> listagem;

    @FXML
    private TableColumn<Produto, String> campoCodigo;

    @FXML
    private TableColumn<Produto, String> campoNome;

    @FXML
    private TableColumn<Produto, Float> campoPreco;
    
    @FXML
    private TableColumn<Produto, Integer> campoQtd;
	
	@FXML
    private Button botaoVoltar;
	
	@FXML
    void buscar(ActionEvent event) {
		Set<Produto> filtrado = new HashSet<Produto>(Sistema.produtos);
		
		if (!campoBusca.getText().equals("")) {
			filtrado.removeIf(x -> !x.codigo.contains(campoBusca.getText()));
		}
		
		produtos = FXCollections.observableArrayList(filtrado);
		listagem.setItems(produtos);
	}
	
	@FXML
    void clicouNaListagem(MouseEvent event) {
		Sistema.produtoSelecionado = new Produto(listagem.getSelectionModel().getSelectedItem(), 1);
		Sistema.compradorSelecionado.adicionarNaSacola(Sistema.vendedorSelecionado, Sistema.produtoSelecionado, 1);
		Sistema.compradorSelecionado.comprar(Sistema.vendedorSelecionado, TipoFormaPagamento.BOLETO);
		CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaSelecaoVendedor.fxml");
    }

    @FXML
    void botaoVoltarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaSelecaoVendedor.fxml");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		campoCodigo.setCellValueFactory(new PropertyValueFactory<Produto, String>("codigo"));
		campoNome.setCellValueFactory(new PropertyValueFactory<Produto, String>("nome"));
		campoPreco.setCellValueFactory(new PropertyValueFactory<Produto, Float>("preco"));
		campoQtd.setCellValueFactory(new PropertyValueFactory<Produto, Integer>("quantidade"));
		
		produtos = FXCollections.observableArrayList(Sistema.produtos);
		listagem.setItems(produtos);
	}
}
