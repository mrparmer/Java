# Java

## Variables

```java
//width of an Int = 32 (4 bytes)
int myIntValue = 5;
//width of a float = 32 (4 bytes)
float myFloatValue = 5f;
//width of a double = 64 (8 bytes)
double myDoubleValue = 5d;
```

​		Can cast an int, or double as another type by using () with the data type between them.

​	Float has 7 digits of precision
​	Double has 16 digits of precision. Is actually faster on modern systems. Inbuilt Java functions just Double more often, and it is more precise.

```java
char myChar = 'D';
```

Char must use single quote, can be letter, number, or special character, can also be unicode. Can only be one character, width of 16(2 bytes). Unicode much be called as '\ucode'

Strings

Append to strings 

```java
String myString = "This is my string";
System.out.println("myString equals: " + myString);
myString = myString + ", and this is how you add more.";
System.out.println("myString equals: " + myString);
```

## Operators

​	Operators are special symbols that perform specific operations on 1, 2, or 3 operands then return a result. Mathematical symbols are operators

varName += value is short cut for setting varName = varName +-*/% value.

### Conditionals

​	if( && ) both conditions must be true

variables created inside a code block cannot be accessed outside of the block. AKA scope