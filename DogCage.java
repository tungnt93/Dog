package Dog;

import java.util.Iterator;
import java.util.LinkedList;


public class DogCage {
	private LinkedList<Dog> DogCage = new LinkedList<Dog>(); 
	private int totalWeight=0;
	private final int MAX_WEIGHT = 100;
	
	public int GetTotalWeight(){
		return totalWeight;
	}
	
	public void AddDog(Dog dog){
		if ((totalWeight+dog.weight) > MAX_WEIGHT) System.out.println("Khong the them cho vao chuong!");
		else {
			DogCage.addLast(dog);
			totalWeight += dog.weight;
			System.out.println("Da nhot them \"" + dog.name + "\" vao chuong!");
			}
	}//end AddDog
	
	public void RemoveDog(Dog dog){
		if (!DogCage.isEmpty()) {
			Iterator<Dog> it = DogCage.iterator();
			int i=0;
			while(it.hasNext()){
				Dog d = (Dog) it.next();
				if (d.getName().equals(dog.getName())) i++;
			}//end while
			if (i==0) System.out.println("Khong co \"" +dog.getName() + "\" o trong chuong!");
			else {
				System.out.println("Da tha \""+dog.getName()+ "\" ra ngoai");
				DogCage.remove(dog);
				totalWeight -= dog.getWeight();
			}
		}
		else System.out.println("Khong co con cho nao o trong chuong!");
	}//end RemoveDog
	
	public void ThrowSquirrel(){
		System.out.println("Tha soc vao chuong cho.");
		Mastiff mastiff = new Mastiff();
		if (!DogCage.isEmpty()) {
			Iterator<Dog> it = DogCage.iterator();
			while(it.hasNext()){
				Dog d = it.next();
				d.barking();
				String s = d.getClass().getName();
				if (s.equals("Dog.Husky")||s.equals("Dog.AlaskanMalamute")) 
					System.out.println(mastiff.getHowl());
			}
		}
	}//end ThrowSquirrel
	
	public void ListHusky(){
		System.out.println("Danh sach cac con cho thuoc loai Husky:");
		if(!DogCage.isEmpty()){
			Iterator<Dog> it;
			it = DogCage.iterator();
			int i=0;
			while(it.hasNext()){
				Dog d = it.next();
				String s = d.getClass().getName();
				if (s.equals("Dog.Husky")){
					System.out.println(" - " + d.getName());
					i++;
				}
			}
			if (i==0) System.out.println(" Khong co con cho nao thuoc loai Husky o trong chuong!");
		}
	}//end ListHusky
	
	public void ListChihuahua(){
		System.out.println("Danh sach cac con cho thuoc loai Chihuahua:");
		if(!DogCage.isEmpty()){
			Iterator<Dog> it;
			it = DogCage.iterator();
			int i=0;
			while(it.hasNext()){
				Dog d = it.next();
				String s = d.getClass().getName();
				if (s.equals("Dog.Chihuahua")){
					System.out.println(" - " + d.getName());
					i++;
				}
			}
			if (i==0) System.out.println(" Khong co con cho nao thuoc loai Chihuahua o trong chuong!");
		}
	}//end ListChihuahua
	
	public void ListPitbull(){
		System.out.println("Danh sach cac con cho thuoc loai Pitbull:");
		if(!DogCage.isEmpty()){
			Iterator<Dog> it;
			it = DogCage.iterator();
			int i=0;
			while(it.hasNext()){
				Dog d = it.next();
				String s = d.getClass().getName();
				if (s.equals("Dog.Pitbull")){
					System.out.println(" - " + d.getName());
					i++;
				}
			}
			if (i==0) System.out.println(" Khong co con cho nao thuoc loai Pitbull o trong chuong!");
		}
	}//end 
	
	public void ListBecgie(){
		System.out.println("Danh sach cac con cho thuoc loai Becgie:");
		if(!DogCage.isEmpty()){
			Iterator<Dog> it;
			it = DogCage.iterator();
			int i=0;
			while(it.hasNext()){
				Dog d = it.next();
				String s = d.getClass().getName();
				if (s.equals("Dog.Becgie")){
					System.out.println(" - " + d.getName());
					i++;
				}
			}
			if (i==0) System.out.println(" Khong co con cho nao thuoc loai Becgie o trong chuong!");
		}
	}//end ListBecgie
	
	public void ListAlaskanMalamute(){
		System.out.println("Danh sach cac con cho thuoc loai AlaskanMalamute:");
		if(!DogCage.isEmpty()){
			Iterator<Dog> it;
			it = DogCage.iterator();
			int i=0;
			while(it.hasNext()){
				Dog d = it.next();
				String s = d.getClass().getName();
				if (s.equals("Dog.AlaskanMalamute")){
					System.out.println(" - " + d.getName());
					i++;
				}
			}
			if (i==0) System.out.println(" Khong co con cho nao thuoc loai AlaskanMalamute o trong chuong!");
		}
	}//end ListAlaskanMalamute
}
