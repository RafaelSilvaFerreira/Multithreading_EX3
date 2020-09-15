package Multithreading;

public class ThreadVetor extends Thread{
	private int threadName;
	private int[] vetor;
	private String name;
	
public ThreadVetor (int threadName, int vetor[]){
	this.threadName = threadName;
	this.vetor = vetor;
	this.name  = "Thread " + threadName;

}

public void run(){
	System.out.println("Iniciando "+
	this.name +
	"...");
	int soma=0;
	for (int i=0; i<vetor.length; i++){
		soma=soma+vetor[i];
	}
	System.out.println("Valor total da linha "+
	threadName+
	": "+
	soma);
}



}