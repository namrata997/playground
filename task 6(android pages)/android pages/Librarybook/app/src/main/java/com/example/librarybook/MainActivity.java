package com.example.librarybook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {


    Button student;
    Button books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

class Library{
        public Library()
        {
            System.out.println(" college Library");
        }
        public  void collagelibran(){
            System.out.println("collage library");
        }
}
class books extends Library{
        public books()
        {
            System.out.println("book name R.S.Agarwal");
        }
        public void version(){
            System.out.println("book versionis: 2");
        }
        public void Number(){
            System.out.println("book number:456");
        }
        public void numberofcopy(){
            System.out.println("number of copy available:4");
        }
}
public class student extends books{
        public student(){
            System.out.println("student name:geeta");
        }
        public void rollno(){
            System.out.println("student usn:2SD19058");
        }
        public void branch(){
            System.out.println("student branch:cs");
        }
        public void numberofbook(){
            System.out.println("number book issue:2");
        }

    {
        student obj = new student();
        obj.collagelibran();
        obj.version();
        obj.Number();
        obj.numberofcopy();
        obj.rollno();
        obj.branch();
        obj.numberofbook();
    }
}

}
