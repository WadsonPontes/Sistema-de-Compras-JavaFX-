package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import app.models.pessoa.Vendedor;
import app.utils.CenaUtil;

public class CadastroVendedorController {
	@FXML
    private Button botaoCadastrar;
	
	 @FXML
    private TextField campoNome;

    @FXML
    private TextField campoCNPJ;
	
	@FXML
    private Button botaoCancelar;
	
	@FXML
    void botaoCadastrarClicado(MouseEvent event) {
		Sistema.vendedores.add(new Vendedor(campoNome.getText(), campoCNPJ.getText()));
		CenaUtil.trocarCena(botaoCancelar, getClass(), "/app/views/TelaCadastro.fxml");
	}

    @FXML
    void botaoCancelarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoCancelar, getClass(), "/app/views/TelaCadastro.fxml");
	}
}
