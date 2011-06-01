public class FizzBuzz {

	public String obterSequencia(int numeroMax) {
		String sequencia = "";

		for (int i = 1; i <= numeroMax; i++) {
			if ((i % 3 != 0) && (i % 5 != 0)) {
			  int resto = i%10;
			  if(resto==3){
				  sequencia += "fizz";
			  }else{
				sequencia += i;
			  }
			} else {
				if (i % 3 == 0) {
					sequencia += "fizz";
				}  
				if (i % 5 == 0) {
					sequencia += "buzz";
				}
				
			}
			if (i != numeroMax) {
				sequencia += ",";
			}
		}
		return sequencia;

	}

}
