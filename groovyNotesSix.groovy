class groovyNotesSix {
  static void main(String[] args) {
    println getGreeting()

    def numbers = [1, 2, 3, 4, 5]
    println numbers
    println doubleNumbers(numbers)

    println sumNumbers(4, 3, 7)

    println factorial(4) // 4 * 3 * 2 * 1 = 24

    // Factorial definition using closure
    // notice the use of call to make the recursive call to itself
    // { argument -> doSomethingHereToReturn }
    def getFactorial = { number -> number <= 1 ? 1 : number * call(number - 1)}

    println getFactorial(3)

    // Searching for a match using .find()
    // ** Finds the first item matching the IDENTITY Closure (i.e. matching Groovy truth).
    // ** otherwise returns null
    def names = ["Jck", "Jill", "Angel", "Jill"]
    // note how it's OK to not use .equals() to compare strings in Groovy
    println names.find { item -> item == 'Jill' }

    // Finding all matches using findAll()
    println names.findAll { item -> item.equals('Jill') } // returns an array

    // See also:
    //  .any
    //  .every
    //  .collect (seen before)

    def someNumbers = [1, 4, 12, 30, 100]
    // Is there any number greater than 12?
    println someNumbers.any { number -> number > 12} // => true

    // Is every number greater than 3?
    println someNumbers.every { number -> number > 3 } // => false


    // You can also pass a closure to a method
    def getEvenNumber = { number -> number % 2 == 0 }
    println getEvens([1, 4, 3, 8, 5], getEvenNumber)
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

  static def getEvens(numbers, theClosure) {
    // Finds all matches given the by closure condition
    numbers.findAll(theClosure)
  }
}
