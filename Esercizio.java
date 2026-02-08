// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Lista<String> rubrica = new Lista<>();
        
        System.out.println("=== RUBRICA CONTATTI ===");
        
        rubrica.aggiungiInTesta("juan");
        rubrica.aggiungiInCoda("bajuan");
        rubrica.aggiungiInCoda("mcheil");
        rubrica.aggiungiInTesta("bamcheil");
        rubrica.aggiungiInPosizione("toninio", 2);
        
        System.out.println("lista iniziale:");
        System.out.println(rubrica);
        System.out.println("dimensione: " + rubrica.size());
        
        String cercato = "lello";
        int posizione = rubrica.indiceDi(cercato);
        System.out.println("posizione di " + cercato + ": " + posizione);
        
        System.out.println("contatto 1: " + rubrica.leggiTesta());
        System.out.println("ultimo contatto: " + rubrica.leggiCoda());
        System.out.println("contatto posizione 2: " + rubrica.leggiInPosizione(2));
        
        System.out.println("rimuovo tonino");
        rubrica.cancella("tonino");
        System.out.println(rubrica);
        
        System.out.println("rimuovo posizione 1");
        String rimosso = rubrica.cancellaInPosizione(1);
        System.out.println("rimosso: " + rimosso);
        System.out.println(rubrica);

        System.out.println("contiene 'mcheil'? " + rubrica.contiene("Alice"));
        System.out.println("Contiene 'tonino'? " + rubrica.contiene("Bob"));
        
        System.out.println("dimensione finale: " + rubrica.size());
        System.out.println("lista vuota? " + rubrica.isEmpty());
        
        Lista<String> altriContatti = new Lista<>();
        altriContatti.aggiungiInCoda("pino");
        altriContatti.aggiungiInCoda("ugo");
        
        System.out.println("aggiungo altri contatti");
        rubrica.concatena(altriContatti);
        System.out.println(rubrica);
        System.out.println("dimensione finale: " + rubrica.size());
    }
}
