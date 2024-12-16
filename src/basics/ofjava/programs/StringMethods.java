package basics.ofjava.programs;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        StaticMethods();
        InstanceMethods();
    }

    public static void StaticMethods(){
        int num = 45;
        float f = 4545767.5F;
        String name = "Raghava";
        String initial = "Ginjupalli";
        char[] text = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        // String.valueOf() is convert any data type to String.
        String value = String.valueOf(f);
        System.out.println(value);

        // String.copyValueOf() for creating String from char[].
        System.out.println(String.copyValueOf(text));                // Hello World
        System.out.println(String.copyValueOf(text, 6, 4));          // Worl

        /*
        NOTE: You can convert all Char[] array and print as String or as SubString.
        NOTE: text- char Array, "6"- start index of array, "4" - after start index how many characters you want.
        NOTE: we can't give end index out-of-boundary
        */

        // String.format() is for formating string like "printf".
        String message = String.format("my name is %s, my id is %d, my grade is %,.2f", name, num, f);
        // NOTE: %f-floating, "," for two separate the floating value, ".2" for print 2 decimal point after "."
        System.out.println(message);

        // String.join() is for joining multiple strings with specified symbol.
        System.out.println(String.join("-", name, initial));            // Raghava-Ginjupalli

        // NOTE: "-" - delimiter, str1, str2, str3...


    }

    public static void InstanceMethods(){
        float fl = 75.86F;
        String name = "     Raghava";

    // obj.charAt() is use to get single character from string at the specified index.
        char sub1 = name.charAt(6);
        System.out.println(sub1);

    // obj.length() is to get length of given string.
        int sub2 = name.length();
        System.out.println(sub2);

        int c1 = String.valueOf(fl).length();
        // I give float value & covert to string, and then I calculate the length of string.
        // NOTE: we can perform type conversation and methods using at single line.
        System.out.println(c1);

    // obj.subString(startingIndex, endingIndex(optional)) to get subString from specified String.
        String sub_name = name.substring(2);           // ghava from Raghava.
        // NOTE: If you don't specify ending index it will print from string index to until ending.

        String sub_name1 = name.substring(2, 5);       // gha from Raghava.
        // NOTE: If we want get subString from one specific index to another one specific index.

        System.out.println(sub_name);
        System.out.println(sub_name1);

    // obj.equals(another str) to check other string content and this string.

        // NOTE: it will check the given string and present string content.
        System.out.println(name.equals("Raghava"));             // True
        System.out.println(name.equals("raghava"));             // False, because content same still case different.
        System.out.println(name.equalsIgnoreCase("raghava"));   // True, because content same, case doesn't matter.

    // obj.contains() for check the specified substring present/not.
        System.out.println(name.contains("gha"));   // True, because "gha" is contains "Raghava".

    // obj.lowerCase() / upperCase() to change the case.
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // NOTE: to convert all characters to lower or upper.

    // obj.trim() to remove the white spaces from starting and ending.
        System.out.println(name);            //    Raghava
        System.out.println(name.trim());     // Raghava
        // NOTE: it won't delete the characters & inside words spaces.

    // obj.replace() to remove and update the old char with new char.
        System.out.println(name.replace('a','A'));
        // NOTE: For single char replacement

        String name2 = "remove and update the ve";
        System.out.println(name2.replace("remove","Ra"));
        // NOTE: For word replacement

    // obj.indexOf() take char value and check the first occurrence of the char.
        System.out.println(name2.indexOf('m'));      // output : 2
        // NOTE: It takes char in name2 string and checks the 'm' letter first occurrence.

        System.out.println(name2.indexOf("move"));      // output : 2
        // NOTE: It will take substring of name2 string but, it checks the first letter of substring as char and check it's first occurrence.
        // NOTE: It takes "move" substring and pick the 'm' as char to check its first occurrence.

        // NOTE : If specified char or substring is not there in the string it will give output as "-1".

    // obj.lastIndexOf() take char value and check the last occurrence of the char.
        System.out.println(name2.lastIndexOf('b'));      // output : -1  because, it is not in the string
        // NOTE: It takes char in name2 string and checks the 'm' letter last occurrence.

        System.out.println(name2.lastIndexOf("ve"));      // output : 22
        // NOTE: It will take substring of name2 string but, it checks the last letter of substring as char and check it's first occurrence.
        // NOTE: It takes "ve" substring and pick the 'v' as char to last occurrence.

        // NOTE : If specified char or substring is not there in the string it will give output as "-1".

    // obj.startsWith() / endsWith() to specified string is is in the starting or ending.
        System.out.println(name2.startsWith("re"));             // TO check starting
        System.out.println(name2.endsWith("re"));               // To check ending

    // obj.concat(str)
        String str1 = "Hello";
        String str2 = " World";
        String result = str1.concat(str2); // "Hello World"
        // NOTE: it will take another string and concatenate the current string.

    // obj.toCharArray() take string and convert to char Array.
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));

    // obj.isEmpty() to check given string is empty or not.
        String ety = "";
        String ety1 = " ";
        System.out.println(ety.isEmpty());            // True because ety String is Empty.
        System.out.println(ety1.isEmpty());           // False because ety1 String is contain space, so not a Empty.// obj.isEmpty() to check given string is empty or not.


    }
}
