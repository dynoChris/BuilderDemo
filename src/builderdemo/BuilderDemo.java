package builderdemo;

public class BuilderDemo {

    public static void main(String[] args) {
        Car car = new Car.Builder("Tesla").build();
        System.out.println(car);
    }
}

class Car {
    private String name;
    private String color;
    private int maxSpeed;

    private Car(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", maxSpeed=" + maxSpeed + '}';
    }
    
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    static class Builder {
        private String name;
        private String color;
        private int maxSpeed;
        
        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        
        public Car build() {
            return new Car(this);
        }
    }
}
