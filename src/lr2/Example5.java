package lr2;

public class Example5 {
    public class Rectangle {
        private double length;
        private double width;
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        public double getlenght() {
            return length;
        }
        public void setlength(double length) {
            this.length = length;
        }
        public double getwidth() {
            return width;
        }
        public void setwidth(double width) {
            this.width = width;
        }
        public double calcarea() {
            return length * width;
        }
        public double calcperim() {
            return 2 * (length + width);
        }
    }
}
