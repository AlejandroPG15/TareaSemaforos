import java.util.Random;
public class Luchador extends Thread {

    Cuadrilatero c;

    public Luchador(Cuadrilatero cuadri) {
        this.c = cuadri;
    }

    @Override
    public void run() {
        c.pelearse(this);
    }
}
