public class Human{
    String name;
    int age;
    int height;

    public Human(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;

    }
    @Override
    public String toString(){
        return "My name is " + name + " and I am old:" + age + " height:" + height;
    }
}