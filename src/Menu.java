public enum Menu {

    //definimos los diferentes precios con sus menus
    MENU1(12.3),
    MENU2(14),
    MENU3(9.80),
    MENU4(12),
    MENU5(10);

   //atributos y con precio final ya que no se modificara en un futuro
    private final double precio;

    //metodo constructor
    Menu(double precio) {
        this.precio = precio;
    }

    //metodo para obtener el precio
    public double getPrecio() {
        return precio;
    }
}

