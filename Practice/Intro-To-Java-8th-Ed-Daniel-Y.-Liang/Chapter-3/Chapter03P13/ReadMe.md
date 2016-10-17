#Compute Tax by Tony Liang

Made using Java SE 1.8.

Computes the federal personal income tax for 2009 given the filing status and the taxable income.

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
6. Click Browse and click the location of the folder that contains the src folder and its files to import.
7. On the left side, drop down the selected folder, click the src folder, and click Finish.
8. In the Package Explorer tab, drop down the project folder, the src folder, and the package and click ComputeTax.java.
9. Run the program.

#How To Use
1. Enter the filing status. 0 for single filer, 1 for married jointly, 2 for married separately, or 3 for head of household.
2. Enter the taxable income.