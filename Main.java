class Main {

  int v1;
  int v2;
  int v3;

  Main(int v1, int v2, int v3){
    this.v1=v1;
    this.v2=v2;
    this.v3=v3;
  }
  
  float media(){
    return (v1+v2+v3) / 3;
  }
  
  public static void main(String[] args) {
    Main main = new Main(70,80,75);

    System.out.println(main.media());
  }
}