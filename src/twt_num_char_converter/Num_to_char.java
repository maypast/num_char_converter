package twt_num_char_converter;

public class Num_to_char {
		private int num;
		private char var;
		public Num_to_char(){
			System.out.println("Ã»ÓĞÊäÈë");
		}
		public Num_to_char(int innum){
			num = innum;
			var = this.converter(innum);
		}
		private char converter(int innum){
			return (char)innum;
		}
		public char getchar(){
			return this.var;
		}
		public int getint(){
			return this.num;
		}
	}
