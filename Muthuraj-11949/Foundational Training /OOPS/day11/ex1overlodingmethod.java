package com.muthu.day11;

class Leafs {
	void info() {
		System.out.println("we use leafs");
	}
}
	class Slates {
		void info() {
			System.out.println("We use Slates");
		}
	}

		class NoteBooks {
			void info() {
				System.out.println("we use Notebooks");
			}
		}

		class Laptops {
			void info() {
				System.out.println("we use Laptops");
			}
		}

		class SmartPhones {
			void info() {
				System.out.println("we use SmartPhones");
			}
		}

	

	class Students {
		public void takingNotes(Leafs Leaf) {
			Leaf.info();
		}

	

	public void takingNotes(Slates slate) {
		slate.info();

	}

	public void takingNotes(NoteBooks notebook) {
		notebook.info();

	}

	public void takingNotes(Laptops laptop) {
		laptop.info();
	}

	public void takingNotes(SmartPhones smartphone) {
		smartphone.info();
	}

}

public class ex1overlodingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leafs Leaf = new Leafs();
		Slates slate = new Slates();
		NoteBooks notebook = new NoteBooks();
		Laptops laptop = new Laptops();
		SmartPhones smartphone = new SmartPhones();

		Students earlyyear1 = new Students();
		earlyyear1.takingNotes(Leaf);
		
		Students earlyyear2 = new Students();
		earlyyear2.takingNotes(Leaf);
		earlyyear2.takingNotes(slate);
		
		Students earlyyear3 = new Students();
		earlyyear3.takingNotes(Leaf);
		earlyyear3.takingNotes(slate);
		earlyyear3.takingNotes(notebook);
		
		Students earlyyear4 = new Students();
		earlyyear4.takingNotes(Leaf);
		earlyyear4.takingNotes(slate);
		earlyyear4.takingNotes(notebook);
		earlyyear4.takingNotes(laptop);
		
		
		Students earlyyear5 = new Students();
		earlyyear5.takingNotes(Leaf);
		earlyyear5.takingNotes(slate);
		earlyyear5.takingNotes(notebook);
		earlyyear5.takingNotes(laptop);
		earlyyear5.takingNotes(smartphone);
		
		
		
		
		
		
	}

}
