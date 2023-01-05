class Car {
	String color;		// ����
	String gearType;	// ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;			// ���� ����
	int check;
	
	Car() {
		this("red", "blue", 19);
		check = 19;
	}

	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
		check = 2;
	}
}

class Ex6_12 {
	public static void main(String[] args) {
		Car c1 = new Car();

		Car c2 = new Car("white", "auto", 4);

		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
		System.out.println(c1.check);
		System.out.println(c2.check);
	}
}