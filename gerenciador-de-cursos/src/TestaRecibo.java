import java.util.TreeSet;

public class TestaRecibo {
	public static void main(String[] args) {
		Recibo recibo = new Recibo();
		Recibo recibo2 = new Recibo();
		Recibo recibo3 = new Recibo();
		TreeSet<Recibo> treeSet = new TreeSet<>();
		treeSet.add(recibo);
		treeSet.add(recibo2);
		treeSet.add(recibo3);
		System.out.println(treeSet);
	}
}
