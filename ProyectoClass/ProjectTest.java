public class ProjectTest {
    
    public static void main(String [] args){

        //sobrecarga 2
        Project ventaLibros1 = new Project("Libreria Sol");
        String nomProyecto = ventaLibros1.getNombre();
        System.out.println("El Nombre del proyecto es: " + nomProyecto);

        // sobrecarga 3
        Project ventaLibros2 = new Project("Libreria Mar Azul", "Venta de libros fotográficos...");
        String ventaLibrosNombre = ventaLibros2.getNombre();
        String ventaLibrosDescripcion = ventaLibros2.getDescripcion();
        System.out.println("PROYECTO - " + ventaLibrosNombre + " : " + ventaLibrosDescripcion);

        
        //crear objeto 
        Project ventaLibros3 = new Project();

        ventaLibros3.setNombre("Libreria Sol");
        ventaLibros3.setDescripcion("Venta de libros literarios y escolares...");

        //String ventaLibrosNombre = ventaLibros.getNombre();
       // String ventaLibrosDescripcion = ventaLibros.getDescripcion();

        String tipoProyecto = ventaLibros3.elevatorPitch();
        System.out.println(tipoProyecto);
    }
}