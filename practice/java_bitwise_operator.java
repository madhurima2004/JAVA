//1.BITWISE OR :This operator is a binary operator, denoted by ‘|’. It returns bit by bit OR of input values, i.e., if either of the bits is 1, it gives 1, else it shows 0

//2.Bitwise AND (&)This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0. 

//3. Bitwise XOR (^) :This operator is a binary operator, denoted by ‘^.’ It returns bit by bit XOR of input values, i.e., if corresponding bits are different, it gives 1, else it shows 0. 

//4. Bitwise Complement (~) :This operator is a unary operator, denoted by ‘~.’ It returns the one’s complement representation of the input value, i.e., with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 

//5.LEFT SHIFT(<<): a<<b=a*2^b
//6. RIGHT SHIFT(>>):

public class java_bitwise_operator {

    public static void main(String[] args) {
        int p=9;
        int q=10;
        System.out.println(p|q);
        System.out.println(p&q);
        System.out.println(p^q);
        System.out.println(p<<1);
        System.out.println(p<<2);
        System.out.println(q>>1);
        System.out.println(q>>2);
    }
}