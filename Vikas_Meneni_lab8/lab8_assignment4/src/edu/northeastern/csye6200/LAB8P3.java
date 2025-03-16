package edu.northeastern.csye6200;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;


public class LAB8P3 extends Application {
	
	@Override 
	public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5); 
        gridPane.setVgap(5);

        
        Random random = new Random();

        
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                
                int randomNumber = random.nextInt(2);

               
                TextField textField = new TextField(String.valueOf(randomNumber));
                textField.setPrefWidth(40); 
                textField.setAlignment(Pos.CENTER); 
                textField.setEditable(false);

               
                gridPane.add(textField, col, row);
            }
        }

        
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setTitle("Lab8_Problem3 - Extra Credit");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	public static void main(String[] args) {
		launch(args);
	}
	
}