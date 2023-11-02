public class Student {
        private String fullName;
        private int age;

        public Student(String fullName , int age){
            this.fullName = fullName;
            this.age = age;
        }

        public void setFullName (String fullName) {
            this.fullName = fullName;
        }
        public String getFullName () {
            return fullName;
        }
        public int getAge (){
            return age;
        }


        public void setAge(int age){
            this.age = age;

        }
        public String toString() {
            return "Hello " + fullName + " тебе " + age;

        }
}
