package classes.emprestimos;

public class Relatorio {
    private String relatorioMultas;
    private String estatisticas;
    
    public Relatorio(String relatorioMultas, String estatisticas) {
    	this.relatorioMultas = relatorioMultas;
    	this.estatisticas = estatisticas;
    }
    
    public String getRelatorioMultas() {
    	return relatorioMultas;
    }
    
    public String getEstatisticas() {
    	return estatisticas;
    }
}
