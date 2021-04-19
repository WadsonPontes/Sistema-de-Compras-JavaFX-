package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import app.utils.CenaUtil;

public class ListagemController {
	@FXML
    private Button botaoComprador;
	
	@FXML
    private Button botaoVendedor;
	
	@FXML
    private Button botaoProduto;
	
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
