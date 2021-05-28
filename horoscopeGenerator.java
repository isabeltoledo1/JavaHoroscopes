import java.util.Scanner;

public class horoscopeGenerator{

   public static void main (String [] args){
   
      Scanner in = new Scanner (System.in);
      
      int month = 0;
      int day = 0;
      String sign = "";
      String tryAgain = "";
     
     do 
     {
      
       System.out.println ("Enter your Birth Month (1-12): ");
       month = in.nextInt();
      
       System.out.println ("Enter your Birth day: ");
       day = in.nextInt(); 
       
       
      
      
      if (month == 1){
       if (day <=20)
       System.out.println ("You are a Capricorn.");
       else 
       System.out.println ("You are an Aquarius.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
      
      if (month == 2){
       if (day <=19)
       System.out.println ("You are an Aquarius.");
       else 
       System.out.println ("You are a Pisces.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
       
      if (month ==3){
       if (day <=20)
       System.out.println ("You are a Pisces.");
       else
       System.out.println ("You are an Aries.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
       
      if (month ==4){
       if (day <=19)
       System.out.println ("You are an Aries.");
       else 
       System.out.println ("You are a Taurus.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
       
      if (month ==5){
       if (day <= 20)
       System.out.println ("You are a Taurus.");
       else
       System.out.println ("You are a Gemini.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       }
       
      if (month ==6){
       if (day <= 20)
       System.out.println ("You are a Gemini.");
       else
       System.out.println ("You are a Cancer.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
       
      if (month ==7){
       if (day <=22)
       System.out.println ("You are a Cancer.");
       else 
       System.out.println ("You are a Leo.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
       
      if (month ==8){
       if (day <=22)
       System.out.println ("You are a Leo.");
       else
       System.out.println ("You are a Virgo.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
       
      if (month ==9){
       if (day <=22)
       System.out.println ("You are a Virgo.");
       else
       System.out.println ("You are a Libra.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
       
      if (month ==10){
       if (day <= 22)
       System.out.println ("You are a Libra.");
       else
       System.out.println ("You are a Scorpio, The best sign!");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
          
      if (month ==11){
       if (day <= 21)
       System.out.println ("You are a Scorpio, The best sign!");
       else 
       System.out.println ("You are a Sagittarius.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
       
      if (month ==12){
       if (day <=21)
       System.out.println ("You are a Sagittarius.");
       else
       System.out.println ("You are a Capricorn.");
       System.out.println ("Would you like to try again? y/n: ");
       tryAgain = in.nextLine();
       in.nextLine();
       }
     
      
     
      
      }while (!tryAgain.equalsIgnoreCase("n"));
      
      
      }
      
     }