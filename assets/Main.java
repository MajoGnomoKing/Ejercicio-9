package assets;

public class Main{
     
    public static void main (String[] args){
  Cliente cliente= new Cliente();
  cliente.setNombre("Carlos");
  cliente.setEdad(20);
  cliente.setTelefono(456789);
  cliente.setCredito(30000);

  Trabajador trabajador= new Trabajador();
  trabajador.setNombre("Santiago");
  trabajador.setEdad(35);
  trabajador.setTelefono(123456);
  trabajador.setSalario(4000);

  System.out.println(cliente.getNombre());
  System.out.println(cliente.getEdad()+ " años");
  System.out.println("Telefono:"+ cliente.getTelefono());
  System.out.println("Tu credito es:"+ cliente.getCredito());


  System.out.println(trabajador.getNombre());
  System.out.println(trabajador.getEdad()+ " años");
  System.out.println("Telefono:"+ trabajador.getTelefono());
  System.out.println("Tu salario es:"+ trabajador.getSalario());

    }
}

class Persona {
    int edad,telefono;
    String nombre;

    public void setEdad (int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}

final class Cliente extends Persona {
    int credito;

    public void setCredito (int credito){
        this.credito=credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

final class Trabajador extends Persona{
    int salario;

    public void setSalario (int salario){
        this.salario=salario;
    }
    public int getSalario(){
        return this.salario;
    }
}