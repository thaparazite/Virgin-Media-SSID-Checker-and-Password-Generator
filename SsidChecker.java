
public class SsidChecker{
	
	//variables
	private String text;
	private String validationMsg;

	//constructor
	public SsidChecker(){
		this.text = ""; 
		this.validationMsg = "";
	}//constructor
	
	//setter
	public void setText(String text){
			this.text = text;
	}//setText members
	
	//getter
	public String getValidationMsg(){
		return validationMsg;
	}//getIsValid method
	
	//compute method that validates the SSID
	public void validateSSID(){
		
		//divide the text in 3 parts then 
		StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();
        StringBuilder part3 = new StringBuilder();

        //split the text, add it to multiple strings for further validation
		String uniqueId = "VM";
		for(int i = 0; i < text.length(); i++){
			//if we encounter a dash in the text we skip to the next iteration
			char dash = '-';
			if(text.charAt(i) == dash){
				continue;
			//if i is greater than the length of the uniqueId the char at index i is added to the part1 string 	
			}else if(i < uniqueId.length()){
				part1.append(text.charAt(i));
			//if i is greater than part1's length and smaller than text - the 3 letters from the end of the text,
			// the char at index i is added to part2 string
			}else if(i > part1.length() & i < text.length() - 4){
				part2.append(text.charAt(i));
			//if all conditions are not met then char at index i is added to part3 string	
			}else{
				part3.append(text.charAt(i));
			}//end /else if/else if/else statement
			
		}//end of for loop
		
		//make small letters to upper case letters for appropriate sections
		part1 = new StringBuilder(part1.toString().toUpperCase());
		part3 = new StringBuilder(part3.toString().toUpperCase());
		
		//validations
		boolean isValid1 = false, isValid2 = true, isValid3 = true;
		
		//validate the unique service provider VM
		if(part1.length() == 2){//if the length is not 2 isValid1 will be set to false
            //end if/else statement
            isValid1 = part1.toString().equals(uniqueId);//assign true if the part1 text equals VM
		}//end if/else statement

		//validate if the numbers from part2 are in ascending order
		if(part2.length() == 5){
			int[] numbers = new int[part2.length()];//we need to store the numbers in an array
			
			//populate the array with the numbers from part2 string
			for(int i = 0; i < numbers.length;i++){
				//I have to add "" to concatenate the char because charAt returns a char,
				//and parseInt method does not accept a char as an argument 
				numbers[i] = Integer.parseInt(""+part2.charAt(i));
			}//end for loop
			
			//validate if the numbers in an array are in ascending order
			int index1 = 0;
			int index2 = 1;
			while(true){
				//if first number is greater than second number,
				//set isValid2 to false and exit the loop using break
				if(numbers[index1++] > numbers[index2++]){
					isValid2 = false;
					break;
				}//end if statement
				
				//if index2 is equal then numbers length exit to avoid ArrayIndexOutOfBoundsException
				if(index2 == numbers.length){
					break;
				}//end if statement	
				
			}//end while loop
			
		}else{
			isValid2 = false;
		}//end if/else statement
		
		//validate last three letters of part3
		/*
		  this part melted my brain, I could not figure out a way to exit the loops after no vowel encounter.
		  in the end I figure out how to exit the loops by adding the if statements after looping	  
		 */ 
		if(part3.length() == 3){//if the string is not equal to 3 isValid3 is set to false	
		//object
		 char[] vowels = {'A','E','I','O','U'};
		
			for(int i = 0;i < part3.length();i++){
                for (char vowel : vowels) {
                    //compare vowels and if they are the same set isValid3 true else set valid to false
                    //end if/else statement
                    isValid3 = part3.charAt(i) == vowel;
                    if (isValid3) {
                        break;
                    }//I reverted the boolean to exit the loop after a no vowel encounter
                }//end inner for loop
				if(!isValid3){break;}//I reverted the boolean to exit the loop after a no vowel encounter
			}//end for loop
		}else{
			isValid3 = false;
		}//end if/else statement

		//message assignment
		if(isValid1 & isValid2 & isValid3){
			validationMsg = "Valid";
		}else{
			validationMsg = "Not Valid";
		}//end if/else statement
	}//validateSSID method
	//second compute method that generate a number of passwords 
	public String[] generatePassword(int numPasswords, String ppsn){
		
		//objects
		String[] generatedPasswords = new String[numPasswords];
		int[] numbers = {21,22,23,24,25,26,27,28,29};
		StringBuilder password;
		
		//extract and store the 7 digits number from ppsn
		int ppsNumber = Integer.parseInt(ppsn.substring(0,7));
		
		//extract last 2 letters from ppsn
		String lastTwoLetters = ppsn.substring(7);
		
		//build the password then store it in the array
 		for(int i = 0;i < numPasswords;i++){
			password = new StringBuilder();//every loop a new StringBuffer object is created
			//use Math class to extract a random number from the array then perform the % and append the reminder  
			password.append(ppsNumber % numbers[((int)(Math.random()*numbers.length))]);
			password.append('$');//append $ symbol
			password.append(lastTwoLetters.toUpperCase());//append last two letters from ppsn
			
			//use for loop to append 4 generated letters from English alphabet
			for(int j = 0;j < 4;j++){
				//I used the ASCII table as a guide to generate capital letters
				password.append((char)((int)(65 + Math.random()*25)));
			}//end for loop
			
			//add the password to the array
			generatedPasswords[i] = password.toString();//to convert the StringBuffer obj I used the toString method
			
		}//end for loop
			
		//return the array
		return generatedPasswords;
		
	}//generetePassword method
	
}//class SsidChecker