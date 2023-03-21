package homework_44;

import java.util.ArrayList;
import java.util.List;

public class Objects {
  /*
  Задача 1:
  Напишите интерфейсы "Умеет летать" CanFly с методом fly(),
  "Умеет бегать" CanRun с методом run
  "умеет плавать" CanSwim с методом swim
  реализуйте их в классе "Супермен" Superman.
  Задача 2:
  Реализуйте соответствующие интерфейсы из предыдущей задачи в классах
  "Человек", "Утка", "Пингвин" и "Самолёт".
   */
  public static void main(String[] args) {
    List<CanFly> flyable = new ArrayList<>();
    List<CanRun> runnable = new ArrayList<>();
    List<CanSwim> swimmable = new ArrayList<>();

    Superman clarkKent = new Superman();
    flyable.add(clarkKent);
    runnable.add(clarkKent);
    swimmable.add(clarkKent);

    Man Leon = new Man();
    runnable.add(Leon);
    swimmable.add(Leon);

    Duck donaldDuck = new Duck();
    flyable.add(donaldDuck);
    runnable.add(donaldDuck);
    swimmable.add(donaldDuck);

    Penguin skipper = new Penguin();
    runnable.add(skipper);
    swimmable.add(skipper);

    Airplane plane = new Airplane();
    flyable.add(plane);

    System.out.println("лететь");
    for (CanFly flyingObject : flyable ) {
      flyingObject.fly();
    }

    System.out.println("run");
    for (CanRun runningObject : runnable ) {
      runningObject.run();
    }

    System.out.println("лететь");
    for (CanSwim swimmingObject : swimmable ) {
      swimmingObject.swim("sea");
    }

  }
}