import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cliente {

    private int codCliente;
    
    private String nome;

    private String cognome;

    private String indirizzo;

    private String tipo;

    private Calendar dataNascita;

    public Cliente(int codCliente, String nome, String cognome, String indirizzo, String tipo, String dataDiNascita){ 

        this.codCliente = codCliente;

        this.nome = nome;

        this.cognome = cognome;

        this.indirizzo = indirizzo;

        this.tipo = tipo;

        String[] buffer = dataDiNascita.split("/");

        this.dataNascita = Calendar.getInstance();

        if(!tipo.equals("Azienda")){

            this.dataNascita.set(Integer.parseInt(buffer[2]), Integer.parseInt(buffer[1]),Integer.parseInt(buffer[0]));

        }

    }

    @Override
    public String toString(){

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/mm/yyyy");

        String data = formatoData.format(dataNascita.getTime());
        
        if(!this.tipo.equals("Azienda")){

            return "Codice Cliente: "+ this.codCliente +"\t\tTipo: "+ this.tipo +"\nCognome: " + this.cognome + "\t\tNome: " + this.nome + "\nIndirizzo: " + this.indirizzo + "\nData di nascita: " + data;

        } else{

            return "Codice Cliente: "+ this.codCliente +"\t\tTipo: "+ this.tipo +"\nNome: " + this.nome + "\nIndirizzo: " + this.indirizzo;

        }

    }

}
