package puzzle;

import java.util.*;

public class Board {

    private int emptyPosition;
    private int[] data;

    public Board(int emptyPosition, int[] data) {
        setData(data);
    }

    public Board() {
        this(0, null);
    }

    public Board(Board newBoard) {
        this(newBoard.emptyPosition, newBoard.data);
    }

    public int getEmptyPosition() {
        return emptyPosition;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        /* uncomment for randomized board
        if (data == null) {
            // this.data = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
            this.data = new int[9];
            Integer[] toShuffle = {0, 1, 2, 3, 4, 5, 6, 7, 8};
            List<Integer> shuffle = new LinkedList<Integer>(Arrays.asList(toShuffle));
            Collections.shuffle(shuffle);
            shuffle.toArray(toShuffle);

            for (int i = 0; i < 9; i++) {
                this.data[i] = toShuffle[i];

                if(this.data[i] == 0) {
                    emptyPosition = i;
                }
            }
            return;
         */
        //comment from this line down
        if (data == null) {
            this.data = new int[]{8,0,6,5,4,7,2,3,1};
            emptyPosition = 0;
            return;
        }
        this.data = new int[9];
        for (int i = 0; i < 9; i++) {
            this.data[i] = data[i];

            if(this.data[i] == 0) {
                emptyPosition = i;
            }
        }

    }

    public boolean isGoalState(){
        for (int i = 0; i < 9; i++) {
            if(this.data[i] != i) {
                return false;
            }
        }
        return true;
    }

    public Board moveLeft(){
        if(emptyPosition == 0 || emptyPosition == 3 || emptyPosition == 6){
            return null;
        }
        Board afterMovement = new Board(this);
        afterMovement.data[afterMovement.emptyPosition] = afterMovement.data[afterMovement.emptyPosition - 1];
        afterMovement.data[afterMovement.emptyPosition - 1] = 0;
        afterMovement.emptyPosition -= 1;

        return afterMovement;
    }

    public Board moveRight(){
        if(emptyPosition == 2 || emptyPosition == 5 || emptyPosition == 8) {
            return null;
        }

        Board afterMovement = new Board(this);
        afterMovement.data[afterMovement.emptyPosition] = afterMovement.data[afterMovement.emptyPosition + 1];
        afterMovement.data[afterMovement.emptyPosition + 1] = 0;
        afterMovement.emptyPosition += 1;

        return afterMovement;
    }

    public Board moveUp(){
        if(emptyPosition == 0 || emptyPosition == 1 || emptyPosition == 2) {
            return null;
        }

        Board afterMovement = new Board(this);
        afterMovement.data[afterMovement.emptyPosition] = afterMovement.data[afterMovement.emptyPosition - 3];
        afterMovement.data[afterMovement.emptyPosition - 3] = 0;
        afterMovement.emptyPosition -= 3;

        return afterMovement;
    }

    public Board moveDown(){
        if(emptyPosition == 6 || emptyPosition == 7 || emptyPosition == 8) {
            return null;
        }

        Board afterMovement = new Board(this);
        afterMovement.data[afterMovement.emptyPosition] = afterMovement.data[afterMovement.emptyPosition + 3];
        afterMovement.data[afterMovement.emptyPosition + 3] = 0;

        afterMovement.emptyPosition += 3;

        return afterMovement;
    }

    @Override
    public String toString() {
        return String.format("Board: %s; Position of empty = %d", Arrays.toString(data), emptyPosition);
    }
}