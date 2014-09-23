package Dog;

public class Main {

	public static void main(String[] args) {
		Chihuahua c = new Chihuahua();
		c.setName("mi");
		c.setAge(22);
		c.setHeight(50);
		c.setWeight(17);
		
		Husky husky = new Husky();
		husky.setName("To");
		husky.setAge(10);
		husky.setHeight(50);
		husky.setWeight(20);
		
		Pitbull p = new Pitbull();
		p.setName("lu");
		p.setAge(5);
		p.setHeight(40);
		p.setWeight(25);
		
		Husky h = new Husky();
		h.setName("tom");
		h.setHeight(50);
		h.setWeight(15);
		h.setAge(3);
		
		AlaskanMalamute a = new AlaskanMalamute();
		a.setAge(2);
		a.setHeight(30);
		a.setWeight(15);
		a.setName("rox");
		
		Husky hu = new Husky();
		hu.setName("leo");
		hu.setAge(2);
		hu.setWeight(20);
		hu.setHeight(25);
		
		DogCage dog = new DogCage();
		dog.AddDog(hu);
		dog.AddDog(c);
		dog.AddDog(husky);
		dog.AddDog(p);
		dog.AddDog(a);
		
		//dog.RemoveDog(husky);
		dog.RemoveDog(h);
		dog.ThrowSquirrel();
		//dog.display();
		dog.ListHusky();
		dog.ListChihuahua();
		dog.ListBecgie();
		dog.ListPitbull();
		dog.ListAlaskanMalamute();
	}

}
