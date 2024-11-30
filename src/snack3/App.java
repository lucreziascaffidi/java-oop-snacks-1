package snack3;

public class App {

    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();

        registro.aggiungiStudente("Mario Rossi", 20);
        registro.aggiungiStudente("Giulia Bianchi", 22);
        registro.aggiungiStudente("Luca Verdi", 19);
        registro.aggiungiStudente("Lucrezia Scaffidi", 29);
        registro.aggiungiStudente("Giovanni Izzo", 25);
        registro.aggiungiStudente("Jacopo Mastro", 20);
        registro.aggiungiStudente("Orsetta Liberato", 19);
        registro.aggiungiStudente("Etta James", 50);
        registro.aggiungiStudente("Lucia", 19);

        registro.stampaStudenti();
    }

}
