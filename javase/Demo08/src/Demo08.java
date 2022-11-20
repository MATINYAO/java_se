public class Demo08 {
    public static void main(String[] args) {


        int  a= 1;
        int b = 20;
        int c = 21;

        System.out.println(c%b);

        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a!=b);



        //++  --
        int aa = 3;
        int bb = aa++;
        System.out.println(aa);

        int cc = ++aa;


        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        //幂运算 2^3
        double pow = Math.pow(2,3);

        double pow1 = Math.pow(3,3);
        System.out.println(pow);
        System.out.println(pow1);


        //逻辑运算符号
        boolean aaa = true;
        boolean bbb = false;

        System.out.println("aaa && bbb " + (aaa && bbb));
        System.out.println("aaa || bbb " + (aaa || bbb));
        System.out.println("!(aaa && bbb) " + !(aaa && bbb));


        //短路运算

        //System.out.println(bbb &&& aaa);
        int ccc = 5;
        boolean d = (c<4)&&(c++<10);
        System.out.println(ccc);



    }
}
