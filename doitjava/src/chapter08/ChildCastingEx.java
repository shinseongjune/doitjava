package chapter08;

public class ChildCastingEx {

	public static void main(String[] args) {
		ParentCasting parent = new ChildCasting();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 * parent field2 = "date2";		// 불가능
		 * parent.method3();			// 불가능
		 */
		ChildCasting child = (ChildCasting)parent;
		child.field2 = "data2";			// 가능
		child.method3();				// 가능
	}

}
