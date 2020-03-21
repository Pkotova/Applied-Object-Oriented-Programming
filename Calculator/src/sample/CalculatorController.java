package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class CalculatorController {

    @FXML
    private Button btnOne;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnZero;

    @FXML
    private Button btnNull;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnMultiplication;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnFloatingPoint;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnClearAll;

    @FXML
    private Button btnOff;

    @FXML
    private Button btnMemory;

    @FXML
    private Button btnSumWithMemory;

    @FXML
    private Button btnSubtractWithMemory;

    @FXML
    private Button btnClearMemory;

    @FXML
    private Button btnInfo;

    @FXML
    private TextField txtResult;

    @FXML
    private double memory;

    @FXML
    void btnInfoOnAction(ActionEvent event){
        Alert information = new Alert(Alert.AlertType.INFORMATION);
        information.setTitle("Welcome to Petya's calculator!");
        information.setContentText("You can calculate any expression you want");
        information.show();
    }
    @FXML
    void btnPlusOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "+");
    }

    @FXML
    void btnMinusOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "-");
    }

    @FXML
    void btnMultiplicationOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "*");
    }

    @FXML
    void btnDivideOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "/");
    }

    @FXML
    void btnPointOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + ".");
    }

    @FXML
    void btnNullOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "00");
    }

    @FXML
    void btnZeroOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "0");
    }

    @FXML
    void btnOneOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "1");
    }

    @FXML
    void btnTwoOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "2");
    }

    @FXML
    void btnThreeOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "3");
    }

    @FXML
    void btnFourOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "4");
    }

    @FXML
    void btnFiveOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "5");
    }

    @FXML
    void btnSixOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "6");
    }

    @FXML
    void btnSevenOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "7");
    }

    @FXML
    void btnEightOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "8");
    }

    @FXML
    void btnNineOnAction(ActionEvent event) {
        txtResult.setText(txtResult.getText() + "9");
    }

    @FXML
    void btnClearsOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        if (txtResult.getText().isBlank()) {
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setContentText("The field is empty");
            alert.show();
        } else {
            txtResult.clear();
        }
    }

    @FXML
    void btnClearsLastOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        if (txtResult.getText().isBlank()) {
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setContentText("The field is empty");
            alert.show();
        } else {
            String updated = txtResult.getText();
            updated = updated.substring(0, updated.length() - 1);
            txtResult.setText(updated);
        }
    }

    @FXML
    void btnMemoryOnAction(ActionEvent event){
        memory = checkResult();
    }
    @FXML
    void btnClearMemoryOnAction(ActionEvent event){
        memory = 0;
        txtResult.setText(" ");
    }
    @FXML
    void btnSumWithMemory(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.NONE);
        if (memory == 0){
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setContentText("Your memory is empty");
            alert.show();
        }else{
            String result = String.valueOf(memory + checkResult());
            txtResult.setText(result);
        }

    }
    @FXML
    void btnSubtractWithMemory(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.NONE);
        if (memory == 0){
            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setContentText("Your memory is empty");
            alert.show();
        }else{
            String result = String.valueOf(memory - checkResult());
            txtResult.setText(result);
        }
    }
    @FXML
    double checkResult() {
        Alert alert = new Alert(Alert.AlertType.NONE);

        String expression = txtResult.getText();
        int length = txtResult.getLength();

        if (expression.charAt(0) == '.') {
            txtResult.setText("0 " + txtResult.getText());
        }
        for (int i = 0; i < length - 1; i++) {

            if (Character.isLetter(expression.charAt(i))) {

                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setContentText("Wrong format! You cant input letters");
                alert.show();
            }

            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' ||
                    expression.charAt(i) == '*' || expression.charAt(i) == '/' ||
                    expression.charAt(i) == '.' || expression.charAt(length - 1) == ' ') {

                if (expression.charAt(i) == expression.charAt(i + 1)) {

                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setContentText("Wrong format! You cant have two math symbols next to each other");
                    alert.show();
                }
            }
        }

        if (expression.charAt(length - 1) == '+' || expression.charAt(length - 1) == '-' ||
                expression.charAt(length - 1) == '*' || expression.charAt(length - 1) == '/' ||
                expression.charAt(length - 1) == '.' || expression.charAt(length - 1) == ' ') {

            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Wrong format!");
            alert.show();
        }

        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
        try {
            Object result = engine.eval(expression);
            txtResult.setText(result.toString());
        }
        catch (ScriptException e) {

            e.printStackTrace();
        }
        double expressionResult = Double.parseDouble(txtResult.getText());
        return expressionResult;
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        System.exit(0);
    }
}
