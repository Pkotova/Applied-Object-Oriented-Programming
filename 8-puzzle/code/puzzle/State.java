package puzzle;

public class State implements Comparable<State> {
    private int function;
    private int pathValue;
    private Board board;
    private State parentAction;
    private String action;

    public State(Board board, State parentAction, int function, int pathValue, String action) {
        setBoard(board);
        setParentAction(parentAction);
        setPathValue(pathValue);
        setFunction(function);
        setAction(action);
    }

    public State() {
        this(null, null, 0, 0, null);
    }

    public State(State state) {
        this(state.board, state.parentAction, state.function, state.pathValue, state.action);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public State getParentAction() {
        return parentAction;
    }

    public void setParentAction(State parentAction) {
        this.parentAction = parentAction;
    }

    public int getFunction() {
        return function;
    }

    public void setFunction(int function) {
        this.function = Math.max(function, 0);
    }

    public int getPathValue() {
        return pathValue;
    }

    public void setPathValue(int pathValue) {
        this.pathValue = pathValue;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? "GO: " : action;
    }

    public boolean isGoalState() {
        return board.isGoalState();
    }

    @Override
    public int compareTo(State state) {
        if (pathValue + function < state.pathValue + state.function) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return String.format("State = %s; function: %d; path value:  %d; action: %s",
                board, function, pathValue, action);
    }
}