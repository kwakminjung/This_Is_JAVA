package ch08.sec12;

public class InstancofExample {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		//���1
		//�Ű����� Bus�� ��쿡�� ����Ÿ�Ժ�ȯ�ؼ� checkFare()�޼ҵ� ȣ��
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		//���2 : Java12���� ����
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
