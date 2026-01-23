/**
 * This program demonstrates various String operations in Java.
 */
public class StringDemo {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        String greeting = "Hello";
        String name = "World";
        
        // 2. Concatenation (Joining strings)
        String message = greeting + " " + name + "!";
        System.out.println("Message: " + message);
        
        // 3. Length of a string
        int length = message.length();
        System.out.println("Length: " + length);
        
        // 4. Character at specific index
        char firstChar = message.charAt(0);
        System.out.println("First character: " + firstChar);
        
        // 5. Substring (Extracting a part)
        String sub = message.substring(0, 5); // From index 0 to 4
        System.out.println("Substring (0-5): " + sub);
        
        // 6. Case conversion
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());
        
        // 7. Comparison
        String str1 = "Java";
        String str2 = "java";
        System.out.println("Equals 'java'? " + str1.equals(str2));
        System.out.println("Equals Ignore Case 'java'? " + str1.equalsIgnoreCase(str2));
        
        // 8. Searching
        System.out.println("Contains 'World'? " + message.contains("World"));
        System.out.println("Index of 'o': " + message.indexOf('o'));
        
        // 9. Replacing
        String replaced = message.replace("World", "Java");
        System.out.println("Replaced: " + replaced);
        
        // 10. Splitting
        String csv = "Apple,Banana,Orange";
        String[] fruits = csv.split(",");
        System.out.print("Fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}