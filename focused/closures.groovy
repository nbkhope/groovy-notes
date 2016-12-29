// Important: in Groovy, a closure is an object!

def myClosure = { println "Hello" }

myClosure()

// Closures can accept parameters, just like functions
def sayGreeting = { name -> println "Hello, ${name} !!!!" }

sayGreeting "John Doe"

// Timer function
def startTimer() {
	def initialDate = new Date()

	// return a closure!
	return { println "${initialDate} - ${new Date()} : Elapsed time ${System.currentTimeMillis() - initialDate.time}" }
}

def timer = startTimer()

sleep 3000
timer()

sleep 3000
timer()


// Reset the timer
println "Resetting timer ..."
timer = startTimer()

timer()
sleep 3000
timer()
