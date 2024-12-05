# Задание 3
***
Напишите программу для поиска файлов по названию или содержимому (для текстовых файлов) в выбранной директории.
***
**Описание**: Программа выполняет поиск файлов в указанной пользователем директории по имени и/или содержимому. В методе `main` пользователю предлагается ввести путь к директории, имя файла и текст для поиска. Затем вызывается метод `searchFiles`, который обходит все файлы в указанной директории с помощью `Files.walk` и фильтрует их по заданным критериям: имени файла и наличию текста в содержимом. Для каждого найденного файла, содержащего искомый текст, программа выводит строки, в которых этот текст встречается, с помощью метода `printFileContentWithSearchText`. Все операции с файлами обрабатываются с учетом возможных ошибок ввода/вывода.