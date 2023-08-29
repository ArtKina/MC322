package classes.emprestimos.relatorio;

public class Relatorio {

    private SecoesRelatorio[] secoesRelatorios; //Implementação da relação de composição
    
    public Relatorio(String titulo, String conteudo) {
    	SecoesRelatorio secoesRelatorios = new SecoesRelatorio(titulo, conteudo);
    }

    public void gerarRelatorio() {
        System.out.println("Relatório:");
        for (SecoesRelatorio secao : secoesRelatorios) {
            System.out.println("Seção: " + secao.getTitulo());
            System.out.println("Conteúdo: " + secao.getConteudo());
            System.out.println("---------------------------------------");
        }
    }
}
