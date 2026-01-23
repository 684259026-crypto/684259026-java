/**
 * This program demonstrates the 8 primitive data types in Java.
 */
public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        // 1. byte: 8-bit integer (-128 to 127)
        byte myByte = 100;
        
        // 2. short: 16-bit integer (-32,768 to 32,767)
        short myShort = 30000;
        
        // 3. int: 32-bit integer (most commonly used)
        int myInt = 1000000;
        
        // 4. long: 64-bit integer (use 'L' suffix)
        long myLong = 10000000000L;
        
        // 5. float: 32-bit floating point (use 'f' suffix)
        float myFloat = 3.14f;
        
        // 6. double: 64-bit floating point (standard for decimals)
        double myDouble = 19.99;
        
        // 7. char: 16-bit Unicode character (use single quotes)
        char myChar = 'A';
        
        // 8. boolean: true or false
        boolean myBoolean = true;

        // Displaying the values
        System.out.println("=== Java Primitive Data Types ===");
        System.out.println("byte:    " + myByte);
        System.out.println("short:   " + myShort);
        System.out.println("int:     " + myInt);
        System.out.println("long:    " + myLong);
        System.out.println("float:   " + myFloat);
        System.out.println("double:  " + myDouble);
        System.out.println("char:    " + myChar);
        System.out.println("boolean: " + myBoolean);
    }
}