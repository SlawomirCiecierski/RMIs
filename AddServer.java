/*
Program główny dla serwera, którego funkcją jest aktualizacja rejestru RMI poprzez
wykorzystanie metody rebind() należacej do klasy Naming. Metoda definiuje powiązanie nazwy
z referencją do obiektu
 */
import java.rmi.Naming;

public class AddServer {

    public static void main(String[] args) {

        try{
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("AddServer", addServerImpl);


        }catch (Exception e){
            System.out.println("Wyjątek "+e);
        }

    }

}
