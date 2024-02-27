ТЗ:
1) Добавить в класс Animal public методы двигаться(toGo), летать(fly), плавать(swim).
2) Создать по два класса
наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).
3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)

Возникшие проблемы:
1. В первом пункте нарушается один из принципов ООП - абстракция.
В классе "Animal" должны указываться общие характеристики, запрашиваемые методы не являются характерными действиями для всех животных.
2. При таком проектировании необходимо переопределять метод для каждого производного класса, что нарушает принцип "Don’t repeat yourself".
