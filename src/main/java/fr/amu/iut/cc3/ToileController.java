package fr.amu.iut.cc3;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    @FXML
    double comp1 = 0;
    @FXML
    double comp2 = 0;
    @FXML
    double comp3 = 0;
    @FXML
    double comp4 = 0;
    @FXML
    double comp5 = 0;
    @FXML
    double comp6 = 0;
    @FXML
    TextField entrecomp1;
    @FXML
    TextField entrecomp2;
    @FXML
    TextField entrecomp3;
    @FXML
    TextField entrecomp4;
    @FXML
    TextField entrecomp5;
    @FXML
    TextField entrecomp6;

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;


    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }
    @FXML
    public void update(){
        if (!entrecomp1.getText().isEmpty()) {
            comp1 = Double.parseDouble(entrecomp1.getText());
            getXRadarChart(comp1,1);
            getYRadarChart(comp1,1);
        }
        if (!entrecomp2.getText().isEmpty()) {
            comp2 = Double.parseDouble(entrecomp2.getText());
            getXRadarChart(comp2,1);
            getYRadarChart(comp2,1);
        }
        if (!entrecomp3.getText().isEmpty()) {
            comp3 = Double.parseDouble(entrecomp3.getText());
            getXRadarChart(comp3,1);
            getYRadarChart(comp3,1);
        }
        if (!entrecomp4.getText().isEmpty()) {
            comp4 = Double.parseDouble(entrecomp4.getText());
            getXRadarChart(comp4,1);
            getYRadarChart(comp4,1);
        }
        if (!entrecomp5.getText().isEmpty()) {
            comp5 = Double.parseDouble(entrecomp5.getText());
            getXRadarChart(comp5,1);
            getYRadarChart(comp5,1);
        }
        if (!entrecomp6.getText().isEmpty()) {
            comp6 = Double.parseDouble(entrecomp6.getText());
            getXRadarChart(comp6,1);
            getYRadarChart(comp6,1);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        entrecomp1.setOnKeyPressed(this::handleKeyPress);
        entrecomp2.setOnKeyPressed(this::handleKeyPress);
        entrecomp3.setOnKeyPressed(this::handleKeyPress);
        entrecomp4.setOnKeyPressed(this::handleKeyPress);
        entrecomp5.setOnKeyPressed(this::handleKeyPress);
        entrecomp6.setOnKeyPressed(this::handleKeyPress);
    }
    private void handleKeyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            update();
        }
    }
}
