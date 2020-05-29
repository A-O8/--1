
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

 class Kernel {
	private MyStack stack;
	private HashMap<Integer, SystemCall> SystemCalls;
	Kernel(MyStack stack) {	
		this.stack = stack;
		SystemCalls = new HashMap<>();
		SystemCalls.put(0, new SystemCall("a"));
		SystemCalls.put(1, new SystemCall("a", "b"));
		SystemCalls.put(2, new SystemCall("a", "b", "c"));
		SystemCalls.put(3, new SystemCall("a", "b", "c", "d"));
		SystemCalls.put(4, new SystemCall("a", "b", "c", "d", "e"));
	}
	
		 void ExecuteCall(int id) {
			var adress =SystemCalls.get(id);
		if (!SystemCalls.containsKey(id)) {
			System.out.print("Вызов номер " + id + " не существует\n");
			return;
		}

		for (int i = adress.getArgs().size() - 1; i >= 0; i--) {
				String arg = stack.pop();
				if (arg == null) {
					System.out.print("Неверное количество аргументов.Ожидалось:");
					System.out.print(SystemCalls.get(id).getArgs());
					return;
				}
				if (!adress.getArgs().get(i).equals(arg)) {
					System.out.print("Аргументы не совпадают. Ожидалось:");
					System.out.print(SystemCalls.get(id).getArgs());
					return;
				}	
			}
		System.out.print(SystemCalls.get(id).Execute());
	}

		void Calls() {
		SystemCalls.entrySet().forEach(
				entry -> System.out.println(entry.getKey() + " " + " "
						+ entry.getValue().getArgs()));
	}
}
