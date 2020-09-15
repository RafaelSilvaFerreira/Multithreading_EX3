package Multithreading;

import java.util.Random;


public class Main {


public static void main (String [] args){
	Random alea = new Random();
	
	int[][] matriz = new int[3][5];
	
	for (int i=0; i<3; i++){
		for (int j=0; j<5; j++){
			matriz[i][j]= alea.nextInt(99)+1;
		}
	}
	
	ThreadVetor thread1= new ThreadVetor(1,matriz[0]);
	ThreadVetor thread2= new ThreadVetor(2,matriz[1]);
	ThreadVetor thread3= new ThreadVetor(3,matriz[2]);
	
	thread1.run();
	thread2.run();
	thread3.run();
}

}
