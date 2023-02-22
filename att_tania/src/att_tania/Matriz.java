package att_tania;

public class Matriz {
	public static void main(String[] args) {
		int botoes[][] = { { 3, 1, 3 }, { 6, 5, 5 } };
		int camisas[][] = { { 100, 50 }, { 50, 100 }, { 50, 50 } };
		int resultados[][] = new int[2][2];
		for (int i = 0; i < botoes.length; i++) {
			for (int j = 0; j < botoes.length; j++) {
				for(int h = 0; h < 3; h++) {
				resultados[i][j] += botoes[i][h]*camisas[h][j];}
			}
		}
		System.out.println("Esta foi a tabela de botoes usados em maio e junho:");
		System.out.println(" P | G");
		for(int i = 0; i < resultados.length;i++) {
			for(int j = 0; j < resultados.length;j++) {
				System.out.print(resultados[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}