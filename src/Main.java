import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Pedido pedido1=new Pedido(1);
       pedido1.agregarMenu(Menu.MENU2);
       pedido1.agregarMenu(Menu.MENU3);
       pedido1.imprimirMenu();

        Pedido pedido2=new Pedido(5);
        pedido2.agregarMenu(Menu.MENU5);
        pedido2.agregarMenu(Menu.MENU1);
        pedido2.imprimirMenu();

        Pedido pedido3=new Pedido(10);
        pedido3.agregarMenu(Menu.MENU4);
        pedido3.agregarMenu(Menu.MENU3);
        pedido3.imprimirMenu();


        double total=pedido1.getSaldo()+pedido2.getSaldo()+pedido3.getSaldo()+pedido1.getSaldo()+pedido2.getSaldo()+pedido3.getSaldo();
        System.out.println("\nTotal-> "+ total +"€");
       System.out.println("*****GRACIAS POR VENIR*****");

    }
}