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
public class Administrador  extends Suscriptor implements Gestor{
    Video video;
    private String nombre;
    private String nickname;
    private String password;
    
    public Administrador(){
        nombre="";
        nickname="";
        password="";
    }
    
    public Administrador(String nombre, String nickname, String password){
        this.nombre=nombre;
        this.nickname=nickname;
        this.password=password;
    }
    
    public Administrador(Administrador admin){
        this.nombre=admin.nombre;
        this.nickname=admin.nickname;
        this.password=admin.password;
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
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrador{" + "nombre=" + nombre + ", nickname=" + nickname + ", password=" + password + '}';
    }
    
}
