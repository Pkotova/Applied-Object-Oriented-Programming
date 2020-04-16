package code;

public class SquareMatrixTest {

    public static void main(String[] args) {
// representation of class SquareMatrix
        SquareMatrix defaultMatrix = new SquareMatrix();        //default constructor
        defaultMatrix.printMatrix();
        System.out.println();

        int[][] example = new int[][]{{1, 2}, {3, 4}};
        SquareMatrix generalPurpose = new SquareMatrix(example);    // general purpose constructor
        generalPurpose.printMatrix();
        System.out.println();

        SquareMatrix copyMatrix = new SquareMatrix(generalPurpose); // copy-constructor
        copyMatrix.printMatrix();

//uncomment this to manually set the data in matrix
/*
        SquareMatrix myMatrix = new SquareMatrix();                 // manual setting of data in the matrix
        myMatrix.setDataArray(2);
        System.out.println(myMatrix.toString());                    // usage of method toString()
*/
        SquareMatrix randomMatrix = new SquareMatrix();             //random setting of data in the matrix
        randomMatrix.setDataArrayRandom();
        System.out.println(randomMatrix.toString());                //usage if toString()

//---- using findMax() and printAll() methods
        System.out.println("Maximum sum: " + randomMatrix.findMax());
        randomMatrix.printAll();
        System.out.println();

// representing the given example in the assigment
        int[][] matrixFromTheExample =
                new int[][]{{2, 3, 3, 4},
                        {0, 2, 3, 4},
                        {3, 7, 1, 2},
                        {4, 3, 3, 2}};
        SquareMatrix givenExample = new SquareMatrix(matrixFromTheExample);
        System.out.println(givenExample.toString());
        System.out.println("Maximum sum: " + givenExample.findMax());
        givenExample.printAll();
    }
}
