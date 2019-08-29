public final class Penguin extends Pet{
    private String sex;//性别
    public Penguin(String name,String sex){
        super(name);
        setSex(sex);
    }
    public  void print(){
        //super.print();
        System.out.println("性别是"+ getSex() +".");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
