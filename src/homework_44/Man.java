package homework_44;

public class Man implements CanSwim, CanRun{

  @Override
  public void swim(String place) {
    System.out.println("Человек умеет плавать." + place);
  }

  @Override
  public void run() {
    System.out.println("Человек умеет бегать.");
  }
}
