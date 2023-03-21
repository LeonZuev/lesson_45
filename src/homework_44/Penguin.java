package homework_44;

public class Penguin implements CanSwim, CanRun {

  @Override
  public void swim() {
    System.out.println("Пингвин умеет плавать");
  }

  @Override
  public void run() {
    System.out.println("Пингвин умеет бегать");
  }
}
