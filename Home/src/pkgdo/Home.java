/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

/**
 *
 * @author mehr
 */
public class Home extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
    //    Group g = new Group();
      
        grid.setMinWidth(600);
        grid.setMinHeight(400);
    
        grid.setVgap(5);
        grid.setHgap(20);
        grid.setGridLinesVisible(true);
        
        Label tableArea = new Label("This is where tasks table will appear");
        tableArea.setMaxWidth(600);
        
        GridPane.setConstraints(tableArea, 1, 1,3,1);
        
        grid.getChildren().addAll(tableArea);
    
        
    
//        Button b1 = new Button("First button");
//        Button b2 = new Button("Second");
//        
//        g.getChildren().addAll(b1 , b2);
//        b1.setLayoutX(200);
//        b1.setLayoutY(150);
//        b2.setLayoutX(250);
//        b2.setLayoutY(280);
        
//        GridPane.setConstraints(b1, 1, 1);
//        GridPane.setConstraints(b2, 2, 1);
//        
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(new Button("Top"));
//        
//        
//        GridPane.setConstraints(borderPane, 1, 3);
//        
//        grid.getChildren().addAll(b1,b2,borderPane);

        Scene scene = new Scene(grid, 400, 600);
        
        stage.setScene(scene);
        stage.setTitle("Do-It!!");
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
