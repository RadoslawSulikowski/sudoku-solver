package pl.radoslawsulikowski.sudokusolver.solvercommon;

import java.util.ArrayList;
import java.util.List;

public class SudokuField {
    public static final int EMPTY = 0;
    private int value;
    private int row;
    private int column;
    private int section;
    private int fieldNumber;
    private boolean userValue;
    private List<Integer> candidates = new ArrayList<>();

    SudokuField() {
        for (int i = 1; i < 10; i++) {
            candidates.add(i);
        }
    }

    int getValue() {
        return value;
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }

    int getSection() {
        return section;
    }

    int getFieldNumber() {
        return fieldNumber;
    }

    boolean isUserValue() {
        return userValue;
    }

    List<Integer> getCandidates() {
        return candidates;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setSection(int section) {
        this.section = section;
    }

    void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public void setUserValue(boolean userValue) {
        this.userValue = userValue;
    }

    SudokuField copyField() {
        SudokuField copy = new SudokuField();

        copy.setValue(this.value);
        copy.setRow(this.row);
        copy.setColumn(this.column);
        copy.setSection(this.section);
        copy.setFieldNumber(this.fieldNumber);
        copy.setUserValue(this.userValue);
        copy.getCandidates().clear();
        copy.getCandidates().addAll(this.getCandidates());
        return copy;
    }
}
