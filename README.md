# Virgin Media SSID Checker and Password Generator

## Overview

The **SsidChecker** project is a Java application designed to validate Virgin Media SSIDs and generate secure passwords based on a provided PPSN. It ensures that the SSID follows a specific format and meets validation criteria. Additionally, it provides a password generator for enhanced security.

## Features

- **SSID Validation:** Checks whether a given SSID follows the correct format and meets the required conditions.
- **Password Generation:** Generates a set of secure passwords based on a provided PPSN.
- **Interactive Console Interface:** Allows users to input SSIDs for validation and generate passwords through a simple command-line interface.

## SSID Validation Criteria

A valid SSID must meet the following conditions:

1. The first two characters must be `VM` (case-insensitive).
2. The middle section must be a sequence of five digits in **ascending order**.
3. The last three characters must be **vowels** (A, E, I, O, U).

Example of a valid SSID: `VM-12345-EEO`

## Password Generation

The application generates passwords based on a provided PPSN (Personal Public Service Number) using the following logic:

- Extracts the first seven digits of the PPSN.
- Generates a random number from a predefined set and applies a modulo operation.
- Appends a `$` symbol.
- Uses the last two letters of the PPSN.
- Appends four randomly generated uppercase letters.

Example password format: `123$ABCD`

## Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/SsidChecker.git
   ```
2. Navigate to the project directory:
   ```sh
   cd SsidChecker
   ```
3. Compile the Java files:
   ```sh
   javac SsidChecker.java SsidCheckerApp.java
   ```
4. Run the application:
   ```sh
   java SsidCheckerApp
   ```

## Usage

1. Enter an SSID for validation.
2. Receive feedback on whether the SSID is valid or not.
3. If valid, proceed to password generation by entering a PPSN.
4. The system will generate and display passwords.

## Example Execution

```
  *** Virgin Media SSID Checker and Password Generator ***

    Please find the SSID and enter it for validation
    SSID Example : VM-12345-EEE

    Enter the SSID : VM-12345-EEO

    SSID is Valid !

    To Check Another SSID Type 'yes' : yes
```

## Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or command prompt

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

[Flaviu Vanca](https://github.com/yourusername)



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


Feel free to contact me at skety_tm@yahoo.com.
 

