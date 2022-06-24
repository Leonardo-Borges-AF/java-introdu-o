public class Cartao{
  
  private int unidades;

  public Cartao(){
   unidades = 10;
  }

  public void Coffe(){
    
    if(unidades == 0){
      System.out.println("saldo insuficiente" + "\n" + "saldo atual:"+unidades);
    }
      
    else{
    unidades = unidades - 1;
    System.out.println("voce pegou um cafe" + "\n" + "saldo atual:"+unidades);
    }
  }

  public String getSaldo (){
    return ("Saldo atual:"+unidades);
  }
  
  public void setSaldo (int R){
    unidades = unidades + R;
  }
}
