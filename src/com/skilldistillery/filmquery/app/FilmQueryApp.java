package com.skilldistillery.filmquery.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {
  
  DatabaseAccessor db = new DatabaseAccessorObject();

  public static void main(String[] args) {
    FilmQueryApp app = new FilmQueryApp();
    //app.test();
    app.launch();
  }

//  private void test() {
//    Film film = db.findFilmById(1);
//    System.out.println(film);
//  }

  private void launch() {
    Scanner input = new Scanner(System.in);
    
    startUserInterface(input);
    
    input.close();
  }

  private void startUserInterface(Scanner input) {
	boolean menu = true;
	while(menu) {
	System.out.println("=================================");
    System.out.println("| Welcome to the Film Query App |");
    System.out.println("|    Please Make a selection:   |");
    System.out.println("|    1. Look Up a Film By ID    |");
    System.out.println("|    2. Look Up Film By Keyword |");
    System.out.println("|    3. Exit Application        |");
    System.out.println("=================================");
    int userIn = input.nextInt();
	if (userIn == 3) {
	menu = false;
	}
    switch(userIn) {
    case 1:
    	System.out.print("Please enter a Film ID: ");
    	int filmId = input.nextInt();
    	System.out.println();
    	Film film = db.findFilmById(filmId);
    	if (film != null) {
    		System.out.println(film);
    	} else {
    		System.out.println("Film not found, please try again!");
    	}
    	break;
    case 2:
    	System.out.print("Please enter a keyword: ");
    	String keyword = input.next();
    	System.out.println();
    	List<Film> films = db.findFilmByKeyword(keyword);
    	if (films.isEmpty()) {
    		System.out.println("No matching films found, please try again!");
    	} else{
    		System.out.println(films);
    	}
    	break;
    case 3:
    	System.out.println("Goodbye!");
    	break;
    }
    } 
  }

}
