package Arranjo;


public class Arranjo{
	private int[] arr;
		
	public Arranjo(int[] arr) {
		this.arr = arr;
		}



	public double menor() {
		int menor = arr[0];
		for (int i = 1;  i < arr.length; i++) {
			if (arr[i] < menor) {
				menor = arr[i];
			
			}
		}
		return menor;
	}



	public double maior() {
		int maior = arr[0];
		for (int i = 1;  i > arr.length; i++) {
			if (arr[i] > maior) {
				maior = arr[i];
			}
		}
		return maior;
	}

	public double soma() {
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += arr[i];
		}
		return soma;
	}



	public double repeticoes(int [] arr, int numero) {
		int repeticoes = 0;
		for (int elemento : arr) {
			if (elemento == numero) {
				repeticoes ++;
			}
			
			
		}
		return repeticoes;
	}
	
	public double repeticoes2(int [] arr, int numero) {
		int repeticoes2 = 0;
		for (int elemento : arr) {
			if (elemento == numero) {
				repeticoes2 ++;
			}
			
			
		}
		return repeticoes2;
	
	}
	public double repeticoes3(int [] arr, int numero) {
		int repeticoes3 = 0;
		for (int elemento : arr) {
			if (elemento == numero) {
				repeticoes3 ++;
			}
			
			
		}
		return repeticoes3;
	
	}
}