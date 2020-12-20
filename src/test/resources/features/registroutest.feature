#language: es

Característica: Prueba reto sophos

  Esquema del escenario: : Registro en uiTest
    Dado el usuario abre la pagina
    Cuando el usuario quiere registrar sus datos personales
      | firstname   | lastname   | email   | month   | day   | year   |
      | <firstname> | <lastname> | <email> | <month> | <day> | <year> |
    Y el usuario adiciona los datos de su direccion como ciudad <city> codigo postal <postalcod>
    Cuando el usuario establece un password <pass> para la cuenta


    Ejemplos:
      | firstname | lastname | email              | month | day | year | city                          | postalcod | pass             |
      | jhon      | smith    | jhonsena@gmail.com | March | 3   | 1980 | Medellín, Antioquía, Colombia | 050010    | TIC+05+antioquia |