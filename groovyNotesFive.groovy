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
  }
}
