package udemy.lesson22;

import udemy.lesson22.Human;

public class Test1 {
    public static void main(String[] args) {

        Human h = new udemy.lesson22.Human("male");
        h.setName(new StringBuilder("John"));
        h.setAge(15);
        h.setWeight(50);
        h.getName().append("!!!");
        System.out.println(h.getName() + " " + h.getAge() + " " + h.getWeight());

    }
}
