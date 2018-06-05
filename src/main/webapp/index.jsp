<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<center><h2>Generator hasła:</h2></center>

<center>
    <form action="password" method="post">

        <label for="password-label">Podaj rodzaj hasła</label>
        <select id="password-label" name="passKind">
            <option value="letters">Same litery</option>
            <option value="lettersnumbers">Litery i cyfry</option>
            <option value="lettersnumberschars">Litery, cyfry i znaki specjalne</option>
        </select>
        <br>
        <br>
        <label for="pasSize">Podaj ile znaków ma mieć hasło</label>
        <select id="pasSize" name="passSize">
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
        </select>
        <br/>
        <br/>
        <button type="submit">Zapisz</button>
    </form>

</center>




</body>
</html>
