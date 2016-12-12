class GroovyTutTwo {
  static void main(String[] args) {
    // a string variable
    def vocation = 'doctor';
    def name = "John Doe";

    println(vocation.class.name); // => java.lang.String
    println(name.class.name); // => java.lang.String

    def sentence = 'Welcome, ${name}!';
    def anotherSentence = "Welcome, ${name}!";

    println(sentence.class.name); // => java.lang.String
    println(anotherSentence.class.name); // => org.codehaus.groovy.runtime.GStringImpl

    def poem = '''This
      is a multiline
      string.
      Indentation WILL BE present too''';

    println(poem);

    // Slicing strings:
    def fullName = "John Marshall Somebody";

    println(fullName[1..6]) // => "ohn M"

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
  }
}
