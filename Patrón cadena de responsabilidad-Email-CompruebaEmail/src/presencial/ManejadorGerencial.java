package presencial;

public class ManejadorGerencial extends Manejador{

    @Override
    public String comprobarMail(Mail mail) {
        if (mail.getDestino().equals("gerencia@colmena.com")||mail.getTema().equals("gerencia")){
            return "Enviado a gerencia";
        }
        else{
            return getSiguienteManejador().comprobarMail(mail);
        }
    }
}
