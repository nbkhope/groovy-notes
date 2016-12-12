class GroovyTut {
  static void main(String[] args) {
    println("Hello World");

    // Variables are dynamically typed
    def age = "Dog";
    age = 32; // allowed in Groovy

    // Math Operations: + - * %

    // Integer division:
    println(5.intdiv(4));
    // vs. floating point (no matter if numbers are integers)
    println(5 / 4);

    // the statements below all seem to do the same thing,
    // with result being an FP number
    println(5.2 + 4.4);
    println(5.2.plus(4.4));

    println(5.2 - 3.1);
    println(5.2.minus(3.1));

    println(5.2 * 4.4);
    println(5.2.multiply(4.4));
  }
}
