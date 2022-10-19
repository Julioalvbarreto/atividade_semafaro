package semafaro;

import java.util.Scanner;

import semafaro.Interrupcao.Finalizacao;

public class MainSemafaro {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Finalizacao semafaro = new Finalizacao();
		new Thread(semafaro).start();

		new Scanner(System.in).hasNextLine();	
		semafaro.notificarFinalizacao(); 
	}
		

}
