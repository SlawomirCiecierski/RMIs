/*
Zdalny interfejs udostępniany przez serwer.
Umieszczono metodę, która pobiera dwa argumenty typu double
i zwraca ich sumę
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerIntf extends Remote {

    double add(double d1,double d2  ) throws RemoteException;

}
