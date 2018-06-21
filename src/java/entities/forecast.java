package entities;

/**
 *
 * @author Moises
 */
public class forecast {
    int mes;
    int dia;
    String periodo; 
    int estado;
    String descripcion;
    int minima;
    int maxima;
    int llovera;
    
    public forecast(){}
    
    public forecast( int mes, int dia, String periodo, 
    int estado, String descripcion, int minima, int maxima, int llovera){
        this.mes=mes;
        this.dia=dia;
        this.periodo=periodo;
        this.estado=estado;
        this.descripcion=descripcion;
        this.minima=minima;
        this.maxima=maxima;
        this.llovera=llovera;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMinima() {
        return minima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public int getLlovera() {
        return llovera;
    }

    public void setLlovera(int llovera) {
        this.llovera = llovera;
    }
    
}
