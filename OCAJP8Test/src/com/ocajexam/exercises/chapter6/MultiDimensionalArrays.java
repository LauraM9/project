package com.ocajexam.exercises.chapter6;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		char[][] ticTacToeBoard = new char[3][3];
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				ticTacToeBoard[x][y] = '-';
			}
		}
		ticTacToeBoard[0][0] = 'X';
		ticTacToeBoard[1][1] = 'O';
		ticTacToeBoard[0][2] = 'X';
//		for (int y = 0; y < 3; y++) {
//			for (int x = 0; x < 3; x++) {
//				System.out.print(ticTacToeBoard[x][y] + " ");
//			}
//			System.out.print("\n");
//		}
		
		String[][] chessBoard;
		String chessBoard1[][];
		int[][][] cube;
		int cube1[][][];
		
		String[][] square = {{"1", "2"}, {"3", "4"}};
		String[][] square1 = new String[2][2];
		int[][][] cube2 = new int[3][3][2];
		
		int[][] oddSizeArray = {{1, 2}, {1, 2, 3, 4}, {1, 2, 3}};
		
		int[][][] array3D = new int[2][][];
		array3D[0] = new int[5][];
		array3D[1] = new int[3][];
		array3D[0][0] = new int[7];
		array3D[0][1] = new int[2];
		array3D[1][0] = new int[4];
		
		int[][] grid = {{1, 2}, {3, 4}};
		System.out.println(grid[0][0] + " " + grid[1][0]);
		System.out.println(grid[0][1] + " " + grid[1][1]);
		int[] subGrid = grid[1];
	}

}
