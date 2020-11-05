public class School {
    Node<Student>[] ar;
    public School() {
        this.ar = new Node[6];
    }

    public Node<Student>[] getAr() {
        return ar;
    }
    public void addStudent(Student student, int index){
        if(ar[index]==null){
            Node<Student> add_node=new Node<Student>(student);
            ar[index]=add_node;
        }else{
            Node<Student> add_node=new Node<Student>(student,ar[index]);
            ar[index]=add_node;
        }
    }
}
