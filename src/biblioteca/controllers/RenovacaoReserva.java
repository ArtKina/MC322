package biblioteca.controllers;

import classes.multimidias.Multimidia;

public class RenovacaoReserva {
	private Multimidia item;
	
	public RenovacaoReserva(Multimidia item) {
		this.item = item;
	}
	
	public Multimidia getItem() {
		return item;
	}
}
