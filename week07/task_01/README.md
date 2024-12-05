# Задание 1
***
Необходимо написать метод, который принимает на вход строку s и выводит пару двух элементов: Самый часто встречающийся символ и Количество его повторов
***
**Описание**: Программа принимает строку от пользователя, затем находит символ, который встречается в ней наиболее часто, и выводит его вместе с количеством вхождений. Для этого строка преобразуется в поток символов, затем каждый символ группируется по значению с подсчетом количества вхождений. С помощью метода `max` выбирается пара (символ, количество), с наибольшим количеством, и результат выводится в виде списка с символом и его частотой. Если строка пуста, программа возвращает пустой список.