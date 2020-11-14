package puzzle;

import java.util.PriorityQueue;
import java.util.function.Function;

public class Algorithms {
    private static Board left = null;
    private static Board right = null;
    private static Board up = null;
    private static Board down = null;

    public static State aStar(State initial, Function<Board, Integer> function) {
        PriorityQueue<State> states = new PriorityQueue<>();
        states.add(initial);

        while (!states.isEmpty()) {
            State runningState = states.poll();
            Board board = runningState.getBoard();
            String lastMovement = runningState.getAction();

            if (runningState.isGoalState()) {
                System.out.println("Found goal");
                return runningState;
            }

            switch (lastMovement) {
                case "up": {
                    left = board.moveLeft();
                    up = board.moveUp();
                    right = board.moveRight();
                    break;
                }
                case "down": {
                    left = board.moveLeft();
                    right = board.moveRight();
                    down = board.moveDown();
                    break;
                }
                case "left": {
                    left = board.moveLeft();
                    up = board.moveUp();
                    down = board.moveDown();
                    break;
                }

                case "right": {
                    right = board.moveRight();
                    down = board.moveDown();
                    up = board.moveUp();
                    break;
                }
                default: {
                    right = board.moveRight();
                    down = board.moveDown();
                    up = board.moveUp();
                    left = board.moveLeft();
                }
            }
            if(up != null) {
                states.add(new State(up, runningState, function.apply(up), runningState.getPathValue() + 1, "up"));
            }

            if(down != null) {
                states.add(new State(down, runningState, function.apply(down), runningState.getPathValue() + 1, "down"));
            }

            if(left != null) {
                states.add(new State(left, runningState, function.apply(left), runningState.getPathValue() + 1, "left"));
            }

            if(right != null) {
                states.add(new State(right, runningState, function.apply(right), runningState.getPathValue() + 1, "right"));
            }
        }

        System.out.println("Error: Something went wrong!");
        return null;
    }
    public static State bestFirstSearch(State initial, Function<Board, Integer> function) {
        PriorityQueue<State> states = new PriorityQueue<>();
        states.add(initial);

        while (!states.isEmpty()) {

            State runningState = states.poll();
            Board board = runningState.getBoard();
            String lastMovement = runningState.getAction();

            if (runningState.isGoalState()) {
                return runningState;
            }

            switch (lastMovement) {
                case "up": {
                    left = board.moveLeft();
                    up = board.moveUp();
                    right = board.moveRight();
                    break;
                }
                case "down": {
                    left = board.moveLeft();
                    right = board.moveRight();
                    down = board.moveDown();
                    break;
                }
                case "left": {
                    left = board.moveLeft();
                    up = board.moveUp();
                    down = board.moveDown();
                    break;
                }
                case "right": {
                    right = board.moveRight();
                    down = board.moveDown();
                    up = board.moveUp();
                    break;
                }
                default: {
                    right = board.moveRight();
                    down = board.moveDown();
                    up = board.moveUp();
                    left = board.moveLeft();
                }
            }

            if(up != null) {
                states.add(new State(up, runningState, function.apply(up), 0, "up"));
            }

            if(down != null) {
                states.add(new State(down, runningState, function.apply(down), 0, "down"));
            }

            if(left != null) {
                states.add(new State(left, runningState, function.apply(left), 0, "left"));
            }

            if(right != null) {
                states.add(new State(right, runningState, function.apply(right), 0, "right"));
            }
        }
        System.out.println("Error: Something went wrong");
        return null;
    }
}
