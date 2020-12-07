

import pl.radoslawsulikowski.sudokusolver.solvercommon.SudokuBoard;
import pl.radoslawsulikowski.sudokusolver.solvercommon.SudokuField;

import java.util.Scanner;

class SudokuSolver {
    final private SudokuBoard inputBoard = new SudokuBoard();
    final private Scanner scanner = new Scanner(System.in);

    SudokuSolver() {
        inputBoard.createBoard();
    }

    private boolean isInputCorrect(String[] lineVector) {
        if (lineVector.length % 3 > 0) {
            return false;
        }
        for (String s : lineVector) {
            if (!(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5")
                    || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9"))) {
                return false;

            }
        }
        return true;
    }

    private void getDataFromUser() {
        int row, column, value, fieldNumber;
        String line;
        String[] lineVector;
        boolean resolve = false;
        while (!resolve) {
            line = scanner.nextLine();
            if (line.equals("SUDOKU")) {
                resolve = true;
            } else {
                lineVector = line.split(",");
                if (isInputCorrect(lineVector)) {
                    for (int i = 0; i < (lineVector.length - 1) / 3 + 1; i++) {
                        column = Integer.parseInt(lineVector[3 * i]);
                        row = Integer.parseInt(lineVector[3 * i + 1]);
                        value = Integer.parseInt(lineVector[3 * i + 2]);
                        fieldNumber = 9 * (row - 1) + column - 1;

                        SudokuField field = inputBoard.getFieldByFieldNumber(fieldNumber);
                        field.setValue(value);
                        if (!inputBoard.hasDuplicateValuesInRowColumnOrSection()) {
                            field.setColumn(column);
                            field.setRow(row);
                            field.setSection((((row - 1) / 3) * 3 + (column - 1) / 3) + 1);
                            field.setUserValue(true);
                        } else {
                            field.setValue(SudokuField.EMPTY);
                            System.out.println("Value " + value + " is not allowed in column " + column + " and row " + row);
                        }

                        System.out.println(inputBoard.toString());
                    }
                } else {
                    System.out.println("Incorrect input. Input format:\n" +
                            "columnNumber,rowNumber,value\nor\n" +
                            "columnNumber1,rowNumber1,value1,columnNumber2,rowNumber2,value2,columnNumber3,rowNumber3,value3 etc.\nor\n" +
                            "SUDOKU to resolve your board\n" +
                            "columnNumber, rowNumber and value are integers from 1 to 9");
                }
            }
        }
    }

    boolean resolveSudoku() {
        /*to test solving algorithm use SampleBoards interface
         *use: "inputBoard = SampleBoards.sampleBoard10();"(or other sampleBoard) instead "getDataFromUSer();"
         */
        System.out.println(inputBoard.toString());
        getDataFromUser();

        SudokuBoard board = inputBoard.copyBoard();
        board.prepareBoard();
        if (board.solve()) {
            System.out.println("Your sudoku has been solved correctly." + board.toString());
            System.out.println("Do you want to solve another Sudoku? [Y + [ENTER] - to confirm, other action to quit");
            return !scanner.nextLine().equals("Y");
        } else {
            System.out.println("Your sudoku has no solution. Pleas check your input board:\n" + inputBoard.toString());
            return false;
        }
    }
}