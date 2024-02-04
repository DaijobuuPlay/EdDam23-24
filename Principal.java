import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Usuario usuarios[];
        System.out.println("Hola mundo");
        horaActual();
        usuarios = crearUsuario(2);
        for(int i = 0; i<usuarios.length; i++){
            System.out.println("Nombre: " + usuarios[i].getNombre());
            System.out.println("Apellidos: " + usuarios[i].getApellidos());
            System.out.println("Email: " + usuarios[i].getEmail() + "\n");
        }
    }   

    static void horaActual(){
        java.util.Date date = new java.util.Date();    
        System.out.println(date);   
    }

    static Usuario[] crearUsuario(int n){
        Scanner sc = new Scanner(System.in);
        Usuario usuarios[] = new Usuario[n];
        for(int i = 0; i<usuarios.length; i++){
            System.out.print("Introduce el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduce los apellidos: ");
            String apellidos = sc.nextLine();
            System.out.print("Introduce el email: ");
            String email = sc.nextLine();
            usuarios[i] = new Usuario(nombre, apellidos, email);
        }
        return usuarios;
    }
}
