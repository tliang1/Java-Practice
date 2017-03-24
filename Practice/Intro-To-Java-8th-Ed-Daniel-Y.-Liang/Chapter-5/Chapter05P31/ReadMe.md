# Credit Card Number Validation by Tony Liang

Made using Java SE 1.8.

Checks if the given credit card number is valid.

#### Credit Card Number Patterns
1. 13-16 digits.
2. Prefixes
   1. 4 for VISA
   2. 5 for MasterCard
   3. 37 for American Express
   4. 6 for Discover

#### Luhn/Mod 10 Check
1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
2. Add all single-digit numbers from Step 1.
3. Add all digits in the odd places from right to left in the card number.
4. Sum the results from Step 2 and Step 3.
5. If the result from Step 4 is divisible by 10, the card number is valid. Otherwise, it is invalid.

# Project Setup

### Eclipse IDE Instructions
1. Open Eclipse.
2. Create a new project.
3. Right click the folder of the project and click Import.
4. Drop down the General folder and click File System.
5. Click Next.
6. Click Browse and click the location of the folder that contains the src folder, the test folder, and the doc folder, and their files to import.
7. On the left side, drop down the selected folder, select the src folder, select the test folder, and the doc folder, and click Finish.
8. In the Package Explorer tab, right click the project folder and click Properties.
9. Click Java Build Path on the left side and click the Libraries tab on the top right of the window.
10. Click Add Library and click JUnit.
11. Make sure JUnit 4 is the JUnit library version.
12. Click Finish and click Apply at the bottom right of the window.
13. Click Javadoc Location on the left side of the window.
14. Click Browse and select the docs folder location.
15. Click OK.
16. Click OK at the bottom right of the window.
17. Right click test folder and select Build Path.
18. Click Use as Source Folder.

#### Run Program
1. In the Package Explorer tab, drop down the project folder, the src folder, and the package and click CreditCardNumberValidation.java.
2. Run the program.

#### Run JUnit Tests
1. In the Package Explorer tab, drop down the project folder, the test folder, and the package and click CreditCardNumberValidationTest.java.
2. Run the program.

#### View Javadoc
1. In the Package Explorer tab, click the project folder.
2. In the menu bar, select Navigate and click Open Attached Javadoc. Keyboard Shortcut: Shift+F2

# How To Use
1. Enter the credit card number.