package code;

import java.util.Scanner;

public class SquareMatrix {
    // class data
    private int[][] dataArray;
    private int dimension;

    //default constructor
// by default we set matrix:    0   0
//                              0   0
    public SquareMatrix() {
        this.dataArray = new int[][]{{0, 0}, {0, 0}};
        this.dimension = 2;
    }

    // general purpose constructor
// we construct new object by given matrix
    public SquareMatrix(int[][] newDataArray) {
        this.dataArray = newDataArray;
        this.dimension = newDataArray.length;       // we get the give matrix's length
    }

    // copy constructor
// we construct new object by given object
    public SquareMatrix(SquareMatrix other) {
        this.dataArray = other.dataArray;
        this.dimension = other.dimension;
    }

    // set dimension
    public void setDimension(int newDimension) {
// we check the input data due the assigment
// if the given dimension does not fit the range, we set the value to 2
        if (newDimension >= 2 && newDimension <= 12)
            this.dimension = newDimension;
        else dimension = 2;
    }

    public int getDimension() {
        return this.dimension;
    }

    public int[][] getDataArray() {
        return dataArray;
    }

    // setter with random generator
    public void setDataArrayRandom() {
// we generate random number for dimension in the range [2:12]
        int dimension = (int) (Math.random() * ((12 - 2) + 1)) + 2;
        dataArray = new int[dimension][dimension];
// setting the dimension with the generated one
        setDimension(dimension);
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
// we generate random values for each element in the range [0;8]
                dataArray[row][column] = (int) (Math.random() * ((8 + 1)) + 0);
            }
        }
    }

    // setter for manual using
// the user choose the dimension of his matrix, as well as each element of it
    public void setDataArray(int newDimension) {

        dataArray = new int[newDimension][newDimension];
        setDimension(newDimension);
        Scanner input = new Scanner(System.in);

        System.out.println("Your elements have to be in range[0;8]");
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
                do {
                    System.out.print("Element: [" + row + "][" + column + "]: ");
                    dataArray[row][column] = input.nextInt();
                } while (!checkElement(dataArray[row][column]));
            }
        }
    }

    // function for validating the entered elements
    private boolean checkElement(int element) {
        return (element >= 0 && element <= 8);
    }

    // helper function for printing any object of this class
    public void printMatrix() {
        for (int row = 0; row < this.dimension; row++) {
            for (int column = 0; column < this.dimension; column++) {
                System.out.print(dataArray[row][column] + " ");
            }
            System.out.println();
        }
    }

    public int findMax() {
//change the value of this variable to select different dimensions of sub-matrix
        int submatrixDimension = 2;
        int maxSum = 0;

        for (int row = 0; row < dimension - submatrixDimension + 1; row++) {

            for (int column = 0; column < dimension - submatrixDimension + 1; column++) {

                int sum = 0;

                for (int subMatrixRow = row; subMatrixRow < submatrixDimension + row; subMatrixRow++) {

                    for (int subMatrixColumn = column; subMatrixColumn < submatrixDimension + column; subMatrixColumn++) {

                        sum += dataArray[subMatrixRow][subMatrixColumn];

                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                    }
                }
            }
        }
        return maxSum;
    }

    public void printAll() {
        int subMatrixDimension = 2;
        int max = 0;
        int indexRow = 0, indexColumn = 0;
        for (int row = 0; row < dimension - subMatrixDimension + 1; row++) {
            for (int column = 0; column < dimension - subMatrixDimension + 1; column++) {
                int sum = 0;

                for (int subMatrixRow = row; subMatrixRow < subMatrixDimension + row; subMatrixRow++) {

                    for (int subMatrixColumn = column; subMatrixColumn < subMatrixDimension + column; subMatrixColumn++) {

                        sum += dataArray[subMatrixRow][subMatrixColumn];

                        if (sum > max) {
                            max = sum;
                            indexRow = row;
                            indexColumn = column;
                        }
                    }
                }
            }

        }
        System.out.println("Sub-matrices with " + findMax() + " sum are: ");
        System.out.println("[" + indexRow + "," + indexColumn + "]");
    }

    // overloading of method toString
// it returns matrix in table visualisation
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Dimension: ").append(this.dimension).append('\n');

        for (int row = 0; row < this.dimension; row++) {
            for (int column = 0; column < this.dimension; column++) {
                builder.append(dataArray[row][column]).append(" ");
            }
            builder.append('\n');
        }
        return builder.toString();
    }
}
