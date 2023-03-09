package com.example.t1;
/** Estas variables importan las librerias necesarias*/
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    /** jdncksvjsfv*/
    /*
    private String[] provincias = {"San José", "Alajuela", "Heredia", "Cartago", "Puntarenas", "Guanacaste", "Limon"};

     */
    /** clase publica que declara un entero*/
    public ObservableList<Integer> num;
    /** Esta metodo se hace privada y es un combobox que se utiliza para seleccionar las provincias*/
    private ComboBox cmbx1;
    /** Esta metodo privada coloca un cuadro de texto*/
    private TextField tf1;
    /** Este label*/
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    /** Este type declara que combobox es un string*/
    @FXML
    void add(ActionEvent event) {
        String s = cmbx1.getSelectionModel().getSelectedItem().toString();
        welcomeText.setText(s);

    }
    /** Este metodo pertenece a la combobox y retorna a sí misma*/
    public ComboBox getCmbx1() {
        return cmbx1;
    }

    public void setCmbx1(ComboBox cmbx1) {
        this.cmbx1 = cmbx1;
    }
    /*
    private void val () {    for (int i = 0; i <= nombretf.getText().length() - 1; i++) {
    char digi = nombretf.getText().charAt(i);        if (!(Character.isDigit(digi)))
                esNum=false;
        return;
    {
     */


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
