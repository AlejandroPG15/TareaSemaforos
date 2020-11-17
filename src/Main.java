
// Vamos a simular un juego de luchadores estilo rey de la pista. El que gana sigue compitiendo hasta que no quede nadie.
// Tendremos una clase cuadrilatero donde se realizarán las peleas entre 2 luchadores (otra clase)
// Mediante un semaforo nos aseguraremos de que no haya mas de dos participantes al mismo tiempo
// La forma de elegir ganador puede ser como tu quieras, yo he puesto un booleano aleatorio.
// Cuando empieza el combate, todos los luchadores están intentando subir al cuadrilaterio a la vez.
// Cuando un luchador ha sido derrotado entra el siguiente

public class Main {
    public static void main(String[] args) {
        Cuadrilatero c = new Cuadrilatero();
        for (int i = 0; i < 10; i++){
            Luchador luchador = new Luchador(c);
            luchador.setName("Luchador " + i);
            luchador.start();
        }
    }
}
