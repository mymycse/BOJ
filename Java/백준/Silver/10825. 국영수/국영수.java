import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    int kor, eng, math;
    String name;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        if ( this.kor != student.kor )
            return student.kor - this.kor;
        if ( this.eng != student.eng )
            return this.eng - student.eng;
        if ( this.math != student.math )
            return student.math - this.math;
        return this.name.compareTo(student.name);
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stu = Integer.parseInt(br.readLine());
        Student[] students = new Student[stu];

        for ( int i = 0 ; i < stu ; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for ( int i = 0 ; i < stu ; i++ )
            System.out.println(students[i].name);
    }
}