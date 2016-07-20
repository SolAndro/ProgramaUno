public class Matriz 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//declaro matriz
		int[][] mimatriz=new int[4][4];
		//declaro variables para mi operacion
		int a=2;
		//bucle for para llenar matriz:mi matriz
		for( int i=0;i<mimatriz.length;i++)
		{
			System.out.print((i+1)+" ");
			for(int j=0;j<mimatriz.length;j++)
			{	
						mimatriz[i][j]=a;
						System.out.print(" "+mimatriz[i][j]);
						a+=2;	
			}
			System.out.print("\n");						
		}
			
	}

}