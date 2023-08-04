public class Project {

    private String nombre;
    private String descripcion;

    //1 sobrecarga 
    public Project(){

    }
    //2 sobrecarga
    public Project(String name) { 
        nombre = name;
    }
    //3 sobrecarga
    public Project(String name, String description) { 
        nombre = name;
        this.descripcion = description;
    }


    //getter
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    //setter
    public void setNombre(String nom) {
        nombre = nom;
    }
    public void setDescripcion(String desc) {
        descripcion = desc;
    }
    public String elevatorPitch() {
        return "PROYECTO- " + this.nombre + " : " + this.descripcion;
    }
}