/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_entidad;

/**
 *
 * @author mati
 */
public class Cliente {
     private int DNI;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private String Nick;
    private String Password;
    private boolean moroso=false;
    private float saldo=0;

    public Cliente() {
    }

    public Cliente(int DNI, String Nombre, String Apellido1, String Apellido2, String Nick, String Password) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Nick = Nick;
        this.Password = Password;
    }
    

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isMoroso() {
        return moroso;
    }

    public void setMoroso(boolean moroso) {
        this.moroso = moroso;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellido1=" + Apellido1 + ", Apellido2=" + Apellido2 + ", Nick=" + Nick + ", Password=" + Password + ", moroso=" + moroso + ", saldo=" + saldo + '}';
    }
    
    
}
