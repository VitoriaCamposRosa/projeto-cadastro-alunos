import java.util.Comparator;

/**
 * Comparator para ordenar alunos pelo nome.
 * Ignora diferenças entre maiúsculas e minúsculas.
 */
public class ComparatorNome implements Comparator<Aluno> {

    /**
     * Compara dois alunos pelo nome.
     */
    @Override
    public int compare(Aluno a, Aluno b) {
        return a.getNome().compareToIgnoreCase(b.getNome());
    }
}