// Maps are like Ruby hashes
def emptyMap = [:]

// this .class gives null :O
// println emptyMap.class.name
println emptyMap.getClass().name // => java.util.LinkedHashMap

def countries = ["United States": "English", "Japan": "Japanese", "Brazil": "Portuguese"]

println countries["United States"]
println countries."United States"
println countries.getAt("Japan")
println countries.get("Japan")
println countries.get("China", "Chinese") // if not defined, then define it with given value

println countries

countries.d = "Unknown :)"
println countries.d

countries.put("Mexico", "Spanish")
println countries.Mexico
countries.putAt("Canada", "English")
println countries.Canada

// Iterating over Map
countries.each { println "Key: ${it.key}, value: ${it.value}" }

// Iterating over Map with index starting at 0
countries.eachWithIndex { it, i -> println "${i} Key: ${it.key}" }

// this does not work:
//   println countries.keys()
// Gotta do this:
println countries.keySet()

// A list of all the values
println countries.values()