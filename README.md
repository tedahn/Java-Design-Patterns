# Object-Oriented-Programming Design Patterns in JAVA

## About
Here are very basic examples of OOP  Design Patterns. They are mainly compiled for myself to refer back to but feel free to take a look.
 
All codes and examples were designed/shown by Derek Banas. They were written by myself so there may be some differences. But follow his guide on his [YouTube Channel](https://www.youtube.com/playlist?list=PLF206E906175C7E07) for detailed explanation. The definitions and descriptions of each design patterns are compiled from a mix of [OODesign.com](https://www.oodesign.com/) and [GeeksforGeeks](https://www.geeksforgeeks.org/)

## Behavioral Design Patterns

### 1. Strategy
>	Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

In computer programming, the strategy pattern (also known as the policy pattern) is a software design pattern that enables an algorithm’s behavior to be selected at runtime. 

The strategy pattern
- defines a family of algorithms,
- encapsulates each algorithm, and
- makes the algorithms interchangeable within that family.

### 2. Observer
>	Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

To understand observer pattern, first you need to understand the subject and observer objects.
- The relation between subject and observer can easily be understood as an analogy to magazine subscription.
- A magazine publisher(subject) is in the business and publishes magazines (data).
- If you(user of data/observer) are interested in the magazine you subscribe(register), and if a new edition is published it gets delivered to you.
- If you unsubscribe(unregister) you stop getting new editions.
- Publisher doesn’t know who you are and how you use the magazine, it just delivers it to you because you are a subscriber(loose coupling).

### 3. Template Method
>	Define the skeleton of an algorithm in an operation, deferring some steps to subclasses / Template Method lets subclasses redefine certain steps of an algorithm without letting them to change the algorithm's structure.

Template method design pattern is to define an algorithm as skeleton of operations and leave the details to be implemented by the child classes. The overall structure and sequence of the algorithm is preserved by the parent class.

Template means Preset format like HTML templates which has fixed preset format.Similarly in template method pattern,we have a preset structure method called template method which consists of steps.This steps can be abstract method which will be implemented by its subclasses.

This behavioral design pattern is one of the easiest to understand and implement. This design pattern is used popularly in framework development. This helps to avoid code duplication also.

### 4. Iterator
>	Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

Iterator Pattern is a relatively simple and frequently used design pattern. There are a lot of data structures/collections available in every language. Each collection must provide an iterator that lets it iterate through its objects. However while doing so it should make sure that it does not expose its implementation.

### 5. Chain of Responsibility
>	It avoids attaching the sender of a request to its receiver, giving this way other objects the possibility of handling the request too. The objects become parts of a chain and the request is sent from one object to another across the chain until one of the objects will handle it.

Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is passed to a chain of objects to process them. Later, the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

Where and When Chain of Responsibility pattern is applicable :
- When you want to decouple a request’s sender and receiver
- Multiple objects, determined at runtime, are candidates to handle a request
- When you don’t want to specify handlers explicitly in your code
- When you want to issue a request to one of several objects without specifying the receiver explicitly.
- This pattern is recommended when multiple objects can handle a request and the handler doesn’t have to be a specific object. Also, handler is determined at runtime. Please note that that a request not handled at all by any handler is a valid use case.

### 6. Interpreter
>	Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language / Map a domain to a language, the language to a grammar, and the grammar to a hierarchical object-oriented design

Interpreter design pattern is one of the behavioral design pattern. Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.

- This pattern involves implementing an expression interface which tells to interpret a particular context. This pattern is used in SQL parsing, symbol processing engine etc.
- This pattern performs upon a hierarchy of expressions. Each expression here is a terminal or non-terminal.
- The tree structure of Interpreter design pattern is somewhat similar to that defined by the composite design pattern with terminal expressions being leaf objects and non-terminal expressions being composites.
- The tree contains the expressions to be evaluated and is usually generated by a parser. The parser itself is not a part of the interpreter pattern.

### 7. Mediator
>	Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

Mediator design pattern is one of the important and widely used behavioral design pattern. Mediator enables decoupling of objects by introducing a layer in between so that the interaction between objects happen via the layer. If the objects interact with each other directly, the system components are tightly-coupled with each other that makes higher maintainability cost and not hard to extend. Mediator pattern focuses on providing a mediator between objects for communication and help in implementing lose-coupling between objects.

Air traffic controller is a great example of mediator pattern where the airport control room works as a mediator for communication between different flights. Mediator works as a router between objects and it can have it’s own logic to provide way of communication.

### 8. Visitor
>	Represents an operation to be performed on the elements of an object structure / Visitor lets you define a new operation without changing the classes of the elements on which it operates.

Visitor design pattern is one of the behavioral design patterns. It is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.

The visitor pattern consists of two parts:
1. a method called Visit() which is implemented by the visitor and is called for every element in the data structure
2. visitable classes providing Accept() methods that accept a visitor
	
## Creational Design Patterns

### 1a. Factory Method
>	Defines an interface for creating objects, but let subclasses to decide which class to instantiate and Refers to the newly created object through a common interface.

In Factory pattern, we create object without exposing the creation logic to client and the client use the same common interface to create new type of object.

The idea is to use a static member-function (static factory method) which creates & returns instances, hiding the details of class modules from user.

A factory pattern is one of the core design principles to create an object, allowing clients to create objects of a library(explained below) in a way such that it doesn’t have tight coupling with the class hierarchy of the library.

### 1b. Factory (Simplified version of Factory Method)
>	Creates objects without exposing the instantiation logic to the client and Refers to the newly created object through a common interface.

### 2. Abstract Factory 
>	Offers the interface for creating a family of related objects, without explicitly specifying their classes.

Abstract Factory design pattern is one of the Creational pattern. Abstract Factory pattern is almost similar to Factory Pattern is considered as another layer of abstraction over factory pattern. Abstract Factory patterns work around a super-factory which creates other factories.

Abstract factory pattern implementation provides us a framework that allows us to create objects that follow a general pattern. So at runtime, abstract factory is coupled with any desired concrete factory which can create objects of desired type.

### 3. Singleton
>	Ensure that only one instance of a class is created and Provide a global access point to the object.

The singleton pattern is one of the simplest design patterns. Sometimes we need to have only one instance of our class for example a single DB connection shared by multiple objects as creating a separate DB connection for every object may be costly. Similarly, there can be a single configuration manager or error manager in an application that handles all problems instead of creating multiple managers.

### 4. Builder
>	Defines an instance for creating an object but letting subclasses decide which class to instantiate and Allows a finer control over the construction process.

Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can be used to create different representations of the same object.

### 5. Prototype 
>	Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

Prototype allows us to hide the complexity of making new instances from the client. The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly operations. The existing object acts as a prototype and contains the state of the object. The newly copied object may change same properties only if required. This approach saves costly resources and time, especially when the object creation is a heavy process.

The prototype pattern is a creational design pattern. Prototype patterns is required, when object creation is time consuming, and costly operation, so we create object with existing object itself. One of the best available way to create object from existing objects are clone() method. Clone is the simplest approach to implement prototype pattern. However, it is your call to decide how to copy existing object based on your business model.

### 6. Command
>	Encapsulate a request in an object, Allows the parameterization of clients with different requests and Allows saving the requests in a queue.

The command pattern encapsulates a request as an object, thereby letting us parameterize other objects with different requests, queue or log requests, and support undoable operations.

The definition is a bit confusing at first but let’s step through it. In analogy to our problem above remote control is the client and stereo, lights etc. are the receivers. In command pattern there is a Command object that encapsulates a request by binding together a set of actions on a specific receiver. It does so by exposing just one method execute() that causes some actions to be invoked on the receiver.

## Structural Design Patterns

### 1. Decorator
>	add additional responsibilities dynamically to an object.

The decorator pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

Take a pizza and “decorate” it with toppings at runtime:
1. Take a pizza object
2. “Decorate” it with a Capsicum object.
3. “Decorate” that with a CheeseBurst object.
4. Call getCost() and use delegation instead of inheritance to calculate the toppings' cost.

What we get in the end is a pizza with cheeseburst and capsicum toppings. Visualize the “decorator” objects  like wrappers. 

Here are some of the properties of decorators:
- Decorators have the same super type as the object they decorate.
- You can use multiple decorators to wrap an object.
- Since decorators have same type as object, we can pass around decorated object instead of original.
- We can decorate objects at runtime.

### 2. Adapter
>	Convert the interface of a class into another interface clients expect. / Adapter lets classes work together, that could not otherwise because of incompatible interfaces.

This pattern is easy to understand as the real world is full of adapters.   For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and USB on the other. Since they are incompatible with each other. we use an adapter that converts one to other. This example is pretty analogous to Object Oriented Adapters. In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

To use an adapter:
1. The client makes a request to the adapter by calling a method on it using the target interface.
2. The adapter translates that request on the adaptee using the adaptee interface.
3. Client receive the results of the call and is unaware of adapter’s presence.

### 3. Bridge
>	Compose objects into tree structures to represent part-whole hierarchies. / Composite lets clients treat individual objects and compositions of objects uniformly.

The Bridge design pattern allows you to separate the abstraction from the implementation.It is a structural design pattern.

There are 2 parts in Bridge design pattern :
1. Abstraction
2. Implementation

This is a design mechanism that encapsulates an implementation class inside of an interface class.
- The bridge pattern allows the Abstraction and the Implementation to be developed independently and the client code can access only the Abstraction part without being concerned about the Implementation part.
- The abstraction is an interface or abstract class and the implementor is also an interface or abstract class.
- The abstraction contains a reference to the implementor. Children of the abstraction are referred to as refined abstractions, and children of the implementor are concrete implementors. Since we can change the reference to the implementor in the abstraction, we are able to change the abstraction’s implementor at run-time. Changes to the implementor do not affect client code.
- It increases the loose coupling between class abstraction and it’s implementation.

### 4. Composite 
>	Compose objects into tree structures to represent part-whole hierarchies. / Composite lets clients treat individual objects and compositions of objects uniformly.

Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies. It allows you to have a tree structure and ask each node in the tree structure to perform a task. (When dealing with Tree-structured data, programmers often have to discriminate between a leaf-node and a branch. This makes code more complex, and therefore, error prone. The solution is an interface that allows treating complex and primitive objects uniformly.)

The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them. The operations you can perform on all the composite objects often have a least common denominator relationship.

The Composite Pattern has four participants:
1. Component – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.
2. Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
3. Composite – Composite stores child components and implements child related operations in the component interface.
4. Client – Client manipulates the objects in the composition through the component interface.

### 5. Flyweight
>	use sharing to support a large number of objects that have part of their internal state in common where the other part of state can vary.

This pattern provides ways to decrease object count thus improving application required objects structure. Flyweight pattern is used when we need to create a large number of similar objects (say 105). One important feature of flyweight objects is that they are immutable. This means that they cannot be modified once they have been constructed.

In Flyweight pattern we use a HashMap that stores reference to the object which have already been created, every object is associated with a key. Now when a client wants to create an object, he simply has to pass a key associated with it...

### 6. Proxy
>	provide a “Placeholder” for an object to control references to it.

Proxy means ‘in place of’, representing’ or ‘in place of’ or ‘on behalf of’ are literal meanings of proxy and that directly explains Proxy Design Pattern. Proxies are also called surrogates, handles, and wrappers. They are closely related in structure, but not purpose, to Adapters and Decorators.

A real world example can be a cheque or credit card is a proxy for what is in our bank account. It can be used in place of cash, and provides a means of accessing that cash when required. And that’s exactly what the Proxy pattern does – “Controls and manage access to the object they are protecting“.

### 7. Memento
>	capture the internal state of an object without violating encapsulation and thus providing a mean for restoring the object into initial state when needed.

Memento pattern is used to restore state of an object to a previous state. As your application is progressing, you may want to save checkpoints in your application and restore back to those checkpoints later.

Design components
- originator : the object for which the state is to be saved. It creates the memento and uses it in future to undo.
- memento : the object that is going to maintain the state of originator. Its just a POJO.
- caretaker : the object that keeps track of multiple memento. Like maintaining savepoints.
	
## Other Patterns
1. Java Reflection API
2. Facade Design Pattern
3. State Design Pattern
