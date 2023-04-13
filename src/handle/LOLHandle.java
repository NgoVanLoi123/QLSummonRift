package handle;

import entity.LoL;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class LOLHandle {
     public LoL input(Scanner sc){
         System.out.println("Nhập số team:");
         int n=Integer.parseInt(sc.nextLine());
         System.out.println("Nhập thời gian bắt đầu:");
         String startTime =sc.nextLine();
         TeamHandle teamHandle =new TeamHandle();
         ArrayList<Team> teams =new ArrayList<>();
         for(int i=0;i<n;i++){
             System.out.println("Nhập teams thứ "+(i+1));
             Team team =teamHandle.inputTeam(sc);
             teams.add(team);
         }
         return new LoL(teams,startTime);

     }
}
