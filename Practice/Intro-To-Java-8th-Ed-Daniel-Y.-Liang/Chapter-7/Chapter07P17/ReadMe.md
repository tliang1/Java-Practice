# Unsafe Banks by Tony Liang

Made using Java SE 1.8.

Displays the unsafe banks given the number of banks, the bank minimum balance limit, each bank's balance, the number of borrowers for each bank, and each borrower's ID and their borrow amount.

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
1. In the Package Explorer tab, drop down the project folder, the src folder, and the package and click UnsafeBanks.java.
2. Run the program.

#### Run JUnit Tests
1. In the Package Explorer tab, drop down the project folder, the test folder, and the package and click UnsafeBanksTest.java.
2. Run the program.

#### View Javadoc
1. In the Package Explorer tab, click the project folder.
2. In the menu bar, select Navigate and click Open Attached Javadoc. Keyboard Shortcut: Shift+F2

# How To Use
1. Enter the number of banks.
2. Enter their minimum limit (For example, 1 = 1 million dollars) (Must be a nonzero positive limit).
3. For each bank:
	1. Enter the bank's balance.
	2. Enter the number of banks that borrow from the bank.
	3. For each borrower:
		1. Enter the borrower's ID.
		2. Enter the amount the borrower borrows from the bank.