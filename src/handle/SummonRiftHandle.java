package handle;

import entity.SummonRift;

import java.util.Scanner;

public class SummonRiftHandle {
    public SummonRift input(Scanner sc){
        System.out.println("Nhập tên đội tuyển 1:");
        String name1=sc.nextLine();
        System.out.println("Nhập tên đội tuyển 2: ");
        String name2=sc.nextLine();
        return new SummonRift(name1,name2);
    }
}
