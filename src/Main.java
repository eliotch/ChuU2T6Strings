
public class Main {
    public static void main(String args []){
        //String str1="green";
        //LabRunner str2=new LabRunner("eggs");
        //String s="and ham";
        //LabRunner str3=new LabRunner(s);
        //System.out.println(str1);
        //System.out.println(str2.getStr());
        //System.out.println(str3.getStr());
        //int day = 8;
        //String str1 = "Holy cow!";
        //String str2 = "It’s almost";
        //String str3 = str1 + " " + str2;
        //str3 += " ";
        //str3 += "October " + day + ", ";
        //str3 += 2022;
        String str1 = "A" + 1 + "B" + 2;
        String str2 = 1 + "A" + 2 + "B";
        String str3 = "A" + "B" + 1 + 2;
        String str4 = "A" + 1 + 2 + "B";
        String str5 = 1 + 2 + "A" + "B";
        String str6 = "A" + 1 + 2 + 3;
        String str7 = 1 + 2 + 3 + "A";
        String str8 = "1" + 2 + 3 + 4;
        String str9 = 1 + 2 + 3 + "4";
        String str10 = 3.5 + 2 + 3 + "4";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        System.out.println("str5 = " + str5);
        System.out.println("str6 = " + str6);
        System.out.println("str7 = " + str7);
        System.out.println("str8 = " + str8);
        System.out.println("str9 = " + str9);
        System.out.println("str10 = " + str10);
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());

    }
}
