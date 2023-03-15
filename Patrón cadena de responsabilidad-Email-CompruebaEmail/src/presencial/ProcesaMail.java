package presencial;

public class ProcesaMail {
    private CompruebaMail comprobador;
    private Mail elMail;

    public ProcesaMail(CompruebaMail comprobador, Mail elMail) {
        this.comprobador = comprobador;
        //aqui creamos el correo
        this.elMail = elMail;
    }

    public CompruebaMail getComprobador() {
        return comprobador;
    }

    public void setComprobador(CompruebaMail comprobador) {
        this.comprobador = comprobador;
    }

    public Mail getElMail() {
        return elMail;
    }

    public void setElMail(Mail elMail) {
        this.elMail = elMail;
    }
}
