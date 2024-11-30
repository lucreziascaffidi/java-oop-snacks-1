package snack1;

// Classe 
public class Studente {
    private String name;
    private String surname;
    private int age;

    // Metodo costruttore
    public Studente(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Metodo che restituisce nome, cognome ed età dello studente
    public String theStudent() {
        return this.name + this.surname + ", " + String.valueOf(this.age) + " anni";
    }

}