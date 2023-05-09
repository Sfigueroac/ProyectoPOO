/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Home
 */
public class Afiliado {
    private int identificacion;
    private String nombre;
    private int celular;
    private double salario;
    private ServicioMedico suServicioMedico;

    public Afiliado(int identificacion, String nombre, int celular, double salario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.celular = celular;
        this.salario = salario;
    }

    public Afiliado(ServicioMedico suServicioMedico) {
        this.suServicioMedico = suServicioMedico;
    }

    public ServicioMedico getSuServicioMedico() {
        return suServicioMedico;
    }

    public void setSuServicioMedico(ServicioMedico suServicioMedico) {
        this.suServicioMedico = suServicioMedico;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular; 
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Afiliado{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", celular=" + celular + ", salario=" + salario + '}';
    }

    
    
    public double CalcularCuota(){
        double cuotaModeradora = 0.0;
             if (salario == 1) {
            cuotaModeradora = 4100;
        } else if (salario == 2) {
            cuotaModeradora = 16400;
        } else if (salario == 3) {
            cuotaModeradora = 43000;
        }
        return cuotaModeradora;
    }
    public double calcularCopago() {
    double copago = 0.0;
    if (salario == 1) {
        copago = suServicioMedico.calcularCosto() * 0.115;
    } else if (salario == 2) {
        copago = suServicioMedico.calcularCosto() * 0.173;
    } else if (salario == 3) {
        copago = suServicioMedico.calcularCosto() * 0.23;
    }
    return copago;
    }
    }