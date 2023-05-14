package Modelo;

public class Beneficiario extends Afiliado{
    private Cotizante suCotizante;

    public Beneficiario(Cotizante suCotizante, String nombre, int identificacion, int celular, ServicioMedico suServicioMedico) {
        super(nombre, identificacion, celular, suServicioMedico);
        this.suCotizante = suCotizante;
    }



    public Cotizante getCotizante() {
        return suCotizante;
    }

    public void setCotizante(Cotizante Cotizante) {
        this.suCotizante = Cotizante;
    }

    @Override
    public String toString() {
        return "Beneficiario{" + "Cotizante=" + suCotizante + '}';
    }
    
}
