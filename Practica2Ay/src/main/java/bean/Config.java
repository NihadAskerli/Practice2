/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

import util.FileUtility;

/**
 *
 * @author ASUS
 */
public class Config implements Serializable {
    private static Config config=null;
private static final String filename="app.obj";
    private Teacher [] teachers=new Teacher[0];
    private Student [] students=new Student[0];
    private static boolean loggedin;
    public static void initialize()   {
      Object obj = null;
        try {
            obj = FileUtility.readFileDeserilize(filename);
        } catch (Exception ex) {
       
        ex.printStackTrace();
        }
        if(obj==null){
            return;
        }if(obj instanceof Config){
            config=(Config)obj;
        }
   }
    public static void save(){
           try {
            FileUtility.writeObjectfile(Config.instance(), filename);
        } catch (Exception ex) {
       ex.printStackTrace();
        }
    }


    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void appendStudent(Student s){
        Student []newStudents=new Student[students.length+1];
        for(int i=0;i<students.length;i++){
            newStudents[i]=students[i];
        }
        newStudents[newStudents.length-1]=s;
        students=newStudents;
    }
        public void appendTeacher(Teacher s){
        Teacher []newTeacher=new Teacher[teachers.length+1];
        for(int i=0;i<teachers.length;i++){
            newTeacher[i]=teachers[i];
        }
        newTeacher[newTeacher.length-1]=s;
        teachers=newTeacher;
    }
    public static Config instance(){
        if(config==null){
            config=new Config();
        }
           return config; 
        }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedin() {
        return loggedin;
    }

    public static void setLoggedin(boolean loggedin) {
        Config.loggedin = loggedin;
    }
    

  
    
}
