
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abbcd22hizzihdceea";
		char[] b = new char[a.length() / 2];
		int derece = 0;
		int h1 = 0;
		for (int i = 0; i < a.length(); i++) {
			if((isInList(b,a.charAt(i)))){
				derece--;
			}
			else{
				derece++;
				yazdir(derece,a.charAt(i));
				b[h1]=a.charAt(i);
				h1++;
			}
		}
	}

	public static void yazdir(int derece,char x){
		for(int y=0;y<derece;y++){ System.out.print(" "); }
		 System.out.println("-"+x);
	}
	public static boolean isInList(char a[], char b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return true;
			}
		}
		return false;
	}
}


