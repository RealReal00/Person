public class Main {


    public static void main(String[]args){
       /* Person persona1= new Person(1,"Luca",20);
        Person persona2= new Person(2,"Riccardo",22);


        System.out.println("numero persone: " + Person.numeroPersone);
        System.out.println(persona1.getNumber());
        System.out.println(persona1.StringaIntero());
        System.out.println(persona1);*/
        ///////////////////////////////////////////////////
        Car c1 = new Car("BWM", "M6");
        System.out.println(c1);
        System.out.println("Identity: " + System.identityHashCode(c1));
        System.out.println("Class: " + c1.getClass().getName());
        System.out.println("State: " + c1);

        /* Implicit upcasting */

        Car[] garage = new Car[2];
        garage[0] = new Car("BWM", "M6");
        garage[1] = new SelfDrivingCar("Tesla", "Model Y");
        int cnt=0;
       /* SelfDrivingCar sdcar = new SelfDrivingCar("Tesla", "Model Y");
        sdcar.turnSelfDrivingOn();
        System.out.println(sdcar.isSelfDriving);*/
        for (Car car : garage) {
            if(cnt==0) {
                System.out.println("isOn prima del metodo = " + car.isOn);
            }
            car.turnOn();
            if(cnt==0) {
                System.out.println("isOn dopo il metodo = " + car.isOn);
                cnt++;
            }


            /* Explicit downcasting */
            if (car instanceof SelfDrivingCar) {
                if(cnt==1){
                    System.out.println("isSelfDriving prima del metodo = " + ((SelfDrivingCar) car).isSelfDriving);
                }
                ((SelfDrivingCar) car).turnSelfDrivingOn();
                if(cnt==1){
                    System.out.println("isSelfDriving dopo il metodo = " + ((SelfDrivingCar) car).isSelfDriving);
                }
            }
            /* Less explicit downcasting */
            if (car instanceof SelfDrivingCar sdcar) {
                sdcar.turnSelfDrivingOn();
            }
        }
    }
 }

