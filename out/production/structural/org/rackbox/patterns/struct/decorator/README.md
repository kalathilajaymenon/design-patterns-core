### [Decorator](https://refactoring.guru/design-patterns/decorator)
- Where is this pattern commonly seen ?
```commandline
InputStream input = new BufferedInputStream(new FileInputStream("file.txt"));
```
- What is the purpose of this pattern ?
    
The decorator pattern is a structural pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

- What are the main components of this pattern ?

The decorator pattern consists of a set of decorator classes that are used to wrap concrete components. The decorator class has the same interface as the component it decorates. The decorator class contains a reference to the component and delegates all operations to the component. 
The decorator class can add its own behavior before or after delegating to the component.

- Why is CoffeeDecorator an abstract class ?

The CoffeeDecorator class is an abstract class because it defines the interface for all concrete decorators. It contains a reference to the component it decorates and delegates all operations to the component. 
The concrete decorators will extend this class and implement their own behavior.

- Benefits of using this pattern ?
  - Flexibility: The decorator pattern allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.
  - Avoids class explosion: The decorator pattern avoids the need for an explosion of classes to support every combination of behaviors. Instead, new behavior can be added by creating new decorators.
  - Single Responsibility Principle: The decorator pattern allows for the separation of concerns by allowing behavior to be added to individual objects without affecting the behavior of other objects from the same class.
  - Open/Closed Principle: The decorator pattern allows for the extension of behavior without modifying existing code. This adheres to the open/closed principle, which states that software entities should be open for extension but closed for modification.
  - Code Reusability: The decorator pattern allows for the reuse of existing code by allowing behavior to be added to individual objects without affecting the behavior of other objects from the same class.
  - Maintainability: The decorator pattern allows for the easy addition of new behavior without modifying existing code. This makes the code more maintainable and easier to understand.
  - Testability: The decorator pattern allows for the easy testing of individual components and decorators. This makes it easier to test the behavior of individual components and decorators without affecting the behavior of other objects from the same class.
  - Extensibility: The decorator pattern allows for the easy addition of new behavior without modifying existing code. This makes the code more extensible and easier to understand.


- What are the main components of this pattern ?
  - Component: The interface or abstract class that defines the behavior of the objects that can have behavior added to them.
  - Concrete Component: The concrete implementation of the component interface. This is the object that will have behavior added to it.
  - Decorator: The abstract class that implements the component interface and contains a reference to the component. This class delegates all operations to the component and can add its own behavior before or after delegating to the component.
  - Concrete Decorator: The concrete implementation of the decorator class. This class adds its own behavior before or after delegating to the component.
