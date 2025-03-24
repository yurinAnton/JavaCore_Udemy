package udemy.lesson22;

class Main {
    public static void main(String[] args) {

//        int i = 2;
//        String s = new String [] {"A", "B", "C"}[i];
//        System.out.println(s);


//        Human h = new Human("male");
//        h.setName("John");
//        h.setAge(15);
//        h.setWeight(50);
//        System.out.println(h.getName() + " " + h.getAge() + " " + h.getWeight());

        //-------------------------------------------------------------------------






    }
}

public class Human{
    final String gender;
    private StringBuilder name;
    String surname;
    private int age;
    private int weight;

    public Human(String gender){
        this.gender = gender;
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if(weight > 0){
            this.weight = weight;
        }
    }

}


