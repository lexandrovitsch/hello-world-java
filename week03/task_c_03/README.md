# Задание 3C
***
Напишите программу, которая на вход получает набор чисел в виде массива. Необходимо найти медиану этого набора чисел. 
***
**Описание**: Программа состоит из двух классов: `Median` и `App`. Ее цель — вычислить медиану для массива чисел, введенных пользователем.
1. Класс `Median`:
    - Поле arr[]: хранит массив чисел, переданных в конструктор.
    - Метод `calculateMedian()`: вычисляет медиану:
        * Сначала сортирует массив.
        * Если длина массива нечетная, медианой является средний элемент.
        * Если длина четная, медиана вычисляется как среднее значение двух центральных элементов.
2. Класс `App`:
    - Программа запрашивает у пользователя размер массива и проверяет, что он не меньше 2.
    - Затем запрашивает ввод чисел, которые сохраняются в массив `arr`.
    - Вызывает метод `calculateMedian()` у объекта `Median` для вычисления медианы и выводит результат.