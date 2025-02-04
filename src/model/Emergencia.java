package model;

import utils.TipoEmergencia;
import utils.TipoNivelGravedad;
import utils.TipoUbicacion;

public abstract class Emergencia {

    TipoEmergencia tipo;
    private TipoUbicacion ubicacion;
    private TipoNivelGravedad nivelGravedad;
    private int tiempoRespuesta;
    private boolean atendida;
    private long tiempoInicioAtencion;
    private long tiempoFinalAtencion;

    public Emergencia(TipoEmergencia tipo, TipoUbicacion ubicacion, TipoNivelGravedad nivelGravedad, int tiempoRespuesta) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
        this.atendida = false;
    }

    public TipoEmergencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmergencia tipo) {
        this.tipo = tipo;
    }

    public TipoUbicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(TipoUbicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public TipoNivelGravedad getNivelGravedad() {
        return nivelGravedad;
    }

    public void setNivelGravedad(TipoNivelGravedad nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }

    public long getTiempoInicioAtencion() {
        return tiempoInicioAtencion;
    }

    public void setTiempoInicioAtencion(long tiempoInicioAtencion) {
        this.tiempoInicioAtencion = tiempoInicioAtencion;
    }

    public long getTiempoFinalAtencion() {
        return tiempoFinalAtencion;
    }

    public void setTiempoFinalAtencion(long tiempoFinalAtencion) {
        this.tiempoFinalAtencion = tiempoFinalAtencion;
    }

    public void iniciarAtencion() {
        this.tiempoInicioAtencion = System.currentTimeMillis();
    }

    public void finalizarAtencion() {
        this.atendida = true;
        this.tiempoFinalAtencion = System.currentTimeMillis();

    }

    public long calcularTiempoAtencion() {
        return (tiempoFinalAtencion - tiempoInicioAtencion);
    }

    public String getDescripcion() {
        return String.format("%s en %s (gravedad: %s)", tipo, ubicacion, nivelGravedad);
    }

    public String toString() {
        return getDescripcion() + " Tiempo estimado: " + tiempoRespuesta + " minutos";
    }

}
