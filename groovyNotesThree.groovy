class GroovyNotesThree {
  static void main(String[] args) {
    // User Input
    // print 'What\'s your name? '
    // def fullName = System.console().readLine()
    //
    // print 'Enter a number: '
    // def theNumber = System.console().readLine().toDouble()
    // print 'Enter another number: '
    // def anotherNumber = System.console().readLine().toDouble()
    //
    // printf '%.2f + %.2f = %.2f\n', [theNumber, anotherNumber, theNumber + anotherNumber]

    // Lists
    def primes = [2, 3, 5, 7, 11, 13]
    println 'The second prime is ' + primes[1]
    println 'The third prime is ' + primes.get(2)
    //println primes.class.name // => java.util.ArrayList

    // Mixed Lists
    def student = ['Josh', 23, 5.75, [4, 5, 6]]
    //println student.class.name // => java.util.ArrayList

    // operations on ArrayList
    // .add(n)
    // << n (same)
    // + [12, 23] (concatenating to list)

    // Permanently add elements
    primes.add 17
    primes << 19
    // Concatenate and create new list
    println primes + [29, 31]
    println primes - [19]

    println primes

    // Check if list is empty
    //  .isEmpty()

    // Matches
    println primes.intersect([2, 3, 7, 8])

    // List Processing
    // .reverse()
    // .sort()

    // Remove element from list
    // .pop()
  }
}
