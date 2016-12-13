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

  }
}
