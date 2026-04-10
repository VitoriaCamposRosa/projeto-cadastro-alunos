import java.util.Comparator;

/**
 * Comparator para ordenar alunos pela idade.
 * Em caso de empate, ordena pelo nome.
 */
public class ComparatorIdade implements Comparator<Aluno> {

    /**
     * Compara dois alunos pela idade e, se necessário, pelo nome.
     */
     @Override
    public int compare(Aluno a, Aluno b) {
        int resultado = Integer.compare(a.getIdade(), b.getIdade());

        if (resultado == 0) {
            return a.getNome().compareToIgnoreCase(b.getNome());
        }

        return resultado;
    }
}