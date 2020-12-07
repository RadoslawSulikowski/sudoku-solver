public class SolverRunner {

    public static void main(String[] args) {

        boolean closeSolver = false;
        while(!closeSolver){
            SudokuSolver solver = new SudokuSolver();
            closeSolver = solver.resolveSudoku();
        }
    }
}
