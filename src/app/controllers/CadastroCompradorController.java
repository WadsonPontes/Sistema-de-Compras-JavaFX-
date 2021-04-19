package app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import app.models.pessoa.Comprador;
import app.utils.CenaUtil;

public class CadastroCompradorController {
	@FXML
    private Button botaoCadastrar;
	
	 @FXML
    private TextField campoNome;

    @FXML
    private TextField campoCPF;

    @FXML
    private TextField campoSaldo;
	
	@FXML
    private Button botaoCancelar;
	
	@FXML
    void botaoCadastrarClicado(MouseEvent event) {
		Sistema.compradores.add(new Comprador(campoNome.getText(), campoCPF.getText(), Float.parseFloat(campoSaldo.getText())));
		CenaUtil.trocarCena(botaoCancelar, getClass(), "/app/views/TelaCadastro.fxml");
	}

    @FXML
    void botaoCancelarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoCancelar, getClass(), "/app/views/TelaCadastro.fxml");
	}
}
