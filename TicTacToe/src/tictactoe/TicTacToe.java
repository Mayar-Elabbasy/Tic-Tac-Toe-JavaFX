/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class TicTacToe extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
     MainMenuFXMLBase root = new  MainMenuFXMLBase();
        
        
     Scene   scene = new Scene(root, 700, 800);
        
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
      //  primaryStage.setResizable(false);
        // ==============game icon=========
        primaryStage.getIcons().add(new Image("https://xo-projects.com/wp-content/uploads/XO-LOGO-1920-1080-White-Blue-M.png"));
        primaryStage.setOnCloseRequest(e -> {
      
        System.exit(0);
      
    
     });
          primaryStage.show();
          }
        
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
