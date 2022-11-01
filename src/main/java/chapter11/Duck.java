package chapter11;

public class Duck extends Animal{
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    void makeSound() {
        System.out.println(sound);
    }
}
