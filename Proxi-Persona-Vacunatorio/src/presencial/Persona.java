package presencial;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String documento;
    private Date fecha;
    private String tipoVacuna;

    public Persona(String nombre, String apellido, String documento, Date fecha, String tipoVacuna) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fecha = fecha;
        this.tipoVacuna = tipoVacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }
}
