public class Student {
    public String id;
    private int choice;
    private int age;
    private String name;
    private String fatherName;

    public void setid(String id ){
        this.id = id;
    }public void setname(String name) {
        this.name=name;
    }
    public void setfatherName(String fatherName){
        this.fatherName=fatherName;
    }
    public void setage(int age) {
        this.age=age;
    }
    public void setchoice(int choice){
        this.choice = choice;
    }
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getfatherName(){
        return fatherName;
    }
    public int getage(){
        return age;
    }
    public int getchoice(){
        return choice;
    }

}
