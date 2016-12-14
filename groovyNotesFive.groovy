class groovyNotesFive {
  static void main(String[] args) {
    // for the C-style switch,
    // you can also use ranges:
    def age = 13

    switch (age) {
      case 0..6:
        println 'Kid'
        break
      case 7..12:
        println 'Teen'
        break
      case 13..18:
        println 'Almost Adult'
        break
      default:
        println 'Adult'
    }

    // Other than the classic for-loop, you can also
    // use the for-in loop:
    for (i in 1..5) { // note you didn't have to define i
      printf '%d ', i
    }
    println()

    for (j in [3, 4, 5]) {
      printf '%d ', j
    }
    println()

    // What is i and j?
    // println "i is $i" // error
    // println "j is $j" // error

    // converting range to array:
    println( (0..4).toArray() )

    // Looping over a map
    def people = [
      35: 'John',
      36: 'Angela',
      ageLimit: 20
    ]

    for (person in people) {
      // key
      print person.key + " "
      // value
      println person.value
    }

    // you can also iterate over the values of a map
    for (val in people.values()) {
      print val + ' '
    }
    println()

    // Iterating over characters
    def sentence = 'This is cool'
    for (character in sentence) {
      print character + ' '
    }
    println()
  }
}
