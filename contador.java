import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
        contar(parametroUm, parametroDois);
		
		} catch (IllegalArgumentException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
    static void contar(int parametroUm, int parametroDois) throws IllegalArgumentException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		if (parametroUm > parametroDois){
			System.out.println("O primeiro parametro é maior que o segundo parametro\nPrimeiro parametro " + parametroUm + "\nSegundo parametro " + parametroDois);
//			System.out.println("Primeiro parametro " + parametroUm);
		}else{
			System.out.println("O segundo parametro é maior que o primeiro parametro\nSegundo parametro " + parametroDois + "\nPrimeiro parametro " + parametroUm);
//            System.out.println("Segundo parametro " + parametroDois);
		}

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
	}
}