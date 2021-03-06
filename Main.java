public class Main
{

    public static void main(String[] args)
    {
       /* Из трехзначного числа x вычли его последнюю цифру. Когда результат разде-
          лили на 10, а к частному слева приписали последнюю цифру числа x, то полу-
          чилось число 237. Найти число x. */
        int y = 237;
        int z;
        int rez;

        z = y % 100;
        rez =  (z * 10) + (y / 100);

        System.out.println("x = " + rez);

        /*. В трехзначном числе x зачеркнули первую цифру. Когда оставшееся число
            умножили на 10, а произведение сложили с первой цифрой числа x, то полу-
            чилось число 564. Найти число x.*/
        y = 564;
        z = (y % 10);
        rez =(y / 10) + (z * 100);
        System.out.println("x = " + rez);

        /*. В трехзначном числе x зачеркнули его последнюю цифру. Когда в оставшемся
            двузначном числе переставили цифры, а затем приписали к ним слева послед-
            нюю цифру числа x, то получилось число 654. Найти число x*/
        int c;
        int d;

        y = 654;
        z = y / 100;
        c = (y % 100)/ 10;
        d = y - ((z * 100) + (c * 10));
        rez = (d * 100) + (c * 10) + z;

        System.out.println("x = " + rez);

        /*. С начала суток часовая стрелка повернулась на y градусов (0 ≤ y < 360, y —
            вещественное число). Определить число полных часов и число полных минут,
            прошедших с начала суток.*/
        int hour;
        int min;
        int t;
        int rez2;
        t = 160;

        min = 360 / 60;
        hour = 360 / 12;
        rez = (t / hour );
        rez2 = (t / min);

        System.out.println(rez +":"+ rez2);

        /*  Даны два целых числа a и b. Если a делится на b или b делится на a, то вывес-
            ти 1, иначе — любое другое число. Условные операторы и операторы цикла
            не использовать.*/
        int a = 20;
        int b = 40;
        int e = a % b;
        int f = b % a;

        rez = (e * f)+1;

        System.out.println(rez);

        /*  В трехзначном числе x зачеркнули его вторую цифру. Когда к образованному
            при этом двузначному числу слева приписали вторую цифру числа x, то полу-
            чилось число 546. Найти число x.*/

        y = 546;
        z = y / 100;
        c = (y % 100)/ 10;
        d = y - ((z * 100) + (c * 10));

        rez = (c * 100) + (z * 10) + d;

        System.out.println("x = " + rez);

        /*  В трехзначном числе x зачеркнули его вторую цифру. Когда к образованному
            при этом двузначному числу слева приписали вторую цифру числа x, то полу-
            чилось число n. По заданному n найти число n (значение n вводится с клавиа-
            туры, 10 ≤ n ≤ 999 и при этом число десятков в n не равно нулю)*/
        int n = 406;
        z = n / 100;
        c = (n % 100)/ 10;
        d = n - ((z * 100) + (c * 10));

        rez = (c * 100) + (z * 10) + d;

        System.out.println("x = " + rez);

        /*  В трехзначном числе x зачеркнули его последнюю цифру. Когда в оставшемся
            двузначном числе переставили цифры, а затем приписали к ним слева послед-
            нюю цифру числа x, то получилось число 654. Найти число x.*/

        y = 654;
        z = y / 100;
        c = (y % 100)/ 10;
        d = y - ((z * 100) + (c * 10));

        rez = (d * 100) + (c * 10) + z;

        System.out.println("x = " + rez);

    }
}
