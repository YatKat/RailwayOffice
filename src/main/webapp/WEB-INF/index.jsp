

<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 18.05.2018
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Railway</title>
    <header>Вітаємо на сайті залізничних кас!</header>
</head>
<body>
<h5>Сьогодні : <%= new java.util.Date() %>

<form method="post" action="/">
    Виберіть маршрут для пошуку поїзда<p>

    Місто відправлення
    <select name="cityFrom" size="1">
        <option value="Київ">Київ</option>
        <option value="Львів">Львів</option>
        <option value="Ужгород">Ужгород</option>
        <option value="Дніпро">Дніпро</option>
        <option value="Житомир">Житомир</option>
    </select>

    Місто прибуття
    <select name="cityTo" size="1">
        <option value="Київ">Київ</option>
        <option value="Львів">Львів</option>
        <option value="Ужгород">Ужгород</option>
        <option value="Дніпро">Харків</option>
        <option value="Житомир">Житомир</option>
    </select>

    Дата відправлення
    <select name="date" size="1">
        <option value="25.05.2018">25.05.2018</option>
        <option value="26.05.2018">26.05.2018</option>
        <option value="27.05.2018">27.05.2018</option>
    </select>
    <br><br>
    <input type="submit" value="ПОШУК" name="search"><br>
</form>
</body>
</html>
