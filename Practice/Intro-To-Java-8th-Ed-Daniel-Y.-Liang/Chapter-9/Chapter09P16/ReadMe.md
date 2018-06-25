# Reformat Java Source Code by Tony Liang

Made using Java SE 10.

Converts the given Java file written in the next-line brace style to the end-of-line brace style.

# Project Setup

### Eclipse IDE Instructions
1. Open Eclipse.
2. Create a new project.
3. Right click the folder of the project and click Import.
4. Drop down the General folder and click File System.
5. Click Next.
6. Click Browse and click the location of the folder that contains the src folder and the doc folder and their files to import.
7. On the left side, drop down the selected folder, select the src folder and the doc folder, and click Finish.
8. In the Package Explorer tab, right click the project folder and click Properties.
9. Click Javadoc Location on the left side of the window.
10. Click Browse and select the docs folder location.
11. Click OK at the bottom right of the window.

#### Run Program
1. In the Package Explorer tab, drop down the project folder, the src folder, and the package and right click ReformatJavaSourceCode.java.
2. Select Run As and click Run Configurations....
3. On the left side of the window, drop down the Java Application section and click ReformatJavaSourceCode if it is not already selected.
4. On the right side, click the Arguments tab.
5. In the Program arguments section, enter the Java file pathname (For example, if using the provided Test.java, enter Test.java) for the program to use for the conversion.
6. Click Apply near the bottom right of the window.
7. Click Run at the bottom right of the window to run the program.

#### View Javadoc
1. In the Package Explorer tab, click the project folder.
2. In the menu bar, select Navigate and click Open Attached Javadoc. Keyboard Shortcut: Shift+F2