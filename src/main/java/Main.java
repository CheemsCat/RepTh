import java.time.LocalDate;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        String talonNumber = "22000078912345";
        Integer current_Year = Calendar.getInstance().get(Calendar.YEAR);
//        if(current_Year.toString().substring(2,4))
        System.out.println("year" + current_Year.toString().substring(2,4));
        if(Integer.parseInt(talonNumber.substring(0,2)) > Integer.parseInt(current_Year.toString().substring(2,4))){
            System.out.println(">");
        }

        if(talonNumber.length() != 14){
            System.out.println("Номер талона не соответствует необходимой длине!");
        }
        else if(Integer.parseInt(talonNumber.substring(0,2))<15){
            System.out.println(talonNumber.substring(0,2) + "Год!");
        }
        else if(Integer.parseInt(talonNumber.substring(2,4))>12 || Integer.parseInt(talonNumber.substring(2,4))<1){
            System.out.println(talonNumber.substring(2,4) + "Месяц!");
        } else if(Integer.parseInt(talonNumber.substring(4,6))>31 || Integer.parseInt(talonNumber.substring(4,6))<1){
            System.out.println(talonNumber.substring(4,6) + "День!");
        }
        System.out.println(Integer.parseInt(talonNumber.substring(4,6))<1);
        System.out.println("End");
    }
}
