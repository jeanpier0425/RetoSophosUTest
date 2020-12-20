#language: es

Característica: Prueba reto sophos

  Esquema del escenario: : Registro en uiTest
    Dado abro la pagina
    Cuando me quiero registrar con los datos personales
      | firstname   | lastname   | email   | month   | day   | year   |
      | <firstname> | <lastname> | <email> | <month> | <day> | <year> |
    Y Adiciono mi ciudad de destino <city> y el codigo postal <postalcod>


    Ejemplos:
      | firstname | lastname | email          | month | day | year | city                          | postalcod |
      | jhon      | smith    | jhon@gmail.com | March | 3   | 1980 | Medellín, Antioquía, Colombia | 050010    |