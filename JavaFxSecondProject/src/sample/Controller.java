package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;


import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;


public class Controller {

    @FXML

    public TextField textField;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button buttonX;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button buttonWithMinus;
    public Button button1;
    public Button button0;
    public Button button2;
    public Button button3;
    public Button buttonWithPlus;
    public Button buttonWithDot;
    public Button buttonWithEqual;

  // String[] array = {"1","2","3","4","5","6"};


    public void firstbutton(javafx.event.ActionEvent event) {
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );

        if(event.getSource() == button1) {
            textField.setText(textField.getText() + "1");
        }
    }

    @FXML
    public void secondButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button2) {
            textField.setText(textField.getText() + "2");
        }
    }
    @FXML
    public void thirdButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button3) {
            textField.setText(textField.getText() + "3");
        }
    }
    @FXML
    public void forthButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button4) {
            textField.setText(textField.getText() + "4");
        }
    }
    @FXML
    public void fifthButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button5) {
            textField.setText(textField.getText() + "5");
        }
    }
    @FXML
    public void sixButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button6) {
            textField.setText(textField.getText() + "6");
        }
    }
    @FXML
    public void seventhButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button7) {
            textField.setText(textField.getText() + "7");
        }
    }
    @FXML
    public void eightButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button8) {
            textField.setText(textField.getText() + "8");
        }
    }
    @FXML
    public void ninthButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button9) {
            textField.setText(textField.getText() + "9");
        }
    }
    @FXML
    public void zeroButton(javafx.event.ActionEvent event){
        textField.textProperty().addListener(
                (observable,oldValue,newValue)-> {
                    if(newValue.length() > 6) textField.setText(oldValue);
                }
        );
        if(event.getSource() == button0) {
            textField.setText(textField.getText() + "0");
        }
    }
    @FXML
    public void multButton(){
        textField.setText("x");
    }
    @FXML
    public void minusButton(){
        textField.setText("-");
    }
    @FXML
    public void plusButton(){
       textField.setText("+");
    }
    @FXML
    public void dotButton(){
       textField.setText(".");
    }
    @FXML
    public void equalsButton(){
       textField.setText("=");
    }
}
