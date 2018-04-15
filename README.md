Questo è un fork del repository di esempio di Openshift.
Prima bisogna importare il tempalte di WildFly application server. Viene usato Maven per fare la build e generare il war. Il codice contiene un esempio di servizio REST all'indirizzo /hello.

Può essere fatto il deploy in Openshift con il seguente comando:

	oc new-app wildfly:10.0~https://github.com/simontim/bootwildfly.git


Funziona anche su Openshift Online gratuitamente.
