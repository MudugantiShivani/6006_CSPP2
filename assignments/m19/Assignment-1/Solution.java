import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
    static Quiz[] quizquestions = new Quiz[20];
    static int[] element = new int[20];
    static String[] choices = {"choice 1", "choice 2", "choice 3", "choice 4"};
    static int size = 0;
    /**
    * Constructs the object.
    */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this Quiz
        Quiz q = new Quiz();
        // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
            case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
            case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
            default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        if (questionCount == 0) {
            System.out.println("Quiz does not have questions");
        } else {
            System.out.println(questionCount + " are added to the quiz");
            for (int i = 0; i < questionCount; i++) {
                String str = s.nextLine();
                String[] words = str.split(":");
                String[] choice = words[1].split(",");
                if (words.length != 5) {
                    System.out.println("Error! Malformed question");
                } else {
                    quizquestions[size] = new Quiz(words[0], Integer.parseInt(words[2]), Integer.parseInt(words[3]), Integer.parseInt(words[4]));
                    size += 1;
                }
            }
        }
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        if (size > 0) {
            for (int i = 0; i < answerCount; i++) {
                String string = s.nextLine();
                String[] token = string.split(" ");
                element[i] = Integer.parseInt(token[1]);
                System.out.println(quizquestions[i].getQuestion() + "(" + quizquestions[i].getMarks() + ")");
                System.out.println(choices[0] + "\t" + choices[1] + "\t" + choices[2] + "\t" + choices[3]);
                System.out.println();
            }
        }
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        int finalscore = 0;
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                System.out.println(quizquestions[i].getQuestion());
                if (element[i] == quizquestions[i].getCorrect()) {
                    finalscore += quizquestions[i].getMarks();
                    System.out.println(" Correct Answer! - Marks Awarded: " + quizquestions[i].getMarks());
                } else {
                    //finalscore += quizquestions[i].getPenalty();
                    System.out.println(" Wrong Answer! - Penalty: " + quizquestions[i].getPenalty());
                }
            }
            System.out.print("Total Score: " + finalscore);
        }
    }
}
class Quiz {
    String question;
    String choices;
    int correct;
    int marks;
    int penalty;
    Quiz() {

    }
    Quiz(String question, int correct, int marks, int penalty) {
        this.question = question;
        this.correct = correct;
        this.marks = marks;
        this.penalty = penalty;
    }
    public String getQuestion() {
        return this.question;
    }
    public int getCorrect() {
        return this.correct;
    }
    public int getMarks() {
        return this.marks;
    }
    public int getPenalty() {
        return this.penalty;
    }
}