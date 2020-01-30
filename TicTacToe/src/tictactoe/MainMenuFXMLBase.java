package tictactoe;

import static java.lang.Math.random;
import java.util.Optional;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Separator;
import javafx.scene.effect.Blend;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BURLYWOOD;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class MainMenuFXMLBase extends AnchorPane {
     
    private final  AnchorPane rootPane ;

    protected final AnchorPane anchorPane;
    protected final Button singlePlayerButton;
    protected final InnerShadow singlePlayerButtonInnerShadow;
    protected final ColorAdjust colorAdjust;
    protected final Button multiplayerButton;
    protected final InnerShadow multiplayerInnerShadow;
    protected final ColorAdjust colorAdjust0;
    protected final Button friendsButton;
    
    
    protected final Button achievementsButton;
    protected final InnerShadow achievementsButtonInnerShadow;
    protected final ColorAdjust colorAdjust1;
    protected final Button aboutButton;
    protected final InnerShadow innerShadow2;
    protected final ColorAdjust colorAdjust2;
    protected final Button exitButton;
    protected final InnerShadow innerShadow3;
    protected final ColorAdjust colorAdjust3;
    protected final Separator separator;
    protected final DropShadow dropShadow;
    protected final Separator separator0;
    protected final DropShadow dropShadow0;
    protected final Blend blend;
    protected final InnerShadow innerShadow4;
    protected final BorderPane borderPane;
    protected final Text ticTacToe;
    protected final ColorAdjust colorAdjust4;
    protected final Reflection reflection;
    protected final Lighting lighting;
    protected final StackPane doubleCircleStackPane;
    protected final Circle circle;
    protected final Circle circle0;
    protected final Circle circle1;
    protected final StackPane stackPane0;
    protected final Line line;
    protected final Line line0;
    protected final StackPane stackPane1;
    protected final Line line1;
    protected final Line line2;
    protected final StackPane stackPane2;
    protected final Line line3;
    protected final Line line4;
    protected final StackPane stackPane3;
    protected final Circle circle2;
    protected final Circle circle3;
    protected final StackPane stackPane4;
    protected final Circle circle4;
    protected final Circle circle5;
    protected final InnerShadow innerShadow5;

    public MainMenuFXMLBase() {
         rootPane=new AnchorPane();

        anchorPane = new AnchorPane();
        singlePlayerButton = new Button();
        singlePlayerButtonInnerShadow = new InnerShadow();
        colorAdjust = new ColorAdjust();
        multiplayerButton = new Button();
        multiplayerInnerShadow = new InnerShadow();
        colorAdjust0 = new ColorAdjust();
        
        friendsButton=new Button();
        
        achievementsButton = new Button();
        achievementsButtonInnerShadow = new InnerShadow();
        colorAdjust1 = new ColorAdjust();
        aboutButton = new Button();
        innerShadow2 = new InnerShadow();
        colorAdjust2 = new ColorAdjust();
        exitButton = new Button();
        innerShadow3 = new InnerShadow();
        colorAdjust3 = new ColorAdjust();
        separator = new Separator();
        dropShadow = new DropShadow();
        separator0 = new Separator();
        dropShadow0 = new DropShadow();
        blend = new Blend();
        innerShadow4 = new InnerShadow();
        borderPane = new BorderPane();
        ticTacToe = new Text();
        colorAdjust4 = new ColorAdjust();
        reflection = new Reflection();
        lighting = new Lighting();
        doubleCircleStackPane = new StackPane();
        circle = new Circle();
        circle0 = new Circle();
        circle1 = new Circle();
        stackPane0 = new StackPane();
        line = new Line();
        line0 = new Line();
        stackPane1 = new StackPane();
        line1 = new Line();
        line2 = new Line();
        stackPane2 = new StackPane();
        line3 = new Line();
        line4 = new Line();
        stackPane3 = new StackPane();
        circle2 = new Circle();
        circle3 = new Circle();
        stackPane4 = new StackPane();
        circle4 = new Circle();
        circle5 = new Circle();
        innerShadow5 = new InnerShadow();
        
      

final Rectangle rect1 = new Rectangle(10, 10, 100, 100);
rect1.setArcHeight(20);
rect1.setArcWidth(20);
rect1.setFill(Color.RED);

FadeTransition ft = new FadeTransition(Duration.millis(3000), rect1);
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(Timeline.INDEFINITE);
ft.setAutoReverse(true);
ft.play();






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

                                                                         //=============animatedRectangle================
                                                                         
                                                                         
final Rectangle rectPath = new Rectangle (0, 0, 60, 60);
 
rectPath.setArcHeight(10);
rectPath.setArcWidth(10);
rectPath.setFill(Color.valueOf("BURLYWOOD"));

Path path = new Path();
path.getElements().add(new MoveTo(50,50));
path.getElements().add(new CubicCurveTo(380, 0, 1000, 120, 250, 120));
path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 400, 240));
PathTransition pathTransition = new PathTransition();
pathTransition.setDuration(Duration.millis(4000));
pathTransition.setPath(path);
pathTransition.setNode(rectPath);
pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
pathTransition.setCycleCount(Timeline.INDEFINITE);
pathTransition.setAutoReverse(true);
 getChildren().addAll(rectPath );

pathTransition.play();


                                         //======================animatedCircles=======================
  Group circles = new Group();
   for (int i = 0; i < 10; i++) {
   Circle circle = new Circle(30, Color.web("BLACK",0));
  circle.setStrokeType(StrokeType.OUTSIDE);
  circle.setStroke(Color.web("WHITE", 1));
   circle.setStrokeWidth(10);
   circles.getChildren().add(circle);
}

 Timeline timeline = new Timeline();
for (Node circle: circles.getChildren()) {
    timeline.getKeyFrames().addAll(
        new KeyFrame(Duration.ZERO, // set start position at 0
            new KeyValue(circle.translateXProperty(), random() *800),
            new KeyValue(circle.translateYProperty(), random() *600)
        ),
        new KeyFrame(new Duration(40000), // set end position at 40s
            new KeyValue(circle.translateXProperty(), random() * 800),
            new KeyValue(circle.translateYProperty(), random() * 600)
        )
    );
}
// play 40s of animation
 getChildren().add(circles);
timeline.play();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(709.0);
        setPrefWidth(700.0);
        setStyle("-fx-background-color:KHAKI;");

        AnchorPane.setBottomAnchor(anchorPane, 25.0);
        AnchorPane.setLeftAnchor(anchorPane, 112.0);
        AnchorPane.setRightAnchor(anchorPane, 111.0);
        AnchorPane.setTopAnchor(anchorPane, 275.0);
        anchorPane.setLayoutX(112.0);
        anchorPane.setLayoutY(229.0);
        anchorPane.setPrefHeight(396.0);
        anchorPane.setPrefWidth(440.0);

        AnchorPane.setLeftAnchor(singlePlayerButton, 103.0);
        AnchorPane.setRightAnchor(singlePlayerButton, 90.0);
        AnchorPane.setTopAnchor(singlePlayerButton, 0.0);
        singlePlayerButton.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        singlePlayerButton.setLayoutX(119.0);
        singlePlayerButton.setMaxHeight(USE_PREF_SIZE);
        singlePlayerButton.setMaxWidth(USE_PREF_SIZE);
        singlePlayerButton.setMinHeight(USE_PREF_SIZE);
        singlePlayerButton.setMinWidth(USE_PREF_SIZE);
        singlePlayerButton.setMnemonicParsing(false);
       
        
        singlePlayerButton.setPrefHeight(59.0);
        singlePlayerButton.setPrefWidth(254.0);
        singlePlayerButton.setText("SINGLE PLAYER");
        singlePlayerButton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        singlePlayerButton.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));

        singlePlayerButtonInnerShadow.setChoke(0.85);
        singlePlayerButtonInnerShadow.setColor(javafx.scene.paint.Color.valueOf("TOMATO"));
       

        colorAdjust.setBrightness(0.15);
        colorAdjust.setContrast(1.0);
        colorAdjust.setHue(0.61);
        colorAdjust.setSaturation(0.49);
     
        
      singlePlayerButtonInnerShadow.setInput(colorAdjust);
       singlePlayerButton.setEffect(singlePlayerButtonInnerShadow);
        
                    //==========================singlePlayerButtonHandeling===================
                            singlePlayerButton.setOnAction(new EventHandler<ActionEvent>() {
                               @Override
                               public void handle(ActionEvent e) {
                                   
                                  
                            GamePreferencesSinglePlayer root =new GamePreferencesSinglePlayer();
                            singlePlayerButton .getScene().setRoot(root.getRootPane());
                              
                               }
                           });

                            singlePlayerButton.setOnMouseEntered((event) -> {
                                    
                                            DropShadow shadow = new DropShadow();
                                                   singlePlayerButton.setEffect(shadow);
                  
                                              
                                               singlePlayerButton.setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(PALETURQUOISE,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,TEAL 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
                                            
                                      
                     
                       });
                            
                            
                             singlePlayerButton.setOnMouseExited((event) -> {
                                  singlePlayerButton.setEffect(singlePlayerButtonInnerShadow);
                                 singlePlayerButton.setStyle(null);
                       });

         
           
        AnchorPane.setLeftAnchor(multiplayerButton, 103.0);
        AnchorPane.setRightAnchor(multiplayerButton, 90.0);
        multiplayerButton.setLayoutX(119.0);
        multiplayerButton.setLayoutY(80.0);
        multiplayerButton.setMaxHeight(USE_PREF_SIZE);
        multiplayerButton.setMaxWidth(USE_PREF_SIZE);
        multiplayerButton.setMinHeight(USE_PREF_SIZE);
        multiplayerButton.setMinWidth(USE_PREF_SIZE);
        multiplayerButton.setMnemonicParsing(false);
        multiplayerButton.setPrefHeight(59.0);
        multiplayerButton.setPrefWidth(254.0);
        multiplayerButton.setText("MULTIPLAYER");
        multiplayerButton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        multiplayerButton.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));

        multiplayerInnerShadow.setChoke(0.85);
        multiplayerInnerShadow.setColor(javafx.scene.paint.Color.valueOf("TOMATO"));
     

        colorAdjust0.setBrightness(0.15);
        colorAdjust0.setContrast(1.0);
        colorAdjust0.setHue(0.61);
        colorAdjust0.setSaturation(0.49);
        multiplayerInnerShadow.setInput(colorAdjust0);
       multiplayerButton.setEffect(multiplayerInnerShadow);
             //==========================multiplayeButtonHandeling===================
         multiplayerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                
                GameInformationMultiPlayer root =new GameInformationMultiPlayer();
                              multiplayerButton.getScene().setRoot(root.getRootPane());
                //  GameFXMLBase root2=new GameFXMLBase();
          // multiplayerButton .getScene().setRoot(root2.getRootPane());
            }
        });
         
              multiplayerButton.setOnMouseEntered((event) -> {
                                  
                                         DropShadow shadow = new DropShadow();
                                                  multiplayerButton.setEffect(shadow);
                  
                                              
                                                 multiplayerButton.setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(PALETURQUOISE,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,TEAL 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
                                 
                     
                       });
                            
                            
                             multiplayerButton.setOnMouseExited((event) -> {
                                 multiplayerButton.setStyle(null);
                                 multiplayerButton.setEffect(multiplayerInnerShadow);
                                
                       });
        
       
       AnchorPane.setLeftAnchor(friendsButton, 103.0);
        AnchorPane.setRightAnchor(friendsButton, 90.0);
       friendsButton.setLayoutX(124.0);
        friendsButton.setLayoutY(161.0);
       friendsButton.setMaxHeight(USE_PREF_SIZE);
       friendsButton.setMaxWidth(USE_PREF_SIZE);
       friendsButton.setMinHeight(USE_PREF_SIZE);
        friendsButton.setMinWidth(USE_PREF_SIZE);
       friendsButton.setMnemonicParsing(false);
        friendsButton.setPrefHeight(59.0);
        friendsButton.setPrefWidth(252.0);
        friendsButton.setText("FRIENDS");
        friendsButton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        friendsButton.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));
         friendsButton.setEffect(multiplayerInnerShadow);
        
           //==========================friendsButtonHandeling===================
         friendsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                
                  GamePreferencesFriends root2 =new GamePreferencesFriends();
                              multiplayerButton.getScene().setRoot(root2.getRootPane());
                
             
            }
        });
         
               friendsButton .setOnMouseEntered((event) -> {
                                  
                                      DropShadow shadow = new DropShadow();
                                                  friendsButton .setEffect(shadow);
                  
                                              
                                               friendsButton .setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(PALETURQUOISE,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,TEAL 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
                                     
                     
                       });
                            
                            
                            friendsButton .setOnMouseExited((event) -> {
                                 friendsButton .setStyle(null);
                                  friendsButton.setEffect(multiplayerInnerShadow);
                                
                       });

       
       
       
       
       
       
       
       
       

        AnchorPane.setLeftAnchor(achievementsButton, 103.0);
        AnchorPane.setRightAnchor(achievementsButton, 90.0);
        achievementsButton.setLayoutX(120.0);
        achievementsButton.setLayoutY(240.0);
        achievementsButton.setMaxHeight(USE_PREF_SIZE);
        achievementsButton.setMaxWidth(USE_PREF_SIZE);
        achievementsButton.setMinHeight(USE_PREF_SIZE);
        achievementsButton.setMinWidth(USE_PREF_SIZE);
        achievementsButton.setMnemonicParsing(false);
     
        achievementsButton.setPrefHeight(59.0);
        achievementsButton.setPrefWidth(254.0);
        achievementsButton.setText("ACHIEVEMENTS");
        achievementsButton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        achievementsButton.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));

        achievementsButtonInnerShadow.setChoke(0.85);
        achievementsButtonInnerShadow.setColor(javafx.scene.paint.Color.valueOf("TOMATO"));
                

       colorAdjust1.setBrightness(0.15);
       colorAdjust1.setContrast(1.0);
         colorAdjust1.setHue(0.61);
       colorAdjust1.setSaturation(0.49);
        achievementsButtonInnerShadow.setInput(colorAdjust1);
        achievementsButton.setEffect( achievementsButtonInnerShadow);
        
        
            //==========================achievementsButtonHandeling===================
            
                         achievementsButton.setOnAction((ActionEvent event) -> {
                                                System.out.println("Hello World!");
                        });
                        achievementsButton .setOnMouseEntered((event) -> {
                                                  DropShadow shadow = new DropShadow();
                                                  achievementsButton .setEffect(shadow);
                  
                                              
                                                achievementsButton .setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(PALETURQUOISE,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,TEAL 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
                                 
                                                  

                                     });
                            
                            
                         achievementsButton.setOnMouseExited((event) -> {
                                 achievementsButton.setStyle(null);
                                  achievementsButton.setEffect( achievementsButtonInnerShadow);
                                
                       });

        AnchorPane.setLeftAnchor(aboutButton, 103.0);
        AnchorPane.setRightAnchor(aboutButton, 90.0);
        aboutButton.setLayoutX(118.0);
        aboutButton.setLayoutY(326.0);
        aboutButton.setMaxHeight(USE_PREF_SIZE);
        aboutButton.setMaxWidth(USE_PREF_SIZE);
        aboutButton.setMinHeight(USE_PREF_SIZE);
        aboutButton.setMinWidth(USE_PREF_SIZE);
        aboutButton.setMnemonicParsing(false);
        aboutButton.setPrefHeight(59.0);
        aboutButton.setPrefWidth(252.0);
        aboutButton.setText("ABOUT US");
        aboutButton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        aboutButton.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));
       
      
         
         

        innerShadow2.setChoke(0.85);
        innerShadow2.setColor(javafx.scene.paint.Color.valueOf("TOMATO"));
      

        colorAdjust2.setBrightness(0.1);
        colorAdjust2.setContrast(.5);
        colorAdjust2.setHue(0.61);
        colorAdjust2.setSaturation(0.49);
       innerShadow2.setInput(colorAdjust2);
    aboutButton.setEffect(innerShadow2);
    
      //==========================aboutButtonHandeling===================
        
         aboutButton.setOnAction(ActionEvent-> {
               
             
               
               
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Welcome");
               
                alert.setHeaderText("Tic Tac Toe game");
            
                alert.setContentText(   "This game was made by Amira,Gehad,Mayar,Osama,Mohamed");
              
       
                
                  alert.showAndWait();
                    });
    
    
    
                         aboutButton.setOnMouseEntered((event) -> {

                                                        DropShadow shadow = new DropShadow();
                                                 aboutButton.setEffect(shadow);
                  
                                              
                                              aboutButton.setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(PALETURQUOISE,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,TEAL 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
                                    

                                     });
                            
                            
                          aboutButton.setOnMouseExited((event) -> {
                                  aboutButton.setStyle(null);
                                  aboutButton.setEffect(innerShadow2);
                                
                       });


        AnchorPane.setLeftAnchor(exitButton, 103.0);
        AnchorPane.setRightAnchor(exitButton, 90.0);
        exitButton.setLayoutX(119.0);
        exitButton.setLayoutY(410.0);
        exitButton.setMaxHeight(USE_PREF_SIZE);
        exitButton.setMaxWidth(USE_PREF_SIZE);
        exitButton.setMinHeight(USE_PREF_SIZE);
        exitButton.setMinWidth(USE_PREF_SIZE);
        exitButton.setMnemonicParsing(false);
        exitButton.setPrefHeight(59.0);
        exitButton.setPrefWidth(252.0);
        exitButton.setText("EXIT");
       exitButton.setEffect(multiplayerInnerShadow);
        
        
        
        exitButton.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        exitButton.setFont(new Font("Berlin Sans FB Demi Bold", 29.0));

        innerShadow3.setChoke(0.85);
   //     innerShadow3.setColor(javafx.scene.paint.Color.valueOf("#331eaf"));
        

        colorAdjust3.setBrightness(0.15);
        colorAdjust3.setContrast(1.0);
        colorAdjust3.setHue(0.61);
        colorAdjust3.setSaturation(0.49);
        innerShadow3.setInput(colorAdjust3);
 //       exitButton.setEffect(innerShadow3);
 
 //==========================exitButtonHandeling===================
        exitButton.setOnAction(ActionEvent-> {
                 Alert alert;
      alert = new Alert(Alert.AlertType.CONFIRMATION);
  
        alert.setTitle("Confirmation");
       alert.setHeaderText("Are you sure you want to exit?");
       Optional<ButtonType> result = alert.showAndWait();
           if (result.get() == ButtonType.OK){
               System.exit(0);
              System.out.println("You have  exited  ^_^");
            } else if (result.get() == ButtonType.CANCEL) {
           
            }
       
            });
        
          exitButton.setOnMouseEntered((event) -> {

                                                          DropShadow shadow = new DropShadow();
                                                 exitButton.setEffect(shadow);
                  
                                              
                                               exitButton.setStyle(" -fx-background-color: linear-gradient(PALETURQUOISE, #263463),"
                                                + " linear-gradient(PALETURQUOISE,PALETURQUOISE), "
                                                + "linear-gradient(PALETURQUOISE, navy), "
                                                + "linear-gradient(rgb(148, 250, 235) 0%,TEAL 50%,TAN 100%),"
                                                + "  linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0)); "
                                                + "  -fx-background-radius: 30;   "
                                                + "-fx-text-fill:MIDNIGHTBLUE");
                                          

                                     });
                            
                            
                         exitButton.setOnMouseExited((event) -> {
                                 exitButton.setStyle(null);
                                  exitButton.setEffect(multiplayerInnerShadow);
                                
                       });
 
 
 
 
 
 
        AnchorPane.setLeftAnchor(separator, 103.0);
        separator.setLayoutX(117.0);
        separator.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator.setPrefHeight(470.0);

        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#1712ac"));
       
        dropShadow.setHeight(71.35);
        dropShadow.setRadius(35.099999999999994);
        dropShadow.setSpread(0.51);
        dropShadow.setWidth(71.05);
       separator.setEffect(dropShadow);

        AnchorPane.setRightAnchor(separator0, 86.4);
        separator0.setLayoutX(370.0);
        separator0.setOrientation(javafx.geometry.Orientation.VERTICAL);
        separator0.setPrefHeight(470.0);

        
        dropShadow0.setColor(javafx.scene.paint.Color.valueOf("#1712ac"));
        dropShadow0.setHeight(71.19999999999999);
        dropShadow0.setRadius(35.0625);
        dropShadow0.setSpread(0.51);
        dropShadow0.setWidth(71.05);
        separator0.setEffect(dropShadow0);

        blend.setMode(javafx.scene.effect.BlendMode.SCREEN);

        innerShadow4.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow4.setChoke(1.0);
        
        innerShadow4.setColor(javafx.scene.paint.Color.valueOf("#13f817"));
        innerShadow4.setHeight(1.0);
        innerShadow4.setRadius(0.0);
        innerShadow4.setWidth(0.0);
        blend.setTopInput(innerShadow4);
        anchorPane.setEffect(blend);
        
        anchorPane.setCursor(Cursor.cursor("http://icons.iconarchive.com/icons/danieledesantis/playstation-flat/512/playstation-circle-black-and-white-icon.png"));
    
       

        AnchorPane.setLeftAnchor(borderPane, 160.0);
        AnchorPane.setRightAnchor(borderPane, 141.0);
        borderPane.setLayoutX(160.0);
        borderPane.setLayoutY(81.0);
        borderPane.setPrefHeight(134.0);
        borderPane.setPrefWidth(399.0);

        BorderPane.setAlignment(ticTacToe, javafx.geometry.Pos.CENTER);
        ticTacToe.setFontSmoothingType(javafx.scene.text.FontSmoothingType.LCD);
        ticTacToe.setStrikethrough(true);
      //  ticTacToe.setStroke(javafx.scene.paint.Color.valueOf("BLUE"));
       // ticTacToe.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticTacToe.setStrokeWidth(0.0);
        ticTacToe.setText("Tic Tac T0e");
        ticTacToe.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        ticTacToe.setFont(new Font("Berlin Sans FB Demi Bold", 85.0));

        colorAdjust4.setBrightness(0.4);
        colorAdjust4.setContrast(.4);
        colorAdjust4.setHue(0.50);
        colorAdjust4.setSaturation(0.40);

        reflection.setBottomOpacity(0.03);
        reflection.setFraction(0.79);
        reflection.setTopOpacity(0.39);

    //   lighting.setBumpInput(new GaussianBlur(20));
       
        lighting.setDiffuseConstant(2.0);
        lighting.setSpecularConstant(1.42);
        lighting.setSpecularExponent(31.59);
        lighting.setSurfaceScale(6.36);
        reflection.setInput(lighting);
        colorAdjust4.setInput(reflection);
        ticTacToe.setEffect(colorAdjust4);
        borderPane.setTop(ticTacToe);

        doubleCircleStackPane.setLayoutX(12.0);
        doubleCircleStackPane.setLayoutY(206.0);
        doubleCircleStackPane.setPrefHeight(150.0);
        doubleCircleStackPane.setPrefWidth(200.0);
       
        

        circle.setFill(javafx.scene.paint.Color.valueOf("#5935e800"));
        circle.setId("circle");
        circle.setRadius(54.0);
        circle.setStroke(javafx.scene.paint.Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle.setStrokeWidth(12.0);
        circle.setStyle("-fx-stroke-dash-array: 40;");

        circle0.setFill(javafx.scene.paint.Color.valueOf("#5935e800"));
        circle0.setRadius(30.0);
        circle0.setStroke(javafx.scene.paint.Color.BLACK);
        circle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle0.setStrokeWidth(10.0);
        circle0.setStyle("-fx-stroke-dash-array: 30;");
         circle0.setId("circle0");

        circle1.setFill(javafx.scene.paint.Color.valueOf("#5935e800"));
        circle1.setLayoutX(110.0);
        circle1.setLayoutY(86.0);
        circle1.setRadius(54.0);
        circle1.setStroke(javafx.scene.paint.Color.valueOf("#1712ac"));
        circle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle1.setStrokeWidth(12.0);
        circle1.setStyle("-fx-stroke-dash-array: 40;");

        AnchorPane.setLeftAnchor(stackPane0, 526.0);
        AnchorPane.setRightAnchor(stackPane0, 14.0);
        AnchorPane.setTopAnchor(stackPane0, 260.0);
    
        stackPane0.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        stackPane0.setLayoutX(541.0);
        stackPane0.setLayoutY(293.0);
        stackPane0.setPrefHeight(88.0);
        stackPane0.setPrefWidth(123.0);

        line.setEndX(10.0);
        line.setEndY(10.0);
        line.setFill(javafx.scene.paint.Color.valueOf("#3d27ab"));
        line.setRotate(-57.1);
        line.setStartX(-100.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#3d27ab"));
        line.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.BEVEL);
        line.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        line.setStrokeWidth(10.0);

        line0.setEndX(10.0);
        line0.setEndY(10.0);
        line0.setFill(javafx.scene.paint.Color.valueOf("#3d27ab"));
        line0.setLayoutX(170.0);
        line0.setLayoutY(20.0);
        line0.setRotate(-143.7);
        line0.setStartX(-100.0);
        line0.setStroke(javafx.scene.paint.Color.valueOf("#3d27ab"));
        line0.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line0.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.BEVEL);
        line0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        line0.setStrokeWidth(10.0);

        AnchorPane.setRightAnchor(stackPane1, 28.600000000000023);
    
        stackPane1.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        stackPane1.setLayoutX(541.0);
        stackPane1.setLayoutY(583.0);
        stackPane1.setPrefHeight(88.0);
        stackPane1.setPrefWidth(123.0);

        line1.setEndX(10.0);
        line1.setEndY(10.0);
        line1.setFill(javafx.scene.paint.Color.valueOf("#de83c600"));
        line1.setLayoutX(170.0);
        line1.setLayoutY(20.0);
        line1.setRotate(-143.7);
        line1.setStartX(-90.0);
        line1.setStroke(javafx.scene.paint.Color.valueOf("#3d27ab"));
        line1.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line1.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.BEVEL);
        line1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        line1.setStrokeWidth(10.0);

        line2.setEndX(10.0);
        line2.setEndY(10.0);
        line2.setFill(javafx.scene.paint.Color.valueOf("#de83c600"));
        line2.setRotate(-59.0);
        line2.setStartX(-100.0);
        line2.setStroke(javafx.scene.paint.Color.valueOf("#3d27ab"));
        line2.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line2.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.BEVEL);
        line2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        line2.setStrokeWidth(10.0);

        AnchorPane.setLeftAnchor(stackPane2, 50.0);

 
        stackPane2.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        stackPane2.setLayoutX(34.0);
        stackPane2.setLayoutY(433.0);
        stackPane2.setPrefHeight(50.0);
        stackPane2.setPrefWidth(123.0);

        line3.setEndX(10.0);
        line3.setEndY(10.0);
        line3.setFill(javafx.scene.paint.Color.valueOf("#de83c600"));
        line3.setLayoutX(170.0);
        line3.setLayoutY(20.0);
        line3.setRotate(-143.7);
        line3.setStartX(-90.0);
        line3.setStroke(javafx.scene.paint.Color.valueOf("#3d27ab"));
        line3.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line3.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.BEVEL);
        line3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        line3.setStrokeWidth(10.0);

        line4.setEndX(10.0);
        line4.setEndY(10.0);
        line4.setFill(javafx.scene.paint.Color.valueOf("#de83c600"));
        line4.setRotate(-59.0);
        line4.setStartX(-100.0);
        line4.setStroke(javafx.scene.paint.Color.valueOf("#3d27ab"));
        line4.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        line4.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.BEVEL);
        line4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        line4.setStrokeWidth(10.0);

        stackPane3.setLayoutX(-1.0);
        stackPane3.setLayoutY(528.0);
        stackPane3.setPrefHeight(150.0);
        stackPane3.setPrefWidth(200.0);

        circle2.setFill(javafx.scene.paint.Color.valueOf("#5935e800"));
        circle2.setRadius(54.0);
        circle2.setStroke(javafx.scene.paint.Color.valueOf("#1712ac"));
        circle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle2.setStrokeWidth(12.0);
        circle2.setStyle("-fx-stroke-dash-array: 40;");

        circle3.setFill(javafx.scene.paint.Color.valueOf("#91ffd900"));
        circle3.setRadius(30.0);
        circle3.setStroke(javafx.scene.paint.Color.valueOf("BLACK"));
        circle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle3.setStrokeWidth(10.0);
        circle3.setStyle("-fx-stroke-dash-array: 30;");

        AnchorPane.setRightAnchor(stackPane4, -6.0);
        AnchorPane.setTopAnchor(stackPane4, 350.0);
        stackPane4.setLayoutX(506.0);
        stackPane4.setLayoutY(410.0);
        stackPane4.setPrefHeight(150.0);
        stackPane4.setPrefWidth(200.0);

        circle4.setFill(javafx.scene.paint.Color.valueOf("#5935e800"));
        circle4.setRadius(54.0);
        circle4.setStroke(javafx.scene.paint.Color.valueOf("#1712ac"));
        circle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle4.setStrokeWidth(12.0);
        circle4.setStyle("-fx-stroke-dash-array: 40;");

        circle5.setFill(javafx.scene.paint.Color.valueOf("#91ffd900"));
        circle5.setRadius(30.0);
        circle5.setStroke(javafx.scene.paint.Color.valueOf("BLACK"));
        circle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        circle5.setStrokeWidth(10.0);
        circle5.setStyle("-fx-stroke-dash-array: 30;");
     
     
        

        innerShadow5.setBlurType(javafx.scene.effect.BlurType.GAUSSIAN);
        innerShadow5.setChoke(0.25);
        innerShadow5.setColor(javafx.scene.paint.Color.valueOf("PALETURQUOISE"));
        innerShadow5.setHeight(85.43);
        innerShadow5.setRadius(42.1575);
        innerShadow5.setWidth(85.2);
        setEffect(innerShadow5);
        

        anchorPane.getChildren().add(singlePlayerButton);
        anchorPane.getChildren().add(multiplayerButton);
        anchorPane.getChildren().add(achievementsButton);
        anchorPane.getChildren().add(aboutButton);
        anchorPane.getChildren().add(exitButton);
          anchorPane.getChildren().add(friendsButton);
        anchorPane.getChildren().add(separator);
        anchorPane.getChildren().add(separator0);
        getChildren().add(anchorPane);
        getChildren().add(borderPane);
        doubleCircleStackPane.getChildren().add(circle);
        doubleCircleStackPane.getChildren().add(circle0);
        doubleCircleStackPane.getChildren().add(circle1);
        getChildren().add(doubleCircleStackPane);
        stackPane0.getChildren().add(line);
        stackPane0.getChildren().add(line0);
        getChildren().add(stackPane0);
        stackPane1.getChildren().add(line1);
        stackPane1.getChildren().add(line2);
        getChildren().add(stackPane1);
        stackPane2.getChildren().add(line3);
        stackPane2.getChildren().add(line4);
        getChildren().add(stackPane2);
        stackPane3.getChildren().add(circle2);
        stackPane3.getChildren().add(circle3);
        getChildren().add(stackPane3);
        stackPane4.getChildren().add(circle4);
        stackPane4.getChildren().add(circle5);
        getChildren().add(stackPane4);

    }
     public Pane getRootPane(){
       return this; 
        
    }
     
 
}
