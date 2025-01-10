public class RecursosSingleton {

    private static RecursosSingleton instancia;

    private RecursosSingleton() {
    }

    public static RecursosSingleton getIntancia() {
        if (instancia == null) {
            instancia = new RecursosSingleton();

        }
        return instancia;

    }
}
