package evf.javadoc.original;

public class Artista {
    String nombreArtista;
    String generoMusica;

    

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    //Alberto Naranjo Moya
    public void aprobar(){
        System.out.println("Voy a aprobar");
    }

    //Este metodo cambia el genero de musica del artista.
    public void cambioGenero(){
        generoMusica = "Rock";
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


