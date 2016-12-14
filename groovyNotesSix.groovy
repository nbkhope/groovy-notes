class groovyNotesSix {
  static void main(String[] args) {
    println getGreeting()

    def numbers = [1, 2, 3, 4, 5]
    println numbers
    println doubleNumbers(numbers)

    println sumNumbers(4, 3, 7)

    println factorial(4) // 4 * 3 * 2 * 1 = 24
  }

  // Defining a method
  static def getGreeting() {
    // last evaluated expression is implicitly returned, like in Ruby
    'Hello Everybody!'
  }

  static def doubleNumbers(list) {
    // "The collect() method in Groovy can be used to iterate over collections
    // and transform each element of the collection. The transformation
    // is defined in as a closure and is passed to the collect() method."
    // source: http://mrhaki.blogspot.com/2010/05/groovy-goodness-use-collect-with.html

    // using a closure (this is like "map()")
    list.collect { it * 2 }
  }

  static def sumNumbers(int... numbers) {// note the use of ... for a variable number of arguments
    def sum = 0
    // closures again
    numbers.each { sum += it }
    sum
  }

  static def factorial(number) {
    number <= 1 ? 1 : number * factorial(number - 1)

    // there's no "return 1 if number <= 1" in Groovy 
  }
}
