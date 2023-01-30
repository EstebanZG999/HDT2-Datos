import java.util.*;
public class pruebas {
    public static void main(String[] args) {
        Stack<String> mystack = new Stack<String>();

        String hola = "* + 8 4 hola";
        String[] spliting = hola.split(" ");
        for(int i = 0; i<= spliting.length - 1;i++){
            if(spliting[i].equals("+") )
            mystack.push(spliting[i]);
        }





        String u = mystack.pop();
        String d = mystack.pop();
        Integer A = Integer.valueOf(u);
        Integer B = Integer.valueOf(d);

        System.out.println(A+B);





        // int myInt = Integer.parseInt(hola);

    }





    }