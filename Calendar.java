import java.util.*;
public class Calendar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if(year<0)
        {
            System.out.println("Invalid year");
            return;
        }
        int s=0,x=0;
        int i,j,month,startindex,noofdays=0,counter,k;
        boolean leapyear=false;
        s=0;
        if((year%400==0)||(year%100!=0 && year%4==0)|| (year%100==0 && year<=1700))
        {
            leapyear=true;
        }
        for(j=Math.min(2017,year);j<Math.max(2017,year);j++)
        {
            if(j==1752)
            {
                s+=355;
            }
            else if((j%400==0)||(j%100!=0 && j%4==0)|| (j%100==0 && j<=1700))
            {
                s+=366;
            }
            else
            {
                s+=365;
            }
        }
        for(month=1;month<=12;month++)
        {
            startindex=0;
            noofdays=0;
            switch(month)
            {
                case 1:
                    System.out.println("January");
                    noofdays=31;
                    break;
                case 2:
                    System.out.println("February");
                    if(leapyear)
                    {
                        noofdays=29;
                    }
                    else
                    {
                        noofdays=28;
                    }
                    break;
                case 3:
                    System.out.println("March");
                    noofdays=31;
                    break;
                case 4:
                    System.out.println("April");
                    noofdays=30;
                    break;
                case 5:
                    System.out.println("May");
                    noofdays=31;
                    break;
                case 6:
                    System.out.println("June");
                    noofdays=30;
                    break;
                case 7:
                    System.out.println("July");
                    noofdays=31;
                    break;
                case 8:
                    System.out.println("August");
                    noofdays=31;
                    break;
                case 9:
                    System.out.println("September");
                    if(year!=1752)
                    noofdays=30;
                    else
                    noofdays=19;
                    break;
                case 10:
                    System.out.println("October");
                    noofdays=31;
                    break;
                case 11:
                    System.out.println("November");
                    noofdays=30;
                    break;
                case 12:
                    System.out.println("December");
                    noofdays=31;
                    break;
            }
            x=0;
            switch(month-1)
            {
                case 12:x+=31;
                case 11:x+=30;
                case 10:x+=31;
                case 9:
                    if(year==1752)
                    x+=19;
                    else
                    x+=30;
                case 8:x+=31;
                case 7:x+=31;
                case 6:x+=30;
                case 5:x+=31;
                case 4:x+=30;
                case 3:x+=31;
                case 2:
                    if(leapyear)
                    {
                        x=x+29; 
                    }
                    else 
                    {    
                        x=x+28;
                    }
                case 1:x+=31;
                    
            }
            //System.out.println("s = "+s);
            //System.out.println("x = "+x);
            if(year<2017)
            {
                startindex=(0-s+x)%7;
            }
            else
            {
                startindex=(s+x)%7;
            }
            counter=1;
            if(startindex<0)
            {
                startindex=7+startindex;
            }
            //System.out.println("startindex = "+startindex);
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat"); 
            for(i=1;noofdays!=0;i++)
            {
                for(k=0;k<7;k++)
                {
                    if(k<startindex || noofdays==0)
                    {
                        System.out.print("\t");
                    }
                    else if(k==startindex)
                    {
                        startindex=-1;
                        System.out.print(counter+"\t");
                        counter++;
                        noofdays--;
                    }
                    else
                    {
                        System.out.print(counter+"\t");
                        if(year==1752 && counter==2 && month==9)
                        {
                            counter=14;
                            noofdays--;
                        }
                        else
                        {
                            counter++;
                            noofdays--;
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}