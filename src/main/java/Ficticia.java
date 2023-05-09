public class Ficticia{

    public Ficticia() {
    }

    static IFicticia iFicticia = new IFicticia() {
        @Override
        public void aceptar() {
            System.out.println("ficticia");
        }
    };

    static IFicticia iFicticia2 = () ->  {System.out.println("ficticia");};

    public static void main(String[] args) {
        iFicticia.aceptar();
        iFicticia2.aceptar();
    }

    }
