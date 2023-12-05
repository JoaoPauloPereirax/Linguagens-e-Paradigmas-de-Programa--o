package JavaTiposDeDados;

public class ClassObj {
       public static class Veiculo 
       {
              int ano;
              double valor;
              String modelo;
              String proprietario;
              String placa;
       }

       public static void main(String[] args)
       {
              Veiculo v1 = new Veiculo();//Criação de um objeto do tipo carro
              v1.ano = 1980;
              v1.valor = 21590.0;
              v1.modelo = "Fusca";
              v1.proprietario = "JoaoPaulox";
              v1.placa = "XYZ-4567";
              System.out.println(v1.proprietario+" possui um "+v1.modelo+" "+v1.ano);             
       }
}
