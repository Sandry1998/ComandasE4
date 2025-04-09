import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //definimos atributos
    private double saldo;
    private List<String>menus;
    private int numeroMesas;

    //metodo constructor
    public Pedido(int numeroMesas) {
        this.saldo = 0;
        this.menus = new ArrayList<>();
        this.numeroMesas = numeroMesas;
    }
    //metodos getter
    public List<String> getMenus() {
        return menus;
    }

    public int getNumeroMesas() {
        return numeroMesas;
    }

    public double getSaldo() {
        return saldo;
    }
    //agregamos los menus
    public void agregarMenu(Menu menu) {
        menus.add(menu+":€"+menu.getPrecio());
        saldo+=menu.getPrecio();

    }
    //aqui utilizamos el metodo para imprimir por pantalla el numero de mesa,el menu y precio
    public void imprimirMenu() {
        System.out.println("Pedidos para la mesa"+numeroMesas+":");
        for(String menu: menus){
            System.out.println(menu);
        }
        System.out.println("Total: "+saldo+ "€");
    }


}