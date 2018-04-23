package twt_num_char_converter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		Char_to_num b = new Char_to_num(a);
		int c = b.getint();
		for(int i=1;i<=26;i++){
			Num_to_char d = new Num_to_char(c);
			System.out.println(d.getchar());
			c=c+1;
			
		}

	}

}
