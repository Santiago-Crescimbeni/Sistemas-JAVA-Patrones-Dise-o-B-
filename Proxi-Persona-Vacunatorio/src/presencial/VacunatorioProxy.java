package presencial;

import java.util.Date;

public class VacunatorioProxy implements IVacunatorio{
    private Vacunatorio centroVacunatorio;

    public VacunatorioProxy() {
        this.centroVacunatorio = new Vacunatorio();
    }

    @Override
    public String vacunar(Persona persona) {
        //yo filtro y si to do ok paso a objeto real
        String respuesta="Vuelva cuando sea su turno :D";
        Date hoy= new Date();
        if (hoy.after(persona.getFecha())){
            //corresponde la vacuna
            respuesta=centroVacunatorio.vacunar(persona);
        }
        return respuesta;
    }
}
