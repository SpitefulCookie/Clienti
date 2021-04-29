import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Database {

    private static final String DELIMITER = "¥";

    private String db;

    private Map<Integer, Cliente> tuple; 

    private BufferedReader br;

    public Database(String fileName){ 

        this.db = fileName;

        this.tuple = new HashMap<>();

        try {
            
            br = new BufferedReader(new FileReader(fileName)); //Creazione di un buffered reader 

            String fLine = br.readLine(); //Salto la riga d'intestazione 

            do{

                fLine = br.readLine();

                if(fLine != null){
					
					String[] datiCliente = fLine.split(DELIMITER);

					int codCliente = Integer.parseInt(datiCliente[0]);

					Cliente c = new Cliente(codCliente, datiCliente[1],datiCliente[2],datiCliente[3],datiCliente[4],datiCliente[5]); //Creazione nuova istanza di cliente contenente i dati letti

					this.tuple.put(codCliente, c);

				}

            }while (fLine != null);

        } catch (IOException e){

            System.out.println("File non trovato!");

        }

    }

    public Cliente getValore(int codCliente){

        return this.tuple.get(codCliente);

    }

    public String getDBName(){

        return this.db;

    }

}
