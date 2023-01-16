
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Machine mach = new Machine();
    mach.start();
    mach.stop();

    Car car1 = new Car();
    car1.start();
    car1.wipeWindShield();
    car1.stop();
    car1.showInfo();
  }
}