class Student
{
    int rollno;
    String name;
    int marks;
}
public class arrayOfObjects {
    public static void main(String[] args) {
       //string array
        Student s1=new Student();
        s1.rollno=1;
        s1.name="Sowndu";
        s1.marks = 79;
        
        Student s2=new Student();
        s2.rollno=2;
        s2.name="Ranju";
        s2.marks = 89;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="anju";
        s3.marks = 99;

        // System.out.println(s1);//addrees will print ex.Student@7a81197d

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
             System.out.println(students[i].name + " : " + students[i].marks);
        }
        System.out.println("enhanced loop");

        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }

        //integer array
        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;
        // //add length of array
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
    }
}
