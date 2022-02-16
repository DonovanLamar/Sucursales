package com.exampleSucursales;

import javax.persistence.*;

@Entity
@Table(name = "Suc1")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private int IdCiudad;
    private String Nproduc;
    private String cEspe;
    private String CDis;
    private int Precio;

    public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public String getNprodic() {
        return Nproduc;
    }

    public void setNproduct(String Nproduc) {
        this.Nproduc = Nproduc;
    }

    public String getCespe() {
        return cEspe;
    }

    public void setCEspe(String cEspe) {
        this.cEspe = cEspe;
    }

    public String getCDis() {
        return CDis;
    }

    public void setCDis(String CDis) {
        this.CDis = CDis;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

}
