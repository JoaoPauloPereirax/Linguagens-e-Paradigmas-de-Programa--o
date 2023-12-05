
//Bibliotecas
import java.util.LinkedList;
import java.util.Queue;

//Sistema FIFO "First in first out"
public class Fila {
       public static void main(String[] args) {
              Queue<String> fila = new LinkedList<>();
              fila.add("Pessoa 1");
              System.out.println("A fila possui "+fila.size()+" pessoas.");
              fila.add("Pessoa 2");
              System.out.println("A fila possui "+fila.size()+" pessoas.");
              fila.add("Pessoa 3");
              System.out.println("A fila possui "+fila.size()+" pessoas.");
              System.out.println(fila);
              fila.poll();
              System.out.println("Uma pessoa foi atendida!");
              System.out.println("A fila possui "+fila.size()+" pessoas.");
              System.out.println(fila);
       }
}
