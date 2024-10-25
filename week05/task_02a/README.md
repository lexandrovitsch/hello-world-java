# Задание 2A
***
Напишите программу, которая представляет собой калькулятор перевода из одного типа данных в другой. 

На вход пользователь подает сообщение и выбирает тип, в который хочет преобразовать сообщение.

На выходе пользователь должен получить преобразованное сообщение или информацию о невозможности сделать это с пояснением причины.
***
**Описание**: Эта программа выполняет преобразование строки, введённой пользователем, в указанный тип данных. Пользователь вводит значение и целевой тип (например, `int`, `double`, `boolean`), после чего программа вызывает соответствующий метод из класса `Converter` для преобразования строки в выбранный тип. Если преобразование успешно, результат выводится на экран; в случае ошибки (например, если строку нельзя преобразовать в указанный тип) программа перехватывает исключение и выводит сообщение об ошибке. Программа поддерживает преобразование в типы `int`, `double`, `boolean`, `string`, `byte`, `short` и `float`.