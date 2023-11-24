package com.jp.visao;

import com.jp.tools.ConexaoBD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.util.StringConverter;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class TelaHome implements Initializable {

    @FXML
    private BorderPane bpAddState;

    @FXML
    private BorderPane bpAddTransition;

    @FXML
    private ComboBox<?> cbEstadoAnterior;

    @FXML
    private ComboBox<?> cbEstadoFinal;

    @FXML
    private VBox vboxEstado;

    @FXML
    private ToggleButton tbDireita;

    @FXML
    private ToggleButton tbEsquerda;

    @FXML
    private VBox vboxListaEstados;

    @FXML
    private VBox vboxTransicao;

    @FXML
    private VBox vboxListaTransicoes;

    @FXML
    private AnchorPane paneRoot;

    @FXML
    private TextField tfLetraTransicao;

    @FXML
    private TextField tfNomeEstado;

    @FXML
    private TextField tfCadeia;


    @FXML
    void OpenAddState(ActionEvent event) {
    }

    @FXML
    void addState(ActionEvent event) {

    }

    @FXML
    void exitAddState(ActionEvent event) {
    }

    @FXML
    void OpenAddTransition(ActionEvent event) {
    }

    @FXML
    void addTransition(ActionEvent event) {
    }

    @FXML
    void exitAddTransition(ActionEvent event) {
    }

    @FXML
    void setDireita(ActionEvent event) {

    }

    @FXML
    void setEsquerda(ActionEvent event) {
    }


    @FXML
    void playTuringMachine(ActionEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Run.telaHome = this;
        try {
            ConexaoBD.getConexao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
