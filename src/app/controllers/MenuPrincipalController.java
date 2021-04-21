package app.controllers;

import app.utils.CenaUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuPrincipalController {
	@FXML
    private Button botaoCadastrar;
	
	@FXML
    private Button botaoListar;
	
	@FXML
    private Button botaoSimular;
	
	@FXML
    private Button botaoSair;
	
	@FXML
    void botaoCadastrarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoCadastrar, getClass(), "/app/views/TelaCadastro.fxml");
	}
	
	@FXML
    void botaoListarClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoListar, getClass(), "/app/views/TelaListagem.fxml");
	}
	
	@FXML
    void botaoSimularClicado(MouseEvent event) {
    	CenaUtil.trocarCena(botaoSimular, getClass(), "/app/views/TelaSelecaoComprador.fxml");
	}
    
    @FXML
    void botaoSairClicado(MouseEvent event) {
    	Stage janela = (Stage) botaoSair.getScene().getWindow();
    	janela.close();
    }
}
