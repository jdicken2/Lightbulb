JFLAGS = -g 
JC = javac 
JE= java 
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
		Lightbulb.java \
		LampInterface.java \
		buttons/Button.java \
		buttons/PushdownButton.java \
		lamps/TableLamp.java \
		lamps/TableLampClient.java \
		TableLampjunitTests.java \
		TestRunner.java 


default: classes run 

classes: $(CLASSES:.java=.class)

run:
		 $(JE) TableLampClient
test:

		$(JE) TestRunner
	
clean:
		$(RM) *.class