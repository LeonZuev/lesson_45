package homework_44;

public class Penguin implements CanSwim, CanRun {

  @Override
  public void swim(String place) {
    System.out.println("Пингвин умеет плавать" + place);
  }

  @Override
  public void run() {
    System.out.println("Пингвин умеет бегать");
  }
}
