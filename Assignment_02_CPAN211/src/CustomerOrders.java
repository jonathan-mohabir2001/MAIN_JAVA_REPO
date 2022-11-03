/*
CPAN 211: 
- Jonathan Mohabir 

Assignment 02, customer order application 
created throughg JAVA FX. 
 */

import javafx.application.Application;
// import the application class from the javaFx class.
import javafx.scene.Scene;
import javafx.scene.control.Button;
// scene imported 
import javafx.stage.Stage;
// stage imported.

/*
The neccesary components of JavaFx have been imported below in order 
to produce the nessary results within the 
*/
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

/**
 *
 * @author Jonathan Mohabir
 */
public class CustomerOrders extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label customer_name = new Label("Enter your name:");
        // label created to hold name of customer
        Label phonenumber = new Label("Phone Number");
        // label created to hold Phone number 
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        // two text fields created for the user to enter name and phone number

        Button b = new Button("Save");
        // save button created
        Button b2 = new Button("Terminate");

        GridPane root = new GridPane();
        root.addRow(0, customer_name, tf1);
        root.addRow(1, phonenumber, tf2);
        root.addRow(2, b);
        root.addRow(3, b2);

        Label description_label = new Label("Combo box below");

        // Number of cakes stored into string arrray below. 
        String cakeTypes[] = {"Apple", "Carrot", "Cheesecake", "Chocolate",
            "Coffee", "Opera", "Tiramisu"};
        ComboBox combo_box = new ComboBox (FXCollections.observableArrayList(cakeTypes)); 
        // combo box created and assigned the array collections. 
        root.addRow(4, combo_box);
        // the combo box is added to the row. 
        
        Label l2 = new Label("Here is a radio button"); 
        RadioButton s = new RadioButton("small"); 
        RadioButton m = new RadioButton ("medium"); 
        RadioButton l = new RadioButton("large"); 
        // three radio button objects are created with assigned names. 
        root.addRow(5, s,m, l); 
       
       
        Scene scene = new Scene(root, 800, 200);
        // a scene is created and assigned the root and it's children. 
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Field Example");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
