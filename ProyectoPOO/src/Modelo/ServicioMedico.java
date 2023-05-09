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
    private LocalDate fecha;

    public ServicioMedico(String tipo, LocalDate fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ServicioMedico{" + "tipo=" + tipo + ", fecha=" + fecha + '}';
    }
    
    
    public double calcularCosto(){
        return 1+1;
    }
    
    }
    

