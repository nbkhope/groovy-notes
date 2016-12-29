// Empty list (actually an ArrayList)
def basket = []

// Defined closure
def printBasket = {
	println basket
	println()
}

// Adding elements
basket.add "banana"
basket << "apple"
basket += "broccoli"

printBasket()

// Removing elements
basket.remove 1
basket -= "broccoli"

printBasket()

basket << "orange"
basket += "pear"

printBasket()

// Accessing specific elements
println basket.get(0)
println basket[1]

// Setting specific elements
basket.set 0, "kiwi"
basket[1] = "nectarine"

printBasket()

// Accessing from last element
println basket[-1]

// Iterating over list
println "-- My Basket --"
basket.each { println it }
println "---------------"
