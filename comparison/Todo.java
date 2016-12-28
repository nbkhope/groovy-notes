// package com.nbkworld.nbkhope;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Todo {
	/**
	 * Attributes
	 */
	private String name;
	private String note;

	/**
	 * Constructors
	 */
	public Todo() {}

	public Todo(String name, String note) {
		this.name = name;
		this.note = note;
	}

	/**
	 * Getters
	 */
	public String getName() {
		return name;
	}

	public String getNote() {
		return note;
	}

	/**
	 * Setters
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setNote(String note) {
		this.note = note;
	}


	public static void main(String[] args) {
		// List<Todo> todos = new ArrayList<Todo>();
		List todos = new ArrayList();


		todos.add(new Todo("1", "one"));
		todos.add(new Todo("2", "two"));
		todos.add(new Todo("3", "three"));

		for (Iterator iter = todos.iterator(); iter.hasNext(); ) {
			Todo todo = (Todo) iter.next();
			System.out.println(todo.getName() + " " + todo.getNote());
		}
	}
}