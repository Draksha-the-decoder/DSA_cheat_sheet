class Student
{
    String name;
    float marks;
    Student(String name,float marks)
    {
        this.name = name;
        this.marks = marks;
    }
}
class user_defined_generic <T>
{
    private T obj;
    user_defined_generic(T obj)
    {
        this.obj=obj;
    }
    T getObject()
    {
        return this.obj;
    } 
}
class user_defined_main
{
    public static void main (String args[])
    {
        System.out.println("welcome");
        Student s[]=new Student[2];
        s[0] = new Student("Draksha",74);
        s[1] = new Student("Sudiksha",74);

        user_defined_generic<Student> obj=new user_defined_generic<Student>(s[1]);
        System.out.println(obj.getObject().name);
    }
}