1- LINUX:

1.1)
sudo chown -R name(name of the person whom should we give access to)  /home/rahul/financial_report.txtxt
For giving read permissions & For modifying the command is-
sudo chmod -R ugo+r  financial_report.txt

1.2) cat financial_report.txt //read the file
vim financial_report.txt //edit the file
ESC :qw! //save the file

1.3)
scp <financial_report.txt> <user_name> @<system_ip> :/home/rahul /financial_report.txt

1.4)
1.4.1)-rw-r--r-x 1 rahul finance 2345 Jul 27 12:94 financial_report.txt = 
-:-Says it is file
-r w :- says that  user has read and write permissions
-r :- says group has only read permission
-r-x :- says others have read and execute permission
1 – it is the execute permission

drwxr--rwx 1 rahul finance 4096 Jul 27 10:94 finance = d is a directory, where owner can read, write and execute, r--

1.5)
777- all can read/write/execute (full access)
647-owner can read/write, group/others can read only
660- owner can write and read the file
475- Owner can read. Group can read, write and execute. Everyone can read and execute

1.6)
change directory- cd /[directory name]
remove files and directory- rm [file/directory name]
rename files and directory- rename 's/Directory1/Example_Directory/' *

2.
2.1) git branch John
2.2) git branch Aditya
git push -u "branchname"
git commit -m "changes"
git push origin "John"




3.
3.1)

3.2)import java.time.*;
public class DateOfBirth
{
public static void main(String args[])
{
LocalDate LD = LocalDate.of(2022, 19,11);
LocalDate CD = LocalDate.now();
Period p1 = Period.between(dob, curDate);
System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
}
}

