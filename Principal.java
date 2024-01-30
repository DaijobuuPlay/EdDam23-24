public class Principal {
    public static void main (String[] args){
        System.out.println("Hola mundo");
        horaActual();
    }   

    static void horaActual(){
        java.util.Date date = new java.util.Date();    
        System.out.println(date);   
    }
}
