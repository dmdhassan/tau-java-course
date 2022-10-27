package chapter9;

public class Square extends  Rectangle{

    @Override
    public double calculatePerimeter() {
        return 4 * sides;
    }

    public void sayhello(String word) {
        System.out.println("Hello" + word);
    }
}

