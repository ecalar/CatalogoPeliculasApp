package servicio;

import dominio.Pelicula;

public interface IServicioPeliculas {
    public void listarPeliculas();

    public void agregarPelicula(Pelicula pelicula);

    public void buscarPelicula(Pelicula pelicula);
}
