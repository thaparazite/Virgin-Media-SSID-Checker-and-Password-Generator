import java.util.Scanner;
import java.lang.NumberFormatException;

public class SsidCheckerApp{//class name
	
	public static void main(String[] args){//the main method is the start point of a Java Program 
		
		Scanner scan = new Scanner(System.in);//scanner object that accept keyboard input
		//when the following object is created the variables will be set 
		SsidChecker ssidCheck = new SsidChecker();//instance of SsidChecker class
		
		//variable
		String SSID;
		
		//input a space to separate the path from the result in command line 
		System.out.println();

		//add a divider
		SsidCheckerApp.divider();

		//display a message
		System.out.println("  *** Virgin Media SSID Checker and Password Generator ***");

		//variable for validation
		boolean valid = true;
		while(valid){//infinite loop, the loop will be controlled further in the code

			//add a divider
			SsidCheckerApp.divider();
			
			//display an example of SSID to the user
			System.out.println("    Please find the SSID and enter it for validation");
			System.out.println("    SSID Example : XX-00000-EEE");
			
			//add a divider
			SsidCheckerApp.divider();
			
			//display a prompt message for a user to type in the SSID
			System.out.print("    Enter the SSID : ");
			
			//enter the SSID by calling the setText and give it an argument using scanner object
			SSID = scan.nextLine();
			ssidCheck.setText(SSID);
			//any static member of a class should be called using the class name form where it belongs
			SsidCheckerApp.divider();
			//call the compute method from SsidChecker class to process and validate the inputted text 
			ssidCheck.validateSSID();
			/*
				display if the text is valid or not by calling 
				the getIsValid method from SsidChecker class,
				then pass it as an argument to print line method
			*/	
			System.out.println("    SSID is " + ssidCheck.getValidationMsg() + " !");
			//add a divider
			SsidCheckerApp.divider();
			//display a message to the user to type yes if he wants to validate another SSID
			System.out.print("    To Check Another SSID Type 'yes' : ");
			//determine if the user want to check another SSID
			if(!scan.nextLine().equalsIgnoreCase("yes")){
				//add a divider
				SsidCheckerApp.divider();
				valid = false;
			}//end if statement

		}//end while loop
		
		/*
			-loop added after the TABA examination, 
			-I added the loop and check if input is:
				-a number and not a letter or symbol
				-a positive number and is greater than 0
				-equal to 0 then exit the program
		*/
		int numberPasswords;
		while(true){
			//display a message for the user to input the amount of passwords he wants to generate
			System.out.print("    How Many Passwords You Want to Generate : ");
			//if the input is not a number a NumberFormatException will be thrown 
			try{
				numberPasswords = Integer.parseInt(scan.nextLine());//use scanner obj to enter the value	
			}catch(NumberFormatException e){//catch NumberFormatException and handle it
				SsidCheckerApp.divider();//print the divider
				SsidCheckerApp.printNumberValidationMsg();//print message
				SsidCheckerApp.divider();//print the divider
				continue;//skip the iteration
			}//end try/catch

			if(numberPasswords > 0)break;//if the number is greater than 0 break the loop
			
			//if number is equal to 0 exit the program as we don't want passwords tp be generated
			if(numberPasswords == 0){
				SsidCheckerApp.divider();
				SsidCheckerApp.printGoodByeMsg();//print goodbye message
				System.exit(1);//exit the program
			}//end if statement
			
			SsidCheckerApp.divider();	
			
		}//end while loop
		
		//add a divider
		SsidCheckerApp.divider();
		
		//display a message where the user enters the PPSN
		System.out.print("    Enter PPSN (PPSN Format:'1234567AB') : ");
		String ppsn = scan.nextLine();//use scanner obj to enter the value
		
		//add a divider
		SsidCheckerApp.divider();
		
		//call the method generatePassword and pass the arguments, also assign it to an array
		String[] passwords = ssidCheck.generatePassword(numberPasswords,ppsn);
		
		//display a message
		System.out.println("\t- Generated Passwords -");
		
		//display the generated passwords
        for (String password : passwords) {
            System.out.println("\t\t" + password);
        }//end for loop
		
		//close scanner object
		scan.close();
		
		//add a divider
		SsidCheckerApp.divider();
		
		//display goodbye message
		SsidCheckerApp.printGoodByeMsg();
		
		//add a divider
		SsidCheckerApp.divider();
		
	}//main method
	
	//I've added a method to divide the user input from validation, I added it separate for code reuse :)  
	private static void divider(){
		System.out.println("-------------------------------------------------------------");
	}//divider method
	
	//added after TABA examination
	private static void printGoodByeMsg(){
		System.out.println("\t\t\t\t\t ***  Good Bye  ***");
	}//end printGoodByeMsg method
	
	//added after TABA examination
	private static void printNumberValidationMsg(){
		System.out.println("\t- Enter a valid number! -");
	}//end printNumberValidationMsg method
	
}//class SsidCheckerApp