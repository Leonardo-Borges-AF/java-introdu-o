
class Main {
  public static void main(String[] args) {
    
    Casa casa = new Casa();
    Proprietario proprietario = new Proprietario();

    proprietario.setCpf("412.124.532.5");
    proprietario.setNome("Roberto");
    casa.setProprietario(proprietario);
    casa.setMatricula("5142646");
    casa.setEnd("R. joaquim tome leite - 1235");
    casa.setValor("100253");

    System.out.println(casa.getProprietario().getNome());
    
  }
}
