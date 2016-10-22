#Compute Tax by Tony Liang

Made using Java SE 1.8.

Prints the table:

Taxable<br>Income  | Single  | Married<br>Joint  | Married<br>Separate  | Head of<br>a House
:----------------- | :------ | :---------------- | :------------------- | :------------------
50000              | 8688    | 6665              | 8688                 | 7353
50050              | 8700    | 6673              | 8700                 | 7365
...                |         |                   |                      |
59950              | 11175   | 8158              | 11175                | 9840
60000              | 11188   | 8165              | 11188                | 9853

2009 U.S. Federal Personal Tax Rates:

Marginal<br>Tax Rate   | Single                | Married Filing Jointly<br>or Qualified Widow(er)   | Married Filing Separately   | Head of Household
:--------------------: | :-------------------: | :------------------------------------------------: | :-------------------------: | :-------------------:
10%                    | $0 - $8,350           | $0 - $16,700                                       | $0 - $8,350                 | $0 - $11,950
15%                    | $8,351 - $33,950      | $16,701 - $67,900                                  | $8,351 - $33,950            | $11,951 - $45,500
25%                    | $33,951 - $82,250     | $67,901 - $137,050                                 | $33,951 - $68,525           | $45,501 - $117,450
28%                    | $82,251 - $171,550    | $137,051 - $208,850                                | $68,525 - $104,425          | $117,451 - $190,200
33%                    | $171,551 - $372,950   | $208,851 - $372,950                                | $104,426 - $186,475         | $190,201 - $372,950
35%                    | $372,951+             | $372,951+                                          | $186,476+                   | $372,951+


#Project Setup

###Eclipse IDE Instructions
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

####Run Program
1. In the Package Explorer tab, drop down the project folder, the src folder, and the package and click ComputeTax.java.
2. Run the program.

####Run JUnit Tests
1. In the Package Explorer tab, drop down the project folder, the test folder, and the package and click ComputeTaxTest.java.
2. Run the program.

####View Javadoc
1. In the Package Explorer tab, click the project folder.
2. In the menu bar, select Navigate and click Open Attached Javadoc. Keyboard Shortcut: Shift+F2