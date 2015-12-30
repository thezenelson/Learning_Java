import java.util.*;

public class list{
	static ArrayList<item> list = new ArrayList<item>();

	public static void clear(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public static void display(ArrayList<item> a){
		String y ="\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nlist:\n";
		for(int i = 0; i < a.size(); i++){
			y = y + (i + 1) + ". " + a.get(i).printItem() + "\n";
		}
		y = y +"\nWhat would you like to do now?\n1- add an item\n2- remove an item\n3- Quit";
		System.out.println(y);
	}

	public static void add(ArrayList<item> a, item s){
		a.add(s);
	}

	public static void remove(ArrayList<item> a, int i){
		if (0 < i && 1 < a.size()) {
			a.remove(i - 1);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while(choice != 3){
		display(list);
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice){
			case 1:
				System.out.println("What would you like to do?");
				String activity = sc.nextLine();
				System.out.println("Where do you want to do it?");
				String location = sc.nextLine();
				System.out.println("When would you like to do it?");
				//String date = sc.nextLine();
				item itemz = new item(activity, location, sc.nextLine());
				add(list, itemz);
				break;
			case 2:
				System.out.println("what would you like to remove?");
				int number = sc.nextInt();
				remove(list, number);
				break;
			case 3:
				clear();
				System.out.println("yo peace out bro");
				try{
					Thread.sleep(3000);
				} catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}
			}
			clear();
			break;
		}
	}
}

