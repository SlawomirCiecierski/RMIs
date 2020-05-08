git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/SlawomirCiecierski/RMIs.git
git push -u origin master

#RMI
Zdalne wywołanie metod (RMI - Remote Method Invocation) pozwala obiektom  na wywoływanie metod obiektów zdefiniowanych w języku Java umieszczonych na innej maszynie posługując się protokołem RMI.
Funkcjonalność ta pozwala na pisanie aplikacji rozproszonych.
###Uwaga
Przykład zastosowano na maszynie lokalnej. 
Pdczas stosowania RMI mogą odezwać się mechanizmy zabezpieczeń.
####Opis.
Po napisaniu kodu źródłowego w 4 plikach kompilujemy je
`javac AddServerIntf.java`

`javac AddServerImpl.java`

`javac AddServer.java`

`AddClient.java`

Uruchamiamy rejestr RMI na serwerze
`start rmiregistry`

Uruchamiamy serwer poleceniem 
`java AddServer`

Uruchamiamy klienta poleceniem
`java AddClient 127.0.0.1 20 30`

Otrzymujemy wynik

`Pierwsza liczba 20`

`Druga liczba 30`

`Suma: 30.0`

Metoda umieszczana na drugim komputerze może pobierać argumenty w postaci prostych typów danych ale także i obiektów. W takim przypadku obiekt powinien być zserializowany.

Film: https://youtu.be/X0gOPp9PtWg






