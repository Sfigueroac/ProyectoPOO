package Modelo;

public class Cotizante extends Afiliado {
    private double salarioC;

    public Cotizante(double salarioC, String nombre, int identificacion, int celular, ServicioMedico suServicioMedico) {
        super(nombre, identificacion, celular, suServicioMedico);
        this.salarioC = salarioC;
    }



    public double getSalarioC() {
        return salarioC;
    }

    public void setSalarioC(double salarioC) {
        this.salarioC = salarioC;
    }

    @Override
    public String toString() {
        return "Cotizante{" + "salarioC=" + salarioC + '}'+ super.toString();
    }
    private double CalcularRangoSalario(){
    double res;
    double SMMLV = 1160000;
    if(salarioC < 2*SMMLV){
    res = 1;
    } else{if(salarioC >= 2*SMMLV || salarioC <= 5*SMMLV) 
     res = 2;
    
    else{res = 3; }
    }  

 return res;}
    
    public double CalcularTotalPagar(){
        double res = 0;
        String tipo = "";
        
        if(tipo.equalsIgnoreCase( "GENERAL") || tipo.equalsIgnoreCase("ESPECIALISTA")){
            if(CalcularRangoSalario() == 1){
            res = 4100;}
            else{if(CalcularRangoSalario()== 2){
            res = 16400;}
            else{ res = 43000;
    
            }}}else{if(tipo.equalsIgnoreCase( "CIRUGIA") || tipo.equalsIgnoreCase("HOSPITALIZACION")){
                
            if(CalcularRangoSalario() == 1){
            res = suServicioMedico.getCosto()*0.115; if(res > 304583){res = 304583;}}
            else{if(CalcularRangoSalario()== 2){
            res = suServicioMedico.getCosto()*0173; if(res > 1220455){res = 1220455;}}
            else{ res = suServicioMedico.getCosto()*0.23; if(res > 2440909){res = 2440909;}}
            
            
            }
            }
        
        }   
        return res; 
    }
        
         
}
    
    

