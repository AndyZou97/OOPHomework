public class Kid {
    private String name;
    private String gender;
    private int age;
    public static int numberOfKids = 0;

    public Kid(){
        this.name = "Jean-Marc";
        this.gender = "Male";
        this.age = 18;
        numberOfKids++;
    }
    public Kid(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        numberOfKids++;
    }
    public String getName(){
        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setGender(String newGender){
        this.gender = newGender;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String toString(){
        return "Name: " + this.name + "\n" + "Gender: " + this.gender + "\n" + "Age: " + this.age;
    }

    public boolean areTheyTwins(Kid kiddo){
        if (this.age == kiddo.age){
            return true;
        }
        else{
            return false;
        }
    }
}
