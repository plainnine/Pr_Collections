//задание1:
//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    /******
     *
     *
     */
    public static void copmare2Lists(){
      ArrayList<Double>arrayList=new ArrayList<>();
      LinkedList<Double>linkedList=new LinkedList<>();
      final int N=100000;
      final int M=1000;
      for(int i=0;i<N;i++){
          arrayList.add(Math.random());
          linkedList.add(Math.random());
      }
      long startTime=System.currentTimeMillis();
      for(int i=0;i<M;i++){
          arrayList.get((int)(Math.random()*(N-1)));

      }
      System.out.println(System.currentTimeMillis()-startTime);
      startTime=System.currentTimeMillis();
      for(int i=0;i<M;i++) {

      }

    }
    public static void main(String[] args) {

        Collection<String>collection=new ArrayList<>();
        collection.add("apple");
    }


class Array2d<T> implements  Iterable<T>{

}
}
