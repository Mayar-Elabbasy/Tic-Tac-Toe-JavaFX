
package tictactoe;





import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BURLYWOOD;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public  class GameInformationMultiPlayer extends AnchorPane {
    
    private AnchorPane rootPane ;

    protected  InnerShadow innerShadow;
    protected  BorderPane borderPane;
  
    protected  DropShadow dropShadow;
 
  
  protected ImageView xPlayerImage;
  protected ImageView oPlayerImage;
  protected ImageView  yesIcon;
  protected ImageView  noIcon;

  

    public GameInformationMultiPlayer() {
        rootPane=new AnchorPane();
     
        innerShadow = new InnerShadow();
        borderPane = new BorderPane();
     
    
        dropShadow = new DropShadow();
         oPlayerImage=new ImageView("O.png");
         xPlayerImage=new ImageView("X.png");
         Button  player1=new Button("Player 1", xPlayerImage); 
         player1.setFont(new Font("Berlin Sans FB Demi Bold",30.0));
         player1.setTextFill(Color.web("blue"));
         player1.setContentDisplay(ContentDisplay.BOTTOM);
         player1 .setAlignment(Pos.CENTER);
         player1 .setTranslateY(200);
         player1 .setTranslateX(150);
         
         Button  player2=new Button("Player 2", oPlayerImage); 
         player2.setFont(new Font("Berlin Sans FB Demi Bold",30.0));
         player2.setTextFill(Color.web("red"));
         player2.setContentDisplay(ContentDisplay.BOTTOM);
         player2 .setAlignment(Pos.CENTER);
         player2 .setTranslateY(200);
         player2 .setTranslateX(400);
        Label label = new Label();
        label .setTranslateY(120);
        label .setTranslateX(200);
        label.setText("Select Player");
        label.setFont(new Font("Berlin Sans FB Demi Bold",50.0));
        label.setTextFill(Color.web("navy"));
        
        Label recordingQuestion= new Label();
       recordingQuestion .setTranslateY(450);
       recordingQuestion.setTranslateX(100);
       recordingQuestion.setText("Do you want to record the game?");
       recordingQuestion.setFont(new Font("Berlin Sans FB Demi Bold",35.0));
       recordingQuestion.setTextFill(Color.web("navy"));
       
      


yesIcon=new ImageView("yesIcon.png");

Button acceptButton = new Button("Yes",yesIcon );
 acceptButton .setTranslateY(500);
 acceptButton.setTranslateX(200);
 acceptButton.setTextFill(Color.web("green"));
 acceptButton.setFont(new Font("Berlin Sans FB Demi Bold",20.0));
 
  noIcon=new ImageView("iconfinder_no_1815.png");
  Button declineButton = new Button("No",noIcon );
  declineButton .setTranslateY(500);
  declineButton.setTranslateX(400);
  declineButton.setTextFill(Color.web("red"));
   declineButton.setFont(new Font("Berlin Sans FB Demi Bold",20.0));
        
        
        Label gameNameLabel = new Label();
        gameNameLabel .setTranslateY(390);
       gameNameLabel.setTranslateX(155);
       gameNameLabel.setText("Game Name:");
       gameNameLabel.setFont(new Font("Berlin Sans FB Demi Bold",35.0));
       gameNameLabel.setTextFill(Color.web("navy"));
        
        TextField  gameName = new TextField();
        gameName .setTranslateY(400);
        gameName .setTranslateX(365);
    
        
        
        
        
        
        Button closeButton = new Button("Close this window");
        closeButton .setTranslateY(680);
        closeButton.setTranslateX(200);
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent e) {
                  Alert alert;
      alert = new Alert(Alert.AlertType.CONFIRMATION);
  
        alert.setTitle("Confirmation");
       alert.setHeaderText("Do you want to exit?");
          
        Optional<ButtonType> result = alert.showAndWait();
           if (result.get() == ButtonType.OK){
               MainMenuFXMLBase root = new  MainMenuFXMLBase();
             closeButton .getScene().setRoot(root.getRootPane());
              System.out.println("You have  exited  ^_^");
            } else if (result.get() == ButtonType.CANCEL) {
           
            }
              
            }
        });
        
        
        closeButton.setPrefHeight(70.0);
        closeButton.setPrefWidth(300.0);
      
        closeButton.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));
        
          DropShadow shadow = new DropShadow();
          closeButton.setEffect(shadow);
                  
          closeButton.setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(white,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,lightblue 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
          
          
        Button startPlayingButton = new Button("Start Playing");
       startPlayingButton  .setTranslateY(600);
        startPlayingButton .setTranslateX(200);
        
        
        startPlayingButton.setOnAction(new EventHandler<ActionEvent>() {
                               @Override
                               public void handle(ActionEvent e) {
                                   
                                 
                                   
                                    MultiPlayerScene root2=new MultiPlayerScene();
                                    
                                   startPlayingButton.getScene().setRoot(root2.getRootPane());
                                    
                            
                               }
                           });
      startPlayingButton .setPrefHeight(70.0);
       startPlayingButton .setPrefWidth(300.0);
      
       startPlayingButton .setFont(new Font("Berlin Sans FB Demi Bold", 29.0));
        
        
          startPlayingButton .setEffect(shadow);
                  
          startPlayingButton .setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(white,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,lightblue 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
        
        
       
       
    
       


         
   
       
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
        
        
        AnchorPane.setBottomAnchor(borderPane, 0.0);
        AnchorPane.setLeftAnchor(borderPane, 0.0);
        AnchorPane.setRightAnchor(borderPane,0.0);
        AnchorPane.setTopAnchor(borderPane, 0.0);
        borderPane.setLayoutX(0);
        borderPane.setLayoutY(0);
        borderPane.setPrefHeight(360.0);
        borderPane.setPrefWidth(300.0);
      
        borderPane.getChildren().addAll(player1, player2);

       
       getChildren().addAll(player1, player2 ,label,startPlayingButton,closeButton,gameName,  gameNameLabel, recordingQuestion,acceptButton,declineButton);
     
 

    }
    
    public Pane getRootPane(){
       return this; 
        
    }
}

