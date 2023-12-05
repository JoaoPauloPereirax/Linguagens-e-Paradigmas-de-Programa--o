package JavaTiposDeDados;
public class Main {
       //Criação da Classe ou Struct do C
       public static class Carro {
              String modelo;
              int ano;
              double valor;
       
       }

       //Principal
       public static void main(String[] args) {
              Carro c1 = new Carro();
              c1.modelo = "Fusca";
              c1.ano = 1980;
              c1.valor = 10000.0;
              System.out.println("Dados do seu carro:");
              System.out.println(c1.modelo);
              System.out.println(c1.ano);
              System.out.println(c1.valor);              
       }
}