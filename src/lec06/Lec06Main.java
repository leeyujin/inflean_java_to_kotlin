package lec06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec06Main {

  public static void main(String[] args) {

    List<Long> longs = Arrays.asList(1L, 2L, 3L);
    for (Long aLong : longs) {
      System.out.println("aLong = " + aLong);
    }

    for (int i = 1; i <= 5; i += 2) {
      System.out.println(i);
    }

    int i = 1;
    while (i <= 3) {
      System.out.println(i);
      i++;
    }

  }

}
