import java.util.ArrayList;

public class Videoteca {
	private String nome = "Os meus filmes";
	private ArrayList<Filme> filmes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public int totalFilmes() {
		return filmes.size();
	}

	public void listarFilmes() {
		System.out.println("=== " + nome + " ===");
		if(filmes.isEmpty()){
			System.out.println("Está vazio.");
		}else{
			for (int i = 0; i < filmes.size(); i++) {
				System.out.println((i + 1) + ". " + filmes.get(i));
			}
			System.out.println("======");
		}
		
	}
	
	public void adicionarFilme(Filme filme) {
		filmes.add(filme);
	}

	public void apagarFilme(int numero) {
		filmes.remove(numero - 1);
	}
	
	public void editarFilme(int numero, String novoTitulo, int ano) {
		filmes.get(numero - 1).setFilme(novoTitulo, ano);
	}
}
