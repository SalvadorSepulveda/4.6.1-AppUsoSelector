package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_sepulvedasalvador.SelectorDeslizamiento;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class AppUsoSelectorController {

    @FXML
    private SelectorDeslizamiento selectorArriba;
    @FXML
    private SelectorDeslizamiento selectorAbajo;
    @FXML
    private Label text;

    public void initialize() {
        ArrayList<String> listaElementos = new ArrayList<>();

        listaElementos.add("Uno");
        listaElementos.add("Dos");
        listaElementos.add("Tres");

        selectorArriba.setItems(listaElementos);
        selectorAbajo.setItems(listaElementos);

        selectorArriba.setOnAction(event -> {
            text.setText("Pulsado selector de arriba");
        });

        selectorAbajo.setOnAction(event -> {
            text.setText("Pulsado selector de abajo");
        });
    }
}