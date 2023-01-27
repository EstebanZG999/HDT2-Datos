import java.util.Scanner;

public class View {
    Scanner scan;
    public String eleccion;

    public View(){
        scan = new Scanner(System.in);
    }
    public String menu(){
        System.out.println("PostFix CALCULATOR");
        System.out.println("1) Subir/Bajar Volumen");
        System.out.println("2) Modo Radio");
        System.out.println("3) Modo Reproduccion");
        System.out.println("4) Modo telefono");
        System.out.println("5) Modo Productividad");
        System.out.println("6) Apagar");

        return eleccion = scan.next();
    }

}
