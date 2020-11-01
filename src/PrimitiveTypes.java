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
        System.out.println("myBoolean : " + myBoolean); // prints false

        ////////////////// char //////////////////////////////
        char myChar = 'c';
        System.out.println("myChar : " + myChar);

        /////////////////// byte //////////////////////////////
        byte myByte = 9;
        System.out.println("myByte : " + myByte);
        System.out.println("byte Max value : " + Byte.MAX_VALUE); // Max Value to be assigned to a byte variable
        System.out.println("byte Min value : " + Byte.MIN_VALUE); // Min Value to be assigned to a byte variable

        /////////////////// short ////////////////////////
        short myShort = 12;
        System.out.println("myShort : " + myShort);
        System.out.println("short Max value : " + Short.MAX_VALUE);
        System.out.println("short Min value : " + Short.MIN_VALUE);

        //////////////// Integer /////////////////////////
        int myInt = 12;
        System.out.println("myInt : " + myInt);
        System.out.println("int Max Value : " + Integer.MAX_VALUE);
        System.out.println("int min value : " + Integer.MIN_VALUE);

        //////////////// long ///////////////////////
        long myLong = 12;
        System.out.println("myLong" + myLong);
        System.out.println("long Max Value : " + Long.MAX_VALUE);
        System.out.println("long Min Value : " + Long.MIN_VALUE);

        /////////////// float ///////////////////
        float myFloat = 12.3f;
        myFloat = 12.0f;
        System.out.println("myFloat : " + myFloat);
        System.out.println("float Min Value :" + Float.MIN_VALUE);
        System.out.println("float Max Value : " + Float.MAX_VALUE);

        /////////// double /////////////////////
        double myDouble = 12.3f;
        myDouble = 12.0f;
        System.out.println("myDouble : " + myDouble);
        System.out.println("double Min Value :" + Double.MIN_VALUE);
        System.out.println("double Max Value : " + Double.MAX_VALUE);


    }
}
