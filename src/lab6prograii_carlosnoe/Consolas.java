package lab6prograii_carlosnoe;

import java.util.Date;

public class Consolas{
    public String identificación;
    public String fabricante;
    public Date AñosDeUso;
    public double precio;
    public int JuegosDisponibles;
    public String modelo;

    public Consolas(String identificación, String fabricante, Date AñosDeUso, double precio, int JuegosDisponibles, String modelo) {
        this.identificación = identificación;
        this.fabricante = fabricante;
        this.AñosDeUso = AñosDeUso;
        this.precio = precio;
        this.JuegosDisponibles = JuegosDisponibles;
        this.modelo = modelo;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Date getAñosDeUso() {
        return AñosDeUso;
    }

    public void setAñosDeUso(Date AñosDeUso) {
        this.AñosDeUso = AñosDeUso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getJuegosDisponibles() {
        return JuegosDisponibles;
    }

    public void setJuegosDisponibles(int JuegosDisponibles) {
        this.JuegosDisponibles = JuegosDisponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Consolas{" + "identificaci\u00f3n=" + identificación + ", fabricante=" + fabricante + ", A\u00f1osDeUso=" + AñosDeUso + ", precio=" + precio + ", JuegosDisponibles=" + JuegosDisponibles + ", modelo=" + modelo + '}';
    }

    
    

}
