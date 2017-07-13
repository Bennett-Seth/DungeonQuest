///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.DungeonQuest.control;
//
//import byui.cit260.DungeonQuest.control.QuestionControl;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Seth
// */
//public class QuestionControlTest {
//    
//    public QuestionControlTest() {
//    }
//
//    @Test
//    public void testWizardQuestion() {
//        System.out.println("wizardQuestion");
//        
//        /*
//         * Test case #1
//         */
//        
//        System.out.println("\tTest case #2");
//        
//        // input the variables
//        double var1 = 1;
//        double var2 = 2;
//        double var3 = 3;
//        
//        // expected result
//        double expectedResult = 1;
//        
//        // create instance of the QuestionControl class
//        QuestionControl instance = new QuestionControl();
//        
//        // call function to run test
//        double result = instance.wizardQuestion(var1, var2, var3);
//        
//        // compare the result with our expected result
//        assertEquals(expectedResult, result, 0.01);
//        // TODO review the generated test code and remove the default call to fail.
//        // fail("The test case is a prototype.");
//         // input the variables
//         
//         /*
//         * Test case #2
//         */
//        
//        System.out.println("\tTest case #2");
//        var1 = -1;
//        var2 = -1;
//        var3 = -1;
//        
//        // expected result
//        expectedResult = -1;        
//        result = instance.wizardQuestion(var1, var2, var3);       
//        assertEquals(expectedResult, result, 0.01);
//        
//        /*
//         * Test case #3
//         */
//        
//        System.out.println("\tTest case #3");
//        var1 = 0;
//        var2 = 0;
//        var3 = 0;
//        
//        // expected result
//        expectedResult = 0;        
//        result = instance.wizardQuestion(var1, var2, var3);       
//        assertEquals(expectedResult, result, 0.01);
//        
//        /*
//         * Test case #4
//         */
//        
//        System.out.println("\tTest case #4");
//        var1 = 100;
//        var2 = 100;
//        var3 = 100;
//        
//        // expected result
//        expectedResult = -3.0E-4;        
//        result = instance.wizardQuestion(var1, var2, var3);       
//        assertEquals(expectedResult, result, 0.01);
//    }
//
//    /**
//     * Test of fairyQuestion method, of class QuestionControl.
//     */
//    @Test
//    public void testFairyQuestion() {
//        System.out.println("fairyQuestion");
//        
//        /*
//         * Test case #1
//         */
//        System.out.println("\tTest case #1");
//        int exploredRooms = 6;
//        QuestionControl instance = new QuestionControl();
//        double expResult = 0.55;
////        double result = instance.fairyQuestion(exploredRooms);
////        assertEquals(expResult, result, 0.01);
////        
////         /*
////         * Test case #2
////         */
////        System.out.println("\tTest case #2");
////        exploredRooms = -1;
////        expResult = -1;
////        result = instance.fairyQuestion(exploredRooms);
////        assertEquals(expResult, result, 0.01);
////
////           /*
////         * Test case #3
////         */
////        System.out.println("\tTest case #3");
////        exploredRooms = 0;
////        expResult = 0;
////        result = instance.fairyQuestion(exploredRooms);
////        assertEquals(expResult, result, 0.01);
////        
////           /*
////         * Test case #4
////         */
////        System.out.println("\tTest case #4");
////        exploredRooms = 1;
////        expResult = .1;
////        result = instance.fairyQuestion(exploredRooms);
////        assertEquals(expResult, result, 0.01);
////        
////           /*
////         * Test case #5
////         */
////        System.out.println("\tTest case #5");
////        exploredRooms = 11;
////        expResult = 1;
////        result = instance.fairyQuestion(exploredRooms);
////        assertEquals(expResult, result, 0.01);
//    }
//
//    /**
//     * Test of calcTrap method, of class QuestionControl.
//     */
//    @Test
//    public void testCalcTrap() {
//        System.out.println("calcTrap");
//         /*
//         * Test case #1
//         */
//        System.out.println("\tTest case #1");
//        double radius = 10;
//        QuestionControl instance = new QuestionControl();
//        double expResult = 62.8;
//        double result = instance.calcTrap(radius);
//        assertEquals(expResult, result, 0.01);
//        
//         /*
//         * Test case #2
//         */
//        System.out.println("\tTest case #2");
//        radius = -1;
//        expResult = -1;
//        result = instance.calcTrap(radius);
//        assertEquals(expResult, result, 0.01);
//        
//        /*
//         * Test case #3
//         */
//        System.out.println("\tTest case #3");
//        radius = 0;
//        expResult = -1;
//        result = instance.calcTrap(radius);
//        assertEquals(expResult, result, 0.01);
//        
//        /*
//         * Test case #4
//         */
//        System.out.println("\tTest case #4");
//        radius = 1;
//        expResult = -1;
//        result = instance.calcTrap(radius);
//        assertEquals(expResult, result, 0.01);
//        
//        /*
//         * Test case #5
//         */
//        System.out.println("\tTest case #5");
//        radius = 100;
//        expResult = -1;
//        result = instance.calcTrap(radius);
//        assertEquals(expResult, result, 0.01);       
//    }
//}

