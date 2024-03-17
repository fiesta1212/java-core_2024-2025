package lr2;

public class Example6 {
    public interface Shape {
        double calcarea();
        double calcperim();
    }
    public class Circle implements Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double calcarea() {
            return Math.PI * radius * radius;
        }
        @Override
        public double calcperim() {
            return 2 * Math.PI * radius;
        }
    }
    public class Square implements Shape {
        private double side;
        public Square(double side) {
            this.side = side;
        }
        @Override
        public double calcarea() {
            return side * side;
        }
        @Override
        public double calcperim() {
            return 4 * side;
        }
    }
    public class Triangle implements Shape {
        private double side1;
        private double side2;
        private double side3;
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        @Override
        public double calcarea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        @Override
        public double calcperim() {
            return side1 + side2 + side3;
        }
    }
}
