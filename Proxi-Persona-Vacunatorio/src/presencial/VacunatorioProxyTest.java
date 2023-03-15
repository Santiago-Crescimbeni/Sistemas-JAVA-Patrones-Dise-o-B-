package presencial;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VacunatorioProxyTest {
    @Test
    public void vacunarPersonaOkTest(){
        //dado
        Persona juan= new Persona("Juan","Perez","544181",
                new Date(2023-1900,2-1,5),"Moderna");
        VacunatorioProxy proxy= new VacunatorioProxy();
        String respEsperada="Se ha verificado la documentación. La persona con documento 544181" +
                " se le aplico la vacuna Moderna";
        //cuando
        String respActual=proxy.vacunar(juan);
        //entonces
        assertEquals(respEsperada,respActual);
    }

    @Test
    public void vacunarPersonaNotOkTest(){
        //dado
        Persona juan= new Persona("Juan","Perez","544181",
                new Date(2023-1900,5-1,15),"Moderna");
        VacunatorioProxy proxy= new VacunatorioProxy();
        String respEsperada="Vuelva cuando sea su turno :D";
        //cuando
        String respActual=proxy.vacunar(juan);
        //entonces
        assertEquals(respEsperada,respActual);
    }

}