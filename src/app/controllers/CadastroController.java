package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import app.utils.CenaUtil;

public class CadastroController {
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
		CenaUtil.trocarCena(botaoComprador, getClass(), "/app/views/TelaCadastrarComprador.fxml");
	}
	
	@FXML
    void botaoVendedorClicado(MouseEvent event) {
		CenaUtil.trocarCena(botaoVendedor, getClass(), "/app/views/TelaCadastrarVendedor.fxml");
	}
	
	@FXML
    void botaoProdutoClicado(MouseEvent event) {
		CenaUtil.trocarCena(botaoProduto, getClass(), "/app/views/TelaCadastrarProduto.fxml");
	}

    @FXML
    void botaoVoltarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoVoltar, getClass(), "/app/views/TelaMenuPrincipal.fxml");
	}
}
