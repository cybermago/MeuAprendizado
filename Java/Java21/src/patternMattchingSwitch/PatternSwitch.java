package patternMattchingSwitch;

public class PatternSwitch {

	public PatternSwitch() {
		// TODO Auto-generated constructor stub
	}

	public String formatter(Object o){
		return switch (o){
			case Integer i -> String.format("%d",i);
			System.out.println(int);
			case Long l -> String.format("%d",l);
			case Double d -> String.format("%f",d);
			case String s -> String.format("%s",s);
			default -> o.toString();
		}
	}
	public static void main(String[] args){

	}

}
