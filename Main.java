public class Main{

    public static void main(String[] args) {
        
        Database db = new Database ("Clienti.db");

        try{
        
            System.out.println();
            System.out.println(db.getValore(2).toString());

            System.out.println();
            System.out.println(db.getValore(5).toString());

            System.out.println();
            System.out.println(db.getValore(0).toString());

        } catch (NullPointerException e){

            System.out.println("Cliente non presente nel database");

        }

    }

}
