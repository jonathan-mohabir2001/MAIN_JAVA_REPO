// Lab 05 - Created by Jonathan M 

import java.awt.Color;
import java.awt.Paint;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Jonathan Mohabir
 */
public class LineDrawer extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
      try{
          
          
          
        Pane pane = new Pane(); 
        // pane object created in order to have scene be built. 
        int x1=100, y1 = 100, x2 = 100, y2 = 100; 
        // variables set to assign starting points of line.
        
        Line firstLine = new Line(x1,y1,x2-50,y2); 
        // Line object created.
        firstLine.setStrokeWidth(5.0);
        x2= x2-50; 
        x1=x2; 
        
        //event handling will be created below. 
        // lambda function below, pane is accessed using setOnKeyPressed. 
        pane.setOnKeyPressed(e -> {
            
        });
        
        
        
        
        
        
 
        
        Scene scene = new Scene(pane,400,400);
        // blank scene created. 
        primaryStage.setScene(scene);
        primaryStage.show();
        
        pane.requestFocus();
        
      }catch (Exception e){
         e.printStackTrace();
      }
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
