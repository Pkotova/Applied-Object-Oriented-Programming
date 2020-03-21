package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class DrawCalendar extends Application {

    public int getIndex(DayOfWeek date) {
        switch (date) {
            case MONDAY: {
                return 1;
            }
            case TUESDAY: {
                return 2;
            }
            case WEDNESDAY: {
                return 3;
            }
            case THURSDAY: {
                return 4;
            }
            case FRIDAY: {
                return 5;
            }
            case SATURDAY: {
                return 6;
            }
            case SUNDAY: {
                return 7;
            }
            default:
                return 0;
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 400, 200);
//set starting positions
        int startX = 90;
        int startY = 70;
//input dialog for year
        TextInputDialog userYear = new TextInputDialog();
        userYear.setHeaderText("Please, enter the year you want to see.");
        userYear.setTitle("Input Year");
        userYear.setContentText("Year: ");

//input dialog for month
        TextInputDialog userMonth = new TextInputDialog();
        userMonth.setHeaderText("Please, enter the month you want to see.");
        userMonth.setTitle("Input Month");
        userMonth.setContentText("Month: ");

//get the user input and save it in another variable year and month
        Optional<String> result = userYear.showAndWait();
        double year = Double.parseDouble(result.get());
        Optional<String> result1 = userMonth.showAndWait();
        double month = Double.parseDouble(result1.get());

//start to draw our calendar
//1) header line (name of the week days)
        Text weekDays = new Text(80, 50, "MON  TUE  WED  THR  FRI  SAT  SUN");
        weekDays.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));
        weekDays.setStroke(Color.BLUE);
        group.getChildren().add(weekDays);

//get the local time from the users input
        LocalDate date = LocalDate.of((int) year, (int) month, 1);
        int index = getIndex(date.getDayOfWeek());

//saving in variable daysInMonth - how many days are there in the current month entered by the user
        YearMonth yearMonth = YearMonth.of((int) year, (int) month);
        int daysInMonth = yearMonth.lengthOfMonth();

//saving today's day, month, year
        LocalDate today = LocalDate.now();
        int todayDay = today.getDayOfMonth();
        int todayMonth = today.getMonthValue();
        int todayYear = today.getYear();


        for (int i = 2 - index; i <= daysInMonth; i++) {

            for (int j = 0; j < 7; j++) {

                if (i > daysInMonth)
                    break;

                if (i >= 1) {
//print the days index in the calendar
                    Text dayIndex = new Text(startX, startY, String.format("%d", i));
//check if the entered month contains today's day, and if it contains - its red
                    if (i == todayDay && todayMonth == month && todayYear == year) {
                        dayIndex.setStroke(Color.RED);
                    }

                    group.getChildren().add(dayIndex);

                } else {
//printing needed spaces between day indexes
                    Text spaces = new Text(startX, startY, "  ");
                    group.getChildren().add(spaces);
                }

                i++;
                startX += 35;  //changing the positions
            }
            i--;
            startX = 90;
            startY += 20;
        }

//set stage title
        primaryStage.setTitle("Calendar for " + yearMonth.getMonth() + " " + yearMonth.getYear());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
