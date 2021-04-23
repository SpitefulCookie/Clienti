import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import java.util.Map;

public class Database {

    private final String delimiter = "¥";

    private String db;

    private Map<String, Integer> schema; 

    private BufferedReader br;

    public Database(String fileName){ //Metodo per leggere dal file e costruire uno schema

        this.db = fileName;

        try {
            
            br = new BufferedReader(new FileReader(fileName));   

            String fLine = br.readLine();

            String[] buffer = fLine.split(delimiter);
            
            this.schema = new HashMap<String, Integer>();

            for (Integer i=0; i<buffer.length; i++){

                schema.put(buffer[i], i); //lo schema, tramite metodo get(String, Integer) restituirà un valore intero

            }

            /*
                for (String s : buffer){ // debug

                    System.out.println("Valore ottenuto da \""+s+"\": "+ schema.get(s));

                }
            */

        } catch (IOException e){

            System.out.println("File non trovato!");

        }


    }

    public String getValore(int indice, String campo){

        try {
            
            br = new BufferedReader(new FileReader(this.db));  

            String fLine = br.readLine();

            String[] buffer;

            fLine = br.readLine();

            do{

                buffer = fLine.split(delimiter);

                if(Integer.parseInt(buffer[0])==indice){

                    return buffer[this.schema.get(campo)];

                }

                fLine = br.readLine();
                
            }while (fLine != null);

        } catch (IOException e){

            System.out.println("File non trovato!");

        }

        return "Utente non trovato";

    }

}
