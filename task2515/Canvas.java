package com.javarush.task.task25.task2515;

/**
 * Created by AMalakhov on 10.08.2017.
 */
public class Canvas {
    private int width;
    private int height;

    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix=new char[height+2][width+2];
    }

    public int getWidth() {

        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setPoint(double x, double y, char c){
        int xR = (int)Math.round(x);
        int yR = (int)Math.round(y);
        if (xR<0||yR<0||yR>matrix.length||xR>matrix[0].length){

        }
        else {
            matrix[yR][(xR)]=c;
        }
    }
    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]!=0){
                   setPoint(x+j,y+i,c);
                }
            }
        }
    }


}
