# FlyPortal

![Alt text](Architecture.png "Enterprise Architecture")

##Client
Il client � un comunissimo browser web (Chrome, Firefox, Safari, ...)

## Front-End
###JSP
Permette
###  Servlet
Sono organizzate secondo la loro funzionalit�, ogni servlet ha uno specifico compito rendendole estremamente semplici.
Alcune servlet permettono la gestione dei form tramite metodo post (es. _RegistrationServlet_), altre hanno in incarico la gestione delle richeste __AJAX__
(es. _DeleteFlightServlet_).
Hanno anche la responsabilit� delle __session__
 
__Scalabilita__: Le servlet cos� strutturate possono essere deployate in qualsiasi sistema rispondendo alle richieste sempre allo stesso modo.

###Session
Permettono di mantenere informazioni sullo stato della sessione client-server in corso. La sessione viene creata al momento del _login_:

* __auth__: permette di distinguere il livello di autorizzazione (user | admin)


* __username__: nome utente


* __cart__:	struttura dati di tipo _TreeMap_ che permette di memorizzare i voli prenotati dall'utente. La struttura dati � organizzate in modo 
da memorizzare il codice del volo di tipo stringa e il numero di posti prenotati, non � infatti necessario dover inserire all'interno del carrello
(e quindi della sessione) le informazioni complete sul volo in quanto possono essere ricavate al momento del bisogno utilizzando il codice (chiave).
In questo modo si alleggerisce parecchio la sessione e di conseguenza i messaggi in transito sulla rete.

##Back-End

![Alt text](ER.png "E-R Diagram")

![Alt text](bug.png "Glassfish bug")



<https://java.net/jira/browse/GLASSFISH-21314>