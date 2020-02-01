package PrestamoDeLibros;

public class Libro {
	
	private String titulo;
	private String añoEdicion;
	private String autor;
	private boolean estado;
	private String codigo;
	
	
	public Libro(String titulo, String añoEdicion, String autor, boolean estado, String codigo) {
		this.titulo = titulo;
		this.añoEdicion = añoEdicion;
		this.autor = autor;
		this.estado = true;
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAñoEdicion() {
		return añoEdicion;
	}


	public void setAñoEdicion(String añoEdicion) {
		this.añoEdicion = añoEdicion;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "[Titulo---->" + titulo + ", añoEdicion---->" + añoEdicion + ", autor---->" + autor + ", codigo---->" + codigo + "]";
	}
	
}
