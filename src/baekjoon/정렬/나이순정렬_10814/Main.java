package baekjoon.정렬.나이순정렬_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 나이순정렬 10814
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer stk;

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            list.add(new Person(Integer.parseInt(stk.nextToken()), stk.nextToken()));
        }

        Collections.sort(list);

        for (Person person : list) {
            System.out.println(person.getAge() + " " + person.getName());
        }
    }


    static class Person implements Comparable<Person>{
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person o) {
            return this.age - o.age;
        }

    }
}
