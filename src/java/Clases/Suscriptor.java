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
public class Suscriptor {
    Asistente asistente;
    Buscador buscador;
    Reproductor reproductor;
    private String nombre;
    private String apeido;
    private String nickname;
    private String password;
    private String correo;
    
    public Suscriptor(){
        nombre="nombre";
        apeido="apeido";
        nickname="nick";
        password="*******";
        correo="correo";
    }
    
    public Suscriptor(String nombre, String apeido, String nickname, String password, String correo){
        this.nombre=nombre;
        this.apeido=apeido;
        this.nickname=nickname;
        this.password=password;
        this.correo=correo;
    }
    
    public Suscriptor(Suscriptor s){
        this.nombre=s.nombre;
        this.apeido=s.apeido;
        this.nickname=s.nickname;
        this.password=s.password;
        this.correo=s.correo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Suscriptor other = (Suscriptor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apeido, other.apeido)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Suscriptor{" + "nombre=" + nombre + ", apeido=" + apeido + ", nickname=" + nickname + ", password=" + password + ", correo=" + correo + '}';
    }
    
}
