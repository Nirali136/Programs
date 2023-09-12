class Type_of_food implements Test_food{
	public void food_ilove() {
		System.out.println("Sweet");
	}
	public void Indian_test() {
		System.out.println("Indian food test");
	}
}
public class Food1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Type_of_food fd=new Type_of_food();
		fd.food_ilove();
		fd.Indian_test();
	}

}
