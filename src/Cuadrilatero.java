import java.util.concurrent.Semaphore;
import java.util.Random;

public class Cuadrilatero {

    private static final int MAX_AVAILABLE = 2;


    private final Semaphore available = new Semaphore(MAX_AVAILABLE, false);

    private Luchador luchadorGan;

    public void pelearse(Luchador luchador) throws InterruptedException {
        try {
            System.out.println("El " + luchador.getName() + " esta que arde.");
            available.acquire();
            System.out.println("El " + luchador.getName() + " entra al ring.");

            Random d = new Random();
            Thread.sleep(d.nextInt(1000));

            if (luchadorGan == null) {
                System.out.println(luchador.getName() + " ha sido el mas rapido.");
                luchadorGan = luchador;
            } else {

                System.out.println(luchador.getName() + " y " + luchadorGan.getName() + " van a comenzar.");
                luchadorGan = seleccionGanador(luchador, luchadorGan);
                System.out.println("El ganador es " + luchadorGan.getName());
                available.release();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void seleccionGanador(Luchador luchador, Luchador luchadorGan) {
        Random r = new Random();

        if (r.nextBoolean()) {
            return luchadorGan;
        } else {
            return luchador;
        }





    }

}
