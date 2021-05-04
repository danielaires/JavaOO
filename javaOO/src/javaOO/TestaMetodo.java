package javaOO;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contadoPaulo = new Conta();
		contadoPaulo.saldo = 100;
		contadoPaulo.deposita(50);
		System.out.println(contadoPaulo.saldo);

		boolean conseguiuRetirar = contadoPaulo.saca(20);
		System.out.println(contadoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contadaMarcela = new Conta();
		contadaMarcela.deposita(1000);

		boolean sucessoTransferencia = contadaMarcela.transfere(300, contadoPaulo);
		if (sucessoTransferencia) {
			System.out.println("Transferencia de sucesso!!");
		} else {
			System.out.println("Faltou dinheiro");

		}
		System.out.println(contadaMarcela.saldo);
		System.out.println(contadoPaulo.saldo);

	}

}
