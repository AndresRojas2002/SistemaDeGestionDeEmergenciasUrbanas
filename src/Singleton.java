public class Singleton {

    private static Singleton instancia;

    private Singleton() {
    }

    public static Singleton getIntancia() {
        if (instancia == null) {
            instancia = new Singleton();

        }
        return instancia;

    }
}
