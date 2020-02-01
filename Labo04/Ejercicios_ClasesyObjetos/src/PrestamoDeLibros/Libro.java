package PrestamoDeLibros;

public class Libro {
	
	private String titulo;
	private String a�oEdicion;
	private String autor;
	private boolean estado;
	private String codigo;
	
	
	public Libro(String titulo, String a�oEdicion, String autor, boolean estado, String codigo) {
		this.titulo = titulo;
		this.a�oEdicion = a�oEdicion;
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


	public String getA�oEdicion() {
		return a�oEdicion;
	}


	public void setA�oEdicion(String a�oEdicion) {
		this.a�oEdicion = a�oEdicion;
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
		return "[Titulo---->" + titulo + ", a�oEdicion---->" + a�oEdicion + ", autor---->" + autor + ", codigo---->" + codigo + "]";
	}
	
}
