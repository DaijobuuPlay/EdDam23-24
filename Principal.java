import java.util.LocalDate;

public class Principal {
    public void main (String[] args){
        System.out.println("Hola mundo");
        horaActual();
    }

    public void horaActual(){
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds);     
    }
}
