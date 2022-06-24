public class Proprietario{
  
  private String cpf;
  private String nome;

  Proprietario(){
    cpf = "";
    nome = "";
  }


  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getCpf(String cpf){
    return(cpf);
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return(nome);
  }
  
}
