/**
 * 狗狗类，宠物的子类
 */
public final class Dog extends Pet {
    private String strain;//品种

    public Dog() {

    }

    public Dog(String name, String strain) {
          super(name);
        setStrain(strain);
    }

    public void print() {
        System.out.println("我叫" + super.getName() + "我的健康值是" + super.getHealth()
                + "我与主人的亲密度是" + super.getLove() + "我是一只" + getStrain());
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}