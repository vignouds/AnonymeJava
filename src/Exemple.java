
public class Exemple {
	public static void main(String[]args) {Node a=new Leaf("a");
		Printer printer = new Printer() {
		
		public void print(String document) {
			System.out.println("("+document+")");
		}
	};
	a.print(printer);
	}
}
