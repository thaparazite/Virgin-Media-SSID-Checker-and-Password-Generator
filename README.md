#Virgin Media SSID Checker and Password Generator

Overview
This project provides a simple Java application for validating Virgin Media SSIDs and generating passwords based on user input. The application consists of two main classes:

SsidChecker: Handles the validation of SSIDs and password generation.
SsidCheckerApp: Provides a command-line interface for user interaction.
Features
SSID Validation:

Ensures the SSID follows the format XX-00000-EEE.
Validates that:
The prefix is VM.
The middle section consists of 5 ascending digits.
The suffix consists of exactly 3 vowels.
Password Generation:

Generates a specified number of passwords based on a provided PPSN (Personal Public Service Number).
Password format:
A number derived from the first 7 digits of the PPSN modulo a random number.
A $ symbol.
The last two characters of the PPSN in uppercase.
Four random uppercase letters.
Getting Started
Prerequisites
Java Development Kit (JDK) 8 or higher.
An IDE or text editor of your choice.
Running the Application
Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/ssid-checker.git
cd ssid-checker
Compile the Java Files:

bash
Copy code
javac SsidChecker.java SsidCheckerApp.java
Run the Application:

bash
Copy code
java SsidCheckerApp
Usage
SSID Validation:

Enter the SSID in the format XX-00000-EEE when prompted.
The application will validate the SSID and inform you whether it is valid or not.
Password Generation:

Specify the number of passwords you wish to generate.
Provide a PPSN in the format 1234567AB.
The application will generate and display the requested number of passwords.
Code Structure
SsidChecker.java
Variables:
text: Stores the SSID.
validationMsg: Stores the validation message.
Methods:
setText(String text): Sets the SSID to be validated.
getValidationMsg(): Returns the validation message.
validateSSID(): Validates the SSID based on specified rules.
generatePassword(int numPasswords, String ppsn): Generates passwords based on the provided PPSN.
SsidCheckerApp.java
Main Method:

Interacts with the user to get the SSID and PPSN.
Validates the SSID and generates passwords based on user input.
Helper Methods:

divider(): Prints a divider line for better readability.
printGoodByeMsg(): Prints a goodbye message.
printNumberValidationMsg(): Prints a message indicating invalid number input.

CMD Preview:
-------------------------------------------------------------
  *** Virgin Media SSID Checker and Password Generator ***
-------------------------------------------------------------
    Please find the SSID and enter it for validation
    SSID Example : XX-00000-EEE
-------------------------------------------------------------
    Enter the SSID : VM-12345-AEI
-------------------------------------------------------------
    SSID is Valid !
-------------------------------------------------------------
    To Check Another SSID Type 'yes' : no
-------------------------------------------------------------
    How Many Passwords You Want to Generate : 5
-------------------------------------------------------------
    Enter PPSN (PPSN Format:'1234567AB') : 1234567AB
-------------------------------------------------------------
        - Generated Passwords -
                7$ABRPNM
                7$ABOJQI
                7$ABUXKT
                7$ABVYDA
                7$ABBCFA
-------------------------------------------------------------
                    ***  Good Bye  ***
-------------------------------------------------------------


License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
If you have any questions, feel free to contact me at your-email@example.com.
  The source code should be commented throughout highlighting and explaining where the key functionality is being addressed.

