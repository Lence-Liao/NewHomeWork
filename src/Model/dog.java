package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class dog {
    private String name;
    private int kind;
    private int house;
    private int food;
    private int sum;
    
    public dog(String name, int kind, int house, int food) {
        this.name = name;
        this.kind = kind;
        this.house = house;
        this.food = food;
        this.sum = kind+house+food;
    }
    public dog() {
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKind() {
        return (int)kind;
    }

    public void setKind(int kind) {
        
        this.kind = kind;
    }

    public int getHouse() {
        return (int)house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFood() {
        return (int)food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public int getSum() {
        sum = kind+house+food;
        return (int)sum;
    }
    
    
    public String showpublic(){
      return    "姓名= "+name+
                "\n狗狗= "+kind+
                "\n狗屋= "+house+
                "\n飼料= "+food;
    }
    public String show2(int a,int b){
          return    "姓名= "+name+
                    "\n付款= "+a+
                    "\n費用= "+b+
                    "\n找零= "+(a-b)+
                    "\n========================="+
                    "\n千元鈔= "+((a-b)/1000)+
                    "\n百元鈔= "+(a-b)%1000/100+
                    "\n50元硬幣= "+(a-b)%1000%100/50+
                    "\n10元硬幣= "+(a-b)%1000%100%50/10+
                    "\n1元硬幣= "+((a-b)%1000%100%50%10/1);
    }

}
