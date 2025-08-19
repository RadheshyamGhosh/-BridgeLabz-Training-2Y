package ProgrammingElements.level1;
public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;   // division operator
        int remainingPens = totalPens % students;    // modulus operator

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
