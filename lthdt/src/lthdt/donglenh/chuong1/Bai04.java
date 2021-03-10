/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

import java.text.ParseException;


public class Bai04 {
    public static void main (String[] args){
        Shape htron = new Cirde(5, 1, 2);
//        System.out.println("chu vi cua hinh tron la " + htron.calcPerimeter());
//        System.out.println("Dien tich  cua hinh tron la " + htron.calcArea());
        System.out.println(htron.toString());
        Shape hcn = new Rectangle(3, 15, 8, 5);
//        System.out.println("chi vi hcn"+ hcn.calcPerimeter());
//        System.out.println("Dien tich hcn" + hcn.calcArea());
        System.out.println(hcn);
        
        
        
        
    }

//    private static class Circle {
//
//        public Circle() {
//        }

//    private static class Circle {
//
//        public Circle(int i, int i0, int i1) {
//        }
//
//        private String calcPerimeter() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        private String calcArea() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
    }
    

