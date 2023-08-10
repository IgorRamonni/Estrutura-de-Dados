package heranca;


public class S{
    int x;

    public void a(){
        System.out.println("Este é o método a da classe" + this.getClass().getName() );
    }

    public void b(){
        System.out.println("Este é o método b da classe" + this.getClass().getName() );
    }

    public void c(){
        System.out.println("Este é o método c da classe" + this.getClass().getName() );
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX(){
        return this.x;
    }
}