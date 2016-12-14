class groovyNotesSix {
  static void main(String[] args) {
    println getGreeting()

    def numbers = [1, 2, 3, 4, 5]
    println numbers
    println doubleNumbers(numbers)
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
}
