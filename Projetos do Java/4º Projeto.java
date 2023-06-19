import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Define as perguntas e respostas do quiz
    String question1 = "Qual é a capital da França?\n" 
      + "a) Paris\nb) Berlim\nc) Londres";
    String question2 = "Quem pintou a Mona Lisa?\n"
      + "a) Vincent van Gogh\nb) Leonardo da Vinci\nc) Pablo Picasso";
    String question3 = "Qual é o maior planeta do sistema solar?\n"
      + "a) Terra\nb) Saturno\nc) Júpiter";

    String[] questions = {question1, question2, question3};
    String[] answers = {"a", "b", "c"};

    int score = 0;

    // Faz loop pelas perguntas e verifica as respostas
    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);
      String answer = scanner.nextLine();
      if (answer.equals(answers[i])) {
        System.out.println("Correto!");
        score++;
      } else {
        System.out.println("Incorreto.");
      }
    }

    // Exibe a pontuação final
    System.out.println("Sua pontuação final é " + score + "/" + questions.length);
  }
}
