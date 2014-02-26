package com.kaku.sample;
/*
 * 1~100整数の間、3の倍数なら"Hoge"と出力、5の倍数なら"Fuga"と出力、3の倍数かつ5の倍数なら"HogeFuga"と出力
 * および、偶数の合計を出力する
 * 以下のソースは間違いところがあります、直してみてください
 */
public class HogeFugabk {
	 public static void main(String[] args) {
		 boolean add = false;
		 int total = 0;
		 for (int i = 0; i <= 100; i++) {
			 if((i+1) % 3 == 0 && (i+1) % 5 == 0) {
				 System.out.println("HogeFuga");
				 } else if ((i+1)% 3 == 0) {
					 System.out.println("Hoge");
				 } else if((i+1) % 5 == 0) {
					 System.out.println("Fuga");
				 } else {
					 System.out.println(i+1);
				}
			 if(add) {
				 total += i + 1;
				}
			 add = !add;
			 }
		 System.out.println("even-num total= "+ Integer.toString(total));
		 }
	 }
