/*
Zawiera implementację aplikacji po stronie klienta.
Wymaga 3 argumentów adres IP (lub nazwa serwera) oraz dwóch liczb,
które będą sumowane
Przy użyciu adresu 127.0.0.1 zarówno serwer jak i klient można uzyć lokalnie
 */
import java.rmi.Naming;

public class AddClient {

    public static void main(String[] args) {

        try{

            String addServerURL ="rmi://"+args[0]+"/AddServer";
            AddServerImpl addServerIntf=(AddServerImpl) Naming.lookup(addServerURL);

            System.out.println("Pierwsza liczba: "+ args[1]);
            double d1=Double.valueOf(args[1]).doubleValue();

            System.out.println("Druga liczba: "+ args[2]);
            double d2=Double.valueOf(args[2]).doubleValue();

            System.out.println("Suma: "+addServerIntf.add(d1,d2));

        }catch(Exception e){
            System.out.println("Wyjątek "+e);
        }

    }

}
