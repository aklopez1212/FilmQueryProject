### Film Query Project

### Overview
This command line application provides a menu giving the user the ability to find films
from a database by either Film ID number or keyword. The database stores 1000 movies
of varying plots, titles, actors, etc. This program will sort through said database to
retrieve all data matching the users request.

### How to Use
Begin this program by running as a standard Java application. The user will then be
greeted with a menu requesting input (1 for find film by ID, 2 for search by keyword,
and 3 to exit the application).

If the user selects 1 they will then be prompted to
input a Film ID number. The application will search the database and provide a response.
Should the response be null the terminal will display a message informing the user it
could not be found and prompts them to try again.

Should the user select 2 at main menu,
they will be prompted to enter a keyword at which point the program will display a list
of film objects with the keyword in the description. If no film matches the keyword
the user will be informed of no match and prompted to try again.

If 3 is selected the program will print "Goodbye." and terminate.

### Technologies Used
-Java OOP
-JDBC
-Interfaces
-Try/Catch
-SQL

### Lessons Learned (Pos/Neg)
Positive: Working with databases and using the info stored within to create objects
is extremely new to me. That being said, SQL is something I feel really comfortable
with despite not having much experience just due to the simplicity of the language
and its commands. Working with Java is something I have become very comfortable with
over the duration of the program and it was nice to be able to not only get back to
using it but implementing new tools.

Negative: This project came together fairly well and didn't cause many problems. However,
one aspect I was not a fan of when creating this application was my final output. When
accessing an individual film it displays exactly as I had intended. Once my application
is outputting data from an ArrayList it starts to look rather ugly. Functional, yet ugly.
The default toString of ArrayLists is not very pretty. I will likely continue to experiment
with my code to make it look better on the user end.
