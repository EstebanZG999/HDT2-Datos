import java.util.ArrayList;

public class Calculator implements IPostFixCalculator{
    private ArrayList<Integer> Operaciones= new ArrayList<Integer>();
    StackHandmade<String> Mystack = new StackHandmade<String>();
    int Resultados = 0;
    String Datos = "";
    String[] spliting;

    public void calculadora(){
        Reader red = new Reader();
        Datos = red.read();
        spliting = Datos.split(" ");

        for(int i = spliting.length-1; i >= 0 ;i--){
                Mystack.push(spliting[i]);
        }
        //Mystack.push(spliting[0]);

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
        Mates(a,b);


        for(int i = Operaciones.size()-1; i >= 0; i--){
            Mates(Resultados,Operaciones.get(i));
        }
        System.out.println("El resultado es: " + Resultados);
    }



    /**
     * @param operandos
     * @param <T>
     * @return
     */
    @Override
    public <T> boolean isOneItem(IStack<T> operandos) {




        return false;
    }

    @Override
    public int suma(int a, int b) {
        int resultado;
        resultado = a+b;
        return resultado;
    }

    @Override
    public int resta(int a, int b) {
        int resultado;
        resultado= a-b;
        return resultado;
    }

    @Override
    public int multiplicacion(int a, int b) {
        int resultado;
        resultado = a*b;
        return resultado;
    }

    @Override
    public int division(int a, int b) {
        int resultado;
        resultado = a/b;
        return resultado;
    }

    @Override
    public boolean isOperator(String item) {




        return false;
    }

    @Override
    public ArrayList<String> getItems(String _expresion) {




        return null;
    }

    public void Mates(int a, int b){
        String Variable = Mystack.pull();
        if(Variable.equals("+")){
            Resultados = suma(a,b);

        }
        if(Variable.equals("-")){
            Resultados = resta(a,b);

        }
        if(Variable.equals("*")){
            Resultados = multiplicacion(a,b);

        }
        if(Variable.equals("/")){
            Resultados = division(a,b);
        }
    }

}
