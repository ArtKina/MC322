package app;

import classes.Livro;

public class main {
    public static void main(String[] args) {
        //Instanciando objeto LivroA
        Livro LivroA = new Livro("Dom Quixote", 2, "Miguel de Cervantes", "1234", "disponivel");
        
        //Acessando os atributos do objeto "LivroA" pelos getters:
        String titulo = LivroA.getTitulo();
        int edicao = LivroA.getEdicao();
        String autor = LivroA.getAutor();
        String isbn  = LivroA.getIsbn();
        
        //Criando set para mudar situacao do LivroA
        LivroA.setSituacao("indisponivel");
        String situacao  = LivroA.getSituacao();
        
        //Instanciando objeto MembroA
        Membro MembroA = new Membro("123", "Maria");
        
        //Acessando os atributos do objeto "MembroA" pelos getters:
        String nome = MembroA.getNome();
        String id = MembroA.getId();
        
        
        //Instanciando objeto FuncionarioA
        Funcionario FuncionarioA = new Funcionario("122", "Jose", "Bibliotecario");
        
        //Acessando os atributos do objeto "FuncionarioA" pelos getters:
        String funcao = FuncionarioA.getFuncao();
        String nomef = FuncionarioA.getNome();
        String idf = FuncionarioA.getId();
        
        
        //Instanciando o objeto EmprestimoA
        Emprestimo EmprestimoA = new Emprestimo(LivroA, "12/08/2023", "20/08/2023", 0, 0, MembroA);
        
        //Acessando os atributos do objeto "EmprestimoA" pelos getters:
        String NomeEmprestador = EmprestimoA.getEmprestador().getNome();
        String tituloEmprestado = EmprestimoA.getLivroEmprestado().getTitulo();
        String dataEmprestimo = EmprestimoA.getDataEmprestimo();
        String dataDevolucao = EmprestimoA.getDataDevolucao();

        //Executando método
        LivroA.determinarEmprestimo();
        

        System.out.format("O membro(a) %s com id %s alugou o livro %s da %d edicao e do autor(a) %s com o ISBN %s, atraves do %s %s, portador do id %s. A data do emprestimo de %s do livro %s foi feito no dia %s e sua data de devolucao sera no dia %s, a situacao dele é %s",
                nome,
                id,
                titulo,
                edicao,
                autor,
                isbn,
                funcao,
                nomef,
                idf,
                NomeEmprestador,
                tituloEmprestado,
                dataEmprestimo,
                dataDevolucao,
                situacao
                );
    }
}