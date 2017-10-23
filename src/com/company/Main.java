package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,num=0;
        int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0;
        for (int i=0;i<100;i++){
            a = i/10;
            b = i%10;
            num = a+b;
            switch (num){
                case 1:case 2:
                    f1++;
                    break;
                case 3:case 4:
                    f2++;
                    break;
                case 5:case 6:
                    f3++;
                    break;
                case 7:case 8:case 9:case 10:
                    f4++;
                    break;
                case 11:case 12:
                    f5++;
                    break;
                case 13:case 14:
                    f6++;
                    break;
                case 15:case 16:
                    f7++;
                    break;
                case 17:case 18:
                    f8++;
                    break;
            }
        }
        System.out.printf("%d,%d,%d,%d,%d,%d,%d,%d\n",f1,f2,f3,f4,f5,f6,f7,f8);
    }
}
