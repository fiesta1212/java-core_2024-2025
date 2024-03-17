package lr2;

public class Example8 {
    // Класс Animal (животное)
    public class Animal {
        private String name;
        private int age;
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void makeSound() {
            System.out.println("generic animal sound");
        }
    }
    public class Dog extends Animal {
        private String breed;
        private String foodType;
        public Dog(String name, int age, String breed, String foodType) {
            super(name, age);
            this.breed = breed;
            this.foodType = foodType;
        }
        public void bark() {
            System.out.println("Dog barking");
        }
    }
    public class Cat extends Animal {
        private String favoriteToy;
        private String foodType;
        public Cat(String name, int age, String favoriteToy, String foodType) {
            super(name, age);
            this.favoriteToy = favoriteToy;
            this.foodType = foodType;
        }
        public void meow() {
            System.out.println("Cat meowing");
        }
    }
    public class Bird extends Animal {
        private boolean canFly;
        private String species;
        public Bird(String name, int age, boolean canFly, String species) {
            super(name, age);
            this.canFly = canFly;
            this.species = species;
        }
        public void chirp() {
            System.out.println("Bird is chirping");
        }
    }
    public class Shape {

    }
    public class Circle extends Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double calcarea() {
            return Math.PI * radius * radius;
        }
    }
    public class Square extends Shape {
        private double side;
        public Square(double side) {
            this.side = side;
        }
        public double calcarea() {
            return side * side;
        }
    }
    public class Triangle extends Shape {
        private double side1;
        private double side2;
        private double side3;
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        public double calcarea() {

            return 0.0;
        }
    }
}
