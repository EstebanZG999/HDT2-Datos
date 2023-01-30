import java.util.ArrayList;

public class Controlador {
    StackHandmade<String> Mystack = new StackHandmade<String>();
    ArrayList<String> ArrayCopia= new ArrayList<String>();
    ArrayList<Integer> Operaciones= new ArrayList<Integer>();
    int Resultados = 0;
    String Datos = "";
    String[] spliting;
    public void Calculadora(){
        Calculator calc = new Calculator();

        Reader red = new Reader();
        Datos = red.read();
        ArrayCopia = calc.getItems(Datos);

        for(int i = ArrayCopia.size()-1; i >= 0 ;i--){
            Mystack.push(ArrayCopia.get(i));
        }
        try {
            for(int i = 0; i<= Mystack.count;i++){
                Operaciones.add(Integer.valueOf(Mystack.pull()));
            }
        }
        catch (Exception e){
        }

        int a = Operaciones.get(Operaciones.size()-1);
        int b = Operaciones.get(Operaciones.size()-2);
        Operaciones.remove(Operaciones.size()-1);
        Operaciones.remove(Operaciones.size()-1);
        Mates(a,b,calc);

        for(int i = Operaciones.size()-1; i >= 0; i--){
            Mates(Resultados,Operaciones.get(i),calc);
        }
        System.out.println("El resultado es: " + Resultados);

    }



    public void Mates(int a,int b,Calculator calc){
        String Variable = Mystack.pull();
        if(Variable.equals("+")){
            Resultados = calc.suma(a,b);

        }
        if(Variable.equals("-")){
            Resultados = calc.resta(a,b);

        }
        if(Variable.equals("*")){
            Resultados = calc.multiplicacion(a,b);

        }
        if(Variable.equals("/")){
            Resultados = calc.division(a,b);
        }
    }


}
