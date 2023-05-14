/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Home
 */
public class ServicioMedico {
    private String tipo;
    private String fecha;
    private double costo;
    public ServicioMedico(String tipo, String fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "ServicioMedico{" + "tipo=" + tipo + ", fecha=" + fecha + ", costo=" + costo + '}';
    }

    public ServicioMedico(String tipo, String fecha, double costo) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;
    }
    
    

    
    
    }
    
    

