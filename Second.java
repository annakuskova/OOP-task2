public class Second {
    public static void main(String[] args) {
        int arr1[]  = {44, 32, 86, 19};
        int arr2[] = {1, 3};
        int arr3[] = {1, 2, 3};

        System.out.println(repeat("mice", 5));
        System.out.println(differenceMaxMin(arr1));
        System.out.println(isAvgWhole(arr2));

        int arr4[] = cumulativeSum(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        System.out.println("");
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(Fibonacci(7));
        System.out.println(isValid("12945"));
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(boxSeq(1));
    }

    // функция, которая повторяет каждый символ в строке n раз
    public static StringBuilder repeat(String s, int n) {
        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < n; j++) {
                repeat.append(s.charAt(i));
            }
        }
        return repeat;
    }

    //  принимает массив и возвращает разницу между самыми большими и самыми маленькими числами
    public static int differenceMaxMin(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            max = Math.max(max, a[i]);
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            min = Math.min(min, a[i]);
        return (max-min);
    }

    // является ли среднее значение всех элементов
    // массива целым числом или нет
    public static boolean isAvgWhole(int[] a) {
        int sum = 0;
        for (int i = 1; i < a.length - 1; i++)
            sum = a[i] + a[i+1];
        if ((sum/a.length) % 1 !=0)
            return false;
        else return true;
    }

    // возвращает массив, в котором каждое целое число
    // является суммой самого себя + всех предыдущих
    public static int[] cumulativeSum(int[] a) {
        for (int i = 1; i < a.length; i++) {
           a[i] = a[i] + a[i-1];
        }
        return a;
    }

    // возвращает число десятичных знаков, которое имеет число
    public static int getDecimalPlaces(String a) {
        int index = a.indexOf(".");
        int b = a.length() - a.indexOf(".") - 1;
        if (index == -1)
            return index + 1;
        else return b;
    }

    // число Фибоначчи
    public static int Fibonacci(int n) {
        int arr[] = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i)
            arr[i] = arr[i-1] + arr[i-2];
        return arr[arr.length-1];
    }

    // Почтовые индексы
    // – Должно содержать только цифры.
    // – Не должно содержать никаких пробелов.
    // – Длина не должна превышать 5 цифр.
    public static boolean isValid(String a) {
        int c = 0;
        char[] chArray = a.toCharArray();
        for (int i = 0; i < a.length(); i++){
            if ((chArray[i] == '0')||(chArray[i] == '1')||(chArray[i] == '2')||(chArray[i] == '3')||(chArray[i] == '4')||(chArray[i] == '5')||(chArray[i] == '6')||(chArray[i] == '7')||(chArray[i] == '8')||(chArray[i] == '9')) c=c+1;
        }
        if ((a.length() == 5)&&(c == 5)) return true;
        else return false;
    }

    // Странная пара
    //– Первая буква 1-й строки = последняя буква 2-й строки.
    //– Последняя буква 1-й строки = первая буква 2-й строки.
    public static boolean isStrangePair(String a, String b) {
        if ((a.charAt(0) == b.charAt(b.length()-1))&&(b.charAt(0) == a.charAt(a.length()-1))) return true;
        else return false;
    }

    // префикс
    public static boolean isPrefix(String a, String b) {
        String c = b.substring(0, b.length()-1);
        String d = a.substring(0, b.length()-1);
        if (c.equals(d)) return true;
        else return false;
    }

    // суффикс
    public static boolean isSuffix(String a, String b) {
        String c = b.substring(1, b.length());
        boolean d = a.contains(c);
        return d;
    }

    // Шаг 0: начните с 0
    // Шаг 1: Добавьте 3
    // Шаг 2: Вычтите 1
    // Повторите Шаги 1 И 2
    public static int boxSeq(int n){
        int c = 0;
        for (int i = 1; i <= n; i += 2) {
            с += 3;
        }
        for (int i = 2; i <= n; i += 2) {
            c--;
        }
        return c;
    }
}
