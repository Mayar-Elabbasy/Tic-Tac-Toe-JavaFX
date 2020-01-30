package tictactoe;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.X;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BURLYWOOD;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public  class GameFXMLBase extends AnchorPane {
    
    private final  AnchorPane rootPane ;

    protected final InnerShadow innerShadow;
    protected final BorderPane borderPane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final DropShadow dropShadow;
    protected final Label player1;
    protected final Label player2;
    protected final Button goBackToMainMenuButton;
    protected final ImageView xPlayerImage;
    protected final ImageView oPlayerImage;
    
    
     protected final ImageView oIconForGridButton;
    protected final ImageView xIconForGridButton;
    
    protected final ImageView oIconForGridButton0;
    protected final ImageView xIconForGridButton0;
    
    
    protected final ImageView oIconForGridButton1;
    protected final ImageView xIconForGridButton1;
    
    
     protected final ImageView oIconForGridButton2;
    protected final ImageView xIconForGridButton2;
    
    
    protected final ImageView oIconForGridButton3;
    protected final ImageView xIconForGridButton3;
    
     protected final ImageView oIconForGridButton4;
    protected final ImageView xIconForGridButton4;
    
    protected final ImageView oIconForGridButton5;
    protected final ImageView xIconForGridButton5;
    
    protected final ImageView oIconForGridButton6;
    protected final ImageView xIconForGridButton6;
    
    protected final ImageView oIconForGridButton7;
    protected final ImageView xIconForGridButton7;
    
 
    
   
   //   protected final Button [] buttons=new Button[3];

  

    public GameFXMLBase() {
        rootPane=new AnchorPane();
        goBackToMainMenuButton=new Button();
        innerShadow = new InnerShadow();
        borderPane = new BorderPane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
    
        dropShadow = new DropShadow();
       
        
        oPlayerImage=new ImageView("oPlayerImage.png");
        xPlayerImage=new ImageView("xPlayerImage.png");
         player1=new Label("Player 1", xPlayerImage); 
         player1.setFont(new Font("Berlin Sans FB Demi Bold",40.0));
         player1.setTextFill(Color.web("blue"));
         player1.setContentDisplay(ContentDisplay.BOTTOM);
         player1 .setAlignment(Pos.CENTER);
         player1 .setTranslateY(130);
         player1 .setTranslateX(100);
         
         player2=new Label("Player 2", oPlayerImage); 
         player2.setFont(new Font("Berlin Sans FB Demi Bold",40.0));
         player2.setTextFill(Color.web("red"));
         player2.setContentDisplay(ContentDisplay.BOTTOM);
         player2 .setAlignment(Pos.CENTER);
         player2 .setTranslateY(130);
         player2 .setTranslateX(440);
         
          oIconForGridButton = new ImageView("O.png");
          oIconForGridButton.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton = new ImageView("X.png");
          xIconForGridButton.setPickOnBounds(true);   
         
          oIconForGridButton0 = new ImageView("O.png");
          oIconForGridButton0.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton0 = new ImageView("X.png");
          xIconForGridButton0.setPickOnBounds(true);   
       
          oIconForGridButton1 = new ImageView("O.png");
          oIconForGridButton1.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton1 = new ImageView("X.png");
          xIconForGridButton1.setPickOnBounds(true);   
          
          
          oIconForGridButton2 = new ImageView("O.png");
          oIconForGridButton2.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton2 = new ImageView("X.png");
          xIconForGridButton2.setPickOnBounds(true);   
          
          
             oIconForGridButton3 = new ImageView("O.png");
          oIconForGridButton3.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton3 = new ImageView("X.png");
          xIconForGridButton3.setPickOnBounds(true);   
          
          
             oIconForGridButton4 = new ImageView("O.png");
          oIconForGridButton4.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton4 = new ImageView("X.png");
          xIconForGridButton4.setPickOnBounds(true);   
          
             oIconForGridButton5 = new ImageView("O.png");
          oIconForGridButton5.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton5 = new ImageView("X.png");
          xIconForGridButton5.setPickOnBounds(true);   
          
          
             oIconForGridButton6 = new ImageView("O.png");
          oIconForGridButton6.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton6 = new ImageView("X.png");
          xIconForGridButton6.setPickOnBounds(true);   
          
             oIconForGridButton7 = new ImageView("O.png");
          oIconForGridButton7.setPickOnBounds(true); // allows click on transparent areas
          
          xIconForGridButton7 = new ImageView("X.png");
          xIconForGridButton7.setPickOnBounds(true);   
          
          
           
          
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
       
                //==========backgroudColors===================

          Rectangle colors = new Rectangle(this.getWidth(), this.getHeight(),
                new LinearGradient(0f, 1f, 0f, 0f, true, CycleMethod.NO_CYCLE, new 
                Stop[]{
                                new Stop(0, Color.web("#FFFFFF")),
          
          
                                new Stop(0.80, Color.web("PALETURQUOISE")),
                                new Stop( 0.10, BURLYWOOD),
                                new Stop(1, Color.web("#000000"))
                               ,}));
                                   colors.widthProperty().bind(this.widthProperty());
                                   colors.heightProperty().bind(this.heightProperty());
            getChildren().add(colors);
      

        setId("AnchorPane");
        setPrefHeight(709.0);
        setPrefWidth(700.0);
        setStyle("-fx-background-color: lightgray;");
        
     

        innerShadow.setChoke(0.25);
        innerShadow.setColor(javafx.scene.paint.Color.valueOf("PALETURQUOISE"));
        innerShadow.setHeight(85.32);
        innerShadow.setRadius(42.129999999999995);
        innerShadow.setWidth(85.2);
        setEffect(innerShadow);
        
        
        AnchorPane.setBottomAnchor(borderPane, 400.0);
        AnchorPane.setLeftAnchor(borderPane, 0.0);
        AnchorPane.setRightAnchor(borderPane,0.0);
        AnchorPane.setTopAnchor(borderPane, 350.0);
        borderPane.setLayoutX(150.0);
        borderPane.setLayoutY(0);
        borderPane.setPrefHeight(360.0);
        borderPane.setPrefWidth(300.0);

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setMaxHeight(USE_PREF_SIZE);
        gridPane.setMaxWidth(USE_PREF_SIZE);
        gridPane.setMinHeight(USE_PREF_SIZE);
        gridPane.setMinWidth(USE_PREF_SIZE);
        gridPane.setPrefHeight(350.0);
        gridPane.setPrefWidth(320.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);
        

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        button.setMaxHeight(USE_PREF_SIZE);
        button.setMaxWidth(USE_PREF_SIZE);
        button.setMinHeight(USE_PREF_SIZE);
        button.setMinWidth(USE_PREF_SIZE);
        button.setMnemonicParsing(false);
        button.setPrefHeight(108.0);
        button.setPrefWidth(100.0);
        
        //==========iconsHandelingWhenMouseIsClicked===========
           
        button.setOnMouseClicked((MouseEvent e) -> {
          
          button.setGraphic(oIconForGridButton);
          button.setGraphic(xIconForGridButton);
          
          
});
        
   

        GridPane.setRowIndex(button0, 1);
        button0.setLayoutX(10.0);
        button0.setLayoutY(9.0);
        button0.setMaxHeight(USE_PREF_SIZE);
        button0.setMaxWidth(USE_PREF_SIZE);
        button0.setMinHeight(USE_PREF_SIZE);
        button0.setMinWidth(USE_PREF_SIZE);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(108.0);
        button0.setPrefWidth(100.0);
     //==========iconsHandelingWhenMouseIsClicked===========
           
        button0.setOnMouseClicked((MouseEvent e) -> {
        
     //     button0.setGraphic(xIconForGridButton0);
          button0.setGraphic(oIconForGridButton0);
          
          
});

        GridPane.setColumnIndex(button1, 1);
        button1.setLayoutX(10.0);
        button1.setLayoutY(9.0);
        button1.setMaxHeight(USE_PREF_SIZE);
        button1.setMaxWidth(USE_PREF_SIZE);
        button1.setMinHeight(USE_PREF_SIZE);
        button1.setMinWidth(USE_PREF_SIZE);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(108.0);
        button1.setPrefWidth(100.0);
         //==========iconsHandelingWhenMouseIsClicked===========
           
        button1.setOnMouseClicked((MouseEvent e) -> {
       
          button1.setGraphic(xIconForGridButton1);
      //    button1.setGraphic(oIconForGridButton1);
        });

        GridPane.setColumnIndex(button2, 1);
        GridPane.setRowIndex(button2, 1);
        button2.setLayoutX(10.0);
        button2.setLayoutY(9.0);
        button2.setMaxHeight(USE_PREF_SIZE);
        button2.setMaxWidth(USE_PREF_SIZE);
        button2.setMinHeight(USE_PREF_SIZE);
        button2.setMinWidth(USE_PREF_SIZE);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(108.0);
        button2.setPrefWidth(100.0);
       
        
             //==========iconsHandelingWhenMouseIsClicked===========
           
        button2.setOnMouseClicked((MouseEvent e) -> {
       
        //  button2.setGraphic(xIconForGridButton2);
          button2.setGraphic(oIconForGridButton2);
        });

        GridPane.setColumnIndex(button3, 2);
        button3.setLayoutX(10.0);
        button3.setLayoutY(9.0);
        button3.setMaxHeight(USE_PREF_SIZE);
        button3.setMaxWidth(USE_PREF_SIZE);
        button3.setMinHeight(USE_PREF_SIZE);
        button3.setMinWidth(USE_PREF_SIZE);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(108.0);
        button3.setPrefWidth(100.0);
      
        
            //==========iconsHandelingWhenMouseIsClicked===========
           
        button3.setOnMouseClicked((MouseEvent e) -> {
        
         // button3.setGraphic(xIconForGridButton3);
          button3.setGraphic(oIconForGridButton3);
        });


        GridPane.setColumnIndex(button4, 2);
        GridPane.setRowIndex(button4, 1);
        button4.setLayoutX(10.0);
        button4.setLayoutY(9.0);
        button4.setMaxHeight(USE_PREF_SIZE);
        button4.setMaxWidth(USE_PREF_SIZE);
        button4.setMinHeight(USE_PREF_SIZE);
        button4.setMinWidth(USE_PREF_SIZE);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(108.0);
        button4.setPrefWidth(100.0);
      
        
        //==========iconsHandelingWhenMouseIsClicked===========
           
        button4.setOnMouseClicked((MouseEvent e) -> {
         
          button4.setGraphic(xIconForGridButton4);
         // button4.setGraphic(oIconForGridButton4);
        });


        GridPane.setColumnIndex(button5, 2);
        GridPane.setRowIndex(button5, 2);
        button5.setLayoutX(10.0);
        button5.setLayoutY(9.0);
        button5.setMaxHeight(USE_PREF_SIZE);
        button5.setMaxWidth(USE_PREF_SIZE);
        button5.setMinHeight(USE_PREF_SIZE);
        button5.setMinWidth(USE_PREF_SIZE);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(108.0);
        button5.setPrefWidth(100.0);
        
        
           //==========iconsHandelingWhenMouseIsClicked===========
           
        button5.setOnMouseClicked((MouseEvent e) -> {
       
          button5.setGraphic(xIconForGridButton5);
          button5.setGraphic(oIconForGridButton5);
        });

        GridPane.setColumnIndex(button6, 1);
        GridPane.setRowIndex(button6, 2);
        button6.setLayoutX(210.0);
        button6.setLayoutY(224.0);
        button6.setMaxHeight(USE_PREF_SIZE);
        button6.setMaxWidth(USE_PREF_SIZE);
        button6.setMinHeight(USE_PREF_SIZE);
        button6.setMinWidth(USE_PREF_SIZE);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(108.0);
        button6.setPrefWidth(100.0);
         //==========iconsHandelingWhenMouseIsClicked===========
           
        button6.setOnMouseClicked((MouseEvent e) -> {
      
          button6.setGraphic(xIconForGridButton6);
          button6.setGraphic(oIconForGridButton6);
        });
      

        GridPane.setRowIndex(button7, 2);
        button7.setLayoutX(210.0);
        button7.setLayoutY(224.0);
        button7.setMaxHeight(USE_PREF_SIZE);
        button7.setMaxWidth(USE_PREF_SIZE);
        button7.setMinHeight(USE_PREF_SIZE);
        button7.setMinWidth(USE_PREF_SIZE);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(108.0);
        button7.setPrefWidth(100.0);
         //==========iconsHandelingWhenMouseIsClicked===========
           
        button7.setOnMouseClicked((MouseEvent e) -> {
        
          button7.setGraphic(xIconForGridButton7);
         // button7.setGraphic(oIconForGridButton7);
        });
       
        
        
        
         goBackToMainMenuButton.setPrefHeight(70.0);
         goBackToMainMenuButton.setPrefWidth(200.0);
         goBackToMainMenuButton.setLayoutX(250.0);
         goBackToMainMenuButton.setLayoutY(35.0);
         goBackToMainMenuButton.setText(" Main Menu");
         goBackToMainMenuButton.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));
        
        
        
            
         DropShadow shadow = new DropShadow();
          goBackToMainMenuButton.setEffect(shadow);
                  
                                              
        goBackToMainMenuButton.setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(white,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,lightblue 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
       
       
       //===========goBackToMainMenuButtonHandeling==========
       
       goBackToMainMenuButton.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent e) {
                  Alert alert;
      alert = new Alert(Alert.AlertType.CONFIRMATION);
  
        alert.setTitle("Confirmation");
       alert.setHeaderText("Do you want to exit?");
          
        Optional<ButtonType> result = alert.showAndWait();
           if (result.get() == ButtonType.OK){
               MainMenuFXMLBase root = new  MainMenuFXMLBase();
           goBackToMainMenuButton .getScene().setRoot(root.getRootPane());
              System.out.println("You have  exited  ^_^");
            } else if (result.get() == ButtonType.CANCEL) {
           
            }
              
            }
        });
                                          

                                     
                            
                            
          goBackToMainMenuButton.setOnMouseEntered((MouseEvent event) -> {
                                goBackToMainMenuButton.setCursor(Cursor.cursor("http://icons.iconarchive.com/icons/danieledesantis/playstation-flat/512/playstation-circle-black-and-white-icon.png"));
        });

        dropShadow.setColor(javafx.scene.paint.Color.TEAL);
        dropShadow.setSpread(100);
        gridPane.setEffect(dropShadow);
        borderPane.setCenter(gridPane);

   
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(button);
        gridPane.getChildren().add(button0);
        gridPane.getChildren().add(button1);
        gridPane.getChildren().add(button2);
        gridPane.getChildren().add(button3);
        gridPane.getChildren().add(button4);
        gridPane.getChildren().add(button5);
        gridPane.getChildren().add(button6);
        gridPane.getChildren().add(button7);
        getChildren().add(borderPane);

       getChildren().add(goBackToMainMenuButton);
       getChildren().addAll(player1, player2);
 

    }
    public Pane getRootPane(){
       return this; 
        
    }
}
