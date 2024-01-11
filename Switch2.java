/*WAP to accept a choice from the user and accordingly display the output
1:Accept no anc check it is prime no or Not
2:Accept no and find out the SUM OF DIGIT (123 =1+2+3 =6)
3:Accept a no from the user and  display the fibonacci series(0 1 1 2 3 5 .....)
4:Accept no from user and check it is armstrong or not
5: Accept 5 no and find out the greatest 
6: display month name
7: create a calculator*/
import java.util.*;
class SwitchCase
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ans;
        do{
        System.out.println("Enter the Number: ");
        System.out.println("1: check if a number is prime or Not: \n2:find out the sum of digits \n3:display the fibonacci series: \n4:check if a number is armstrong: \n5:find the greatest among 5 number: \n6:display month name: \n7:create a calculator\n");
        int choice= sc.nextInt();
        
        switch (choice) {
            case 1:
                /*1:Accept no anc check it is prime no or Not */
                System.out.println("Enter the number: \n");
                int n=sc.nextInt();
                int i=2,count=0;
                while (i<n) {
                    if (n%i==0) {
                        count++;
                        break;
                    }   
                    i++;
                }
                if (count>=1) {
                    System.out.println(n+" is not a prime number\n");
                }
                else{
                    System.out.println(n+" is prime number");
                    
                }
                break;

                case 2:
                /* 2:Accept no and find out the SUM OF DIGIT (123 =1+2+3 =6)*/
                 System.out.println("the sum of digits \n");
                   int num=sc.nextInt();
                    int sum=0;
                    while (num!=0) {
                        sum+=num%10;
                        num /= 10;
                    }
                    System.out.println(sum);
                    break;

                    case 3:
                   /* 3:Accept a no from the user and  display the fibonacci series(0 1 1 2 3 5 .....)*/
                    System.out.println("Enter the number of fibonacci series:");
                    int fib =sc.nextInt();
                    int a=0,b=1;
                    System.out.println("fibonacci series :" +a+" "+b+" ");
                    for(int x=3;x<=fib;x++){
                        int y=a+b; 
                        System.out.println(y+" ");
                        a=b;
                        b=y;
                    }
                    System.out.println();
                    break;

                    case 4:
                    /*4:Accept no from user and check it is armstrong or not */
                    System.out.println("Enter a number :");
                    int arm=sc.nextInt();
                    int number1, temp,total=0;
                    number1=arm;
                    while (number1!=0) {
                        temp=number1%10;
                        total=total+(temp*temp*temp);
                        number1/=10;
                    }
                    if (total==arm) {
                        System.out.println(arm+" is an armstrong number ");
                      }  else{
                        System.out.println(arm+" is not an armstrong number ");
                    }
                    break;

                    case 5:
                    /* 5: Accept 5 no and find out the greatest */
                    int num1,num2,num3,num4,num5;
                    System.out.println("enter the value of num1=");
                    num1=sc.nextInt();
                    System.out.println("enter the value of num2=");
                    num2=sc.nextInt();
                    System.out.println("enter the value of num3=");
                    num3=sc.nextInt();
                    System.out.println("enter the value of num4=");   
                    num4=sc.nextInt();
                    System.out.println("enter the value of num5=");
                    num5=sc.nextInt();
    
                    if (num1>num2 && num1>num3 && num1>num4&& num1>num5)
                    {
                            System.out.println("num1 is greater");
                    }
                    else if(num2>num1 && num2>num3 && num2>num4 && num2>num5 )
                    {
                            System.out.println("num2 is greater");
                    }
                    else if(num3>num1 && num3>num2 && num3>num4 && num3>num5)
                    {
                            System.out.println("num3 is greater");
                    }        
                    else  if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
                        System.out.println("num4 is greater");
                    }
                    else if (num5>num1 && num5>num2 && num5>num3 && num5>num4) {
                        System.out.println("num5 is greater");
                    } else
                    {
                            System.out.println("Invalid");
                    }
                    break;

                    case 6:
                    /*6: display month name */
                    System.out.println("Enter the month :\n");
                    int month=sc.nextInt();
                    switch (month) {
                        case 1:
                            {
                                System.out.println("Jan");
                            }
                            break;
                            case 2:
                            {
                                System.out.println("Feb");
                            }
                            break;
                            case 3:
                            {
                                System.out.println("Mar");
                            }
                            break;
                            case 4:
                            {
                                System.out.println("Apr");
                            }
                            break;
                            case 5:
                            {
                                System.out.println("May");
                            }
                            break;
                            case 6:
                                {
                                    System.out.println("Jun");
                                }
                                break;
                            case 7:
                            {
                                System.out.println("July");
                            } 
                            break;
                            case 8:
                            {
                                System.out.println("Aug");
                            } 
                            break;
                            case 9:
                            {
                                System.out.println("Sep");
                            }  
                            break;
                            case 10:
                            {
                                System.out.println("Oct");
                            }
                            break;
                            case 11:
                            {
                                System.out.println("Nov");
                            }
                            break;
                            case 12:
                            {
                                System.out.println("Dec");
                            }

                        default:
                            System.out.println("Invalid month number");
                            break;
                    }
                    break;

                    case 7:
                    /*7: create a calculator */
                    int first,second,ch;
                    System.out.println("Enter first Number : ");
    first = sc.nextInt();
    System.out.println("Enter Second Number : ");
    second = sc.nextInt();
    System.out.println("Enter your Choice 1-> Add 2-> Subtract 3-> Multiply 4-> Divide \n Enter Your Choice : ");
    ch = sc.nextInt();
    if (ch==1) 
        System.out.println("Addition = "+(first+second));
        else if(ch==2)
        System.out.println("Subtraction = "+(first-second));
        else if(ch==3)
        System.out.println("Multiplication = "+(first*second));
        else if(ch==4)
        System.out.println("Division = "+(first/second));
        else
        System.out.println("Invalid Choice");
                default:
               
                break;
                }  
        System.out.println("Do you want to perfrom any other program Y/N");
         ans=sc.next().charAt(0);
            }while (ans=='Y' || ans=='y') ;
     
    }

        }
