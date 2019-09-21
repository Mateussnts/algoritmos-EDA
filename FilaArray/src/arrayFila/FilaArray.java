package arrayFila;

import java.util.Scanner;

class FilaArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tamanho = Integer.parseInt(scan.nextLine());
		FilaArray fila = new FilaArray(tamanho);
		
		String operacao = "";
		String[] entrada;
		
		while(!operacao.equals("end")) {
			
			entrada = scan.nextLine().split(" ");
			
			operacao = entrada[0];
			
			
			if(operacao.equals("add")) {
				int numero = Integer.parseInt(entrada[1]);
				fila.add(numero);
			}
			else if(operacao.equals("remove")) {
				fila.remove();
			}
			else if(operacao.equals("element")) {
				System.out.println(fila.primeiro());
			}
			else if(operacao.equals("print")) {
				System.out.println(fila.print());
			}
		}
		
		scan.close();
	}
	
	private int[] array;
	private int corpo;

	public FilaArray(int tamanho) {
		this.array = new int[tamanho];
		this.corpo = -1;
	}

	public void add(int elemento) {
		if (!isFull()) {
			this.array[++corpo] = elemento;
		} else {
			System.out.println("full");
		}
	}

	public int remove() {
		int retorno = -1;
		if (!isEmpty()) {
			retorno = array[0];
			shiftLeft();
			this.corpo--;
		} else {
			System.out.println("empty");
		}
		return retorno;
	}

	private void shiftLeft() {
		for (int i = 0; i < corpo; i++) {
			array[i] = array[i + 1];
		}

	}

	public String primeiro() {
		String result = "empty";
		if (!isEmpty()) {
			result = "" + array[0];
		}
		return result;
	}

	public boolean isEmpty() {
		return corpo == -1;
	}

	public boolean isFull() {
		return corpo == array.length - 1;
	}

	public String print() {
		String retorno = "";
		if(isEmpty()) {
			retorno = "empty ";
		} else {
			retorno = "";
			for (int i = 0; i <= corpo; i++) {
				retorno += array[i] + " ";
			}
		}
		return retorno.substring(0, retorno.length()-1);
	}
}
