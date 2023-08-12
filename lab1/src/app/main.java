package app;

import app.Livro;

public class main {
    public static void main(String[] args) {
        //Criando objeto LivroA
        Livro LivroA = new Livro("Dom Quixote", 2, "Miguel de Cervantes", "1234");

        //Criando objeto MembroA
        Membro MembroA = new Membro("123", "Maria");

        //Criando objeto FuncionarioA
        Funcionario FuncionarioA = new Funcionario("122", "Jose", "Bibliotecario");

        //Criando o objeto EmprestimoA
        Emprestimo EmprestimoA = new Emprestimo(LivroA, "12/08/2023", "20/08/2023", 0, 0, MembroA);

        System.out.format("O membro(a) %s com id %s alugou o livro %s da %d edicao e do autor(a) %s com o ISBN %s, atraves do %s %s, portador do id %s. A data do emprestimo de %s do livro %s foi feito no dia %s e sua data de devolucao sera no dia %s",
                MembroA.nome,
                MembroA.id,
                LivroA.titulo,
                LivroA.edicao,
                LivroA.autor,
                LivroA.isbn,
                FuncionarioA.funcao,
                FuncionarioA.nome,
                FuncionarioA.id,
                EmprestimoA.emprestador.nome,
                EmprestimoA.livroEmprestado.titulo,
                EmprestimoA.dataEmprestimo,
                EmprestimoA.dataDevolucao);
    }
}
