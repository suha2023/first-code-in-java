/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.q31;

/**
 *
 * @author suha9
 */
public class Q31 {

    public static void main(String[] args) {
   int[][]matrix;    
   matrix=new int[4][5];
   int value=1;
   for(int row=0;row<matrix.length;row++){
       for(int column=0;column<matrix[row].length;column++){
           matrix[row][column]=value;
           value++;
       }
   }
   
           //pirent
    for(int row=0;row<matrix.length;row++){
       for(int column=0;column<matrix[row].length;column++){
           System.out.print(matrix[row][column]+" ");}
       System.out.println();
       }    
           }
       }
   
        
        
     
