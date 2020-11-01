public class PrimitiveTypes {
    public static void main(String[] args) {

        /**
         * boolean
         * a boolean value: true or false
         * char
         * 16-bit Unicode character
         * byte
         * 8-bit signed two’s complement integer
         * short
         * 16-bit signed two’s complement integer
         * int
         * 32-bit signed two’s complement integer
         * long
         * 64-bit signed two’s complement integer
         * float
         * 32-bit floating-point number (IEEE 754-1985)
         * double
         * 64-bit floating-point number (IEEE 754-1985)
         */

        System.out.println("*** Primitive Data Types program ***");
        // A variable of specific type stores a value of that type

        ///////////////// boolean //////////////////////
        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean); // prints false

        ////////////////// char //////////////////////////////
        char myChar = 'c';
        System.out.println(myChar);

        /////////////////// byte //////////////////////////////
        byte myByte = 9;
        System.out.println(myByte);
        System.out.println(Byte.MAX_VALUE); // Max Value to be assigned to a byte variable
        System.out.println(Byte.MIN_VALUE); // Min Value to be assigned to a byte variable

        /////////////////// short ////////////////////////
        short myShort = 12;
        System.out.println(myShort);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //////////////// Integer /////////////////////////
        int myInt = 12;
        System.out.println(myInt);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //////////////// long ///////////////////////
        long myLong = 12;
        System.out.println(myLong);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        /////////////// float ///////////////////
        float myFloat = 12.3f;
        myFloat = 12.0f;
        System.out.println(myFloat);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        /////////// double /////////////////////
        double myDouble = 12.3f;
        myDouble = 12.0f;
        System.out.println(myDouble);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


    }
}
