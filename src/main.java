package app;

import classes.emprestimos.*;
import classes.membros.*;
import classes.multimidias.*;

public class main {
    public static void main(String[] args) {
        //Instanciando objeto LivroA
        Multimidia itemA = new Multimidia("Dom Quixote", "Miguel de Cervantes", "disponivel", "1234");
        
        //Acessando os atributos do objeto "LivroA" pelos getters:
        String titulo = itemA.getTitulo();
        String autor = itemA.getAutor();
        String idItem  = itemA.getId();
        
        //Criando set para mudar situacao do LivroA
        itemA.setSituacao("indisponivel");
        String situacao  = itemA.getSituacao();
        
        //Instanciando objeto MembroA
        Membro MembroA = new Membro("123", "Maria", 5);
        
        //Acessando os atributos do objeto "MembroA" pelos getters:
        String nome = MembroA.getNome();
        String idMembro = MembroA.getId();
        
        
        //Instanciando objeto FuncionarioA
        Funcionario FuncionarioA = new Funcionario("122", "Jose", "Bibliotecario");
        
        //Acessando os atributos do objeto "FuncionarioA" pelos getters:
        String funcao = FuncionarioA.getFuncao();
        String nomef = FuncionarioA.getNome();
        String idf = FuncionarioA.getId();
        
        
        //Instanciando o objeto EmprestimoA
        Emprestimo EmprestimoA = new Emprestimo("12/08/2023", "20/08/2023", 0, 0, MembroA);
        
        //Acessando os atributos do objeto "EmprestimoA" pelos getters:
        String NomeEmprestador = EmprestimoA.getEmprestador().getNome();
        Multimidia[] itensEmprestados = EmprestimoA.getitensEmprestados();
        int nItens = EmprestimoA.getNumItens();
        String dataEmprestimo = EmprestimoA.getDataEmprestimo();
        String dataDevolucao = EmprestimoA.getDataDevolucao();

        //Executando método
        itemA.determinarEmprestimo();
        
        EmprestimoA.addItemEmprestado(itemA);
        
        String tituloEmprestado = itensEmprestados[0].getTitulo();
        
        System.out.format("O membro(a) %s com id %s alugou o livro %s do autor(a) %s com o id %s, atraves do %s %s, portador do id %s. A data do emprestimo de %s do livro %s foi feito no dia %s e sua data de devolucao sera no dia %s, a situacao dele é %s",
                nome,
                idMembro,
                titulo,
                autor,
                idItem,
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