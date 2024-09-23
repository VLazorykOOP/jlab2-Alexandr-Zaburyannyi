public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double a, double b, double c) {
        System.out.println("a: " + a + "; b: " + b + "; c: " + c + ";");
        this.a = a;
        this.b = b;
        this.c = c;
    }


    private double getDiscriminant() {
        return b * b - 4 * a * c;
    }


    public int getNumberOfRoots() {
        double discriminant = getDiscriminant();
        if (discriminant > 0) {
            return 2;
        } else if (discriminant == 0) {
            return 1;
        } else {
            return 0;
        }
    }


    public double[] getRoots() {
        double discriminant = getDiscriminant();
        if (discriminant > 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (discriminant == 0) {

            double root = -b / (2 * a);
            return new double[] { root };
        } else {

            return null;
        }
    }


    public static void main(String[] args) {

        QuadraticEquation equation1 = new QuadraticEquation(1, -3, 2);
        System.out.println("Кількість коренів: " + equation1.getNumberOfRoots());
        double[] roots1 = equation1.getRoots();
        if (roots1 != null) {
            for (double root : roots1) {
                System.out.println("Корінь: " + root);
            }
        } else {
            System.out.println("Немає дійсних коренів.");
        }


        QuadraticEquation equation2 = new QuadraticEquation(1, 2, 1);
        System.out.println("Кількість коренів: " + equation2.getNumberOfRoots());
        double[] roots2 = equation2.getRoots();
        if (roots2 != null) {
            for (double root : roots2) {
                System.out.println("Корінь: " + root);
            }
        } else {
            System.out.println("Немає дійсних коренів.");
        }

        QuadraticEquation equation3 = new QuadraticEquation(1, 0, 1);
        System.out.println("Кількість коренів: " + equation3.getNumberOfRoots());
        double[] roots3 = equation3.getRoots();
        if (roots3 != null) {
            for (double root : roots3) {
                System.out.println("Корінь: " + root);
            }
        } else {
            System.out.println("Немає дійсних коренів.");
        }
    }
}
