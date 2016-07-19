package com.arianasantiago.matriz;

public class Matriz 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//declaro matriz
		int[] mimatriz=new int[10];
		//declaro variables para mi operacion
		int a=10;
		int b=5;
		//bucle for para llenar matriz:mi matriz
		for( int i=0;i<mimatriz.length;i++)
		{
			mimatriz[i]=a;
			//imprimo matriz
			System.out.println("mi matriz[" +i+"]"+"   su valor es: " + mimatriz[i]);
			//realizo operacion
			a+=b*4/2;
		}
		
		System.out.println("             Usando un foreach vuelvo a imprimir valores de mi arreglo:");
		
		for(int m:mimatriz)
		{
			System.out.println(m);
		}
		
	}

}
