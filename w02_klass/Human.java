public class Human{
    private String name;
    private int age;
    private int height;

    public Human(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;

    }
    @Override
    public String toString(){
        return "My name is " + name + ", I am " + age + " years old and my height is " + height;
    }
}