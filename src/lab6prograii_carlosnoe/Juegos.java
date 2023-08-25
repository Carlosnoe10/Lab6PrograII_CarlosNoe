package lab6prograii_carlosnoe;

import java.util.Date;

public class Juegos {

    public String Nombre;
    public String Descripción;
    public String Estado;//(Nuevo/Usado) 
    public Date FechaDeLanzamiento;
    public int CantidadDisponibles;
    public double Precio;
    public boolean Rentable;
    public boolean Agregado;

    public Juegos(String Nombre, String Descripción, String Estado, Date FechaDeLanzamiento, int CantidadDisponibles, double Precio, boolean Rentable, boolean Agregado) {
        this.Nombre = Nombre;
        this.Descripción = Descripción;
        this.Estado = Estado;
        this.FechaDeLanzamiento = FechaDeLanzamiento;
        this.CantidadDisponibles = CantidadDisponibles;
        this.Precio = Precio;
        this.Rentable = Rentable;
        this.Agregado = Agregado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Date getFechaDeLanzamiento() {
        return FechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(Date FechaDeLanzamiento) {
        this.FechaDeLanzamiento = FechaDeLanzamiento;
    }

    public int getCantidadDisponibles() {
        return CantidadDisponibles;
    }

    public void setCantidadDisponibles(int CantidadDisponibles) {
        this.CantidadDisponibles = CantidadDisponibles;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public boolean isRentable() {
        return Rentable;
    }

    public void setRentable(boolean Rentable) {
        this.Rentable = Rentable;
    }

    public boolean isAgregado() {
        return Agregado;
    }

    public void setAgregado(boolean Agregado) {
        this.Agregado = Agregado;
    }

    @Override
    public String toString() {
        return "Juegos{" + "Nombre=" + Nombre + ", Descripci\u00f3n=" + Descripción + ", Estado=" + Estado + ", FechaDeLanzamiento=" + FechaDeLanzamiento + ", CantidadDisponibles=" + CantidadDisponibles + ", Precio=" + Precio + ", Rentable=" + Rentable + ", Agregado=" + Agregado + '}';
    }

    
    
}
