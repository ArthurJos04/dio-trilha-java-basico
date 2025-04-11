package main.java.list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void removerLivro(Livro livro) {

        List<Livro> livrosParaRemover = new ArrayList<>();

        for (Livro l : livroList) {
            if(l.getTitulo().equals(livro.getTitulo())) {
                livrosParaRemover.add(l);
            }
        }

        livroList.removeAll(livrosParaRemover);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l: livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for(Livro l: livroList) {
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }

        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()) {
            for(Livro l: livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 1", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 2", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 3", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(1994, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));
    }
}
