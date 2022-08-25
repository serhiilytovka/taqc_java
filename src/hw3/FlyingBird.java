package hw3;

public class FlyingBird extends Bird {
    public int latitude;

    public FlyingBird(String feathers, int layEggs, int latitude){
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.latitude = latitude;
    }

    public FlyingBird() {

    }

    public String fly(){
        return "fly Flying Bird";
    }
}
