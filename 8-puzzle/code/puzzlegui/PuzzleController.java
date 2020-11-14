package puzzlegui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import puzzle.Algorithms;
import puzzle.Board;
import puzzle.HeuristicsFunctions;
import puzzle.State;

import java.util.Arrays;

public class PuzzleController {

    public RadioButton btnAStar;
    @FXML
    private Pane panMain;

    @FXML
    private Label lblAlgr;

    @FXML
    private RadioButton btnBFS;

    @FXML
    private RadioButton btnManDist;

    @FXML
    private RadioButton btnUnBlocks;

    @FXML
    private Label lbl00;

    @FXML
    private Label lbl20;

    @FXML
    private Label lbl01;

    @FXML
    private Label lbl11;

    @FXML
    private Label lbl21;

    @FXML
    private Label lbl02;

    @FXML
    private Label lbl12;

    @FXML
    private Label lbl22;

    @FXML
    private Label lbl10;

    @FXML
    private Label LblChoose;

    @FXML
    private Label lblChooseHeu;

    @FXML
    private Label lblResult;
    @FXML
    private Label lblResultValue;
    @FXML
    private Button btnSearch;
    @FXML
    private TextArea txtBoxResult;
    @FXML
    private Label txtGoal;
    @FXML
    private Button btnInfo;

    @FXML
    private Button btnExit;



    public static String printState(State state) {
        if(state.getParentAction()==null){
            return state.getAction();
        }
        return printState(state.getParentAction())+ ", " +state.getAction() ;
    }

    @FXML
    public void order(){
        lbl00.setText("");
        lbl10.setText("1");
        lbl20.setText("2");
        lbl01.setText("3");
        lbl11.setText("4");
        lbl21.setText("5");
        lbl02.setText("6");
        lbl21.setText("7");
        lbl22.setText("8");
    }
    public String BFSwithManhattanDistance(){

        Board exampleBoard = new Board();
        State exampleState = new State(exampleBoard, null, 0, 0, "start");
        long startTime = System.currentTimeMillis();
        State result = Algorithms.bestFirstSearch(exampleState, HeuristicsFunctions::manhattanDistance);
        long stopTime = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        if (result == null) {
            System.exit(0);
        }
        return printState(result)+"\nTime: " + (stopTime - startTime)+"\nMemory: " + (runtime.totalMemory() - runtime.freeMemory());

    }
    public String BFSwithUnorderedBlocks(){

        Board exampleBoard = new Board();
        State exampleState = new State(exampleBoard, null, 0, 0, "start");
        long startTime = System.currentTimeMillis();
        State result = Algorithms.bestFirstSearch(exampleState, HeuristicsFunctions::numberOfUnorderedBlocks);
        long stopTime = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        if (result == null) {
            System.exit(0);
        }
        return printState(result)+"\nTime: " + (stopTime - startTime)+"\nMemory: " + (runtime.totalMemory() - runtime.freeMemory());

    }
    public String AStarWithManhattanDistance(){

        Board exampleBoard = new Board();
        State exampleState = new State(exampleBoard, null, 0, 0, "start");
        long startTime = System.currentTimeMillis();
        State result = Algorithms.aStar(exampleState, HeuristicsFunctions::manhattanDistance);
        long stopTime = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        if (result == null) {
            System.exit(0);
        }
        return printState(result)+"\nTime: " + (stopTime - startTime)+"\nMemory: " + (runtime.totalMemory() - runtime.freeMemory());
    }
    public String AStarWithUnorderedBlocks(){

        Board exampleBoard = new Board();
        State exampleState = new State(exampleBoard, null, 0, 0, "start");
        long startTime = System.currentTimeMillis();
        State result = Algorithms.aStar(exampleState, HeuristicsFunctions::numberOfUnorderedBlocks);
        long stopTime = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();

        if (result == null) {
            System.exit(0);
        }
        return printState(result)+"\nTime: " + (stopTime - startTime)+"\nMemory: " + (runtime.totalMemory() - runtime.freeMemory());

    }
    @FXML
    public void btnSearchOnAction(ActionEvent event){
        order();
        if (btnAStar.isSelected() && btnManDist.isSelected()){
            btnBFS.setDisable(true);
            btnUnBlocks.setDisable(true);
            txtBoxResult.setWrapText(true);
            txtBoxResult.setText(AStarWithManhattanDistance());
            lblResult.setText("Result for A* with Manhattan Distance: ");
        }
        if (btnAStar.isSelected() && btnUnBlocks.isSelected()){
            btnBFS.setDisable(true);
            btnManDist.setDisable(true);
            txtBoxResult.setWrapText(true);
            txtBoxResult.setText(AStarWithUnorderedBlocks());
            lblResult.setText("Result for A* with Unordered Blocks: ");
        }

        if (btnBFS.isSelected() && btnUnBlocks.isSelected()){
            btnAStar.setDisable(true);
            btnManDist.setDisable(true);
            txtBoxResult.setWrapText(true);
            txtBoxResult.setText(BFSwithUnorderedBlocks());
            lblResult.setText("Result for BFS with Unordered Blocks: ");
        }

        if (btnBFS.isSelected() && btnManDist.isSelected()){
            btnAStar.setDisable(true);
            btnUnBlocks.setDisable(true);
            txtBoxResult.setWrapText(true);
            txtBoxResult.setText(BFSwithManhattanDistance());
            lblResult.setText("Result for BFS with Manhattan Distance: ");
        }
        txtGoal.setTextFill(Color.GREEN);
        txtGoal.setText("GOAL FOUND");
    }
    @FXML
    void btnInfoOnAction(ActionEvent event){
        Alert information = new Alert(Alert.AlertType.INFORMATION);
        information.setTitle("PURPOSE");
        information.setHeaderText("Purpose");
        information.setContentText("Implement the search method by minimizing the total" +
                " cost of the road (A *) and the best-first search method to find a " +
                "solution to the game with sliding tiles with a board size of 3x3 " +
                "(8 - puzzle). The object of the game is to move the tiles from the" +
                " beginning to the end state, with as few moves as possible.");
        information.show();
    }
    @FXML
    void btnQuitOnAction(ActionEvent event) {
        System.exit(0);
    }
}
