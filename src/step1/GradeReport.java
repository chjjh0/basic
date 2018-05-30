package step1;

import java.util.Scanner;

public class GradeReport{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
        String name = "";
        String result = "";
        String result2 = "";
        int kor = 0, eng = 0, math = 0;
        
        
        System.out.print("이름을 입력하세요");
        name = scan.next();
        
        System.out.println("국어 점수를 입력하세요");
        kor = scan.nextInt(); 
            if(kor > 100) { result2 = "잘못 입력했습니다"; break; }
        
        if(kor > 0 && kor <= 100){
            System.out.println("영어 점수를 입력하세요");
            eng = scan.nextInt();
        } else {result2 = "잘못 입력했습니다"; return; }
        
        if(eng > 0 && eng <= 100){
                System.out.println("수학 점수를 입력하세요");
                math = scan.nextInt();}
                    if(math > 0 && math <= 100){
                        result2 = (kor + eng + math) / 3 + "";
                    } else {result2 = "잘못 입력했습니다"; break; }
        
        System.out.println(result2);
        }
    }
}
