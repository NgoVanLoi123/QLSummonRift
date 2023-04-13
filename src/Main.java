import entity.Figure;
import entity.LoL;
import entity.SummonRift;
import entity.Team;
import handle.FigureHandle;
import handle.LOLHandle;
import handle.SummonRiftHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        SummonRiftHandle summonRiftHandle =new SummonRiftHandle();
        SummonRift summonRift =summonRiftHandle.input(sc);
        System.out.println(summonRift);
        LOLHandle lolHandle =new LOLHandle();
        LoL loL =lolHandle.input(sc);
        System.out.println(loL);
    }
}