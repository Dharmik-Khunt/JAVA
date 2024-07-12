class Cuboid{
    float h,l,b;
    Cuboid(float h,float l,float b){
        this.h=h;
        this.l=l;
        this.b=b;
    }
    float CurvedArea(){
        return 2*h*(l+b)*10000;
    }
    float Area(){
        return 6*l*l*10000;
    }
    float Volume(){
        return l*b*h*1000000;
    }
}

class one{
    public static void main(String[] args) {
        Cuboid c=new Cuboid(0.32f,0.23f,0.123f);
        System.out.println(c.CurvedArea()+" "+c.Area()+" "+c.Volume());
    }
}