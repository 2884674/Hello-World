import java.util.Scanner;
public class EvenOrNot{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array size");
		int x = sc.nextInt();
			int[] arr = new int[x];
			System.out.println("Now enter the numbers within the array");
			
				for (int i=0;i<x;i++){
					int a = sc.nextInt();
					arr[i]=a;	
				}
				for (int j=0;j<x;j++){
					int num  = arr[j];
				if(num%2==0){
						System.out.println(num +" is even.");
					}
				else{
						System.out.println(num + " is odd.");
				}
			}

		
		
		return;
	}
}