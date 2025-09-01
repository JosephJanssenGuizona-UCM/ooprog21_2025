public class FixDebugOne
{
    /* This program displays a greeting */
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}
/*
e.g.
- // wrong syntax for access modifier "publlic" instead of "public"

Bugs:
1. // class name contains a space -> should be FixDebugOne
2. // method name is "Main" -> should be lowercase "main"
3. // parameter should be String[] args, not String args
4. // "Systm" is a typo -> should be System
5. // missing semicolon after "Hello World!"
6. // missing closing curly brace '}' for the class
*/