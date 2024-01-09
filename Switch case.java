import java.util.*;
 class Switch {

	public static void main(String[] args) {
		int Ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1:even or odd \n2:find grade \n3: find cube \n4:greatest number");
		int Ch1=sc.nextInt();
		switch(Ch1) {
		case 1 :
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			if(num%2==0) {
				System.out.println("The number is even");
			}
				else {
					System.out.println("The number is odd");
				}
			break;
			
		case 2 :
			System.out.println("Enetr marks of 5 subject:");
			int [] marks=new int[5];
			for(int i=0;i<5;i++) {
				System.out.println("Enter marks of subject"+(i+1)+":");
				marks[i]=sc.nextInt();
			}
			int totalmarks = 0;
			for(int mark : marks) {
				totalmarks +=mark;
			}
			int average = totalmarks / 5;
			if(average>=90) {
				System.out.println("Grade A+");
			}
			else if(average>=80) {
				System.out.println("Grade A");
			}
			else if(average>=70) {
					System.out.println(" Grade B");
				}
			else if(average>=60) {
				System.out.println(" Grade C");
			}
			else
			{
				System.out.println("Grade D");
			}
			break;
			
		case 3 :
			System.out.println("Enter a number:");
			int cubenum=sc.nextInt();
			if(cubenum %5 ==0) {
				int cube=cubenum*cubenum*cubenum;
				System.out.println("cube of number is"+cube);
			}
			else {
				System.out.println("the number is not divisible by 5");
			}
			break;
			
		case 4 :
			System.out.println("Enter three numbers:");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=sc.nextInt();
			int max=Math.max(Math.max(num1, num2),num3);
			System.out.println("The gratest number is:"+max);
			break;
			
			default :
				System.out.println("Invalid choise");
		}

	}

}
