package edu.northeastern.csye6200;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;



public class LAB8P2 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
        
        int projectPercent = 35;
        int examPercent = 30;
        int assignmentPercent = 30;
        int attendancePercent = 5;

        
        Pane pane = new Pane();

        
        double xOffset = 50;

        
        double chartHeight = 300;

        
        Rectangle projectBar = new Rectangle(xOffset, chartHeight - (projectPercent * 3), 50, projectPercent * 3);
        projectBar.setFill(Color.BLUE);
        Text projectLabel = new Text(xOffset, chartHeight + 20, "Project: 35%");

        Rectangle examBar = new Rectangle(xOffset + 100, chartHeight - (examPercent * 3), 50, examPercent * 3);
        examBar.setFill(Color.GREEN);
        Text examLabel = new Text(xOffset + 100, chartHeight + 20, "Exams: 30%");

        Rectangle assignmentBar = new Rectangle(xOffset + 200, chartHeight - (assignmentPercent * 3), 50, assignmentPercent * 3);
        assignmentBar.setFill(Color.RED);
        Text assignmentLabel = new Text(xOffset + 200, chartHeight + 20, "Assignments: 30%");

        Rectangle attendanceBar = new Rectangle(xOffset + 300, chartHeight - (attendancePercent * 3), 50, attendancePercent * 3);
        attendanceBar.setFill(Color.ORANGE);
        Text attendanceLabel = new Text(xOffset + 300, chartHeight + 20, "Attendance: 5%");

       
        pane.getChildren().addAll(projectBar, projectLabel, examBar, examLabel, assignmentBar, assignmentLabel, attendanceBar, attendanceLabel);

       
        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("Lab8_Problem2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	public static void main(String[] args) {
		launch(args);
	}

	
}