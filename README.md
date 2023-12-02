# SsidCheckApp
TABA (Terminal Assignment Based Assessment) from Software Development module.
SsidCheckApp verifies if an SSID (ex: AB-12345-XYZ) is valid under the following rules:

Question 1.	
  A company has hired you to develop an application that enables a user to check if the user name of your WiFi network, 
  which is identified as SSID (Service Set Identifier) hereafter is of a standard format that conforms to the rules corresponding to the assigned item. 
  The application prompts the user to provide one item (i.e. a piece of text). Next, the application uses the piece of text to determine if the 
  provided text is valid (i.e. the text conforms to the rules assigned to you) or invalid (i.e. the text does NOT conform to those rules). 
  The item assigned to you and the rules that you should implement to determine whether the item is valid or not have been assigned based on the penultimate digit of your student ID number. 
  Please check Table 1 Question 1. a. Item and Rules to Determine the Validity of an Item for details about the functionality assigned to you.

  Note that the application should work irrespective of how the user provides the piece of text i.e. using upper case letters, lower case letters or a combination of both upper case and lower case letters. 
  Once the piece of text provided by the user is read, the input from the user should be converted to upper case letters, and the converted input will be further checked if it is valid or not. 
  Question 1. a. and Question 1. b. are to be developed in conjunction, Question 1. a. is the instantiable class (SsidChecker), and Question 1. b. is the App class (SsidCheckerApp).

a.	Develop an instantiable class for this application which contains:
      •	A class definition
      •	Suitable data members (instance variables)
      •	A constructor
      •	A setter method to set the given item (i.e. piece of text)
      •	A compute method to determine if the provided item is valid according to the item and the rules assigned to you based on Table 1. Note: This method should demonstrate the use of programming concepts covered in our module. Marks will not be awarded for solutions that use concepts and data types/classes which have not been addressed/covered in our module. This is a submission requirement.
      •	A getter method to return the validity of the item

Name the instantiable class SsidChecker.

The source code should be commented throughout highlighting and explaining where the key functionality is being addressed.

Rules to Determine the Validity of the Item:
  Item format: AB-12345-XYZ
  The new format for Virgin Media WiFi SSID contains three groups of characters, each separated by a dash i.e. ‘-‘ as follows:
    •	Starts with two letters(AB-12345-XYZ) unique to the service provider and is VM
    •	Continues with a dash i.e. ‘-‘
    •	Followed by a five-digit sequence number (AB-12345-XYZ) Note The five-digit sequence should be in ascending order be considered valid.
    •	Continues with a dash i.e. ‘-‘
    •	Ends with a three-letter sequence (AB-12345-XYZ) Note The three-letter sequence should be vowels to be considered valid.
A digit is any of the ten numbers from 0 to 9. Further, the same digit and letter can repeat in five-digit and three-letter sequences.

Examples (given item and the validity that the compute method should determine):
  For example:
    •	if the item is “VM-13599-AOU” then the compute method should determine that the item is valid, and store that information in the corresponding instance variable
    •	if the item is “VM-12578-EII” then the compute method should determine that the item is valid, and store that information in the corresponding instance variable
    •	if the item is “DM-12358-OUI” then the compute method should determine that the item is invalid, and store that information in the corresponding instance variable
    •	if the item is “VM-12328-OAI” then the compute method should determine that the item is invalid, and store that information in the corresponding instance variable
    •	if the item is “VM-15789-BAI” then the compute method should determine that the item is invalid, and store that information in the corresponding instance variable
  
Question 2.	
  Develop further the application as follows:
    a.First, implement in the instantiable class SsidChecker (the instantiable class previously developed at Question 1. a.) another compute method which 
    takes parameters (1) the number of passwords to be generated, and (2) The Personal Public Services Number (PPSN) from the user which is expected to be entered in format of 
    seven digits followed by 2 letters (i.e. 1234567AB), it’s not required to check if PPSN is entered in the valid format. And (3) an array of numbers between 21 and 29 to be 
    used in a modulo/remainder calculation as part of the password generation for each of the passwords e.g., if 3 passwords are to be generated, then the array should contain 
    3 different numbers between 21 and 29 inclusive. 
    The method should generate/create as many passwords as the given number and should store those passwords in an array of String items. The method should return the array of computed passwords. 
    The items that you should generate and the rules to implement to generate the passwords in this method have been assigned based on the penultimate digit of your student ID number. 

  Rules to Create the Item:
    a.The method should create a password as follows. The password is a variable length code (i.e., a piece of text/String) formed from digits, special characters and upper-case letters.
      •	Using the seven sequence of digits (i.e. 1234567AB) of the PPSN number entered by the user, calculate the remainder based on the random numbers generated in the method. 
      •	Followed by an ‘$’ symbol
      •	Followed by 2 letters of the PPSN number(1234567AB) entered by the user
      •	Followed by 4 upper case letters (i.e. ABCD), selected at random from the English alphabet.
    Note that a digit or a letter can appear more than once in a password. Further all the letters in the created passwords should be in Uppercase.
    
The password should follow the following format:
      •	if the number 4 is passed in as an argument in the compute method
      •	then the method should create and return an array with 4 passwords, such as:
          o	“12$WABDGV”
          o	“23$ANJBRS”
          o	“7$LGXRWA”
          o	“16$TGXKF”
    b.Next, develop further the application class SsidCheckerApp (the class previously developed at Question 1. b) to use the method defined at Question 2. a. 
      First, prompt the user to provide the number of passwords they would like to be created.
      Next, call/invoke/use the method defined at Question 2. a. to generate the passwords according to the functionality assigned to you. 
      Finally, the application should display on the screen the passwords created by the method implemented at Question 2. a.       

    Note: 
      This method should demonstrate the use of programming concepts covered in our module. 
      Marks will not be awarded for solutions that use concepts and data types/classes which have not been addressed/covered in our module.

  The source code should be commented throughout highlighting and explaining where the key functionality is being addressed.

