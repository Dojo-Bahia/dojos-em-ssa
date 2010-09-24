import java.util.Arrays;

public class SuperSenha {

	public static Resultado palpite(final Palpite palpite) {
		// TODO Auto-generated method stub
		return null;
	}

	private String segredo;

	public SuperSenha() {
		this.segredo = "ABCDE";
	}

	public String getResultado() {
		return this.segredo;
	}

	public String testarPalpite(final String palpite) {
		if (this.segredo.equals(palpite)) {
			return "PPPPP";
		}

		// int posicoesCertas = 0;qtdPosicoesErradas
		String resultado = "";
		for (int i = 0; i < palpite.length(); i++) {
			char charPalpite = palpite.charAt(i);
			if (this.segredo.indexOf(charPalpite) == -1) {
				resultado += " ";
			} else if (this.segredo.indexOf(charPalpite) != i) {
				resultado += "B";
			} else {
				resultado += "P";
			}
		}

		char[] charArray = resultado.toCharArray();
		Arrays.sort(charArray);

		return new String(charArray);
	}
}
