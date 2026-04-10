import java.util.*;

/**
 * Classe principal para execução do programa.
 * Responsável por criar alunos, ordenar e exibir resultados.
 */
public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        // Inserção dos alunos
        alunos.add(new Aluno("Vitória", 20, 9.5));
        alunos.add(new Aluno("Henry", 20, 8.5));
        alunos.add(new Aluno("Ana", 26, 5.5));
        alunos.add(new Aluno("ana", 22, 7.8));
        alunos.add(new Aluno("Maria", 27, 4.9));
        alunos.add(new Aluno("João", 28, 8.0));
        alunos.add(new Aluno("Adiely", 20, 6.7));
        alunos.add(new Aluno("Eduardo", 28, 7.0));
        alunos.add(new Aluno("Helena", 26, 6.0));
        alunos.add(new Aluno("Igor", 29, 5.5));
        alunos.add(new Aluno("Mario", 19, 3.2));

        System.out.println("\nVERIFICANDO ORDENAÇÕES E ESTATÍSTICAS");

        // Ordenação por nota (Comparable)
        System.out.println("\n--- Ordenado por Nota ---");
        Collections.sort(alunos);
        alunos.forEach((System.out::println));

        // Ordenação por nome
        System.out.println("\n--- Ordenado por Nome ---");
        Collections.sort(alunos, new ComparatorNome());
        alunos.forEach((System.out::println));

        // Ordenação por idade
        System.out.println("\n--- Ordenado por Idade ---");
        Collections.sort(alunos, new ComparatorIdade());
        alunos.forEach((System.out::println));

        // Estatísticas da turma
        mostrarEstatisticas(alunos);

    }

    /**
     * Calcula e exibe estatísticas da turma.
     */
    public static void mostrarEstatisticas(List<Aluno> alunos) {
        double soma = 0;
        int aprovados = 0;
 
        for (Aluno a : alunos) {
            soma += a.getNota_final();

            if (a.getNota_final() >= 7) {
                aprovados ++;
            }
                    
        }

        double media = soma / alunos.size();

        System.out.println("\n--- Estatísticas ---");
        System.out.println("Média da turma " + media);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + (alunos.size() - aprovados));


    }
}