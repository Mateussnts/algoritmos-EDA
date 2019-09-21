public class Paridade {
	
	public static void main(String[] args) {
		String entrada = "alo mundo";
		String[] retorno = paridade(entrada);
		
		for(String letra: retorno){
			System.out.println(letra);
		}
	}

	public static String[] paridade(String palavra) {
		String[] array = toBinary(palavra, 7).split(" ");
		String[] retorno = new String[array.length];
		
		for(int i = 0; i < array.length; i++){
			String letra = array[i];
			int cont = 0;
			for(int j = 0; j < letra.length(); j++){
				if(letra.substring(j).startsWith("1")){
					cont++;
				}
			}
			if(cont % 2 == 0){
				retorno[i] = "0" + letra;
			}else{
				retorno[i] = "1" + letra;
			}
		}
		
		return retorno;
	}
	
	public static String toBinary(String palavra, int bitsDesejados) {
	    String resultado = "";
	    String palavraCodificada;
	    int tamanhoBits;
	    char[] array = palavra.toCharArray();

	    for (int i = 0; i < array.length; i++) {
	        palavraCodificada = Integer.toBinaryString(array[i]);
	        tamanhoBits = palavraCodificada.length();
	        if(tamanhoBits != bitsDesejados) {
	            tamanhoBits = bitsDesejados - tamanhoBits;
	            if (tamanhoBits == bitsDesejados) {
	                resultado += palavraCodificada;
	            } else if (tamanhoBits > 0) {
	                for (int j = 0; j < tamanhoBits; j++) {
	                    resultado += "0";
	                }
	                resultado += palavraCodificada;
	            }
	        } else {
	            resultado += palavraCodificada;
	        }
	        resultado += " ";
	    }

	    return resultado;
	}
}