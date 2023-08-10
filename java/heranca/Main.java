import heranca.S;
import heranca.FilhoS;

public class Main{
    
    public static void main(String[]args){
        S minhaInstanciaS = new S();
        minhaInstanciaS.a();
        minhaInstanciaS.b();
        minhaInstanciaS.c();
        minhaInstanciaS.setX(10);
        System.out.println("O valor de X é:"+ minhaInstanciaS.getX());
        FilhoS minhaInstanciaFilhoS = new FilhoS();
        minhaInstanciaFilhoS.a();
        minhaInstanciaFilhoS.b();
        minhaInstanciaFilhoS.c();
        minhaInstanciaFilhoS.d();
        minhaInstanciaFilhoS.e();
    }
}