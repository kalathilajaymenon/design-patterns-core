# Proxy Pattern

The Proxy Pattern is a structural design pattern that provides an object representing another object. It acts as an intermediary, controlling access to the original object and allowing for additional functionality such as lazy loading, access control, logging, or caching.

## When to Use Proxy Pattern
- When you want to control access to an object.
- When you want to add additional functionality to an object without modifying its code.
- When you want to implement lazy loading, where the object is not created until it is needed.
- When you want to implement access control, where only certain clients can access the object.
- When you want to implement logging or caching, where the object is accessed frequently and you want to optimize performance.

## Benefits of Proxy Pattern
- Provides a way to control access to an object.
- Allows for additional functionality to be added to an object without modifying its code.
- Supports lazy loading, access control, logging, and caching.
- Reduces the complexity of the client code by providing a simple interface to the original object.
- Improves performance by reducing the number of objects created and the amount of memory used.

## Differences between Proxy and Decorator Patterns
- The Proxy Pattern is used to control access to an object, while the Decorator Pattern is used to add additional functionality to an object.
- The Proxy Pattern is typically used to provide a simple interface to a complex object, while the Decorator Pattern is used to add behavior to an object without modifying its code.
- 
