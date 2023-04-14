import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> resultados = new ArrayList<String>();
		int entradas = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < entradas; i++) {
			String[] numeros = input.nextLine().replaceAll(" ", " ").split(" ");
			int valor1 = Integer.parseInt(numeros[0]);
			int valor2 = Integer.parseInt(numeros[1]);

			if (valor1 < 0) {
				resultados.add("divisao impossivel");
			} else {
				Double resultado = (double) valor1 / valor2;
				String b = String.valueOf(resultado);
				resultados.add(b);
			}
		}

		for (int i = 0; i < resultados.size(); i++) {
			String resultadoAtual = resultados.get(i);
			try {
				Double d = Double.parseDouble(resultadoAtual);
				System.out.printf("%.1f\n", d);
			} catch (NumberFormatException e) {
				System.out.println(resultadoAtual);
			}
		}
	}
}
