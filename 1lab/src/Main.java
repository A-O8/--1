class Main {
	public static void main(String args[]) {
		MyStack stack = new MyStack();
		Kernel kernel = new Kernel(stack);
		kernel.Calls();

		stack.push("a");
		 kernel.ExecuteCall(0);

        stack.push("a");
        stack.push("b");
        kernel.ExecuteCall(1);

        stack.push("a");
        stack.push("b");
        stack.push("c");
        kernel.ExecuteCall(2);

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        kernel.ExecuteCall(3);

       stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        kernel.ExecuteCall(4);

	}
}

