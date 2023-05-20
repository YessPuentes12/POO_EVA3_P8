/*

 */
package eva3_8_custom_exceptions;


public class EVA3_8_CUSTOM_EXCEPTIONS {


    public static void main(String[] args) {
     Persona perso = new Persona();
     perso.setNombre("Manuel");
     perso.setApellido("Rodriguez");
     try{
     perso.setEdad(-34);
     }catch(DatoEnCheckedEx e){
      System.out.println(e.getMessage());    
     }

    }
    
}



class Persona{
 private String nombre;
 private String apellido;
 private int edad;
 
  public Persona() {
     this.nombre = "---";
     this.apellido = "---";
     this.edad = 0;
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

    public int getEdad() {
        return edad;
    }

    //El throw es para que la use quien la captura
    public void setEdad(int edad) throws DatoEnCheckedEx {
        if (edad<0){
         throw new DatoEnCheckedEx();   
        }
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad) throws DatoEnCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }
 

}

//------------------------------------------------------------------------------

class DatoEnException extends RuntimeException{

    public DatoEnException() {
      super("Dato incorrecto, el valor debe de ser positivo.");
    }
  
}

class DatoEnCheckedEx extends Exception{

    public DatoEnCheckedEx() {
      super("Dato incorrecto, el valor debe de ser positivo.");
    }
  
}
