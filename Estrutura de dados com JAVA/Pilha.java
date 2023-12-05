//Bibliotecas
import java.util.Stack;//Exclusiva para trabalhar com pilhas
//Sistema LIFO 
public class Pilha {
       public static void main(String[] args) {
              Stack<String> livros = new Stack<String>();
              System.out.println("Colocando livros na pilha...");
              livros.push("Livro 1");
              livros.push("Livro 2");
              livros.push("Livro 3");
              System.out.println("Livros na pilha: "+livros);
              System.out.println("Retirando livros na pilha...");
              livros.pop();
              System.out.println("Colocando livro na pilha...");
              livros.push("Livro 4");
              System.out.println("Livros na pilha: "+livros);
       }
}