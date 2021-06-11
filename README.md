# IST146_Module04_PA

<TODO: add README introduction>

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. Click on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: `github.com/mmeysenburg/IST146_Module04_PA`
5. Click on the "Import from github" button.
6. Click the "Done" button in the ".replit" dialog that appears.
7. From the "Console" tab, enter the following command: `rm .replit` *If you omit this step, the "Run" button will not work as it should!*
8. Write the `Rectangle` class, in a new file named `Rectangle.java`. 
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
  * To run the code, click the "Run" button.
  * To execute the unit tests (if any), enter the following command in the "Console" tab: `bash test.sh`
10. Once you have completed the code correctly, the unit tests (if any) should pass, and running the code should produce results that make sense.
11. When you are finished, submit your `Rectangle.java` file via the Canvas assignment.

## Files in the repository

`Circle.java`: Subclass of Shape, representing a circle
`Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
`Shape.java`: Abstract shape superclass
`ShapeTest.java`: JUnit4 tests for the `Circle` and `Rectangle` classes
`shapes_uml.png`: PNG of the UML class hierarchy for this assignment
`test.sh`: Bash script to execute the JUnit4 unit tests in `ShapeTest.java`
`shapes.uxf`: UMLet source file for the UML class diagram
`LICENSE`: GNU General Public License v3.0 for these materials
