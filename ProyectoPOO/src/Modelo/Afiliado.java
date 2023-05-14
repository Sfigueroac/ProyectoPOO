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
    protected int identificacion;
    protected String nombre;
    protected int celular;
    protected ServicioMedico suServicioMedico;

    public Afiliado(String nombre, int identificacion, int celular, ServicioMedico suServicioMedico) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.celular = celular;
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
    

    @Override
    public String toString() {
        return "Afiliado{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", celular=" + celular + ", Servicio Medico" + suServicioMedico;
   }
}

    
  
///    public double CalcularCuota(){
//        double cuotaModeradora = 0.0;
//             if (salario == 1) {
//            cuotaModeradora = 4100;
//        } else if (salario == 2) {
//            cuotaModeradora = 16400;
//        } else if (salario == 3) {
//            cuotaModeradora = 43000;
 //      }
//    return cuotaModeradora;
//    }
//    public double calcularCopago() {
//    double copago = 0.0;
//    if (salario == 1) {
//        copago = suServicioMedico.calcularCosto() * 0.115;
//      if (copago > 304583){
//        copago = 304583;
//      }
//    } 
//    else if (salario == 2) {
  //      copago = suServicioMedico.calcularCosto() * 0.173;
//      if (copago > 1220455){
//        copago = 1220455;
//      }
//    } 
//    else if (salario == 3) {
//        copago = suServicioMedico.calcularCosto() * 0.23;
//      if (copago > 2440909){
//        copago = 2440909;
//      }
//      
//    }
//    return copago;
//    }
    