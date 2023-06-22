package InterfaceaFuncionales;

public enum Departamentos {

    CALDAS(1,"CALDAS"),ANTIQUITA(2,"ANTIOQUIA");

    private final int codigo;
    private final String ciudad;

    Departamentos(int codigo, String ciudad) {
        this.codigo = codigo;
        this.ciudad = ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCiudad() {
        return ciudad;
    }


}
