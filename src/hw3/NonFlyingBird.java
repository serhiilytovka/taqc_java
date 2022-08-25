package hw3;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers, int layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    };

    public NonFlyingBird(){};

    public String fly(){
        return "no fly Non Flying Bird";
    }
}
