/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ADMIN
 */
public class Bai06 {
    public static void main(String [] args) throws ParseException{ 
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen Van A", 1, ngaysinh);
        
        System.out.println("Ho ten:" + person.getHoten() + "; gioitinh: " 
                + person.getGioitinh() + "; ngay sinh: " +
                df.format(person.getNgaysinh()));
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-12-2001"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println(sinhvien.getHoten() +"; gioitinh " +
                sinhvien.getGioitinh() + "; ngaysinh: " +
                df.format(sinhvien.getNgaysinh()) + "; " +
                sinhvien.getTruonghoc());
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyen Thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("02-09-2003"));
        congnhan.setCongty("IBM");
        System.out.println(congnhan.getHoten() +"; gioitinh: " +
                congnhan.getGioitinh() + "; ngaysinh:" +
                df.format(congnhan.getNgaysinh()) + "; congty: " +
                congnhan.getCongty());
        
        
    }

    
}
