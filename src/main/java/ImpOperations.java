public class ImpOperations {

    public static void main(String[] args) {

        IOperations op = (nu1,nu2) -> nu1+nu2;
        Integer suma = op.imprimeSuma(1,3);
        System.out.println(suma);
        System.out.println(imprimirSuma(op,10,10));

    }

    public static int imprimirSuma(IOperations op, int num1, int num2){
        return op.imprimeSuma(num1,num2);
    }

}
