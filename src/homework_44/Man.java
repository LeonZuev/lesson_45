package homework_44;

public class Man implements CanSwim, CanRun{

  @Override
  public void swim() {
    System.out.println("Человек умеет плавать.");
  }

  @Override
  public void run() {
    System.out.println("Человек умеет бегать.");
  }
}
