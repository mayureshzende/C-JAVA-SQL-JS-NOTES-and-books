class Green extends Color {}
class LightGreen extends Green {}
class Color {
  String getColor(Color i) {
	  return "green";
  }
  String getColor(Integer i) {
	  return "white";
  }
  String getColor(Green s) {
	  return "blue";
  }
  String getColor(Object o) {
	  return "red";
  }
}
public class OverloadingPuzzle {
	public static void main(String[] args) {
		System.out.println(new Color().getColor(7));
		System.out.println(new Color().getColor(new Green()));
		System.out.println(new Color().getColor(new LightGreen()));
		System.out.println(new Color().getColor("Green"));
	}
}
