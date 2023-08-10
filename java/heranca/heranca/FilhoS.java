package heranca;
import heranca.S;

public class FilhoS extends S{

  int y;

  public void d() {
    System.out.println(
      "Este é o método d da classe" + this.getClass().getName()
    );
  }

  public void e() {
    System.out.println(
      "Este é o método d da classe" + this.getClass().getName()
    );
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int  getX(){
    return this.x +12;
  }
}
