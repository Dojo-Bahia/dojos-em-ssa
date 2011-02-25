package com.beerkeeper;

public class BeerKeeperBC {
	public static final int LATA = 350;

	public int getQuantidadeLatasPorMililitros(int mililitros) {
		return mililitros / LATA;
	}

	public String getMensagemPorLatas(int quantidade) {
		String ret = "Vamos começar a beber!";
		if (quantidade <= 3) {
			ret = "Vamos lá! Iniciando: " + (quantidade * LATA) + " ml = " + quantidade + " latas";
		} else if (quantidade <= 6) {
			ret = "Álcool pra dentro! " + (quantidade * LATA) + " ml = " + quantidade + " latas";
		} else if (quantidade <= 12) {
			ret = "Tá ficando legal! " + (quantidade * LATA) + " ml = " + (quantidade) + " latas";
		} else if (quantidade <= 20) {
			ret = "Já tá ficando azuado! " + (quantidade * LATA) + " ml = " + (quantidade) + " latas";
		} else if (quantidade <= 25) {
			ret = "Tá rodando! " + (quantidade * LATA) + " ml = " + (quantidade) + " latas";
		} else if (quantidade <= 30) {
			ret = "Tá fudido! " + (quantidade * LATA) + " ml = " + (quantidade) + " latas";
		} else if (quantidade <= 33) {
			ret = "Chamou Rauuuuuuuuuuuul! " + (quantidade * LATA) + " ml = " + (quantidade) + " latas";
		} else if (quantidade <= 35) {
			ret = "Desmaiou! " + (quantidade * LATA) + " ml = " + (quantidade) + " latas";
		} else if (quantidade > 35) {
			ret = "Pode enterrar! " + (quantidade * LATA) + " ml = " + (quantidade) + " latas";
		}
		return ret;
	}

}
