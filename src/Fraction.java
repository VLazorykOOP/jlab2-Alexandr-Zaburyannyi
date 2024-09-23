public class Fraction {
    private long wholePart;
    private short fractionPart;

    public Fraction(long wholePart, short fractionPart) {
        this.wholePart = wholePart;
        this.fractionPart = fractionPart;
    }

    public Fraction add(Fraction other) {
        long newWholePart = this.wholePart + other.wholePart;
        short newFractionPart = (short)(this.fractionPart + other.fractionPart);
        if (newFractionPart >= 100) {
            newWholePart++;
            newFractionPart -= 100;
        }
        return new Fraction(newWholePart, newFractionPart);
    }

    public Fraction subtract(Fraction other) {
        long newWholePart = this.wholePart - other.wholePart;
        short newFractionPart = (short)(this.fractionPart - other.fractionPart);
        if (newFractionPart < 0) {
            newWholePart--;
            newFractionPart += 100;
        }
        return new Fraction(newWholePart, newFractionPart);
    }

    public Fraction multiply(Fraction other) {
        long newWholePart = this.wholePart * other.wholePart;
        short newFractionPart = (short)((this.fractionPart * other.fractionPart) / 100);
        return new Fraction(newWholePart, newFractionPart);
    }

    public int compareTo(Fraction other) {
        if (this.wholePart > other.wholePart) {
            return 1;
        } else if (this.wholePart < other.wholePart) {
            return -1;
        } else {
            if (this.fractionPart > other.fractionPart) {
                return 1;
            } else if (this.fractionPart < other.fractionPart) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public String toString() {
        return wholePart + "." + (fractionPart < 10 ? "0" + fractionPart : fractionPart);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, (short)75);
        Fraction f2 = new Fraction(2, (short)50);

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);

        Fraction sum = f1.add(f2);
        System.out.println("Сума: " + sum);

        Fraction diff = f1.subtract(f2);
        System.out.println("Різниця: " + diff);

        Fraction product = f1.multiply(f2);
        System.out.println("Добуток: " + product);

        int comparison = f1.compareTo(f2);
        if (comparison > 0) {
            System.out.println("f1 більше f2");
        } else if (comparison < 0) {
            System.out.println("f1 менше f2");
        } else {
            System.out.println("f1 дорівнює f2");
        }
    }
}