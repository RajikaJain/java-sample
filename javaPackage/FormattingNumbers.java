package javaPackage;

import java.text.NumberFormat;

public class FormattingNumbers{
 public static void main(String[] args) {
NumberFormat currency =NumberFormat.getCurrencyInstance();
String result =currency.format(1234567.891);
System.out.println(result);
NumberFormat percent =NumberFormat.getPercentInstance();
String result1 =percent.format(0.1);
System.out.println(result1);
 }}