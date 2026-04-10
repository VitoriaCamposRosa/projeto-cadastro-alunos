/**
 * Classe que representa um Aluno.
 * Implementa Comparable para permitir ordenação padrão por nota final.
 */
public class Aluno implements Comparable<Aluno> {

    private String nome;
    private int idade;
    private double nota_final;

    public Aluno(String nome, int idade, double nota_final) {
        this.nome = nome;
        this.idade = idade;
        this.nota_final = nota_final;
    }

    /**
     * Retorna as variáveis da Classe.
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota_final() {
        return nota_final;
    }

    public void setNota_final(double nota_final) {
        this.nota_final = nota_final;
    }

    /**
     * Retorna a situação do aluno (Aprovado/Reprovado).
     */
    public String getSituacao() {
        if (nota_final >= 7.0) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    /**
     * Retorna uma classificação baseada na nota.
     */
    public String getClassificacao() {
        if (nota_final >= 9.0) return "Excelente";
        else if (nota_final >= 7.0) return "Bom";
        else if (nota_final >= 5.0) return "Regular";
        else return "Ruim";
    }

    /**
     * Define a ordenação padrão por nota final (decrescente).
     */
    @Override
    public int compareTo(Aluno outro) {
        return Double.compare(outro.nota_final, this.nota_final);
    }

    /**
     * Representação textual do objeto Aluno.
     */
    @Override
    public String toString() {
        return nome + " - " + idade + " anos - Nota: " + nota_final +
               " - " + getSituacao() +
               " -  " +getClassificacao();
    }

}
