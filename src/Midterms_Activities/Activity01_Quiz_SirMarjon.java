package Midterms_Activities;
/*
 Program: Quiz (Random) - Batch 01 & Batch 02 - By Sir Marjon
 Note: Question And Answer
 Syntaxs: Scanner, ArrayList,
*/
import java.util.*;
public class Activity01_Quiz_SirMarjon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Question List
        List <String> questionList = new ArrayList <String>();
        questionList.add("Question(01): ");
        questionList.add("Question(02): ");
        questionList.add("Question(03): ");
        questionList.add("Question(04): ");
        questionList.add("Question(05): ");

        // Answer List // Note: store ABC answer in Question not the Whole Answer
        List <String> answerList = new ArrayList <String>();
        answerList.add("A");
        answerList.add("A");
        answerList.add("A");
        answerList.add("A");
        answerList.add("A");

        // ChoicesA List
        List <String> choicesA = new ArrayList <String>();
        choicesA.add("A: A1");
        choicesA.add("A: A2");
        choicesA.add("A: A3");
        choicesA.add("A: A4");
        choicesA.add("A: A5");

        // ChoicesB List
        List <String> choicesB = new ArrayList <String>();
        choicesB.add("B: B1");
        choicesB.add("B: B2");
        choicesB.add("B: B3");
        choicesB.add("B: B4");
        choicesB.add("B: B5");

        // ChoicesC List
        List <String> choicesC = new ArrayList <String>();
        choicesC.add("C: C1");
        choicesC.add("C: C2");
        choicesC.add("C: C3");
        choicesC.add("C: C4");
        choicesC.add("C: C5");

        // Index List - to use in calling List Values
        List <Integer> index = new ArrayList <Integer>();
        // Looping - store values inside index(List) equal to the size of Questions // Explanation Below
        for(int x = 0; x < questionList.size(); x++){
            index.add(x);
        }
        // Shuffle index(List) to shuffle value inside // Explanation Below
        Collections.shuffle(index);

        // Quiz Header
        System.out.println("Quiz - 01");
        System.out.println("Instruction answer in A,B,C Only \n");

        // Quiz Printout, Inputing Answer(A,B,C Only), Checking Answer
        int score = 0;
        for(int x = 0; x < questionList.size(); x++){
            // store index value to int variable
            int var = index.get(x);
            // Print Quiz that already been shuffle
            System.out.println(questionList.get(var));
            System.out.println(choicesA.get(var));
            System.out.println(choicesB.get(var));
            System.out.println(choicesC.get(var));

            // Input answer (A,B,C Only)
            System.out.println("Input Answer: ");
            String input = scan.nextLine();

            // Checking if your input(String) match value in answerList(List) 
            if (input.equalsIgnoreCase(answerList.get(var))){
                System.out.println("Correct Answer");
                System.out.println();
                score++; // Increment 1 every Question you Answered Correctly
            }
            else{
                System.out.println("Incorrect Answer");
            }

        }

        // After Quiz show Score
        System.out.println("Score: " + score);
    }
}
/* Index(List) Explanation
Example:

index(List) value after looping: based on Question Size.
Element:0 Value:1
Element:1 Value:2
Element:2 Value:3
Element:3 Value:4
Element:4 Value:5

index(List) value after Collection Shuffle: (Note: Shuffle is random every time)
Element:0 Value:5
Element:1 Value:1
Element:2 Value:4
Element:3 Value:3
Element:4 Value:2

 */