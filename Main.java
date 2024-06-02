import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int pin=1234;
        int balance=0;

        int AddAmount=0;
        int TakeAmount=0;

        String name;

        Scanner sc=new Scanner(System.in);
        // To Take input from user
        System.out.println("Enter your pin Number");
         int password=sc.nextInt();
         if(password==pin)
         {
             System.out.println("Enter your Name");
             name=sc.next();
             System.out.println("WELCOME "+ name);

             while(true)
             {
                 System.out.println("Press 1 to Check Balance");
                 System.out.println("Press 2 to Add Amount");
                 System.out.println("Press 3 to Take Amount");
                  System.out.println("Press 4 to Take Recipt");
                  System.out.println("Press 5 to Exit");

                  int opt=sc.nextInt();
                  switch (opt)
                  {
                      case 1:
                          System.out.println("Your Current Balance is:"+balance);
                          break;
                      case 2:
                          System.out.println("Amount You Need to add to your Bank Account");
                          AddAmount=sc.nextInt();
                          System.out.println("SUCCESSFULLY CREDITED");
                          balance=AddAmount+balance;
                          break;
                      case 3:
                          System.out.println("Amount You Need to Debit");
                          TakeAmount=sc.nextInt();
                          if(TakeAmount>balance)
                          {TakeAmount=0;
                          System.out.println("INSUFFICENT BALANCE");
                          System.out.println("TO KNOW BALANCE PRESS 1");
                          int bal_ref=sc.nextInt();
                          if(bal_ref==1)
                          {
                              System.out.println("Your current balance is : " + balance);
                          }
                          else
                          {
                              break;
                          }
                          }
                          else
                          {
                           System.out.println("Your Transaction was Completed SUCESSFULLY");
                           balance=balance-TakeAmount;

                          }
                          break;
                      case 4:
                          System.out.println("WELCOME TO IOB MINI ATM");
                          System.out.println("Available Balance : "+balance);
                          System.out.println("Amount Credited : "+AddAmount);
                          System.out.println("Amount Debited : "+TakeAmount);
                          System.out.println("THANK FOR VISITING");
                          break;
                      default:
                          System.out.println("Enter the proper Number");
                          break;
                  }
                  if(opt==5)
                  {
                      System.out.println("THANK YOU");
                      break;
                  }
             }

         }
         else{
             System.out.println("WRONG PIN NUMBER");
         }

    }

}