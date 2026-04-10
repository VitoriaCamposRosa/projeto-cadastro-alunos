# Projeto: Cadastro e Ordenação de Alunos em Java

## Descrição
Este projeto tem como objetivo implementar um sistema simples de cadastro de alunos em Java, permitindo a organização e ordenação dos dados utilizando conceitos fundamentais de programação orientada a objetos.
Foram aplicadas interfaces como Comparable e Comparator para demonstrar diferentes formas de ordenação.

---

## Funcionalidades
- Cadastro automático de alunos

### Ordenação por:
- Nota final (ordem padrão - Comparable)
- Nome (Comparator)
- Idade (Comparator)
- Tratamento de empate (idade → ordena por nome)
- Exibição da lista antes e depois das ordenações

### Estatísticas da turma:
- Média das notas
- Quantidade de aprovados e reprovados

### Classificação dos alunos:
- Excelente
- Bom
- Regular
- Ruim
  
### Situação do aluno:
- Aprovado / Reprovado

---
  
## Conceitos Utilizados
- Programação Orientada a Objetos (POO)
- Encapsulamento
- Interfaces (Comparable e Comparator)
- Collections (ArrayList, Collections.sort)

---

## Como Executar
- Abra o projeto no VSCode ou outra IDE Java
- Compile os arquivos .java
- Execute a classe Main

---

## Detalhes das Ordenações

### Ordenação por Nota
- Implementada na própria classe Aluno
- Utiliza a interface Comparable
- Ordena em ordem decrescente (maior nota primeiro)

### Ordenação por Nome
- Implementada na classe ComparatorNome
- Ignora diferenças entre letras maiúsculas e minúsculas
  
### Ordenação por Idade
- Implementada na classe ComparatorIdade
- Em caso de empate, ordena pelo nome

---

## Observação
Este projeto tem como foco o aprendizado e aplicação prática de conceitos de Java, especialmente no uso de ordenação de objetos.
