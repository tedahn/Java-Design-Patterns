# Java Design Patterns

## Behavioral Design Patterns
1. Strategy
>	Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
2. Observer
>	Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
3. Template Method
>	Define the skeleton of an algorithm in an operation, deferring some steps to subclasses / Template Method lets subclasses redefine certain steps of an algorithm without letting them to change the algorithm's structure.
4. Iterator
>	Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
5. Chain of Responsibility
>	It avoids attaching the sender of a request to its receiver, giving this way other objects the possibility of handling the request too. The objects become parts of a chain and the request is sent from one object to another across the chain until one of the objects will handle it.
6. Interpreter
>	Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language / Map a domain to a language, the language to a grammar, and the grammar to a hierarchical object-oriented design
7. Mediator
>	Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
8. Visitor
	Represents an operation to be performed on the elements of an object structure / Visitor lets you define a new operation without changing the classes of the elements on which it operates.

	
## Creational Design Patterns
1a. Factory Method
>	Defines an interface for creating objects, but let subclasses to decide which class to instantiate and Refers to the newly created object through a common interface.
1b. Factory (Simplified version of Factory Method)
>	Creates objects without exposing the instantiation logic to the client and Refers to the newly created object through a common interface.
2. Abstract Factory 
>	Offers the interface for creating a family of related objects, without explicitly specifying their classes.
3. Singleton
>	Ensure that only one instance of a class is created and Provide a global access point to the object.
4. Builder
>	Defines an instance for creating an object but letting subclasses decide which class to instantiate and Allows a finer control over the construction process.
5. Prototype 
>	Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
6. Command
>	Encapsulate a request in an object, Allows the parameterization of clients with different requests and Allows saving the requests in a queue.


## Structural Design Patterns
1. Decorator
>	add additional responsibilities dynamically to an object.
2. Adapter
>	Convert the interface of a class into another interface clients expect. / Adapter lets classes work together, that could not otherwise because of incompatible interfaces.
3. Bridge
>	Compose objects into tree structures to represent part-whole hierarchies. / Composite lets clients treat individual objects and compositions of objects uniformly.
4. Composite 
>	Compose objects into tree structures to represent part-whole hierarchies. / Composite lets clients treat individual objects and compositions of objects uniformly.
5. Flyweight
>	use sharing to support a large number of objects that have part of their internal state in common where the other part of state can vary.
6. Proxy
>	provide a “Placeholder” for an object to control references to it.
7. Memento
>	capture the internal state of an object without violating encapsulation and thus providing a mean for restoring the object into initial state when needed.
	
## Other Patterns
1. Java Reflection
2. Facade Design Pattern
3. State Design Pattern
