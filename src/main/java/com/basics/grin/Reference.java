package com.basics.grin;

public class Reference {
    public static void main(String[] args) {

    }
    class WeekDay{
        int number;
        String name;
    }

    public class Example {//Объекты обычно являются совокупностью нескольких полей и методов — специальных функций для работы с ними. При этом все значения полей, даже примитивы, находятся именно в области памяти объекта, в куче. Значения полей одного объекта могут ссылаться на адреса в куче других объектов, как представлено в следующем примере
        public void main(String[] args) {
            WeekDay day = new WeekDay();
            day.number = 1;
            day.name = "Sunday";
        }
    }
    String str1 = "Hello";//Строковый литерал – это множество символов, заключенных в двойные кавычки. Все строковые литералы реализованы как экземпляры (объекты) класса String.
    public class Example2 {//В случаях, когда ссылочная переменная не связана с объектом, такая переменная имеет нулевое/пустое значение. Оно обозначается литералом null. При обращении к полям или методам на переменной, равной null, вы получите NullPointerException.
        public  void main(String[] args) {
            String s1 = "3";
            String s2 = null;
        }
    }

}
