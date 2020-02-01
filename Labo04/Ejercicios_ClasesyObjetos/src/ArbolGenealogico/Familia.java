package ArbolGenealogico;

import java.util.ArrayList;

public class Familia {
	
	private ArrayList<Persona> personas;
    
    public Familia(){
        personas = new ArrayList<Persona>();
        
    }
    
    public void agregarPersona(Persona persona){
        this.personas.add(persona);
    }
    
    public Persona getPersonaPorNombre(String nombre){
        Persona persona = null;
        for(Persona p: this.personas){
            if(p.getNombre().equals(nombre)){
                persona = p;
                break;
            }
        }
        return persona;
    }
    
    public void mostrarFamilia() {
    	for(Persona p: personas) {
    		System.out.println(p.toString());
    		System.out.println("");
    	}
    }

}
