package semafaro;

public class Interrupcao {
	static class Finalizacao implements Runnable {
	private boolean finalizar = false;

	void notificarFinalizacao() {
	finalizar = true;
	}
	
	Semafaro semafaroVerde = new Semafaro();
	Semafaro semafaroAmarelo = new Semafaro();
	Semafaro semafaroVermelho = new Semafaro();

	public void run() {	
		System.out.println("Tecle Enter para parar! \n");
		while (!finalizar) {
			semafaroVerde.verde(2000);
			semafaroAmarelo.amarelo(300);
			semafaroVermelho.vermelho(1000);
		}
	}
	}

}
	
