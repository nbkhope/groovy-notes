class GroovyNotesTwo {
  static void main(String[] args) {
    // a string variable
    def vocation = 'doctor';
    def name = "John Doe";

    println(vocation.class.name); // => java.lang.String
    println(name.class.name); // => java.lang.String

    def sentence = 'Welcome, ${name}!';
    def anotherSentence = "Welcome, ${name}!"; // either with or without $var / ${} seems to work

    println(sentence); // => java.lang.String
    println(anotherSentence); // => org.codehaus.groovy.runtime.GStringImpl

    def poem = '''This
      is a multiline
      string.
      Indentation WILL BE present too''';

    println(poem);

    // Slicing strings:
    def fullName = "John Marshall Somebody";

    println(fullName[1..6]) // => "ohn Ma" because .. is inclusive
    println(fullName[0,5,7]) // => "JMr"

    /* Optionality */

    // 4.1 Optional parentheses
    // println 'Hello World'
    // def maximum = Math.max 5, 8
    //
    // ** Parentheses are required for method calls
    // without parameters or ambiguous method calls
    //  e.g. println()

    // 4.2. Optional semicolons

    // 4.3. Optional return keyword
    // In Groovy, the last expression evaluated in the body of
    // a method or a closure is returned.
    //
    //  e.g.
    // int add(int a, int b) {
    //     a+b
    // }
    // assert add(1, 2) == 3

    // 4.4. Optional public keyword
    // By default, Groovy classes and methods are public


    // More on Strings
    println("Hello " + "World")
    println "Hello ".concat("World") // same

    println("hello " * 4) // allowed (repeats string)

    // Comparing Strings
    // someString.equals(anotherString)
    // someString.equalsIgnoreCase(anotherString)

    def greeting = 'Hello World ' * 2
    println greeting - 'Hello' // you can subtract from a string!
    println greeting.split(' ')
    println greeting.toList() // split into individual characters
    println greeting.replaceAll('Hello', 'Goodbye')

    def efficiency = 3.48
    println 'The efficiency is $efficiency'
    println "The efficiency is $efficiency" // this also interpolates . . . the {} are optional

    printf('%-10s %d %.2f %10s\n', 'Welc', 12, 24.321231, 'Bla')
    // %10s from the left, fill to be 10 spaces
    // %-10s pushing from the right, fill to be 10 spaces
  }
}
