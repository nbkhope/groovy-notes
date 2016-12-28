// package com.nbkworld.nbkhope;

class Todo {
	/**
	 * Attributes
	 */
	String name
	String note
}

// Creates ArrayList of todos (syntactic sugar)
def todos = [
	new Todo([name: "1", note: "one"]),
	new Todo(name: "2", note: "two"),
	new Todo(name: "3", note: "three"),
	new Todo(name: "4") // note will be null
];

todos.each {
	println "${it.name} ${it.note}"
}