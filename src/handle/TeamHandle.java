package handle;

import entity.Figure;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamHandle {
    public Team inputTeam(Scanner sc){
        System.out.println("Nhập số vị tướng:");
        int n=Integer.parseInt(sc.nextLine());
        FigureHandle figureHandle=new FigureHandle();
        ArrayList<Figure> figures=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Nhập tướng thứ "+(i+1));
            Figure figure=figureHandle.inputFigure(sc);
            figures.add(figure);

        }
        return new Team(figures);

    }
}
