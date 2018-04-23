package twt_num_char_converter;

public class Char_to_num {
	private int num;
	private char var;
	public Char_to_num(){
		System.out.println("Ã»ÓĞÊäÈë");
	}
	public Char_to_num(char inchar){
		var = inchar;
		num = this.converter(inchar);
	}
	private int converter(char inchar){
		return (int)inchar;
	}
	public char getchar(){
		return this.var;
	}
	public int getint(){
		return this.num;
	}


}
