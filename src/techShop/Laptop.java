package techShop;

public class Laptop {

    public Brand brand;
    public Color color;

    public Laptop(Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("[Brand = %s, Color = %s]", brand, color);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return laptop.brand.equals(this.brand) && laptop.color.equals(this.color);
    }
}
