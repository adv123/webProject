/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com;

import java.io.*;
import java.util.*;

 class Game {
 protected void play(){
  System.out.println("play game");
 }
}
//Football.java

 class Football extends Game {
 protected void play() {
    System.out.println("play football");
    super.play();
 }
 void f(){
  play();
 }
}
//Basketball.java
 class Basketball extends Game{
 protected void play() {
  System.out.println("play basketball");
 }
}
//Popolong.java

 class Popolong extends Game {
 protected void play() {
  System.out.println("play popolong");
 }
}

public class test{
	
	public static void main(String args[]) throws IOException {
		Game[] games = new Game[10];
		  games[0] = new Basketball();
		  games[1] = new Football();
		  games[2] = new Popolong();  
		  
		  for(int i=0;i<games.length;i++){
		   if(games[i]!=null)
		      games[i].play();
		  }
		  
	}
	
}
/*
 * System.out.print("ÇëÊäÈëÊý×Ö£º"); InputStreamReader in; BufferedReader br; in = new
 * InputStreamReader(System.in); br = new BufferedReader(in); String s =
 * br.readLine(); int n = Integer.parseInt(s); System.out.println(n); for (int i
 * = 1; i <= n; i++) { for(int j =1;j<n-i;j++){ System.out.print(" "); } for
 * (int j = 0; j < i; j++) {
 * 
 * System.out.print("* "); } System.out.println(); }
 * 
 * int n = 7; int a[][] = new int[n + 1][]; for (i = 0; i <= n; i++) { a[i] =
 * new int[i + 1]; } for (i = 0; i <= n; i++) { for (j = 0; j <= a[i].length -
 * 1; j++) { if (i == 0 || j == 0 || j == a[i].length - 1) { a[i][j] = 1; } else
 * { a[i][j] = a[i - 1][j] + a[i - 1][j - 1]; } } } for (i = 0; i <= n; i++) {
 * 
 * for (j = 0; j < n - i; j++) { System.out.print(" "); } for (j = 0; j <=
 * a[i].length - 1; j++) { System.out.print(a[i][j] + " "); }
 * System.out.println(); }
 * 
 * int[] str = new int[3]; for (int[] p : a) { for (int q : p) {
 * System.out.print(q); System.out.println(); } }
 */
