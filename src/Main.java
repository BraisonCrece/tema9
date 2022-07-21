public class Main {
    public static void main(String[] args) {
        //Instanciamos un objeto de la clase Cliente a través de su constructor
        Cliente cliente1 = new Cliente(25,"Manolo",687052011, 11000);

        //Instanciamos un objeto de la clase Cliente y a través de los Setters heredados
        //de la clase Persona le asignamos valor a los atributos
        Cliente cliente2 = new Cliente();

        cliente2.setEdad(55);
        cliente2.setNombre("Pepe");
        cliente2.setTelefono(665058256);
        cliente2.setCredito(5);

        //Instancia de la clase Trabajador
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Amancio");
        trabajador1.setEdad(85);
        trabajador1.setTelefono(666666666);
        trabajador1.setSalario(1000000);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(trabajador1);
    }
}
