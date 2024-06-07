package pototype.question;

public class Rectangular extends Shape{
    public Rectangular(){
        type="rectangular";
    }
    @Override
    void draw() {
        System.out.println("rectangular");
    }
}
