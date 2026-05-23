package com.example;

public class Cancion {
    
    private int idCancion;
    private String artista;
    private Double horasEscuchado;

    public Cancion(int idCancion, String artista, Double horasEscuchadas){
        
        this.idCancion = idCancion;
        this.artista = artista;
        this.horasEscuchado = horasEscuchadas;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setHorasEscuchado(Double horasEscuchado) {
        this.horasEscuchado = horasEscuchado;
    }

    public Double getHorasEscuchado() {
        return horasEscuchado;
    }


    public int getIdCancion() {
        return idCancion;
    }

    public String getArtista() {
        return artista;
    }   


        public void listarDetalle() {
        System.out.println("Cancion: " + idCancion + 
                            " artista=" + artista + 
                            ", horasEscuchado=" + horasEscuchado );
    }
}
