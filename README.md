# 🚀 Virgin Media SSID Checker & Password Generator🔐


## 📝 Overview

The **SsidChecker** project is a Java application designed to validate Virgin Media SSIDs and generate secure passwords based on a provided PPSN. It ensures that the SSID follows a specific format and meets validation criteria. Additionally, it provides a password generator for enhanced security.


## 🌟 Features

- ✅ **SSID Validation:** Checks whether a given SSID follows the correct format and meets the required conditions.
- 🔑 **Password Generation:** Generates a set of secure passwords based on a provided PPSN.
- 🖥️ **Interactive Console Interface:** Allows users to input SSIDs for validation and generate passwords through a simple command-line interface.


## 📌 SSID Validation Criteria

A valid SSID must meet the following conditions:

1️⃣ The first two characters must be `VM` (case-insensitive).

2️⃣ The middle section must be a sequence of five digits in **ascending order**. 

3️⃣ The last three characters must be **vowels** (A, E, I, O, U).

✅ Example of a valid SSID: `VM-12345-EEO`


## 🔐 Password Generation

The application generates passwords based on a provided PPSN (Personal Public Service Number) using the following logic:

- 📌 Extracts the first seven digits of the PPSN.
- 🔢 Generates a random number from a predefined set and applies a modulo operation.
- 💲 Appends a `$` symbol.
- 🔡 Uses the last two letters of the PPSN.
- 🔠 Appends four randomly generated uppercase letters.

🔑 Example password format: `123$ABCD`


## ⚙️ Installation

1️⃣ Clone the repository:
   ```sh
   git clone https://github.com/thaparazite/Virgin-Media-SSID-Checker-and-Password-Generator.git
   ```
2️⃣ Navigate to the project directory:
   ```sh
   cd SsidChecker
   ```
3️⃣ Compile the Java files:
   ```sh
   javac SsidChecker.java SsidCheckerApp.java
   ```
4️⃣ Run the application:
   ```sh
   java SsidCheckerApp
   ```


## 🚀 Usage

1️⃣ Enter an SSID for validation.

2️⃣ Receive feedback on whether the SSID is valid or not.

3️⃣ If valid, proceed to password generation by entering a PPSN.

4️⃣ The system will generate and display passwords.


## 🖥️ Example Execution

```
  *** Virgin Media SSID Checker and Password Generator ***

    Please find the SSID and enter it for validation
    SSID Example : VM-12345-EEE

    Enter the SSID : VM-12345-EEO

    SSID is Valid !

    To Check Another SSID Type 'yes' : yes
```


## 📋 Requirements

- ☕ Java Development Kit (JDK) 8 or later
- 🖥️ A terminal or command prompt


## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


## 👨‍💻 Author

[Flaviu Vanca](https://github.com/thaparazite)

