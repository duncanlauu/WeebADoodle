WeebADoodle Storyboard Project
This is a project for creating storyboards using a custom-made domain-specific language.

Installation
To use this project, you will need to have the following installed on your computer:

Java JDK 8 or later
Eclipse IDE
Xtext 2.23 or later
Once you have these installed, follow these steps to set up the project:

Clone the repository to your local machine
Import the project into Eclipse using the "Import Existing Projects into Workspace" option
Run a clean build of the project to generate the language artifacts
You can now use the language to create storyboards
Usage
To create a storyboard using the custom language, follow these steps:

Create a new project in Eclipse
Create a new file with a .weebadoodle extension
Use the language syntax to create a storyboard. Here's an example:
css
Copy code
board {
	scene {
		Scene1 : "testScene" ;
		background: "Background" ; 
		
		setting {
			camera: "cameraShot" from "right ";
			lighting: "Source" from "left";
			description: "Description" ;
		}
		
		character {
			Char1 name: "Name1" ;
			position: "Position" ;
			action: "Action" ;
			dialogue: "Dialogue" ;
			description: "Description" ;
		}
		
		object {
			Obj1 name: "Obj1" ;
			position: "Position" ;
			description: "Description" ;
		}	
	}
}
Save the file
Right-click on the file and select "Generate Xtext Artifacts"
The project will be compiled and validated automatically
You can now run JUnit tests on the project to ensure that it is working correctly
Contributing
If you'd like to contribute to this project, feel free to submit a pull request with your changes. Before doing so, please ensure that your code is thoroughly tested and that it adheres to the project's coding standards.

License
This project is licensed under the MIT License - see the LICENSE file for details.
