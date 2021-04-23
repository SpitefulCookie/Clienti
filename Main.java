public class Main{

    public static void main(String[] args) {
        
        Database db = new Database ("Clienti.db");

        System.out.println(db.getValore(5, "Cognome"));

    }

}