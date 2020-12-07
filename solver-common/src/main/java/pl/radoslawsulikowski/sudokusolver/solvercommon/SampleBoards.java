package pl.radoslawsulikowski.sudokusolver.solvercommon;

public interface SampleBoards {

    static SudokuBoard sampleBoardTest() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[1].setValue(5);
        board.getBoard()[1].setUserValue(true);

        board.getBoard()[3].setValue(5);
        board.getBoard()[3].setUserValue(true);

        board.prepareBoard();
        return board;
    }

    static SudokuBoard sampleBoard1() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[1].setValue(5);
        board.getBoard()[1].setUserValue(true);

        board.getBoard()[6].setValue(9);
        board.getBoard()[6].setUserValue(true);

        board.getBoard()[12].setValue(8);
        board.getBoard()[12].setUserValue(true);

        board.getBoard()[13].setValue(3);
        board.getBoard()[13].setUserValue(true);

        board.getBoard()[14].setValue(1);
        board.getBoard()[14].setUserValue(true);

        board.getBoard()[15].setValue(2);
        board.getBoard()[15].setUserValue(true);

        board.getBoard()[16].setValue(5);
        board.getBoard()[16].setUserValue(true);

        board.getBoard()[18].setValue(2);
        board.getBoard()[18].setUserValue(true);

        board.getBoard()[20].setValue(7);
        board.getBoard()[20].setUserValue(true);

        board.getBoard()[24].setValue(6);
        board.getBoard()[24].setUserValue(true);

        board.getBoard()[25].setValue(1);
        board.getBoard()[25].setUserValue(true);

        board.getBoard()[26].setValue(3);
        board.getBoard()[26].setUserValue(true);

        board.getBoard()[27].setValue(9);
        board.getBoard()[27].setUserValue(true);

        board.getBoard()[29].setValue(6);
        board.getBoard()[29].setUserValue(true);

        board.getBoard()[32].setValue(7);
        board.getBoard()[32].setUserValue(true);

        board.getBoard()[34].setValue(3);
        board.getBoard()[34].setUserValue(true);

        board.getBoard()[36].setValue(1);
        board.getBoard()[36].setUserValue(true);

        board.getBoard()[37].setValue(2);
        board.getBoard()[37].setUserValue(true);

        board.getBoard()[38].setValue(8);
        board.getBoard()[38].setUserValue(true);

        board.getBoard()[42].setValue(7);
        board.getBoard()[42].setUserValue(true);

        board.getBoard()[48].setValue(2);
        board.getBoard()[48].setUserValue(true);

        board.getBoard()[50].setValue(4);
        board.getBoard()[50].setUserValue(true);

        board.getBoard()[52].setValue(9);
        board.getBoard()[52].setUserValue(true);

        board.getBoard()[53].setValue(6);
        board.getBoard()[53].setUserValue(true);

        board.getBoard()[54].setValue(8);
        board.getBoard()[54].setUserValue(true);

        board.getBoard()[55].setValue(1);
        board.getBoard()[55].setUserValue(true);

        board.getBoard()[57].setValue(7);
        board.getBoard()[57].setUserValue(true);

        board.getBoard()[58].setValue(6);
        board.getBoard()[58].setUserValue(true);

        board.getBoard()[61].setValue(2);
        board.getBoard()[61].setUserValue(true);

        board.getBoard()[62].setValue(9);
        board.getBoard()[62].setUserValue(true);

        board.getBoard()[63].setValue(7);
        board.getBoard()[63].setUserValue(true);

        board.getBoard()[64].setValue(3);
        board.getBoard()[64].setUserValue(true);

        board.getBoard()[65].setValue(4);
        board.getBoard()[65].setUserValue(true);

        board.getBoard()[67].setValue(2);
        board.getBoard()[67].setUserValue(true);

        board.getBoard()[68].setValue(8);
        board.getBoard()[68].setUserValue(true);

        board.getBoard()[71].setValue(1);
        board.getBoard()[71].setUserValue(true);

        board.getBoard()[75].setValue(4);
        board.getBoard()[75].setUserValue(true);

        board.getBoard()[76].setValue(1);
        board.getBoard()[76].setUserValue(true);

        board.prepareBoard();
        return board;
    }


    static SudokuBoard sampleBoard2() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[1].setValue(4);
        board.getBoard()[1].setUserValue(true);

        board.getBoard()[5].setValue(3);
        board.getBoard()[5].setUserValue(true);

        board.getBoard()[9].setValue(7);
        board.getBoard()[9].setUserValue(true);

        board.getBoard()[12].setValue(1);
        board.getBoard()[12].setUserValue(true);

        board.getBoard()[16].setValue(9);
        board.getBoard()[16].setUserValue(true);

        board.getBoard()[20].setValue(2);
        board.getBoard()[20].setUserValue(true);

        board.getBoard()[22].setValue(8);
        board.getBoard()[22].setUserValue(true);

        board.getBoard()[24].setValue(6);
        board.getBoard()[24].setUserValue(true);

        board.getBoard()[28].setValue(3);
        board.getBoard()[28].setUserValue(true);

        board.getBoard()[32].setValue(4);
        board.getBoard()[32].setUserValue(true);

        board.getBoard()[35].setValue(5);
        board.getBoard()[35].setUserValue(true);

        board.getBoard()[36].setValue(1);
        board.getBoard()[36].setUserValue(true);

        board.getBoard()[41].setValue(9);
        board.getBoard()[41].setUserValue(true);

        board.getBoard()[44].setValue(8);
        board.getBoard()[44].setUserValue(true);

        board.getBoard()[45].setValue(6);
        board.getBoard()[45].setUserValue(true);

        board.getBoard()[52].setValue(7);
        board.getBoard()[52].setUserValue(true);

        board.getBoard()[56].setValue(8);
        board.getBoard()[56].setUserValue(true);

        board.getBoard()[58].setValue(5);
        board.getBoard()[58].setUserValue(true);

        board.getBoard()[60].setValue(2);
        board.getBoard()[60].setUserValue(true);

        board.getBoard()[64].setValue(9);
        board.getBoard()[64].setUserValue(true);

        board.getBoard()[68].setValue(7);
        board.getBoard()[68].setUserValue(true);

        board.getBoard()[71].setValue(1);
        board.getBoard()[71].setUserValue(true);

        board.getBoard()[76].setValue(4);
        board.getBoard()[76].setUserValue(true);

        board.getBoard()[79].setValue(5);
        board.getBoard()[79].setUserValue(true);

        board.prepareBoard();
        return board;
    }

    static SudokuBoard sampleBoard3() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[2].setValue(9);
        board.getBoard()[2].setUserValue(true);

        board.getBoard()[4].setValue(8);
        board.getBoard()[4].setUserValue(true);

        board.getBoard()[7].setValue(3);
        board.getBoard()[7].setUserValue(true);

        board.getBoard()[10].setValue(1);
        board.getBoard()[10].setUserValue(true);

        board.getBoard()[16].setValue(7);
        board.getBoard()[16].setUserValue(true);

        board.getBoard()[18].setValue(6);
        board.getBoard()[18].setUserValue(true);

        board.getBoard()[23].setValue(5);
        board.getBoard()[23].setUserValue(true);

        board.getBoard()[27].setValue(4);
        board.getBoard()[27].setUserValue(true);

        board.getBoard()[33].setValue(2);
        board.getBoard()[33].setUserValue(true);

        board.getBoard()[38].setValue(8);
        board.getBoard()[38].setUserValue(true);

        board.getBoard()[40].setValue(9);
        board.getBoard()[40].setUserValue(true);

        board.getBoard()[42].setValue(6);
        board.getBoard()[42].setUserValue(true);

        board.getBoard()[47].setValue(3);
        board.getBoard()[47].setUserValue(true);

        board.getBoard()[50].setValue(7);
        board.getBoard()[50].setUserValue(true);

        board.getBoard()[53].setValue(5);
        board.getBoard()[53].setUserValue(true);

        board.getBoard()[57].setValue(1);
        board.getBoard()[57].setUserValue(true);

        board.getBoard()[62].setValue(4);
        board.getBoard()[62].setUserValue(true);

        board.getBoard()[64].setValue(2);
        board.getBoard()[64].setUserValue(true);

        board.getBoard()[70].setValue(9);
        board.getBoard()[70].setUserValue(true);

        board.getBoard()[73].setValue(7);
        board.getBoard()[73].setUserValue(true);

        board.getBoard()[76].setValue(5);
        board.getBoard()[76].setUserValue(true);

        board.getBoard()[78].setValue(8);
        board.getBoard()[78].setUserValue(true);

        board.prepareBoard();
        return board;
    }
    //Simple methods are not enough to solveWorkbench.

    static SudokuBoard sampleBoard4() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[0].setValue(8);
        board.getBoard()[0].setUserValue(true);

        board.getBoard()[9].setValue(2);
        board.getBoard()[9].setUserValue(true);

        board.getBoard()[12].setValue(1);
        board.getBoard()[12].setUserValue(true);

        board.getBoard()[13].setValue(5);
        board.getBoard()[13].setUserValue(true);

        board.getBoard()[14].setValue(3);
        board.getBoard()[14].setUserValue(true);

        board.getBoard()[22].setValue(4);
        board.getBoard()[22].setUserValue(true);

        board.getBoard()[24].setValue(2);
        board.getBoard()[24].setUserValue(true);

        board.getBoard()[26].setValue(7);
        board.getBoard()[26].setUserValue(true);

        board.getBoard()[28].setValue(2);
        board.getBoard()[28].setUserValue(true);

        board.getBoard()[29].setValue(1);
        board.getBoard()[29].setUserValue(true);

        board.getBoard()[34].setValue(9);
        board.getBoard()[34].setUserValue(true);

        board.getBoard()[36].setValue(3);
        board.getBoard()[36].setUserValue(true);

        board.getBoard()[44].setValue(1);
        board.getBoard()[44].setUserValue(true);

        board.getBoard()[46].setValue(6);
        board.getBoard()[46].setUserValue(true);

        board.getBoard()[51].setValue(4);
        board.getBoard()[51].setUserValue(true);

        board.getBoard()[52].setValue(3);
        board.getBoard()[52].setUserValue(true);

        board.getBoard()[54].setValue(5);
        board.getBoard()[54].setUserValue(true);

        board.getBoard()[56].setValue(4);
        board.getBoard()[56].setUserValue(true);

        board.getBoard()[58].setValue(1);
        board.getBoard()[58].setUserValue(true);

        board.getBoard()[66].setValue(7);
        board.getBoard()[66].setUserValue(true);

        board.getBoard()[67].setValue(9);
        board.getBoard()[67].setUserValue(true);

        board.getBoard()[68].setValue(2);
        board.getBoard()[68].setUserValue(true);

        board.getBoard()[71].setValue(5);
        board.getBoard()[71].setUserValue(true);

        board.getBoard()[80].setValue(8);
        board.getBoard()[80].setUserValue(true);

        board.prepareBoard();
        return board;
    }

    static SudokuBoard sampleBoard5() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[3].setValue(7);
        board.getBoard()[3].setUserValue(true);

        board.getBoard()[4].setValue(8);
        board.getBoard()[4].setUserValue(true);

        board.getBoard()[5].setValue(2);
        board.getBoard()[5].setUserValue(true);

        board.getBoard()[13].setValue(5);
        board.getBoard()[13].setUserValue(true);

        board.getBoard()[16].setValue(1);
        board.getBoard()[16].setUserValue(true);

        board.getBoard()[20].setValue(8);
        board.getBoard()[20].setUserValue(true);

        board.getBoard()[28].setValue(6);
        board.getBoard()[28].setUserValue(true);

        board.getBoard()[31].setValue(4);
        board.getBoard()[31].setUserValue(true);

        board.getBoard()[34].setValue(7);
        board.getBoard()[34].setUserValue(true);

        board.getBoard()[35].setValue(1);
        board.getBoard()[35].setUserValue(true);

        board.getBoard()[36].setValue(8);
        board.getBoard()[36].setUserValue(true);

        board.getBoard()[37].setValue(3);
        board.getBoard()[37].setUserValue(true);

        board.getBoard()[40].setValue(7);
        board.getBoard()[40].setUserValue(true);

        board.getBoard()[41].setValue(1);
        board.getBoard()[41].setUserValue(true);

        board.getBoard()[42].setValue(6);
        board.getBoard()[42].setUserValue(true);

        board.getBoard()[46].setValue(7);
        board.getBoard()[46].setUserValue(true);

        board.getBoard()[53].setValue(9);
        board.getBoard()[53].setUserValue(true);

        board.getBoard()[55].setValue(8);
        board.getBoard()[55].setUserValue(true);

        board.getBoard()[56].setValue(9);
        board.getBoard()[56].setUserValue(true);

        board.getBoard()[58].setValue(2);
        board.getBoard()[58].setUserValue(true);

        board.getBoard()[61].setValue(6);
        board.getBoard()[61].setUserValue(true);

        board.getBoard()[63].setValue(1);
        board.getBoard()[63].setUserValue(true);

        board.getBoard()[65].setValue(3);
        board.getBoard()[65].setUserValue(true);

        board.getBoard()[69].setValue(2);
        board.getBoard()[69].setUserValue(true);

        board.getBoard()[75].setValue(5);
        board.getBoard()[75].setUserValue(true);

        board.getBoard()[76].setValue(1);
        board.getBoard()[76].setUserValue(true);

        board.getBoard()[78].setValue(8);
        board.getBoard()[78].setUserValue(true);

        board.getBoard()[80].setValue(4);
        board.getBoard()[80].setUserValue(true);

        board.prepareBoard();
        return board;
    }

    static SudokuBoard sampleBoard6() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[5].setValue(4);
        board.getBoard()[5].setUserValue(true);

        board.getBoard()[6].setValue(8);
        board.getBoard()[6].setUserValue(true);

        board.getBoard()[11].setValue(8);
        board.getBoard()[11].setUserValue(true);


        board.getBoard()[15].setValue(3);
        board.getBoard()[15].setUserValue(true);

        board.getBoard()[17].setValue(5);
        board.getBoard()[17].setUserValue(true);

        board.getBoard()[18].setValue(7);
        board.getBoard()[18].setUserValue(true);

        board.getBoard()[21].setValue(1);
        board.getBoard()[21].setUserValue(true);

        board.getBoard()[22].setValue(5);
        board.getBoard()[22].setUserValue(true);

        board.getBoard()[24].setValue(6);
        board.getBoard()[24].setUserValue(true);

        board.getBoard()[25].setValue(9);
        board.getBoard()[25].setUserValue(true);

        board.getBoard()[29].setValue(2);
        board.getBoard()[29].setUserValue(true);

        board.getBoard()[31].setValue(9);
        board.getBoard()[31].setUserValue(true);

        board.getBoard()[34].setValue(1);
        board.getBoard()[34].setUserValue(true);

        board.getBoard()[37].setValue(9);
        board.getBoard()[37].setUserValue(true);

        board.getBoard()[40].setValue(1);
        board.getBoard()[40].setUserValue(true);

        board.getBoard()[41].setValue(7);
        board.getBoard()[41].setUserValue(true);

        board.getBoard()[42].setValue(2);
        board.getBoard()[42].setUserValue(true);

        board.getBoard()[45].setValue(1);
        board.getBoard()[45].setUserValue(true);

        board.getBoard()[50].setValue(3);
        board.getBoard()[50].setUserValue(true);

        board.getBoard()[53].setValue(9);
        board.getBoard()[53].setUserValue(true);

        board.getBoard()[55].setValue(6);
        board.getBoard()[55].setUserValue(true);

        board.getBoard()[56].setValue(1);
        board.getBoard()[56].setUserValue(true);

        board.getBoard()[62].setValue(7);
        board.getBoard()[62].setUserValue(true);

        board.getBoard()[64].setValue(3);
        board.getBoard()[64].setUserValue(true);

        board.getBoard()[67].setValue(7);
        board.getBoard()[67].setUserValue(true);

        board.getBoard()[72].setValue(5);
        board.getBoard()[72].setUserValue(true);

        board.getBoard()[73].setValue(7);
        board.getBoard()[73].setUserValue(true);

        board.getBoard()[75].setValue(4);
        board.getBoard()[75].setUserValue(true);

        board.getBoard()[77].setValue(2);
        board.getBoard()[77].setUserValue(true);

        board.getBoard()[79].setValue(8);
        board.getBoard()[79].setUserValue(true);

        board.prepareBoard();
        return board;
    }

    static SudokuBoard sampleBoard7() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[0].setValue(8);
        board.getBoard()[0].setUserValue(true);

        board.getBoard()[6].setValue(2);
        board.getBoard()[6].setUserValue(true);

        board.getBoard()[7].setValue(9);
        board.getBoard()[7].setUserValue(true);

        board.getBoard()[15].setValue(7);
        board.getBoard()[15].setUserValue(true);

        board.getBoard()[19].setValue(9);
        board.getBoard()[19].setUserValue(true);

        board.getBoard()[21].setValue(4);
        board.getBoard()[21].setUserValue(true);

        board.getBoard()[23].setValue(7);
        board.getBoard()[23].setUserValue(true);

        board.getBoard()[25].setValue(3);
        board.getBoard()[25].setUserValue(true);

        board.getBoard()[26].setValue(5);
        board.getBoard()[26].setUserValue(true);

        board.getBoard()[31].setValue(5);
        board.getBoard()[31].setUserValue(true);

        board.getBoard()[32].setValue(4);
        board.getBoard()[32].setUserValue(true);

        board.getBoard()[37].setValue(1);
        board.getBoard()[37].setUserValue(true);

        board.getBoard()[39].setValue(2);
        board.getBoard()[39].setUserValue(true);

        board.getBoard()[44].setValue(6);
        board.getBoard()[44].setUserValue(true);

        board.getBoard()[47].setValue(7);
        board.getBoard()[47].setUserValue(true);

        board.getBoard()[48].setValue(6);
        board.getBoard()[48].setUserValue(true);

        board.getBoard()[52].setValue(1);
        board.getBoard()[52].setUserValue(true);

        board.getBoard()[54].setValue(9);
        board.getBoard()[54].setUserValue(true);

        board.getBoard()[55].setValue(2);
        board.getBoard()[55].setUserValue(true);

        board.getBoard()[60].setValue(3);
        board.getBoard()[60].setUserValue(true);

        board.getBoard()[64].setValue(3);
        board.getBoard()[64].setUserValue(true);

        board.getBoard()[65].setValue(8);
        board.getBoard()[65].setUserValue(true);

        board.getBoard()[66].setValue(5);
        board.getBoard()[66].setUserValue(true);

        board.getBoard()[70].setValue(2);
        board.getBoard()[70].setUserValue(true);

        board.getBoard()[72].setValue(4);
        board.getBoard()[72].setUserValue(true);

        board.prepareBoard();
        return board;
    }

    static SudokuBoard sampleBoard8() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[0].setValue(7);
        board.getBoard()[0].setUserValue(true);

        board.getBoard()[6].setValue(1);
        board.getBoard()[6].setUserValue(true);

        board.getBoard()[7].setValue(8);
        board.getBoard()[7].setUserValue(true);

        board.getBoard()[8].setValue(6);
        board.getBoard()[8].setUserValue(true);

        board.getBoard()[11].setValue(5);
        board.getBoard()[11].setUserValue(true);

        board.getBoard()[15].setValue(7);
        board.getBoard()[15].setUserValue(true);

        board.getBoard()[17].setValue(4);
        board.getBoard()[17].setUserValue(true);

        board.getBoard()[31].setValue(1);
        board.getBoard()[31].setUserValue(true);

        board.getBoard()[33].setValue(4);
        board.getBoard()[33].setUserValue(true);

        board.getBoard()[34].setValue(2);
        board.getBoard()[34].setUserValue(true);

        board.getBoard()[35].setValue(8);
        board.getBoard()[35].setUserValue(true);

        board.getBoard()[37].setValue(4);
        board.getBoard()[37].setUserValue(true);

        board.getBoard()[40].setValue(7);
        board.getBoard()[40].setUserValue(true);

        board.getBoard()[44].setValue(1);
        board.getBoard()[44].setUserValue(true);

        board.getBoard()[50].setValue(5);
        board.getBoard()[50].setUserValue(true);

        board.getBoard()[54].setValue(3);
        board.getBoard()[54].setUserValue(true);

        board.getBoard()[55].setValue(6);
        board.getBoard()[55].setUserValue(true);

        board.getBoard()[58].setValue(2);
        board.getBoard()[58].setUserValue(true);

        board.getBoard()[65].setValue(1);
        board.getBoard()[65].setUserValue(true);

        board.getBoard()[68].setValue(7);
        board.getBoard()[68].setUserValue(true);

        board.getBoard()[69].setValue(6);
        board.getBoard()[69].setUserValue(true);

        board.getBoard()[71].setValue(5);
        board.getBoard()[71].setUserValue(true);

        board.getBoard()[73].setValue(7);
        board.getBoard()[73].setUserValue(true);

        board.getBoard()[76].setValue(6);
        board.getBoard()[76].setUserValue(true);

        board.getBoard()[77].setValue(1);
        board.getBoard()[77].setUserValue(true);

        board.getBoard()[78].setValue(3);
        board.getBoard()[78].setUserValue(true);

        board.getBoard()[79].setValue(4);
        board.getBoard()[79].setUserValue(true);

        board.prepareBoard();
        return board;
    }

    static SudokuBoard sampleBoard9() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[0].setValue(7);
        board.getBoard()[0].setUserValue(true);

        board.prepareBoard();
        return board;
    }

    //The hardest Sudoku on the world!!!
    static SudokuBoard sampleBoard10() {

        SudokuBoard board = new SudokuBoard();
        board.createBoard();

        board.getBoard()[0].setValue(8);
        board.getBoard()[0].setUserValue(true);

        board.getBoard()[11].setValue(3);
        board.getBoard()[11].setUserValue(true);

        board.getBoard()[12].setValue(6);
        board.getBoard()[12].setUserValue(true);

        board.getBoard()[19].setValue(7);
        board.getBoard()[19].setUserValue(true);

        board.getBoard()[22].setValue(9);
        board.getBoard()[22].setUserValue(true);

        board.getBoard()[24].setValue(2);
        board.getBoard()[24].setUserValue(true);

        board.getBoard()[28].setValue(5);
        board.getBoard()[28].setUserValue(true);

        board.getBoard()[32].setValue(7);
        board.getBoard()[32].setUserValue(true);

        board.getBoard()[40].setValue(4);
        board.getBoard()[40].setUserValue(true);

        board.getBoard()[41].setValue(5);
        board.getBoard()[41].setUserValue(true);

        board.getBoard()[42].setValue(7);
        board.getBoard()[42].setUserValue(true);

        board.getBoard()[48].setValue(1);
        board.getBoard()[48].setUserValue(true);

        board.getBoard()[52].setValue(3);
        board.getBoard()[52].setUserValue(true);

        board.getBoard()[56].setValue(1);
        board.getBoard()[56].setUserValue(true);

        board.getBoard()[61].setValue(6);
        board.getBoard()[61].setUserValue(true);

        board.getBoard()[62].setValue(8);
        board.getBoard()[62].setUserValue(true);

        board.getBoard()[65].setValue(8);
        board.getBoard()[65].setUserValue(true);

        board.getBoard()[66].setValue(5);
        board.getBoard()[66].setUserValue(true);

        board.getBoard()[70].setValue(1);
        board.getBoard()[70].setUserValue(true);

        board.getBoard()[73].setValue(9);
        board.getBoard()[73].setUserValue(true);

        board.getBoard()[78].setValue(4);
        board.getBoard()[78].setUserValue(true);

        board.prepareBoard();
        return board;
    }

}
