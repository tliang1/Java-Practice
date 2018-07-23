# Hangman Revised by Tony Liang

Made using Java SE 10.

A simple Hangman game that randomly picks a word from the given text file.

# Project Setup

### Eclipse IDE Instructions
1. Open Eclipse.
2. Create a new project.
3. Right click the folder of the project and click Import.
4. Drop down the General folder and click File System.
5. Click Next.
6. Click Browse and click the location of the folder that contains the src folder and the doc folder and their files to import and the Exercise9_33.txt file.
7. On the right side, select Exercise9_33.txt.
8. On the left side, drop down the selected folder, select the src folder and the doc folder, and click Finish.
9. In the Package Explorer tab, right click the project folder and click Properties.
10. Click Javadoc Location on the left side of the window.
11. Click Browse and select the docs folder location.
12. Click OK at the bottom right of the window.

#### Run Program
1. In the Package Explorer tab, drop down the project folder, the src folder, and the package and right click HangmanRevised.java.
2. Select Run As and click Run Configurations....
3. On the left side of the window, drop down the Java Application section and click HangmanRevised if it is not already selected.
4. On the right side, click the Arguments tab.
5. In the Program arguments section, enter Exercise9_33.txt for the program to use for the Hangman game.
6. Click Apply near the bottom right of the window.
7. Click Run at the bottom right of the window to run the program.

#### View Javadoc
1. In the Package Explorer tab, click the project folder.
2. In the menu bar, select Navigate and click Open Attached Javadoc. Keyboard Shortcut: Shift+F2

# How To Use
1. Enter the letter to guess parts of the word.
2. Repeat Step 1 until the word is guessed correctly.
	1. Enter y to play the game again.
	2. Enter n to quit the game.