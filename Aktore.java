package praktika1;

public class Aktore {
    //atributuak
    private String izena;
    private ListaPelikula lista;

    //eraikiztailea
    public Aktore(String pIzena) {
        this.izena=pIzena;
        this.lista=new ListaPelikula();
    }
    public String getIzena() {
        return this.izena;
    }
	
}