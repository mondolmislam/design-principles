package iterator.question01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentCollection implements Iterable<String>{
    private HashMap<Integer,Student> students;

    public StudentCollection(){
        students=new HashMap<Integer,Student>();
    }

    public void addStudent(Student student){
        students.put(student.getId(),student);
    }

    public String getStudentNameById(int id){
        return students.get(id).getName();
    }
    @Override
    public Iterator<String> iterator() {
        return new StudentIterator(students);
    }

    private class StudentIterator implements Iterator<String>{

        private Iterator<Map.Entry<Integer,Student>> iterator;

        public StudentIterator(HashMap<Integer,Student>students){
            iterator=students.entrySet().iterator();
        }
        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public String next() {
            Map.Entry<Integer,Student> entry=iterator.next();
            return entry.getValue().getName();
        }
    }
}
