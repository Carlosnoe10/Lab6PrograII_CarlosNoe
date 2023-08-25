package lab6prograii_carlosnoe;

import java.util.Date;

public class Portatil extends Consolas{
    public String Tamaño;
    public int Bateria;
    public boolean Estuche;

    public Portatil(String Tamaño, int Bateria, boolean Estuche, String identificación, String fabricante, Date AñosDeUso, double precio, int JuegosDisponibles, String modelo) {
        super(identificación, fabricante, AñosDeUso, precio, JuegosDisponibles, modelo);
        this.Tamaño = Tamaño;
        this.Bateria = Bateria;
        this.Estuche = Estuche;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int getBateria() {
        return Bateria;
    }

    public void setBateria(int Bateria) {
        this.Bateria = Bateria;
    }

    public boolean isEstuche() {
        return Estuche;
    }

    public void setEstuche(boolean Estuche) {
        this.Estuche = Estuche;
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
        return "Portatil{" + "Tama\u00f1o=" + Tamaño + ", Bateria=" + Bateria + ", Estuche=" + Estuche + '}';
    }
    
    
    
}
