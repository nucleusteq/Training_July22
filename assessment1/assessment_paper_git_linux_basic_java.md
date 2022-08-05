# Assessment 1
## Git, Linux and Basic Java

#### Linux

1. Rahul is an employee of the finance department in the company ABC. In the company's system which is a Linux server (not any GUI Linux distro), Rahul is the owner of a file in his home directory /home/rahul/financial_report.txt. Few people from the sales department want to access and modify that file. How Rahul would make sure that people from another department will be able to read and modify the file. Also, provide the commands for the same if any needed.

2. Once Rahul does the needful to allow people from the sales department to read and modify the file. How the people from the sales department will read or edit the file. Also provide the tools/commands used for reading, modifying, and then saving the file.

3. After the sales department people update the file, this file needs to be shared with a vendor (some other company) for analysis of its data. How Rahul will share this file with the other company over the network. Explain what tool/app will be used here and the command that is required to share the file. The details of the other company's system are - user: other_company_user IP: 10.23.43.242.

4. What does the permission ring specify for the below files? Please explain each character of the permission ring.
```sh
-rw-r--r-x    1 rahul finance 2345 Jul 27 12:94 financial_report.txt
drwxr--rwx    1 rahul finance 4096 Jul 27 10:94 finance
```
5. Look at the below Octal number and explain what permission are they denoting
777
647
660
475

6. What are the command used for the below operations in Linux, also provide the syntax for the same.
change directory, remove file and directory, rename file and directory

#### Git
John and Aditya Working in main branch of GIT repo. John creates a new branch for a new feature. 
1. Write a command to create a branch which have all changes from main.

Similarly, Aditya also works on a new feature, and he creates a new branch from main. Both were working in a different branch. Aditya has to push its changes to main branch via Pull request.

2. Help Aditya to push its changes on main branch via pull request. Write all steps so code changes can go in main.

Now after some time John also have to commit its changes to main branch and he also has to push his changes to main. But when he was creating a PR, so he found that there was a Java class application.java
has a conflict with the code that Aditya has pushed to main.
3. Help John by at least 2 ways to debug and get which has a conflict and what is the conflict.
4. Help john also to resolve the conflict and push his changes to main. Write all steps so John and Aditya can work more collaboratively.

#### Java
1.  We have to design discount system for a retail chain, which provides services and sells pet products. It offers 3 types of memberships: Premium, Gold and Silver. Premium, gold and silver members receive a discount of 25%, 15%, and 8%, respectively, for all services provided. Customers without membership receive no discount. All members receive a flat 8% discount on products purchased. We have to design the classes which should at least 3 classes: Customers, Discounts and Visits. Designed classes should show below information:
      - If classes are related so we have to show case the relationship.
      - Classes should have member variables and methods to solve the above problem.
      - Commit your class diagram/code to GIT to showcase above system design in the below git repo with your name as branch name: https://github.com/nucleusteq/Training_July22.git 

2. We have to write a Java program to get the days pending to your birth date. Input will be your date and month of the birth and program will calculate how many days left to your birthday and commit your code onto git. 
e.g. My birth day and month is 1 Sep and today date is 29 July. So, days to birthdate will be 33 days. 