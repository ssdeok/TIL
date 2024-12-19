package org.example.interfaceprac.vihicle;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();

        // passenger boardable : interface
        bus.boardMethod();

        // vehicle : abstact class
        bus.fuelMethod();
        bus.speedMethod();
        System.out.println(bus.busValue);

//        만약
        Vehicle bus2 = new Bus();
        Bus bus3 = (Bus) bus2;
//        System.out.println(bus2.busValue);
        System.out.println(bus3.busValue);
        // 라고 적게 되면
        // bus2 라는 인스턴스는 Vehicle에 정의된 메서드의 종류만 사용이 가능합니다.
        // 대신, 실행을 할때는 Bus에 정의된 메서드를 사용합니다.


        // passenger boardable : interface
        // bus2의 타입은 vehicle로 정했기 때문에 사용 불가능
//        bus2.boardMethod();

        // vehicle : abstact class
        bus2.fuelMethod();
        bus2.speedMethod();

        Truck truck = new Truck();
        truck.speedMethod();
        truck.fuelMethod();
        truck.lendMethod();

        Brucks brucks = new Brucks();
        brucks.speedMethod();
        brucks.fuelMethod();
        brucks.lendMethod();
        brucks.boardMethod();


        vehicleMethod(bus);
        vehicleMethod(truck);
        vehicleMethod(brucks);
        vehicleMethod(bus2);

    }

    static void vehicleMethod(Vehicle vehicle){
        // Vehicle 관련 기능만 수행
        vehicle.fuelMethod();
        vehicle.speedMethod();

    }
}
