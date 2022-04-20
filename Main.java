public class Main {

        public static void main(String[] args) {

            Cliente cliente1 = new Cliente();
            cliente1.setNombre("pepe");
            cliente1.setEdad(33);
            cliente1.setTelefono(12345678);
            cliente1.setCredito(40);
            System.out.println("Nombre: " + cliente1.getNombre() + " edad: " + cliente1.getEdad()
                    + " telefono: " + cliente1.getTelefono() + " credito: " + cliente1.getCredito());

            System.out.println("\n********\n");

            Trabajador trabajador1 = new Trabajador();

            trabajador1.setNombre("juan");
            trabajador1.setEdad(24);
            trabajador1.setTelefono(87654321);
            trabajador1.setSalario(3000);
            System.out.println("Nombre: " + trabajador1.getNombre() + " edad :" + trabajador1.getEdad()
                    + " telefono: " + trabajador1.getTelefono() + " salario: " + trabajador1.getSalario() );



        }

    }

    class Persona{
        private String nombre;
        private int edad;
        private int telefono;

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }
    }

    class Cliente extends Persona{
        private int credito;

        public void setCredito(int credito) {
            this.credito = credito;
        }

        public int getCredito(){
            return this.credito;
        }
    }

    class Trabajador extends Persona{
        private float salario;

        public void setSalario( int salario){
            this.salario = salario;
        }

        public float getSalario(){
            return this.salario;
        }

}
