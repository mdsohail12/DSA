public class UseStatic {
    public static void main(String[] args) {
        Static s1=new Static();
        Static s2=new Static();
        Static s3=new Static();
        s1.a=10;
        s2.a=20;
        s3.a=30;


        System.out.println(s1.a+" "+" "+s2.a+" "+s3.a);
        // s1.b=100;
        // s2.b=200;
        // s3.b=300;
        // System.out.println(s1.b+" "+" "+s2.b+" "+s3.b);
        //this will not giving the eror but jab hamlog static variable ko access karte h to usko class ke name se access karte h b\ok bro
       Static.b=100;
        Static.b=200;
        Static.b=300;
        System.out.println(Static.b+" "+" "+Static.b+" "+Static.b);


    }
    
}
