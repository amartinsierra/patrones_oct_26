package observer;

public class Usuario implements Observador {
    private String nombre;
   
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        
        
    }

    @Override
    public void actualizar(String nuevoContenido) {
        System.out.println(nombre + " ve el nuevo contenido: " + nuevoContenido);
    }

   

    public String getNombre() {
        return nombre;
    }
    
    
}

