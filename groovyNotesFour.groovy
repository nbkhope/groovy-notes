class groovyNotesFour {
  static void main(String[] args) {
    // "Map Literals"
    // Associative Arrays (aka Hash in Ruby and kinda like Object in JS)
    def myMap = [
      name: 'Andrew', // fine to leave out quotes in key
      'age': 24,
      numbers: [34, 23, 12]
    ]

    println myMap['name']
    println myMap['age']
    println myMap['numbers'][1] // => 23

    // Adding to map
    myMap.put('profession', 'doctor')
    println myMap
    // check if a key exists
    println myMap.containsKey('city')
    // check the size of a map (number of key-value pairs)
    println myMap.size()

    // Determining the key given variable value
    def theKey = 'age'
    def anotherMap = [
      (theKey): 44 // will become 'age': 44
    ]
    println anotherMap

    // Ranges
    def numbers = 1..10
    def letters = 'a'..'z'
    def reversedLetters = 'z'..'a'

    println numbers
    println letters
    println reversedLetters

    println numbers.class.name // => groovy.lang.IntRange
    println letters.class.name // => groovy.lang.ObjectRange

    // Size of a range
    println numbers.size() // => 10
    // Get an item from within the range
    println numbers.get(2) // => 3
    // Check whether value is within the range
    println numbers.contains(10) // => true
    // Get the first item in the range
    println numbers.getFrom()
    // Get the last item in the range
    println numbers.getTo()
  }
}
