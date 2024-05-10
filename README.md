# Домашнее задание к занятию «Объектно-ориентированное программирование: ключевые принципы»

## Решения
* <a href="https://github.com/Nephedov/9.Java/blob/main/src/main/java/ru/netology/json/Post.java">Post.java</a> - описывающий объект запроса.
* <a href="https://github.com/Nephedov/9.Java/blob/main/src/main/java/ru/netology/json/FormDate.java">FormDate.java</a> описывающий объект "дата".
* <a href="https://github.com/Nephedov/9.Java/blob/main/src/main/java/Main.java">Main.java</a> - демонстрирует работу класса
  <a href="https://github.com/Nephedov/9.Java/blob/main/src/main/java/ru/netology/json/Post.java">Post.java</a>.

## Что было сделано
* Создан Maven проект и настроен <a href="https://github.com/Nephedov/9.Java/blob/main/pom.xml">pom.xml</a> c плагинами и зависимостями:
  * JunitJupiter.
  * MavenSurefirePlugin.
  * JaCoCo.
* Настроен <a href="https://github.com/Nephedov/9.Java/blob/main/.github/workflows/maven.yml">maven.yml</a> для Github CI с verify-сборкой.
* Разработаны классы, описывающие объекты запроса анкеты на сервер, и продемонстрирована их работа в <a href="https://github.com/Nephedov/9.Java/blob/main/src/main/java/Main.java">Main.java</a>:
  * Реализован класс <a href="https://github.com/Nephedov/9.Java/blob/main/src/main/java/ru/netology/json/FormDate.java">FormDate.java</a> описывающий объект "дата".
  * Реализован класс <a href="https://github.com/Nephedov/9.Java/blob/main/src/main/java/ru/netology/json/Post.java">Post.java</a> описывающий объект запроса. Одним из свойств имеющий объект FormDate.

---
---


# Описание Задания 1. API (обязательное к выполнению)

Вашей задачей будет разработать классы, описывающие объекты запроса анкеты на сервер, и продемонстрировать их работу в `Main`.

Создайте класс `Post`, описывающий объект запроса на сервер, и заполните его полями.

Осталось добавить поле `birthday`. Значение в этом поле должно быть объектом, для которого также нужно будет создать свой класс. Создайте класс `FormDate` для описания схемы объекта в поле `birthday`.

Теперь в классе `Post` добавьте поле `birthday` с типом `FormDate`. После чего добавьте заполнение этого поля в `main`.
