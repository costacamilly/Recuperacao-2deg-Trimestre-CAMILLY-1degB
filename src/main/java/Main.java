import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
    System.out.println("Digite seu nome:");
    String nome = sc.next();
    System.out.println("Digite seu sobrenome:");
    String sobrenome = sc.next();
    System.out.print("Digite sua idade:");
    int idade = sc.nextInt();
    System.out.print("Digite sua altura:");
    Double altura = sc.nextDouble(); 
    System.out.println("Digite seu sexo:");
    String sexo = sc.next();

    System.out.println("Olá, " + nome + " " + sobrenome + " fizemos uma breve analise das informações passadas e temos as seguintes informações a repassar:");
    








    sc.close();
  }

}
