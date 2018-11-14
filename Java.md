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

## Switch Statements

For use when needing to use many if/else statements. Matter of style. Less flexible, can only test one variables, whereas if/else can test different variables.

```java
int switchValue = 1;
switch(switchValue){
    case 1:
        System.out.println("Value was 1");
        break;
    case 2:
        System.out.println("Value was 2");
        break;
    case 3: case 4: case 5:
        System.out.println("Was a 3, 4, or 5");
        break;
    default:
        System.out.println("Was not one or two, three, four, or five");
        break;
}
```

```java
char switchChar = 'e';
switch (switchChar){
    case 'a':case 'b':case 'c':case 'd':case 'e':
        System.out.println(switchChar + " was found.");
        break;
    default:
        System.out.println("No valid value was input");
}
```

```java
String month = "january";
switch (month.toLowerCase()){
    case "january":
        System.out.println("January");
        break;
    case "june":
        System.out.println("June");
        break;
    default:
        System.out.println("Not sure");
}
```