import java.util.concurrent.Semaphore;
import java.util.Random;

public class Cuadrilatero {

    private static final int MAX_AVAILABLE = 2;


    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);

    public void AddParticipante(Luchador luchador) throws InterruptedException {
        available.acquire();
    }

    public void seleccionGanador(Luchador luchador) {
        boolean per = new Random().nextBoolean();
        String luch_gan;

        if(per = true) {
            luch_gan = luchador;
        }

        available.release();
    }

}
