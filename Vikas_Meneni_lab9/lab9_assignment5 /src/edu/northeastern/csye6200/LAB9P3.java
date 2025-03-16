package edu.northeastern.csye6200;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LAB9P3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Label num1Label = new Label("Number 1:");
        Label num2Label = new Label("Number 2:");
        Label resultLabel = new Label("Result:");

        TextField num1Field = new TextField();
        TextField num2Field = new TextField();
        TextField resultField = new TextField();
        resultField.setEditable(false); 

        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");

        
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        
        gridPane.add(num1Label, 0, 0);
        gridPane.add(num1Field, 1, 0);
        gridPane.add(num2Label, 0, 1);
        gridPane.add(num2Field, 1, 1);
        gridPane.add(addButton, 0, 2);
        gridPane.add(subtractButton, 1, 2);
        gridPane.add(multiplyButton, 0, 3);
        gridPane.add(divideButton, 1, 3);
        gridPane.add(resultLabel, 0, 4);
        gridPane.add(resultField, 1, 4);

        
        addButton.setOnAction(e -> performCalculation(num1Field, num2Field, resultField, "+"));
        subtractButton.setOnAction(e -> performCalculation(num1Field, num2Field, resultField, "-"));
        multiplyButton.setOnAction(e -> performCalculation(num1Field, num2Field, resultField, "*"));
        divideButton.setOnAction(e -> performCalculation(num1Field, num2Field, resultField, "/"));

       
        Scene scene = new Scene(gridPane, 300, 250);
        primaryStage.setTitle("JavaFX Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void performCalculation(TextField num1Field, TextField num2Field, TextField resultField, String operator) {
       
        if (num1Field.getText().isEmpty() || num2Field.getText().isEmpty()) {
            resultField.setText("Enter both numbers");
            return;
        }


        Double num1 = parseInput(num1Field.getText(), resultField);
        Double num2 = parseInput(num2Field.getText(), resultField);

        if (num1 == null || num2 == null) {
            return; 
        }

        double result = 0;

       
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    resultField.setText("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
        }

       
        resultField.setText(String.format("%.2f", result));
    }

    private Double parseInput(String input, TextField resultField) {
        try {
            return Double.parseDouble(input);  						
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
            return null;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
