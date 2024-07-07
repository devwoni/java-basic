package poly.ex4;


import poly.ex3.Duck;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 끝");
    }
    
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트");
        animal.move();
        System.out.println("동물 이동 테스트 끝");
    }
}
