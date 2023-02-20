# designpatterns2
design patterns in java - 2

NO MATTER WHAT- FOLLOW THE OPEN-CLOSED Principle.
meaning open for extension, closed for modification
====================================================


Behavioural Design Patterns - Communication and interaction between objects
---------------------------
Memento: Allows restoring an object to a previous state.

State: Allows an object to behave differently depending on the state it is in.

Iterator: Allows iterating over an object without having to expose the object’s internal structure (which may change in the future).

Strategy: Allows passing different algorithms (behaviours) to an object.  Allows defining a template (skeleton) for an operation. 
Specific steps will then be implemented in subclasses.

Command: Allows decouple a sender from a receiver. The sender will talk to the receive through a command. 
Commands can be undone and persisted. 

Observer: Allows an object notify other objects when its state changes.

Mediator: Allows an object to encapsulate the communication between other objects.

Chain of Responsibility: Allows building a chain of objects to process a request.

Visitor: Allows adding new operations to an object structure without modifying it.




Structural Design Patterns - Relationships between objects
--------------------------

Observer Pattern - What the state of an object changes, we must notify another object.

https://i.imgur.com/dnbePcs.png

Push and Pull System 
Push - When DataSource/Subject Pushes data into the observer
Pull - When DataSource/Subject Pulls data FROM The observer


Composite Pattern  - Use when you have a hierarchy and want to treat everything in that hierarchy the same.

https://i.imgur.com/diCyODm.png


Adapter Pattern - To convert the interface of a class to a different form to match 
some library. Think of an adapter for computers etc.

https://i.imgur.com/VSZf4TA.png


Decorator Pattern - Used to add additional behavior to an object.
-------------------
*Encrypt data, such as when storing credit card information.  You do not want to store it in plain text.
You want to have it encrypted.


Facade Pattern - Easy.
----------------

FlyWeight Pattern - Use this pattern in applications where there is a large amount of objects and they use tons of 
memory. Use the flyweight pattern to reduce the amount of memory consumed by these objects.
------------------
A FlyWeight is an object we can share.

https://i.imgur.com/SfOgN4U.png




Bridge Pattern - Purpose of this pattern is to allow two seperate hierarchies to both grow independent of each other.
----------------
https://i.imgur.com/zh0sh7v.png


Proxy Pattern - 
Uses Proxies for different events, such as logging, lazy loading, auth etc.
----------------
https://i.imgur.com/l704iSi.png


===============================
Creational Design Patterns 
===============================

Prototype Pattern - Used when creating new objects by copying an existing object.
------------------------
https://i.imgur.com/jsd9CpV.png


Singleton Pattern - Ensure a class only has a single instnace.  Make a class responsible for making sure that class
can only create a single instance. Define an operation for the creation of a single instance.  
Make a private static field that holds an instance of that class.  Make the constructor private and create an operation
to return a single instance of that class.
------------------
https://i.imgur.com/HFTbWVE.png


Factory Method Pattern -  defer the creation of an object to subclasses, make the parent class abstract, and
have the sub class create the object. **RELIES ON INHERITANCE and polymorphism** - DO NOT USE STATIC METHODS because you cannot overwrite
static methods in java.
------------------------
https://i.imgur.com/w7LJCmt.png

**in a real application, instead of rendering these individual widgets, we would render through a form.


Abstract Factory Pattern - Provides an interface for creating families of related objects 
--------------------------
https://i.imgur.com/QRVEVV0.png
https://i.imgur.com/F7brWcF.png

FACTORY METHOD is a METHOD.
ABSTRACT FACTORY IS AN ABSTRACTION(interface)


Builder Pattern - To seperate the construction of an object from its representation.

---------------------
https://i.imgur.com/JZkqm0e.png
