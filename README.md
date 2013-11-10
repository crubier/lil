<p align="center">
  <img src="docs/images/lilframework.png"/>
</p>

# Presentation

## lil interaction language

**lil** is a domain specific language for Human Machine Interfaces specification, originally developped by Vincent Lecrubier during his Ph.D. at [ONERA](http://www.onera.fr), [ISAE](http://www.isae.fr) and [UPS Toulouse](http://www.univ-tlse3.fr) with the help of his tutors Bruno d'Ausbourg at [ONERA](http://www.onera.fr) and Yamine Aït-Ameur at [ENSEEIHT](http://www.enseeiht.fr). **lil** aims at enabling the following:

- Specification of abstract human-machine interfaces
- Collaboration of different stakeholders on the same specification document
- Design of safety-critical human-machine interfaces
- Ensuring non ambiguous formal specification of human-machine interfaces

## lil standard framework

**lil framework** is a baseline framework designed to implement the **lil** specification canonically. It aims at enabling the following:

- Code generation for prototyping 
- Code generation of runtime backbone
- Code validation
- Model checking of interaction properties
- Model checking of performance properties
- IDE integration with syntax coloring and content assist
- Integration with [ARINC 661](http://en.wikipedia.org/wiki/ARINC_661) via [J661](http://j661.sourceforge.net)

# Getting started

## Prerequisites

In order to get started in developping the **lil** framework, you must comply with the following prerequisites:

1. Have a working installation of the latest release of [Eclipse](http://www.eclipse.org/)

2. Have a working installation of the latest release of [Xtext](http://www.eclipse.org/Xtext/) 


## Installation

Once you are ready to install the **lil** framework into (framework_path), do the following:

1. Clone this repository in your desktop:

		cd (framework_path) 
		git clone https://github.com/crubier/lil.git
	
	(framework_path) should now contain only one folder called lil, containing the repository files.
	
2. Launch Eclipse / Xtext and switch to a fresh new workspace wherever on your machine, but NOT inside of the folder you just cloned:

		Eclipse  >>  File  >>  Switch Workspace  >>  Other...  >>
		Pick a new folder, typically (framework_path)/workspace  >>  Ok
	
	(framework_path) should now contain two folders : lil, and workspace
	
3. Import the 4 Projects found in (framework_path)/lil/projects/ into your workspace:

		Eclipse  >>  File  >>  Import  >> 
		General  >>  Existing projects into workspace  >>  Next  >>
		Select root directory : (framework_path)/lil/projects/  >> 
		Select all  >>  Uncheck Copy projects into workspace  >>  Finish
	
	Your eclipse packages explorer view should now display 4 projects in your workspace.
	
4. Build the language infrastructure:

		Eclipse package explorer view  >>  go to "com.crubier.lil/launch"  >>
		Right-click "Generate lil infrastructure.launch"  >> 
		"Run as"  >>  "Generate lil infrastructure"  >>
		Wait during the language infrastructure generation
	
	Your Eclipse console view should now indicate that the MWE2 workflow succeeded without errors.
	
5. Launch the lil editor runtime Eclipse:

		Eclipse package explorer view  >>  go to "com.crubier.lil/launch"  >>
		Right-click "Launch lil runtime eclipse.launch"  >>
		"Run as"  >>  "Launch lil runtime eclipse"  >>
		Wait until the new eclipse instance is up and running
	
	You should now have two Eclipse instances running : The Xtext IDE, and the lil IDE you just launched.
	Also, (framework_path) should now contain three folders : lil, workspace, and lilsampleworkspace
	
6. Import sample projects into the lil sample workspace:

		lil IDE Eclipse  >>  File  >>  Import  >>
		General  >>  Existing projects into workspace  >> 
		Select root directory : (framework_path)/lil/sample projects/  >> 
		Select all  >>  Uncheck Copy projects into workspace  >>  Finish
	
	Your lil IDE packages explorer view should now display the sample project in the lil workspace.
	
7. Play with the sample projects:

		lil IDE Eclipse  >>  Go in any sample project  >>
		Expand the "src" folder >> Open any "*.lil" file
	
	You are done ! You are now playing with a lil source file, enjoy !

## Sources

**lil** is specified in [Xtext](http://www.eclipse.org/Xtext/). So far, due to the xtext architecture, the interaction language specification and the standard framework code are quite intricated, but here is the important files you might want to have a look at:

- The syntax is defined in [Lil.xtext](projects/com.crubier.lil/src/com/crubier/lil/Lil.xtext)
- Scoping, validation, code formatting and code generation sources are available [there](projects/com.crubier.lil/src/com/crubier/lil/)


