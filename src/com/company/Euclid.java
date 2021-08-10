package com.company;

public class Euclid {
    private int chislo;
    public String f_exam;
    public String s_exam;
    public String t_exam;

    public  Euclid(int chislo)

    {
        int vrem =0;
        if(chislo>0) /// first task
        {
            f_exam="Не отрицательное!";
        }
        else f_exam="Oтрицательное!";
        t_exam="";
        for( int i=1; i<10;i++ )
        {
            if (chislo % i ==0)
            {
                vrem++;

            }

            switch(i)
            {
                case 1: if(chislo % i ==0)
                {
                    t_exam=t_exam+"1 ";
                    break;
                }
                case 2: if(chislo % i ==0)
                {
                    t_exam=t_exam+"2 ";
                    break;
                }
                case 3: if(chislo % i ==0)
                {
                    t_exam=t_exam+"3 "; break;
                }
                case 5: if(chislo % i ==0)
                {
                    t_exam=t_exam+"5 "; break;
                }

                case 6: if(chislo % i ==0)
                {
                    t_exam=t_exam+"6 "; break;
                }
                case 9: if(chislo % i ==0)
                {
                    t_exam=t_exam+"9 "; break;
                }

            }



        }
        if(vrem<=2)
        {
            s_exam="Простое!";
        }
        else if(vrem>2) s_exam="Не простое!";

    }

    public String toString () {

    return f_exam+" | "+ s_exam+"| Делится на:" + t_exam;
    }

}
