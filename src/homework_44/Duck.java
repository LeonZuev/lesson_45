package homework_44;

public class Duck implements CanFly, CanRun, CanSwim {
  @Override
  public void fly() {
    System.out.println("Утка умеет летать, как супермен");
  }

  @Override
  public void run() {
    System.out.println("Утка умеет бегать, как супермен");
  }

  @Override
  public void swim(String place) {
    System.out.println("Утка умеет плавать, как супермен" + place);
  }
}
