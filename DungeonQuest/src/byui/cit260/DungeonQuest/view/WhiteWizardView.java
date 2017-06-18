///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.DungeonQuest.view;
//
//import byui.cit260.DungeonQuest.control.GameControl;
//import byui.cit260.DungeonQuest.model.Player;
//import java.util.Scanner;
//
///**
// *
// * @author parrdyl
// */
//public class WhiteWizardView {
//   
//    private String promptMessage;
//            
//    public WhiteWizardView() {
//        
//        this.promptMessage = "\n WHITE WIZARD";
//        this.displayWizardIntro();
//        
//    }
//    private void displayWizardIntro() {
//       
//        System.out.println(
//                "\n*******************************************"
//                +"\nI am Usidore, Wizard of the 12th Realm of" 
//                +"\nEphysiyies, Master of Light and Shadow," 
//                +"\nManipulator of Magical Delights and Devourer"
//                +"\nof Chaos, and Champion of the Great Halls of"
//                +"\nTerr'akkas. The elves know me as Fi’ang Yalok."
//                + "\nThe dwarves know me as Zoenen Hoogstandjes, and"
//                + "\nI am also known in the Northeast as Gaismunēnas"
//                + "\nMeistar. There may be other secret names you do"
//                + "\nnot know yet!"
//                +""
//                +"\nToday I will aid your quest by giving you the great" 
//                + "\narmor of Ephysiyies if you are smart enough to solve"
//                + "\nmy riddle. The riddle is: what 3 positive numbers"
//                + "\ngive the same result when multiplied and added together?"
//                + "\n--------------------------------"
//        );
//     }
//    public void wizardView() {
//        
//        boolean done = false;
// 
//        do {
//            String WizardOption = this.getWizardOption();
//            if (WizardOption.toUpperCase().equals("Q")) 
//                return; 
//            // done = this.doAction(WizardOption);
//            done = this.doAction();
//        } while (!done);
//    }
//
//    private String getWizardOption() {
//        Scanner keyboard = new Scanner(System.in);
//        String value = "";
//        boolean valid = false;
//        
//        while(!valid){
//            System.out.println("\n" + this.promptMessage);
//            
//            value = keyboard.nextLine();
//            value = value.trim();
// 
//            if (value.length() < 1) { 
//                System.out.println("\nInvalid value: value cannot be blank");
//                continue;
//            }
//            break;
//        }
//        return value;    
//    }
//    
//        private double doAction() {
//        
//        Scanner keyboard = new Scanner(System.in);
//            System.out.println("Enter your choice of numbers: ");
//            Double var1 = keyboard.nextDouble();
//            Double var2 = keyboard.nextDouble();
//            Double var3 = keyboard.nextDouble();
// 
//            if ((wizardQuestion(var1, var2, var3))<> 1){
//                    System.out.println("Incorrect!");
//                    return 0;
//            }
//            
//            else if ((wizardQuestion(var1, var2, var3)) = 1){
//                    System.out.println("Correct!");
//                        return 1;           
//            }
//            else 
//                System.out.println("Invalid entry!");
//                return 0;
//        }
//
//    private int wizardQuestion(Double var1, double var2, double var3) {
//        System.out.println("*** wizardQuestion function called ***");
//     return 0;   
//    }
//
//    private boolean doAction(Double wizardQuestion) {
//        System.out.println("*** doAction function called ***");
//    }
//      
//}
    


