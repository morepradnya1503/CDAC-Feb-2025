//Primitive DataType 
public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        
        // Declaring variables for all primitive data types
        
        // byte (Default: 0, Assigned: 10)
        byte byteVar = 10;
        
        // short (Default: 0, Assigned: 20)
        short shortVar = 20;
        
        // int (Default: 0, Assigned: 100)
        int intVar = 100;
        
        // long (Default: 0L, Assigned: 1000L)
        long longVar = 1000L;
        
        // float (Default: 0.0f, Assigned: 5.75f)
        float floatVar = 5.75f;
        
        // double (Default: 0.0, Assigned: 19.99)
        double doubleVar = 19.99;
        
        // char (Default: '\u0000', Assigned: 'A')
        char charVar = 'A';
        
        // boolean (Default: false, Assigned: true)
        boolean booleanVar = true;
        
        // Printing default and assigned values
        
        // byte
        System.out.println("Default value of byte: " + (byte)0);
        System.out.println("Assigned value of byte: " + byteVar);
        
        // short
        System.out.println("Default value of short: " + (short)0);
        System.out.println("Assigned value of short: " + shortVar);
        
        // int
        System.out.println("Default value of int: " + 0);
        System.out.println("Assigned value of int: " + intVar);
        
        // long
        System.out.println("Default value of long: " + 0L);
        System.out.println("Assigned value of long: " + longVar);
        
        // float
        System.out.println("Default value of float: " + 0.0f);
        System.out.println("Assigned value of float: " + floatVar);
        
        // double
        System.out.println("Default value of double: " + 0.0);
        System.out.println("Assigned value of double: " + doubleVar);
        
        // char
        System.out.println("Default value of char: " + '\u0000'); // Default value for char
        System.out.println("Assigned value of char: " + charVar);
        
        // boolean
        System.out.println("Default value of boolean: " + false);
        System.out.println("Assigned value of boolean: " + booleanVar);
    }
}
