import java.util.Scanner;

public class Citas{
    String identificador, titulo, fecha, horaInicio, horaFinal, lugar, descripcion, personas, estado;

    public Citas(String identificador, String titulo, String fecha, String horaInicio, String horaFinal, String lugar, String descripcion, String personas, String estado){
        this.identificador = identificador;
        this.titulo = titulo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.personas = personas;
        this.estado = estado;
    }

    public String getIdentificador(){
        return identificador;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getFecha(){
        return fecha;
    }

    public String getHoraInicio(){ 
        return horaInicio;
    }

    public String getHoraFinal(){ 
        return horaFinal;
    }

    public String getLugar(){
        return lugar;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getPersonas(){
        return personas;
    }

    public String getEstado(){ 
        return estado;
    }


    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void setHoraInicio(String horaInicio){
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(String horaFinal){
        this.horaFinal = horaFinal;
    }

    public void setLugar(String lugar){
        this.lugar = lugar;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPersonas(String personas){
        this.personas = personas;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    @Override
    public String toString(){
        StringBuilder sb1 = new StringBuilder();
        sb1.append("ID: " + getIdentificador() + "\n");
        sb1.append("Titulo: " + getTitulo() + "\n");
        sb1.append("Fecha: " + getFecha() + "\n");
        sb1.append("Inicio: " + getHoraInicio() + "\n");
        sb1.append("Fin: " + getHoraFinal() + "\n");
        sb1.append("Lugar: " + getLugar() + "\n");
        sb1.append("Descripción: " + getDescripcion() + "\n");
        sb1.append("Persona(s): " + getPersonas() + "\n");
        sb1.append("Estado: " + getEstado() + "\n");
        return sb1.toString();
    }

    /** Metodos que nos ayudarán a identificar la informacion de cada cita */
    public String infoCita(){
        return identificador + "|" + titulo + "|" + fecha + "|" + horaInicio + "|" + horaFinal + "|" + lugar + "|" + descripcion + "|" + personas + "|" + estado;
    }

    public static Citas creaCita(String info){
        String []  informacionCitas = info.split("\\|", -1);
        if(informacionCitas.length == 9){
            return new Citas(informacionCitas[0], informacionCitas[1], informacionCitas[2], informacionCitas[3], informacionCitas[4], informacionCitas[5], informacionCitas[6], informacionCitas[7], informacionCitas[8]);
        } 
        return null;
    }

}