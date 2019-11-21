package 다형성예제_활용;

public class GasStation {

	public static void main(String[] args) {

		//주유소와 차량(이름을 가진)을 생성
		GasStation gasstation = new GasStation();
		Suv suv = new Suv("싼타페");
		Truck truck = new Truck("두돈반");
		Bus bus = new Bus("광역버스");
		
		
		//해당 차량에 기름을 주입 ->주유소가 가진 method ->fill(넣을 차량 대상)
		gasstation.fill(suv);
		gasstation.fill(truck);
		gasstation.fill(bus);
		
		//Car car = Suv suv;
		//공통된 gas,name값을 하나의 메소드로활용하기 위해 사용함
		gasstation.fill(suv);
		
	}
//
//	public void fill(Suv suv) {
//		System.out.println(suv.name + "에 기름을 넣습니다.");
//		suv.gas += 10;
//		System.out.println("현재 기름의 양은" + suv.gas + "입니다.");
//	}
//	public void fill(Truck truck) {
//		System.out.println(truck.name + "에 기름을 넣습니다.");
//		truck.gas += 10;
//		System.out.println("현재 기름의 양은" + truck.gas + "입니다.");
//	}
//	public void fill(Bus bus) {
//		System.out.println(bus.name + "에 기름을 넣습니다.");
//		bus.gas += 10;
//		System.out.println("현재 기름의 양은" + bus.gas + "입니다.");
//	}

	//Car car = Suv suv;
	//공통된 gas,name값을 하나의 메소드로활용하기 위해 사용함
	public void fill(Car car){
		System.out.println(car.getClass().getSimpleName() + "에 기름을 넣습니다.");
		System.out.println(car.name + "에 기름을 넣습니다.");
		car.gas += 10;
		System.out.println("기름이 " + car.gas + "리터 주입 되었습니다.");
		
	}
	
}
