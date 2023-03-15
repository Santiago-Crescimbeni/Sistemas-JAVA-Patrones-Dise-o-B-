package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompruebaMailTest {
    @Test
    public void deberiaIrAComercial(){
        //dado
        CompruebaMail comp=new CompruebaMail();
        String respuestaEsperado="Enviado a comercial";
        Mail mail= new Mail("rodo@dh.com","comercial@colmena.com","comercial");
        //cuando
        String respuestaActual=comp.comprobar(mail);
        //entonces
        assertEquals(respuestaEsperado,respuestaActual);
    }
}