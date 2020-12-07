import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import pl.radoslawsulikowski.sudokusolver.solverjavafx.SudokuSolver;

public class FXSolver extends Application {

    private GridPane grid = new GridPane();

    private final Image imageBack = new Image("background.png", true);

    @Override
    public void start(Stage primaryStage) {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true,
                true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageBack, BackgroundRepeat.REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        grid.setBackground(background);

        addRowsAndColumns();


        Scene scene = new Scene(grid, 1500, 800, Color.BLACK);
        scene.getStylesheets().add("styles.css");
        primaryStage.setTitle("Sudoku Solver");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);

        SudokuSolver sudokuSolver = new SudokuSolver(grid);
        grid = sudokuSolver.newSolver();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void addRowsAndColumns() {
        for (int i = 0; i < 30; i++) {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(100.0 / 30);
            grid.getColumnConstraints().add(column);
        }
        for (int i = 0; i < 16; i++) {
            RowConstraints row = new RowConstraints();
            row.setPercentHeight(100.0 / 16);
            grid.getRowConstraints().add(row);
        }
    }
}
