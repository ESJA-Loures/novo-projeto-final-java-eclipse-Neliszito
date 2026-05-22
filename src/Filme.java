public class Filme {
	private String titulo;
	private int ano;
	
	public Filme(String titulo, int ano) {
		this.titulo = titulo;
		this.ano = ano;
	}
	public void setFilme(String titulo, int ano) {
		this.titulo = titulo;
		this.ano = ano;
	}
	public String toString() {
		
		StringBuilder sb = new StringBuilder("");
		sb.append("Título: " + titulo + " | Ano: " + ano);
		return sb.toString();
	}
}
