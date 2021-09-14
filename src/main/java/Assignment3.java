import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		System.out.println("ENTER THE NUMBER OF ARRAY SIZE");
		int N=sc.nextInt();	
		System.out.println("ENTER THE ARRAY ELEMENTS FOLLOWED BY COMMAMS");
	    String a1=sc.next();
	    String a2=sc.next();    
	    String Array1[]=a1.split(",");
	    String Array2[]=a2.split(",");
        int Array3[]=new int[N];
		int total=0;	 
		for(int i=0;i<N;i++)
		{
			int num1=Integer.parseInt(Array1[i]);
		    int num2=Integer.parseInt(Array2[i]);
		    Array3[i]=num1*num2;
		    total+=Array3[i];
		}
		System.out.println(total);
	}

}
