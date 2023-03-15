package presencial;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        if (mail.getDestino().equals("tecnico@colmena.com")||mail.getTema().equals("tecnico")){
            return "Enviado a tecnico";
        }
        else{
            return getSiguienteManejador().comprobarMail(mail);
        }
    }
}
