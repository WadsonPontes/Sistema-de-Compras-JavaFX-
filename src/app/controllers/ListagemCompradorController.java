package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import app.models.pessoa.Comprador;
import app.utils.CenaUtil;

public class ListagemCompradorController {
	@FXML
    private TextField campoBusca;

    @FXML
    private ListView<Comprador> listagem;
	
	
	@FXML
    private Button botaoVoltar;
	
	@FXML
    void botaoCompradorClicado(MouseEvent event) {
		CenaUtil.trocarCena(botaoComprador, getClass(), "/app/views/TelaListagemComprador.fxml");
	}
	
	@FXML
    void botaoVendedorClicado(MouseEvent event) {
		CenaUtil.trocarCena(botaoVendedor, getClass(), "/app/views/TelaListagemVendedor.fxml");
	}
	
	@FXML
    void botaoProdutoClicado(MouseEvent event) {
		CenaUtil.trocarCena(botaoProduto, getClass(), "/app/views/TelaListagemProduto.fxml");
	}

    @FXML
    void botaoVoltarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaMenuPrincipal.fxml");
	}
}
