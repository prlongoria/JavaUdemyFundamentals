public class HolaMundo04 {
    public static void main(String args[]) {
        /*
        tipos primitivos enteros:byte(8), short(16), int(32), long(64)
         */
        byte numeroByte = 10;//tipo entero
        System.out.println("valor minimo byte:" + Byte.MIN_VALUE);//imprimo el valor mínimo de Byte
        System.out.println("valor maximo byte:" + Byte.MAX_VALUE);
        //si numeroByte = 129 (por encima del valor maximo del Byte) me marca un error porque este valor entero supera lo que puede almacenar 1Byte
        //No obstante puedo hacer una conversión de tipo:
        byte numeroByte2 = (byte) 129;
        System.out.println("Valor byte: " + numeroByte2);//imprime -127 que es el valor mínimo que almacena 1byte

        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo short:" + Short.MAX_VALUE);
        short numeroShort2 = (short)32768;
        System.out.println("numeroShort2 = " + numeroShort2);//imprime valor mínimo de short

        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo integer:" + Integer.MIN_VALUE);
        System.out.println("valor maximo integer:" + Integer.MAX_VALUE);
        int numeroInt2 = (int)2147483648L;//lo convierto a una literal de tipo long para que me admita una cantidad mayor al maximo que admite el tipo int
        System.out.println("numeroInt2 = " + numeroInt2);//imprime valor mínmo de int

        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo long:" + Long.MAX_VALUE);
        long numeroLong2 = 9223372036854775807L;
        System.out.println("numeroLong2 = " + numeroLong2);

        //flotante y double:
        float numeroFloat = 10.0F;// también puedo poner: float numeroFloat = (float)10.0;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo float:" + Float.MIN_VALUE);
        System.out.println("valor maximo float:" + Float.MAX_VALUE);
        float numeroFloat2 = (float) 3.4028236E38D;//meto un numero mayor al soportado por tipo float, así convierto a double la literal para que no tenga problemas con el tamaño
        System.out.println("numeroFloat2 = " + numeroFloat2);//me da infinity porque el compilador no lo soporta, así que debo cambiar el tamaño al maximo que permite el tipo float

        double numeroDouble = 10;//double es el mayor tamaño soportado
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("valor minimo double:" + Double.MIN_VALUE);
        System.out.println("valor maximo double:" + Double.MAX_VALUE);
    }
}
