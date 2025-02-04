package model.strategy;

import model.Emergencia;
import utils.TipoUbicacion;

public class PrioridadCercaniaStrategy implements PrioridadStrategy {

    private class MapaUrbano {

        public int distancia(TipoUbicacion ubicacion) {
            switch (ubicacion) {
                case CENTRO:
                    return 2;

                case SUR:
                    return 10;

                case NORTE:
                    return 8;

                case ORIENTE:
                    return 5;

                case OCCIDENTE:
                    return 6;

                default:
                    return 10;
            }
        }
    }

    private MapaUrbano mapaUrbano = new MapaUrbano();

    @Override
    public int calcularPrioridad(Emergencia emergencia) {
        int distancia = mapaUrbano.distancia(emergencia.getUbicacion());
        return 10 - distancia;
    }
}
