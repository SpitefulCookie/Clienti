public class Cliente {

    private int codCliente;
    
    private String nome;

    private String cognome;

    private String indirizzo;

    private String tipo;

    private int giornoDiNascita;

    private int meseDiNascita;

    private int annoDiNascita;

    public Cliente(String codCliente, String nome, String cognome, String indirizzo, String tipo, String dataDiNascita){ 

        this.codCliente = Integer.parseInt(codCliente);

        this.nome = nome;

        this.cognome = cognome;

        this.indirizzo = indirizzo;

        this.tipo = tipo;

        String[] buffer = dataDiNascita.split("/");

        this.giornoDiNascita = Integer.parseInt(buffer[0]);

        this.meseDiNascita = Integer.parseInt(buffer[1]);

        this.annoDiNascita = Integer.parseInt(buffer[2]);

    }

}
