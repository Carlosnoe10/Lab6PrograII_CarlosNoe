package lab6prograii_carlosnoe;

import java.util.Date;

public class Estacionaria extends Consolas{
    
    public int NumeroControles;
    public double Almacenamiento;
    public String TipoDeConexion;

    public Estacionaria(int NumeroControles, double Almacenamiento, String TipoDeConexion, String identificación, String fabricante, Date AñosDeUso, double precio, int JuegosDisponibles, String modelo) {
        super(identificación, fabricante, AñosDeUso, precio, JuegosDisponibles, modelo);
        this.NumeroControles = NumeroControles;
        this.Almacenamiento = Almacenamiento;
        this.TipoDeConexion = TipoDeConexion;
    }

    public int getNumeroControles() {
        return NumeroControles;
    }

    public void setNumeroControles(int NumeroControles) {
        this.NumeroControles = NumeroControles;
    }

    public double getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(double Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public String getTipoDeConexion() {
        return TipoDeConexion;
    }

    public void setTipoDeConexion(String TipoDeConexion) {
        this.TipoDeConexion = TipoDeConexion;
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
        return "Estacionaria{" + "NumeroControles=" + NumeroControles + ", Almacenamiento=" + Almacenamiento + ", TipoDeConexion=" + TipoDeConexion + '}';
    }
    
    
    
}
