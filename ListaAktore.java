package praktika1;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaAktore {

    //atributuak
    private ArrayList <Aktore> lista;
    private static ListaAktore nireListaAktore=null;

    public ListaAktore() {
        this.lista=new ArrayList<Aktore>();
    }

    //singleton patroia
       public static ListaAktore getListaAktore()
       {
           if (nireListaAktore==null)
               nireListaAktore= new ListaAktore();
           return nireListaAktore;
       }
       
       public void gehituAktorea(Aktore a) {
           this.lista.add(a);
       }
       public Aktore getAktore(int ind) {
           return(this.lista.get(ind));
       }
    //gainontzeko metodoak
	    public void cargarLista(){
	    	
	         try{
	             Scanner entrada = new Scanner(new FileReader("Z:\\movies-dir\\actors_and_films_1970.txt"));
	
	             String linea;
	             while (entrada.hasNext()) {
	                 linea = entrada.nextLine();
	
	                 //System.out.println(linea);
	                 String datos[] = linea.split("\\#+"); // uno o más espacios
	        		 //for (String s: datos) System.out.println(s);
	        		 Aktore a= new Aktore(datos[1]);
	        		 gehituAktorea(a);
	        		 
	
	             }
	             entrada.close();
	         }
	         catch(IOException e){
	             e.printStackTrace();
	        }
	    }
	    public void inprimatuAktoreak() {
	    	 for(int i=0;i<this.lista.size();i++) {
	    		 
	    		 
	    		 System.out.println(this.lista.get(i).getIzena());
	    
	    	 }

	    }
}	    