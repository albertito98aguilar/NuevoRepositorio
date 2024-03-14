package evf.javadoc.original;

public class Artista {
    String nombreArtista;

    

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    //Alberto Naranjo Moya
    public void aprobar(){
        System.out.println("Voy a aprobar");
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
    
}


