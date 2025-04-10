public class Main
{
	public static void main(String[] args) {
	  Beverage b = new Whisky();
	  b.templatemethod(30);
	  b = new Bear();
	  b.templatemethod(200);
	}
}
