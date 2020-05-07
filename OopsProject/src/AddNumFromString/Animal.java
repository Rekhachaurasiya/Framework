package AddNumFromString;

 class Animal {
	 
	 public void eat() {
		System.out.println("eating.....");
	 }
	 public static void main(String[] args) {
			Cat c=new Cat();
			c.eat();
			c.meao();
}
	}
 
 class Dog extends Animal{
	 public void bark() {
		 System.out.println("barking...");
	 }
 }
 class Cat extends Animal{
	 public void meao() {
		 System.out.println("meao....");
	 }
	
 }
 
 