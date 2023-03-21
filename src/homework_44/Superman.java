package homework_44;
/*
Задача 1:
  Напишите интерфейсы "Умеет летать" CanFly с методом fly(),
  "Умеет бегать" CanRun с методом run
  "умеет плавать" CanSwim с методом swim
  реализуйте их в классе "Супермен" Superman.
 */

public class Superman implements CanFly, CanRun, CanSwim {

  @Override
  public void fly() {
    System.out.println("Умеет летать");
  }

  @Override
  public void run() {
    System.out.println("Умеет бегать");
  }

  @Override
  public void swim() {
    System.out.println("умеет плавать");
  }
}
