package collections;
/*
получить от пользователя
кол-во студентов
инф-ю о студентах:
-имя
-рейтинговый балл(целое число)

вывести на экран:
вар1: инфо о студентах в алф-ном порядке
вар2: инф о студентах в порядке убывания рейтинга
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDatabase {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("input students num");
    int n = Integer.parseInt(br.readLine());

    /*
    плохие решения, не подходят:
    Map<String, Integer> - легко отсортировать по алфавиту, но не получится записать тёзок
    Map<Integer, String> - легко отсортировать по рейтингу, но нельзя повторять рейтинг

    сложные решения, сортировка вручную:
    List<String>, List<Integer> - легко сортировать по отдельности, но сохранять совпадение
    порядка очень сложно - придётся как-то сортировать вручную
    List<Map<String, Object>> - использовать мини-словарь для каждого студента (JSON) - тоже
    придётся как-то сортировать вручную

    медленное решение, неэффективно:
    Map<Integer, String> "id-имя" и Map<Integer, Integer> "id-оценка" - можно, но работать
    будет неэффективно - очень медленно для большого количества студентов

    "хак", должно сработать:
    List<String>, где String - серализованный студент вида "имя;рейтинг"
    сериализуем (склеиваем строку) для сортировки, разъединяем для вывода
    для сортировки по рейтингу придётся дополнять слева нулями:
    "23" < "9", но "23" > "09"

    хотелось бы:
    List<Student> - не понятно, как сортировать



     */
  }


}
