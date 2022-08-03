Lambda expression:

1. an anonymous method (it doesn't have a name),
2. It is used to provide the inline implementation of a method defined by the functional interface,
3. The arrow operator (->) connects the argument and functionality,
4. long lambda expressions consisting of many statements may reduce the readability of the code.

Method reference:

1. re-usable (no need to copy and paste lambda expression),
2. It refers to a method without executing it,
3. the double colon operator  (::) separates the method name from the name of an object or class,
4. extracting many statements from lambda expression in a method and referencing it may improve the readability of the code,