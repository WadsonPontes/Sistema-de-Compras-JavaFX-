package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import app.models.produto.Produto;
import app.utils.CenaUtil;

public class CadastroProdutoController {
	@FXML
    private Button botaoCadastrar;
	
	 @FXML
    private TextField campoCodigo;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoPreco;
	
	@FXML
    private Button botaoCancelar;
	
	@FXML
    void botaoCadastrarClicado(MouseEvent event) {
		Sistema.produtos.add(new Produto(campoCodigo.getText(), campoNome.getText(), Float.parseFloat(campoPreco.getText())));
		CenaUtil.trocarCena(botaoCancelar, getClass(), "/app/views/TelaCadastro.fxml");
	}

    @FXML
    void botaoCancelarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoCancelar, getClass(), "/app/views/TelaCadastro.fxml");
	}
}
