package Midterms_Activities;
/*
 Program: Quiz (Random) - Batch 01 & Batch 02 - By Lester
 Note: Question And Answer
 Syntaxs: Scanner, ArrayList, Random, Collections,
*/
import java.util.*;
public class Activity01_Quiz_Lester1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create Random Value
        Random rd = new Random();
        int randomseed = rd.nextInt();
        System.out.println("Random Value: " + randomseed);
        System.out.println();

        // Question List
        List <String> questionList = new ArrayList <String>();
        questionList.add("Question(01): ");
        questionList.add("Question(02): ");
        questionList.add("Question(03): ");
        questionList.add("Question(04): ");
        questionList.add("Question(05): ");

         // Answer List // Note: store ABC answer in Question not the Whole Answer
         // [TAGS] Answer List - Original (A,B,C Only)
        List <String> answerList = new ArrayList <String>();
        answerList.add("Apple1");
        answerList.add("Ball2");
        answerList.add("Cat3");
        answerList.add("Apple4");
        answerList.add("Ball5");

        // ChoicesA List
        List <String> choicesA = new ArrayList <String>();
        choicesA.add("Apple1");
        choicesA.add("Apple2");
        choicesA.add("Apple3");
        choicesA.add("Apple4");
        choicesA.add("Apple5");

        // ChoicesB List
        List <String> choicesB = new ArrayList <String>();
        choicesB.add("Ball1");
        choicesB.add("Ball2");
        choicesB.add("Ball3");
        choicesB.add("Ball4");
        choicesB.add("Ball5");

        // ChoicesC List
        List <String> choicesC = new ArrayList <String>();
        choicesC.add("Cat1");
        choicesC.add("Cat2");
        choicesC.add("Cat3");
        choicesC.add("Cat4");
        choicesC.add("Cat5");

        // Shuffle All List using SAME Randomness
        Collections.shuffle(questionList, new Random(randomseed));
        Collections.shuffle(answerList, new Random(randomseed));
        Collections.shuffle(choicesA, new Random(randomseed));
        Collections.shuffle(choicesB, new Random(randomseed));
        Collections.shuffle(choicesC, new Random(randomseed));

        // Quiz Header
        System.out.println("Quiz - 01");
        System.out.println("Instruction answer in A,B,C Only \n");

        // Quiz Printout, Inputing Answer(A,B,C Only), Checking Answer
        // [TAGS] Answer Input - Original
        int score = 0;
        for(int x = 0; x < questionList.size(); x++){
            // Print Quiz that already been shuffle
            System.out.println(questionList.get(x));
            System.out.println(choicesA.get(x));
            System.out.println(choicesB.get(x));
            System.out.println(choicesC.get(x));

            // Input answer (A,B,C Only)
            System.out.println("Input Answer: ");
            String input = scan.nextLine();

            // Checking if your input(String) match value in answerList(List) 
            if (input.equalsIgnoreCase(answerList.get(x))){
                System.out.println("Correct Answer");
                System.out.println();
                score++; // Increment 1 every Question you Answered Correctly
            }
            else{
                System.out.println("Incorrect Answer");
                System.out.println();
            }
        }
        // After Quiz show Score
        System.out.println("Score: " + score);
    }
}
/* Answer Input - 02
// If AnsweList is not on A,B,C basis
// If AnswerList defends on whole ChoicesA,B,C Value

         // [TAGS] Answer List - 02 (Whole Choices Value)
        List <String> answerList = new ArrayList <String>();
        answerList.add("Apple1");
        answerList.add("Ball2");
        answerList.add("Cat3");
        answerList.add("Apple4");
        answerList.add("Ball5");

        // [TAGS] Answer Input - 02
        int score = 0;
        for(int x = 0; x < questionList.size(); x++){
            // Print Quiz that already been shuffle
            System.out.println(questionList.get(x));
            System.out.println("A: " + choicesA.get(x));
            System.out.println("B: " + choicesB.get(x));
            System.out.println("C: " + choicesC.get(x));

            // Input answer (A,B,C Only)
            System.out.println("Input Answer: ");
            String input = scan.nextLine();

            String answer = "";
            if (input.equalsIgnoreCase("A")){
                answer = choicesA.get(x);
            }
            if (input.equalsIgnoreCase("B")){
                answer = choicesB.get(x);
            }
            if (input.equalsIgnoreCase("C")){
                answer = choicesC.get(x);
            }

            // Checking if your input(String) match value in answerList(List) 
            if (answer.equalsIgnoreCase(answerList.get(x))){
                System.out.println("Correct Answer");
                System.out.println();
                score++; // Increment 1 every Question you Answered Correctly
            }
            else{
                System.out.println("Incorrect Answer");
                System.out.println();
            }
        }
 */

 /* Answer Input - Original   
 
        // [TAGS] Answer List - Original (A,B,C Only)
        List <String> answerList = new ArrayList <String>();
        answerList.add("A");
        answerList.add("A");
        answerList.add("A");
        answerList.add("A");
        answerList.add("A");

        // [TAGS] Answer Input - Original
        int score = 0;
        for(int x = 0; x < questionList.size(); x++){
            // Print Quiz that already been shuffle
            System.out.println(questionList.get(x));
            System.out.println("A: " + choicesA.get(x));
            System.out.println("B: " + choicesB.get(x));
            System.out.println("C: " + choicesC.get(x));

            // Input answer (A,B,C Only)
            System.out.println("Input Answer: ");
            String input = scan.nextLine();

            // Checking if your input(String) match value in answerList(List) 
            if (input.equalsIgnoreCase(answerList.get(x))){
                System.out.println("Correct Answer");
                System.out.println();
                score++; // Increment 1 every Question you Answered Correctly
            }
            else{
                System.out.println("Incorrect Answer");
                System.out.println();
            }
        }
 */
