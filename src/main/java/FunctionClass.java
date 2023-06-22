public class FunctionClass {

    // metodo oculto
    IFunctionClass iFunctionClassOverrida = new IFunctionClass() {
        @Override
        public void accept(int entero) {
            System.out.println(entero+1);
        }
    };

    // programacion funcional
    IFunctionClass iFunctionClass = (parametro) -> System.out.println(parametro+1);


    //metodo + programacion funcional
    public void metodo(IFunctionClass iFunctionClass){
        iFunctionClass.accept(1);
    }

}
