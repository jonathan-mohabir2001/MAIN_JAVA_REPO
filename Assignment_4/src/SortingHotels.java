/*
Assignment 04 created by Jonathan M. 

Sorting hotels java file integritated with a 
GUI application. 
Configuration for JavaFx done on local machine. 
*/

import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.File;
import java.io.FileWriter; 
import java.io.IOException; 
// input output classes imported. 

import java.util.Collections; 
import java.util.ArrayList; 
import java.util.Comparator; 
import java.util.List; 
//Collection classs, comparator, and lists classes imported. 


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
// Neccessary javaFx classes all imported above. 

public class SortingHotels extends Application {

       // file object below to read hotels.txt 
        
    static File f = new File("Hotels.txt");
    static ArrayList<Hotels> hotels = new ArrayList<Hotels>();
    // array list of hotels class type set. 
    
    ListView<String>listOfNames = new ListView<String>(); 
    // list view type, to represent list of hotel names. 
   
    // first comparator below will sort the list by their lowest price 

     //Sort the list in the lowest price order
    static Comparator<Hotels> LOWEST_PRICE = new Comparator<Hotels>() {
        public int compare(Hotels hotel1, Hotels hotel2) {
            return hotel1.getPrice().compareTo(hotel2.getPrice());
        }
    };
        public static boolean numericValue(String str) { 
        try {  
          Integer.parseInt(str);
          // parse any integer to string. 
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    } 
    
        public static void main(String[] args) {
        
        System.out.println("Does file exist" + f.exists());
        // the exist method is called to see if the file will read. 
       
        // a try catch statment will run the file reader. 
        
        try(BufferedReader input = new BufferedReader(new FileReader(f))) {
            String line;
            // string line to represent each line of file being read/ 
            while((line = input.readLine()) != null) {
                String[] tokens = line.split(" ");
                // split segments of the txt files. 
                
                for (int i = 0; i < tokens.length; i++) {
                    
                    if (numericValue(tokens[i])) {
                        String hotelName = "";
                        for (int j = 0; j < i; j++) {
                            hotelName += tokens[j] + " ";
                        }
                        hotels.add(new Hotels(hotelName, Integer.parseInt(tokens[i]), Double.parseDouble(tokens[i+2])));
                       // this line will add each hotel object to the array list which was named hotels. 
                        break;
                    }
                    else {
                        continue;
                    }
                }
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        //Launch the application
        launch();
    }

       public void listView() {
        ArrayList<String> nameField = new ArrayList<>();
        for (Hotels x : hotels) {
            nameField.add(x.getName());
        }
        //Add the array list to the list view
        listOfNames.getItems().setAll(nameField);
    }
    
    
     public void start(Stage stage) throws Exception {
        stage.setTitle("Hotel Sort Engine");
        listView();
        // the stage calls the title to set hotel sort engine.         
        Text text = new Text("List of Hotels");
        //Button to sort in lowest price ordering
        Button lowestPrice = new Button("Lowest Price");
        //Button to save the list view in the .txt file
        Button saveButton = new Button("Save");
        GridPane grid = new GridPane();
        VBox vBox = new VBox(20,lowestPrice, saveButton);
        vBox.setPadding(new Insets(20));
        grid.add(text, 1, 1);
        grid.add(listOfNames, 1, 2);
        grid.add(vBox, 2, 2);
        Scene scene = new Scene(grid,400,400);

        lowestPrice.setOnAction(e -> { 
            Collections.sort(hotels, LOWEST_PRICE);
            listView();            
        });
        
        saveButton.setOnAction(e -> { 
            File file = new File("newSortedFile.txt");
            // a new file object created to represent the sorted file.
            
            try(FileWriter output = new FileWriter(file, false)) {
                output.write("");
         
                List<String> sortedList = listOfNames.getItems();
                for (String element : sortedList) {
                    output.append(element + "\n");
                }
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
            
        });
        
        stage.setScene(scene);
        stage.show();
        // call the set scene and the show method to run the gui application.
    }
    
    

}
