package presencial;

public class Vacunatorio implements IVacunatorio{
    @Override
    public String vacunar(Persona persona) {
        return "Se ha verificado la documentación. La persona" +
                " con documento "+persona.getDocumento()+" se le aplico" +
                " la vacuna "+persona.getTipoVacuna();
    }
}
