package ch3_1;

import java.util.ArrayList;

public class XiangtanTeach implements Component {

	private ArrayList list = new ArrayList();

	public void add(Component c) {
		list.add(c);
	}

	public void remove(Component c) {
		list.remove(c);
	}

	public Component getChild(int i) {
		return ((Component) list.get(i));
	}

	public void operation() {
		for (Object obj : list) {
			((Component) obj).operation();
		}
	}

}
