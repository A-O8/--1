import java.util.ArrayList;
import java.util.List;

class MyStack {
	private	List<String> stack = new ArrayList<String>();

	 void push(String element) {
		stack.add(element);
	}

	 String pop() {

		if (stack.size() >= 1) {
			String element = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			return element;
		} else {
			return null;
		}
	}
}

