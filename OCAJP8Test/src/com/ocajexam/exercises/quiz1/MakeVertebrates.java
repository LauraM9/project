package com.ocajexam.exercises.quiz1;

public class MakeVertebrates {

	public static void main(String[] args) {
		Vertebrate whiteCat = new Cat();
		Cat blackCat = new Cat();
		Vertebrate strayCat = new Cat();
		strayCat = whiteCat;
		blackCat = (Cat) strayCat;
	}
}

class Vertebrate {
}

class Cat extends Vertebrate {
}