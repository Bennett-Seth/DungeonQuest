/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package byui.cit260.DungeonQuest.view;
//
//import byui.cit260.DungeonQuest.model.Actor;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;

/**
 *
 * @author ZiksMS_Sophia
 */
//public class ActorsListView extends View{
//    public ActorsListView(){
//        super("\n"
//                + "\n----------------------------------------------------- "
//                + "\n To see the List of actors's descriptions and strenght "
//                + "\n press the S key on your keyboard.             "
//    
//        );
//    }
//    @Override
//    public boolean doAction(String value){
//        value = value.toUpperCase();
//            switch (value){
//                case "S"://show actors'description and strenght
//                this.displayShowList();
//                break; 
//                default:
//                System.out.println("\n*** Invalid selection *** Try again");
//                break;
//        }
//        return false;
//        }
//    public void displayShowList() {
//        ActorsListView showView = new ActorsListView();
//        showView.display();
//}
//       public class saveActorsListTryWithResources()static {
//       String actorName = "actors.txt"; //specify the file location of the file
//       try{FileWriter outFile = new FileWriter(actorName);
//           //write each name to the file plus a new line character
//           outFile.write("Fairie\n");
//           outFile.write("Vanpire\n");
//           outFile.write("Zombie\n");
//           outFile.write("Blue Wizard\n");
//           outFile.write("Globin\n");
//           outFile.flush();//flush out any data left in the file stream  
//        }catch (IOException ex){
//           System.out.println("Error saving Actors names to file");
//        }
//       
//       String actorDescription = "description.txt";
//       try{FileWriter outFile = new FileWriter(actorDescription);
//            outFile.write("bright\n");
//            outFile.write("Dark\n");
//            outFile.write("Ugly Guy\n");
//            outFile.write("Old\n");
//            outFile.write("Nasty\n");
//            outFile.flush();
//       }catch (IOException ex){
//           System.out.println("Error saving Actors Description");
//       }
//       
//       String actorStrenght = "strength.txt";
//       try{FileWriter outFile = new FileWriter(actorStrenght);
//            outFile.write("50.0");
//            outFile.write("50.0");
//            outFile.write("25.0");
//            outFile.write("100.0");
//            outFile.write("25.0");
//       }catch (IOException ex){
//           System.out.println("Error saving Actors Strength");
//       }
//    }    
//       
//    public void copyTextFile(String inputLocation,
//                             String outputLocation){
//           
//       //create BufferedReader object for inpute file
//        try(BufferedReader in = 
//            new BufferedReader(new FileReader(inputLocation));
//            BufferedWriter out =
//            new BufferedWriter(new FileWriter(outputLocation))
//            ){
//            String text;
//        while ((text = in.readLine()) != null){ //while not end of file
//                    out.write(text);
//            }
//                
//            }   catch (IOException ex) {
//                   System.out.println("I/O Error: " + ex.getMessage());
//               }
//           }
//         
//    public void PrintActorsListLocationReport(ArrayList<Actor> actorsLocation,
//                                        String outputLocation) {
//        //create BufferedReader object for input file
//        try (PrintWriter out = new PrintWriter(outputLocation)) {
//            //print title and column headings
//            out.println("\n\n          Actors Location                      ");
//            out.printf("%n%-20s%10s%10s", "Actors", "Description", "Strength");
//            out.printf("%n%-20s%10s%10s", "------", "-----------", "--------");
//            
//            //print the description and strenght of each item
//            for (Actor actors : actorsLocation) {
//                out.printf("%n%-20s%10s%13.2f"    , actors.getName()
//                                                  , actors.getDescription()
//                                                  , actors.getStrength());
//            }  
//        }   catch (IOException ex)  {
//            System.out.println("I/O Error: " + ex.getMessage());
//        }
//    }
//}
//
