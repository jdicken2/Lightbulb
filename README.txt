Julian Dickens-Julian-Dickens-CS-445-HW 3 Version 1.0 10/10/2017

Usage notes
---------------------------------------------------------------
-This program gives students practice with packages and Dependency Inversion. Button is a class that prints different messages depending on the method that calls it. There is an improved version of button later in the program, called Pushdown Button, that switches betwen on and off, by only calling one method. Lightbulb can also be turned on through on and off messages. Button and PushdownBUtton extends Lightbulb. TableLamp objects extend both Button and Lightbulb through dependency inversion. The Acceptence Test is named TableLampClient, and prints on and off messages dependent on the object.


Finally, the makefile is a script that compiles and runs the Acceptance Test and jUnitTest.

Run
---------------------------------------------------------------

At this point in time, the makefile may throw errors. To run the code, use an IDE, such as NetBeans or Eclipse
To run the Acceptance Test, type "make" in the command line.
To run the jUnit Test, type "make test" in the command line.
To clear the class files, type "make clean".

Without the makefile:
javac Button.java Lightbulb.java PushdownButton.java TableLamp.java TableLampClient.java LampInterface TableLampjunitTests

Acceptance Test: java TableLampClient
Unit Test: java TableLampjunitTests
Installation Notes
---------------------------------------------------------------
Install:
	jdk1.8.0_144
	junit-4.12.jar
	hamcrest-core-1.3.jar