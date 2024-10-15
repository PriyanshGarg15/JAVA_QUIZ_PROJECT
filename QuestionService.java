import java.util.Scanner;

public class QuestionService {
    Question[] questions= new Question[6];
    String selection[]=new String[6];
    public QuestionService()
    {
        questions[0]=new Question(1,"whats is capital of India","Bihar","Jharkhand","Punjab","Delhi","Delhi");
        questions[1] = new Question(2, "Who is the founder of Microsoft?", "Steve Jobs", "Bill Gates", "Mark Zuckerberg", "Elon Musk", "Bill Gates");
        questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Earth", "Venus", "Mars", "Jupiter", "Mars");
        questions[3] = new Question(4, "What is the largest mammal in the world?", "Elephant", "Blue Whale", "Shark", "Giraffe", "Blue Whale");
        questions[4] = new Question(5, "Which is the smallest continent by land area?", "Asia", "Australia", "Europe", "Africa", "Australia");
        questions[5] = new Question(6, "Which element's chemical symbol is 'O'?", "Oxygen", "Gold", "Iron", "Hydrogen", "Oxygen");

    }
    public void playQuiz()
    {
        int i=0;
        for(Question q:questions)
        {
            System.out.println("Question number: "+q.getId());
            System.out.println("Question is: "+q.getQuetsion());
            System.out.println("Option 1 is: "+q.getOpt1());
            System.out.println("Option 2 is: "+q.getOpt2());
            System.out.println("Option 3 is: "+q.getOpt3());
            System.out.println("Option 4 is: "+q.getOpt4());
            Scanner sc=new Scanner(System.in);
            selection[i++] =sc.nextLine();
        }
        for(String s:selection)
        {
            System.out.println(s);
        }
    }

    public void printScore()
    {
        int score=0;
        for(int i=0;i<questions.length;i++)
        {
            Question que=questions[i];
            if(que.getAnswer().equals(selection[i]))
            {
                score++;
            }
        }
        System.out.println(score);
    }
}
