<p align="center">
  <img src="docs/images/lilframework.png"/>
</p>

#Presentation

## lil interaction language

**lil** is a domain specific language for Human Machine Interfaces specification, originally developped by Vincent Lecrubier during his Ph.D. at [ONERA](http://www.onera.fr), [ISAE](http://www.isae.fr) and [UPS Toulouse](http://www.univ-tlse3.fr) with the help of his tutors Bruno d'Ausbourg ([ONERA](http://www.onera.fr)) and Yamine Aït-Ameur ([ENSEEIHT](http://www.enseeiht.fr)).

**lil** aims at enabling the following :

- specification of abstract human-machine interfaces
- collaboration of different stakeholders on the same specification document
- design of safety-critical human-machine interfaces
- ensuring non ambiguous formal specification of human-machine interfaces

## lil standard framework

**lil framework** is a baseline framework designed to implement the **lil** specification canonically
It aims at enabling the following :

- code generation for prototyping 
- code generation of runtime backbone
- model checking of interaction properties
- model checking of performance properties
- IDE integration with syntax coloring, content assist, validation
- Integration with ARINC 661

# Implementation

**lil** is specified in [xtext](http://www.eclipse.org/Xtext/). So far, due to the xtext architecture, the interaction language specification and the standard framework code are quite intricated, but here is the important:

- The syntax is defined in [Lil.xtext](com.crubier.lil/src/com/crubier/lil/Lil.xtext)
- Scoping, validation, code formatting and code generation sources are available here [here](com.crubier.lil/src/com/crubier/lil/)
