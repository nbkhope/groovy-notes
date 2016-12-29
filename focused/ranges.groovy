// Inclusive range
def numbers = 0..9

// Exclusive range ( ..< )
def letters = 'a'..<'z'

println numbers.size()
println letters.size()

// Iterating over range
numbers.each { print it }

println()

// Checking if range contains a value
println letters.contains('g')

// Accessing using [] operator
println letters[2]

// Reverse Range
def reverseNumbers = 9..0
reverseNumbers.each { print it }

// Iterating with For Loop & Iterator
for (i in 0..9) {
	println i
}

println()

(0..9).each { i -> println i }