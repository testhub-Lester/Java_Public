package Midterms_Activities;
/*
 Program: Quiz(Random) With Timer - Batch01
 Note: Question And Answer
 Syntaxs: Scanner, ArrayList, Methods, Timer, TimerTask,
*/
import java.util.*;
public class Activity02_QuizTimer_Lester {
    
    static int clock = 0;
    static String answer = "";
    static int score = 0;
    
    Timer time;
    TimerTask task;

    static ArrayList<String> qList = new ArrayList<>();
    static ArrayList<String> aList = new ArrayList<>();
    static ArrayList<String> choicesA = new ArrayList<>();
    static ArrayList<String> choicesB = new ArrayList<>();
    static ArrayList<String> choicesC = new ArrayList<>();
    static ArrayList<Integer> index = new ArrayList<>();

    public void timerM(){
        
        time = new Timer();
        task = new TimerTask() {
            public void run() {
                clock++;
                
                if (clock == 1){
                    QandA();
                }

                checking();

                if (index.size() == 0){
                    time.cancel();
                    task.cancel();
                    System.out.println("\n Score: "+ score);
                }
            }
        };time.schedule(task, 1, 300);
        input();
        }

    public static void main(String[] args) {
        QuizListAdd();
        Activity02_QuizTimer_Lester Ttask = new Activity02_QuizTimer_Lester();
        Ttask.timerM();
    }
    
    public static void QuizListAdd(){
        qList.add("Question (1)");
        qList.add("Question (2)");
        qList.add("Question (3)");
        qList.add("Question (4)");
        
        aList.add("B");
        aList.add("B");
        aList.add("B");
        aList.add("B");
        
        choicesA.add("A: (1)");
        choicesA.add("A: (2)");
        choicesA.add("A: (3)");
        choicesA.add("A: (4)");
        
        choicesB.add("B: (1)");
        choicesB.add("B: (2)");
        choicesB.add("B: (3)");
        choicesB.add("B: (4)");

        choicesC.add("C: (1)");
        choicesC.add("C: (2)");
        choicesC.add("C: (3)");
        choicesC.add("C: (4)");
        
        for (int x = 0; x < qList.size(); x++){
            index.add(x);
        }
        Collections.shuffle(index);
    }
    
    public static void QandA(){
        int pos = index.get(0);
        System.out.println(qList.get(pos));
        System.out.println(choicesA.get(pos));
        System.out.println(choicesB.get(pos));
        System.out.println(choicesC.get(pos));
        System.out.print("\n Input Answer: ");
    }
    
    public static void input(){
        Scanner scan = new Scanner(System.in);
        for (int x = 1; x !=0 ; x++){
            answer = scan.nextLine();
        }
    }
    
    public static void checking(){
        int pos = index.get(0);
        
        if (answer.equals("")){

        }
        else if (answer.toUpperCase().equals(aList.get(pos))){
            answer = "";
            remove();
            clock = 0;
            System.out.print("  (Correct) \n");
            System.out.println();
            score++;
        }
        else{
            answer = "";
            remove();
            clock = 0;
            System.out.print("  (Wrong) \n");
            System.out.println();
        }
        if (answer.equals("")&&clock == 50){
            answer = "";
            remove();
            clock = 0;
            System.out.println("[No Input - SKIPPED]");
            System.out.println();
        }
    }

    public static void remove(){
        index.remove(0);
    }
}