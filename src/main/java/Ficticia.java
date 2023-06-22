public class Ficticia{

    public Ficticia() {
    }

    static IFicticia iFicticia = new IFicticia() {
        @Override
        public void aceptar(String message) {
            System.out.println(message);
        }
    };

    static IFicticia iFicticia2 = (message) ->  {System.out.println(message);};

    public static void main(String[] args) {
        iFicticia.aceptar("Hola mundo");
        iFicticia2.aceptar("Hola mundo");
    }

    }
