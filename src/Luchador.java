import java.util.Random;
public class Luchador extends Thread {

    Cuadrilatero cuadri;

    public Luchador(Cuadrilatero cuadri) { this.cuadri = cuadri;}
    @Override
    public void run() {
        try {
            cuadri.AddParticipante(this);
            System.out.println("El luchador " + getName() + " entra al ring.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Luchando");
        cuadri.seleccionGanador(this);
        System.out.println("El ganador es " + luchador);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
