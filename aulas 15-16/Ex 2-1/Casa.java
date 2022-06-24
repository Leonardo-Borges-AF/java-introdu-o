public class Casa{

  private String matricula;
  private String end;
  private String valor;
  private Proprietario proprietario;

  Casa(){
    matricula = "";
    end = "";
    valor = "";
    proprietario = new Proprietario();
  }

  public void setMatricula(String m){
    matricula = m;
  }
  public String getMatricula(){
    return (matricula);
  }

  public void setEnd(String endereco){
    end = endereco;
  }
  public String getEnd(){
    return (end);
  }

  public void setValor(String v){
    valor = v;
  }
  public String getValor(){
    return (valor);
  }

  public void setProprietario(Proprietario proprietario){
    this.proprietario = proprietario;
  }
  public Proprietario getProprietario(){
    return(proprietario);
  }
}
