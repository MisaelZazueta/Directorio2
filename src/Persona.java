public class Persona {
    private String nombre;
    private String apellido;
    private String alias;
    private char tipoTelefono;
    private int clavePais;
    private String numeroTelefonico;

    public Persona (String nombre, String apellido, String alias, char tipoTelefono, int clavePais, String numeroTelfonico){
        this.nombre = nombre;
        this.apellido = apellido;
        this.alias = alias;
        this.tipoTelefono = tipoTelefono;
        this.clavePais = clavePais;
        this.numeroTelefonico = numeroTelfonico;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.alias + " " + this.tipoTelefono + " " + this.numeroTelefonico;
    }
}