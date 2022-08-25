package hw3;


public class Program {
    public static void main(String ... args){
        Eagle eagle = new Eagle();
        Swallow swallow = new Swallow();
        Chicken chicken = new Chicken();
        Penguin penguin = new Penguin();
        Bird[] array = {eagle, swallow, chicken, penguin};

        for (Bird element: array){
            System.out.println(element.fly());
        }
    }
}
