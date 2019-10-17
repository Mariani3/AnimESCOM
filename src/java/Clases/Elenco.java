/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author aresu
 */
public class Elenco {private String nombre;
    private String apeido;
    private String fechaDeNacimiento;
    private String nacionalidad;
    
    public Elenco(){
        nombre="nombre";
        apeido="apeido";
        fechaDeNacimiento="algunafecha";
        nacionalidad="algunpais";
    }
    
    public Elenco(String nombre, String apeido, String fechaDeNacimiento, String nacionalidad){
        this.nombre=nombre;
        this.apeido=apeido;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.nacionalidad=nacionalidad;
    }
    
    public Elenco(Elenco e){
        this.nombre=e.nombre;
        this.apeido=e.apeido;
        this.fechaDeNacimiento=e.fechaDeNacimiento;
        this.nacionalidad=e.nacionalidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elenco other = (Elenco) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apeido, other.apeido)) {
            return false;
        }
        if (!Objects.equals(this.fechaDeNacimiento, other.fechaDeNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Elenco{" + "nombre=" + nombre + ", apeido=" + apeido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", nacionalidad=" + nacionalidad + '}';
    }
    
}
