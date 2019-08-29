/**
 * 宠物类，狗狗和企鹅的父类
 */
    public abstract class Pet extends Object {
    private String name;//昵称
    private int health = 100;//健康值
    private int love = 0;//亲密度

    /**
     * 无参构造方法
     */
    public Pet() {
        this.setHealth(95);
        System.out.println("执行宠物的无参构造方法");
    }

    /**
     * 有参构造方法
     *
     * @param name 昵称
     */
    public Pet(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }

    /**
     * 抽象方法输出宠物信
     */
    public abstract void print();

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLove(int love) {
        this.love = love;
    }
}