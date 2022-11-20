import javax.sound.midi.Soundbank;
import java.util.logging.SocketHandler;

public class Demo03 {
    public static void main(String[] args) {
        //整数扩展

        //进制转换  16进制0x
        int i = 10;
        int i1 = 010;
        int i2 = 0x10;

//        System.out.println("10进制的10");
        System.out.println("10进制的10"+ i);

        System.out.println(i1);
        System.out.println(i2);

        System.out.println("====================================");
        //=====================================
        //================浮点数扩展
        //=====================================
        //最好不要用浮点数进行比较
        //银行业务使用Bigdecimal这个数学类来处理

        //float  ,浮点数有舍入有误差
        //double

        float f = 0.1f;
        double d = 1.0/10;

        System.out.println("f=" + f);   // 强类型
        System.out.println("d="+d);
        System.out.println(f==d);

        float d1 = 999912312119f;
        float d2 = d1+1;

        System.out.println(d1==d2);

        //==================================
        //====字符扩展=======================
        //==================================

        char c1 = 'a';
        char c2 = '中';

        System.out.println("a的编码 " + (int)(c1));

        System.out.println("中的编码 " + (int)c2);


        //所有字符都是数字
        //编码
        char c3 = '\u0061';

        System.out.println(c3);


        //转义字符
        // \t   table
        // \n   换行
        System.out.println("aaaa \t world \n aaaa");


        //=========================================
        String sa = new String( "hello world!");
        String sb = new String("hello world!");
        //对象，指的内存不同
        System.out.println(sa==sb);


        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);


        //布尔的扩展
        boolean flag = true;
        if (flag){
            System.out.println("flag 为真" );
        }

    }
}
