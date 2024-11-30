package snack3;

public class RegistroStudenti {

    private String[] registro;
    private int numeroStudenti;

    // Medoto Costruttore
    public RegistroStudenti() {
        registro = new String[8];
        numeroStudenti = 0;
    }

    // Metodo per aggiungere uno studente al registro
    public void aggiungiStudente(String nome, int eta) {
        if (numeroStudenti < registro.length) { // Verifica che ci sia spazio nell'array
            registro[numeroStudenti] = nome + ", Età: " + eta; // Salva nome ed età in una stringa
            numeroStudenti++;
            System.out.println("Studente aggiunto: " + nome + ", Età: " + eta);
        } else {
            System.out.println("Registro pieno! Impossibile aggiungere altri studenti.");
        }
    }

    // Metodo per stampare la lista degli studenti
    public void stampaStudenti() {
        System.out.println("Lista degli studenti nel registro:");
        for (int i = 0; i < numeroStudenti; i++) {
            System.out.println((i + 1) + ". " + registro[i]); // Stampa ogni studente
        }
        if (numeroStudenti == 0) {
            System.out.println("Il registro è vuoto.");
        }
    }
}
