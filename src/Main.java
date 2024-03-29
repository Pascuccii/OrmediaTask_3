public class Main {
    public static void main(String[] args) {
        /*Если мы объявляем переменную как объект класса родителя
        * то мы не можем вызвать через него методы класса наследника
        *
        * ключевое слово final делает класс ненаследуемым, следовательно
        * будет ошибка на этапе компиляции*/
        ClassB b = new ClassB("Ваня",1,1);
        System.out.println(b.getValueB() + '\n');

        String line1 = "line";
        String line2 = "line"; //Используя строковый литерал "line" в конструкторе, новое строковое значение сохраняется в пуле строковых констант.
        String line3 = new String("line");
        System.out.println(line1 == line2);
        System.out.println(line1 == line3);
        /*оператор == сравнивает адреса объектов через hashCode() который
        у нас не переопределён. А так как в куче строки проинициализированные
        как line1 и line2 фактически являются одним объектом (String Constant Pool),
        то сравнение ссылок возвращает true. В инициализации line3 мы "насильно"
        создаём отдельный новый объект класса String с новым собственным адресом, поэтому
        сравнение с ним возвращает false
        Лучше везде использовать инициализацию без new String... и сравнивать строки через .equals()*/

        Something smth = Something.createInstance(); //дописал статик метод возвращающий экземпляр класса
    }
}
