import java.util.ArrayList;

public class Directorio {
    private ArrayList<Persona> personas;
    public Directorio (){
        personas = new ArrayList<>();
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    public void agregar(Persona persona) {
        this.personas.add(persona);
    }
    public void buscar(){}
    public void eliminar(){}
    public void consultar(){}
    public void imprimirTodo(){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }
    public void imprimirTipoTel(){}
    public void ordenar(){}
    public void finalizar(){}
}