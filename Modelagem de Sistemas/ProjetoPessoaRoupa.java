class Main {
  public static void main(String[] args) {
    System.out.println("Tudo certinho!");
  }
}

public class Pessoa{
  private String nome;
  private int idade;
  private Roupa roupa;

  public Pessoa(String n, int i){
    nome = n;
    idade = i;
  }
  
  public void  andar(int i){
    
  }

  public String get_nome(){
    return nome;
  }
}

public class Roupa{
  private String tamanho;
  private String cor;
  private String material;

  public Roupa(String t, String c, String m){
    tamanho = t;
    cor = c;
    material = m;
  }
  
  public boolean ajustar(String t){
    return true;
  }
  
  public void vestir(){
    
  }
}

/*Me ajudou bastante no processo de conversão do diagrama para java*/
