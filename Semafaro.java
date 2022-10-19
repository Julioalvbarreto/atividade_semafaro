package semafaro;

public class Semafaro extends Thread{
	public int temp;
	
	
	public void verde(int temp) {
		System.out.println("Verde");
		
		try {
			Thread.sleep(temp);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void amarelo(int temp) {
		System.out.println("Amarelo");
		
		try {
			Thread.sleep(temp);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void vermelho(int temp) {
		System.out.println("Vermelho \n");
		
		try {
			Thread.sleep(temp);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
		
}
