package com.example;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
public class PrimaryController {

    @FXML TextArea txtFilmes;
    @FXML private Button botaoFavoritar1;
    @FXML private Button botaoFavoritar2;
    @FXML private Button botaoFavoritar3;
    @FXML private Button botaoFavoritar4;
    
    ArrayList <String>filmesFavoritos = new ArrayList<>(); 

    @FXML
    private void initialize() {
        botaoFavoritar1.setOnAction(event -> favoritarOppenheimer());
        botaoFavoritar2.setOnAction(event -> favoritarAteOUltimoHomem());
        botaoFavoritar3.setOnAction(event -> favoritarGrease());
        botaoFavoritar4.setOnAction(event -> favoritarTheMitchellsTheMachines());
    
    }

    private void favoritarOppenheimer() {
        filmesFavoritos.add("Oppenheimer");
        ordenarFilmes();
        atualizarTextoFilmes();
    }

    private void favoritarAteOUltimoHomem() {
       filmesFavoritos.add("Até o último Homem");
       ordenarFilmes();
       atualizarTextoFilmes();
    }

    private void favoritarGrease() {
        filmesFavoritos.add("Grease");
        ordenarFilmes();
        atualizarTextoFilmes();
    }

    private void favoritarTheMitchellsTheMachines() {
        filmesFavoritos.add("A revolta das máquinas");
        ordenarFilmes();
        atualizarTextoFilmes();
    }
              

    private void ordenarFilmes() {
        filmesFavoritos.sort((o1, o2) ->  o1.compareTo(o2));;
    }

    private void atualizarTextoFilmes() {
        txtFilmes.clear();
        for (var filme : filmesFavoritos){
            txtFilmes.appendText(filme + "\n");
        }

    }
}



