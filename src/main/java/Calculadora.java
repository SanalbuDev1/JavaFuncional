public class Calculadora {

    public static void main(String[] args) {
        System.out.println("\n sin parametros");
        calcular((x,y) -> x+y);
        calcular((x,y) -> x-y);
        calcular((x,y) -> x/y);
        calcular((x,y) -> x%y);
        System.out.println("\n con parametros");
        calcular((x,y) -> x%y ,1 ,2);
        calcular((x,y) -> x/y ,1,2);
        calcular((x,y) -> x+y,1,2);
        calcular((x,y) -> x-y,1,2);

        Integer suma = create().ImprimirOperacion(10,20);
        System.out.println(suma);


    }
    public static int calcular(ICalculadora iCalculadora){
        int x1 = 10,x2 = 10;
        System.out.println(iCalculadora.ImprimirOperacion(x1,x2));
        return iCalculadora.ImprimirOperacion(x1,x2);
    }

    public static int calcular(ICalculadora iCalculadora, int x1, int x2){
        System.out.println(iCalculadora.ImprimirOperacion(x1,x2));
        return iCalculadora.ImprimirOperacion(x1,x2);
    }

    public static ICalculadora create(){
        return (x,y) -> x+y;
    }

}
