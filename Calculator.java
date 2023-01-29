import java.util.ArrayList;

public class Calculator implements IPostFixCalculator{
    private ArrayList<Integer> Operaciones= new ArrayList<Integer>();

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
}
