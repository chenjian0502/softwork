package ch2_1_1;

public class CAdapter extends C implements U {

	public String findzipcode(String zipcode) {
		String l = "ULocation";
		int code[] = new int[6];
		for (int i = 0; i < zipcode.length(); i++) {
			Character ch = zipcode.charAt(i);
			code[i] = Integer.parseInt(ch.toString());
		}
		l = super.zipcode(code);
		return  l;
	}

}
